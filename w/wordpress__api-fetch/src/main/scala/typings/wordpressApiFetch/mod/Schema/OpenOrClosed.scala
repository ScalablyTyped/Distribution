package typings.wordpressApiFetch.mod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressApiFetch.wordpressApiFetchStrings.open
  - typings.wordpressApiFetch.wordpressApiFetchStrings.closed
*/
trait OpenOrClosed extends js.Object

object OpenOrClosed {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.wordpressApiFetch.wordpressApiFetchStrings.closed = this.cast("closed")
  @scala.inline
  def open: typings.wordpressApiFetch.wordpressApiFetchStrings.open = this.cast("open")
}

