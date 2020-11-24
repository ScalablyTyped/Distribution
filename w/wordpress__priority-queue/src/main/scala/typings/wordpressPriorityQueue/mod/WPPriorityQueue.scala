package typings.wordpressPriorityQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WPPriorityQueue extends js.Object {
  
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
  implicit class WPPriorityQueueOps[Self <: WPPriorityQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (js.Object, js.Function0[Unit]) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFlush(value: js.Object => Boolean): Self = this.set("flush", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
}
