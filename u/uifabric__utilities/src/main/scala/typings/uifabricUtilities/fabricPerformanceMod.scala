package typings.uifabricUtilities

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabricPerformanceMod {
  
  @JSImport("@uifabric/utilities/lib/FabricPerformance", "FabricPerformance")
  @js.native
  class FabricPerformance () extends StObject
  /* static members */
  object FabricPerformance {
    
    @JSImport("@uifabric/utilities/lib/FabricPerformance", "FabricPerformance")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@uifabric/utilities/lib/FabricPerformance", "FabricPerformance._timeoutId")
    @js.native
    def _timeoutId: js.Any = js.native
    inline def _timeoutId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_timeoutId")(x.asInstanceOf[js.Any])
    
    /**
      * Measures execution time of the given syncronous function. If the same logic is executed multiple times,
      * each individual measurement will be collected as well the overall numbers.
      * @param name - The name of this measurement
      * @param func - The logic to be measured for execution time
      */
    inline def measure(name: String, func: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    
    inline def setPeriodicReset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPeriodicReset")().asInstanceOf[Unit]
    
    @JSImport("@uifabric/utilities/lib/FabricPerformance", "FabricPerformance.summary")
    @js.native
    def summary: IPerfSummary = js.native
    inline def summary_=(x: IPerfSummary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summary")(x.asInstanceOf[js.Any])
  }
  
  trait IPerfData extends StObject {
    
    var duration: Double
    
    var timeStamp: Double
  }
  object IPerfData {
    
    inline def apply(duration: Double, timeStamp: Double): IPerfData = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPerfData]
    }
    
    extension [Self <: IPerfData](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPerfMeasurement extends StObject {
    
    var all: js.Array[IPerfData]
    
    var count: Double
    
    var totalDuration: Double
  }
  object IPerfMeasurement {
    
    inline def apply(all: js.Array[IPerfData], count: Double, totalDuration: Double): IPerfMeasurement = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], totalDuration = totalDuration.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPerfMeasurement]
    }
    
    extension [Self <: IPerfMeasurement](x: Self) {
      
      inline def setAll(value: js.Array[IPerfData]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllVarargs(value: IPerfData*): Self = StObject.set(x, "all", js.Array(value :_*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setTotalDuration(value: Double): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
    }
  }
  
  type IPerfSummary = StringDictionary[IPerfMeasurement]
}
