package typings.wordpressPriorityQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WPPriorityQueue extends js.Object {
  /**
    * Add callback to queue for context.
    */
  def add(element: js.Object, item: js.Function0[Unit]): Unit
  /**
    * Flush queue for context.
    */
  def flush(element: js.Object): Boolean
  /**
    * Reset queue.
    */
  def reset(): Unit
}

object WPPriorityQueue {
  @scala.inline
  def apply(add: (js.Object, js.Function0[Unit]) => Unit, flush: js.Object => Boolean, reset: () => Unit): WPPriorityQueue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), flush = js.Any.fromFunction1(flush), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[WPPriorityQueue]
  }
}

