package typings.yogBigpipe.mod.Pagelet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.yogBigpipe.yogBigpipeStrings.pending
  - typings.yogBigpipe.yogBigpipeStrings.rendering
  - typings.yogBigpipe.yogBigpipeStrings.fulfilled
  - typings.yogBigpipe.yogBigpipeStrings.failed
*/
trait status extends js.Object

object status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typings.yogBigpipe.yogBigpipeStrings.failed = this.cast("failed")
  @scala.inline
  def fulfilled: typings.yogBigpipe.yogBigpipeStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def pending: typings.yogBigpipe.yogBigpipeStrings.pending = this.cast("pending")
  @scala.inline
  def rendering: typings.yogBigpipe.yogBigpipeStrings.rendering = this.cast("rendering")
}

