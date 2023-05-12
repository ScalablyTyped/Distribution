package typings.stubbornFs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRetryifyQueueMod extends Shortcut {
  
  @JSImport("stubborn-fs/dist/retryify_queue", JSImport.Default)
  @js.native
  val default: RetryfyQueue = js.native
  
  trait RetryfyQueue extends StObject {
    
    def add(fn: js.Function): Unit
    
    def init(): Unit
    
    /* private */ var interval: Any
    
    /* private */ var intervalId: Any
    
    /* private */ var limit: Any
    
    /* private */ var queueActive: Any
    
    /* private */ var queueWaiting: Any
    
    def remove(fn: js.Function): Unit
    
    def reset(): Unit
    
    def schedule(): js.Promise[js.Function]
    
    def tick(): Unit
  }
  object RetryfyQueue {
    
    inline def apply(
      add: js.Function => Unit,
      init: () => Unit,
      interval: Any,
      intervalId: Any,
      limit: Any,
      queueActive: Any,
      queueWaiting: Any,
      remove: js.Function => Unit,
      reset: () => Unit,
      schedule: () => js.Promise[js.Function],
      tick: () => Unit
    ): RetryfyQueue = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), init = js.Any.fromFunction0(init), interval = interval.asInstanceOf[js.Any], intervalId = intervalId.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], queueActive = queueActive.asInstanceOf[js.Any], queueWaiting = queueWaiting.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), reset = js.Any.fromFunction0(reset), schedule = js.Any.fromFunction0(schedule), tick = js.Any.fromFunction0(tick))
      __obj.asInstanceOf[RetryfyQueue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryfyQueue] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Function => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInterval(value: Any): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalId(value: Any): Self = StObject.set(x, "intervalId", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Any): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setQueueActive(value: Any): Self = StObject.set(x, "queueActive", value.asInstanceOf[js.Any])
      
      inline def setQueueWaiting(value: Any): Self = StObject.set(x, "queueWaiting", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: js.Function => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSchedule(value: () => js.Promise[js.Function]): Self = StObject.set(x, "schedule", js.Any.fromFunction0(value))
      
      inline def setTick(value: () => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction0(value))
    }
  }
  
  type _To = RetryfyQueue
  
  /* This means you don't have to write `default`, but can instead just say `distRetryifyQueueMod.foo` */
  override def _to: RetryfyQueue = default
}
