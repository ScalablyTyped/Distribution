package typings.yogBigpipe.mod.Pagelet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.yogBigpipe.yogBigpipeStrings.async
  - typings.yogBigpipe.yogBigpipeStrings.pipeline
  - typings.yogBigpipe.yogBigpipeStrings.quickling
*/
trait mode extends js.Object

object mode {
  @scala.inline
  def async: typings.yogBigpipe.yogBigpipeStrings.async = this.cast("async")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pipeline: typings.yogBigpipe.yogBigpipeStrings.pipeline = this.cast("pipeline")
  @scala.inline
  def quickling: typings.yogBigpipe.yogBigpipeStrings.quickling = this.cast("quickling")
}

