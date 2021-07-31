package typings.timezonecomplete

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timesourceMod {
  
  @JSImport("timezonecomplete/dist/lib/timesource", "RealTimeSource")
  @js.native
  class RealTimeSource ()
    extends StObject
       with TimeSource {
    
    /**
      * Return the current date+time as a javascript Date object
      * @throws nothing
      */
    /* CompleteClass */
    override def now(): Date = js.native
  }
  
  trait TimeSource extends StObject {
    
    /**
      * Return the current date+time as a javascript Date object
      * @throws nothing
      */
    def now(): Date
  }
  object TimeSource {
    
    @scala.inline
    def apply(now: () => Date): TimeSource = {
      val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
      __obj.asInstanceOf[TimeSource]
    }
    
    @scala.inline
    implicit class TimeSourceMutableBuilder[Self <: TimeSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNow(value: () => Date): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    }
  }
}
