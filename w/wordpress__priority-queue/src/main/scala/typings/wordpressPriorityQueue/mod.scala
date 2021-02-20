package typings.wordpressPriorityQueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/priority-queue", "createQueue")
  @js.native
  def createQueue(): WPPriorityQueue = js.native
  
  @js.native
  trait WPPriorityQueue extends StObject {
    
    /**
      * Add callback to queue for context.
      */
    def add(element: js.Object, item: js.Function0[Unit]): Unit = js.native
    
    /**
      * Flush queue for context.
      */
    def flush(element: js.Object): Boolean = js.native
    
    /**
      * Reset queue.
      */
    def reset(): Unit = js.native
  }
  object WPPriorityQueue {
    
    @scala.inline
    def apply(add: (js.Object, js.Function0[Unit]) => Unit, flush: js.Object => Boolean, reset: () => Unit): WPPriorityQueue = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), flush = js.Any.fromFunction1(flush), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[WPPriorityQueue]
    }
    
    @scala.inline
    implicit class WPPriorityQueueMutableBuilder[Self <: WPPriorityQueue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (js.Object, js.Function0[Unit]) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFlush(value: js.Object => Boolean): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  type WPPriorityQueueAdd = js.Function2[/* element */ js.Object, /* item */ js.Function0[Unit], Unit]
  
  type WPPriorityQueueCallback = js.Function0[Unit]
  
  type WPPriorityQueueContext = js.Object
  
  type WPPriorityQueueFlush = js.Function1[/* element */ js.Object, Boolean]
  
  type WPPriorityQueueReset = js.Function0[Unit]
}
