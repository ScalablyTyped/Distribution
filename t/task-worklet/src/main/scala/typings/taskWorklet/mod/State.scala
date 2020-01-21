package typings.taskWorklet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.taskWorklet.taskWorkletStrings.cancelled
  - typings.taskWorklet.taskWorkletStrings.completed
  - typings.taskWorklet.taskWorkletStrings.fulfilled
  - typings.taskWorklet.taskWorkletStrings.pending
  - typings.taskWorklet.taskWorkletStrings.scheduled
*/
trait State extends js.Object

object State {
  @scala.inline
  def cancelled: typings.taskWorklet.taskWorkletStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typings.taskWorklet.taskWorkletStrings.completed = this.cast("completed")
  @scala.inline
  def fulfilled: typings.taskWorklet.taskWorkletStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def pending: typings.taskWorklet.taskWorkletStrings.pending = this.cast("pending")
  @scala.inline
  def scheduled: typings.taskWorklet.taskWorkletStrings.scheduled = this.cast("scheduled")
}

