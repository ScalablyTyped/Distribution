package typings.xstate

import typings.xstate.anon.PartialSchedulerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulerMod {
  
  @JSImport("xstate/lib/scheduler", "Scheduler")
  @js.native
  class Scheduler () extends StObject {
    def this(options: PartialSchedulerOptions) = this()
    
    def clear(): Unit = js.native
    
    var flushEvents: js.Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(callback: js.Function0[Unit]): Unit = js.native
    
    var initialized: js.Any = js.native
    
    var options: js.Any = js.native
    
    var process: js.Any = js.native
    
    var processingEvent: js.Any = js.native
    
    var queue: js.Any = js.native
    
    def schedule(task: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait SchedulerOptions extends StObject {
    
    var deferEvents: Boolean = js.native
  }
  object SchedulerOptions {
    
    @scala.inline
    def apply(deferEvents: Boolean): SchedulerOptions = {
      val __obj = js.Dynamic.literal(deferEvents = deferEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchedulerOptions]
    }
    
    @scala.inline
    implicit class SchedulerOptionsMutableBuilder[Self <: SchedulerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeferEvents(value: Boolean): Self = StObject.set(x, "deferEvents", value.asInstanceOf[js.Any])
    }
  }
}
