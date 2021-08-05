package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuTemperatureData extends StObject {
  
  var cores: js.Array[Double]
  
  var main: Double
  
  var max: Double
}
object CpuTemperatureData {
  
  inline def apply(cores: js.Array[Double], main: Double, max: Double): CpuTemperatureData = {
    val __obj = js.Dynamic.literal(cores = cores.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuTemperatureData]
  }
  
  extension [Self <: CpuTemperatureData](x: Self) {
    
    inline def setCores(value: js.Array[Double]): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
    
    inline def setCoresVarargs(value: Double*): Self = StObject.set(x, "cores", js.Array(value :_*))
    
    inline def setMain(value: Double): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
