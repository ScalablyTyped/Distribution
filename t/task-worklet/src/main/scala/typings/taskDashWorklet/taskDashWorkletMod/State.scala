package typings.taskDashWorklet.taskDashWorkletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.taskDashWorklet.taskDashWorkletStrings.cancelled
  - typings.taskDashWorklet.taskDashWorkletStrings.completed
  - typings.taskDashWorklet.taskDashWorkletStrings.fulfilled
  - typings.taskDashWorklet.taskDashWorkletStrings.pending
  - typings.taskDashWorklet.taskDashWorkletStrings.scheduled
*/
trait State extends js.Object

object State {
  @scala.inline
  def cancelled: typings.taskDashWorklet.taskDashWorkletStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typings.taskDashWorklet.taskDashWorkletStrings.completed = this.cast("completed")
  @scala.inline
  def fulfilled: typings.taskDashWorklet.taskDashWorkletStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def pending: typings.taskDashWorklet.taskDashWorkletStrings.pending = this.cast("pending")
  @scala.inline
  def scheduled: typings.taskDashWorklet.taskDashWorkletStrings.scheduled = this.cast("scheduled")
}

