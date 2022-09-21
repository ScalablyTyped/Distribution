package typings.timezonecomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timesourceMod {
  
  @JSImport("timezonecomplete/dist/lib/timesource", "RealTimeSource")
  @js.native
  open class RealTimeSource ()
    extends StObject
       with TimeSource {
    
    /**
      * Return the current date+time as a javascript Date object
      * @throws nothing
      */
    /* CompleteClass */
    override def now(): js.Date = js.native
  }
  
  trait TimeSource extends StObject {
    
    /**
      * Return the current date+time as a javascript Date object
      * @throws nothing
      */
    def now(): js.Date
  }
  object TimeSource {
    
    inline def apply(now: () => js.Date): TimeSource = {
      val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
      __obj.asInstanceOf[TimeSource]
    }
    
    extension [Self <: TimeSource](x: Self) {
      
      inline def setNow(value: () => js.Date): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    }
  }
}
