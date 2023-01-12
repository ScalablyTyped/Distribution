package typings.w3cHrTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("w3c-hr-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("w3c-hr-time", "Performance")
  @js.native
  open class Performance () extends StObject {
    
    def now(): Double = js.native
    
    def timeOrigin: Double = js.native
    
    def toJSON(): PerformanceJSON = js.native
  }
  
  @JSImport("w3c-hr-time", "clockIsAccurate")
  @js.native
  val clockIsAccurate: Boolean = js.native
  
  inline def getGlobalMonotonicClockMS(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalMonotonicClockMS")().asInstanceOf[Double]
  
  trait PerformanceJSON extends StObject {
    
    var timeOrigin: Double
  }
  object PerformanceJSON {
    
    inline def apply(timeOrigin: Double): PerformanceJSON = {
      val __obj = js.Dynamic.literal(timeOrigin = timeOrigin.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerformanceJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerformanceJSON] (val x: Self) extends AnyVal {
      
      inline def setTimeOrigin(value: Double): Self = StObject.set(x, "timeOrigin", value.asInstanceOf[js.Any])
    }
  }
}
