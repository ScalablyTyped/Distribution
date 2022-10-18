package typings.xstate

import typings.xstate.anon.PartialSchedulerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchedulerMod {
  
  @JSImport("xstate/lib/scheduler", "Scheduler")
  @js.native
  open class Scheduler () extends StObject {
    def this(options: PartialSchedulerOptions) = this()
    
    def clear(): Unit = js.native
    
    /* private */ var flushEvents: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(callback: js.Function0[Unit]): Unit = js.native
    
    /* private */ var initialized: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var process: Any = js.native
    
    /* private */ var processingEvent: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    def schedule(task: js.Function0[Unit]): Unit = js.native
  }
  
  trait SchedulerOptions extends StObject {
    
    var deferEvents: Boolean
  }
  object SchedulerOptions {
    
    inline def apply(deferEvents: Boolean): SchedulerOptions = {
      val __obj = js.Dynamic.literal(deferEvents = deferEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchedulerOptions]
    }
    
    extension [Self <: SchedulerOptions](x: Self) {
      
      inline def setDeferEvents(value: Boolean): Self = StObject.set(x, "deferEvents", value.asInstanceOf[js.Any])
    }
  }
}
