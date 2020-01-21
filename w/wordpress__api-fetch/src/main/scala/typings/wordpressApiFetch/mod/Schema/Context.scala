package typings.wordpressApiFetch.mod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressApiFetch.wordpressApiFetchStrings.edit
  - typings.wordpressApiFetch.wordpressApiFetchStrings.embed
  - typings.wordpressApiFetch.wordpressApiFetchStrings.view
*/
trait Context extends js.Object

object Context {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def edit: typings.wordpressApiFetch.wordpressApiFetchStrings.edit = this.cast("edit")
  @scala.inline
  def embed: typings.wordpressApiFetch.wordpressApiFetchStrings.embed = this.cast("embed")
  @scala.inline
  def view: typings.wordpressApiFetch.wordpressApiFetchStrings.view = this.cast("view")
}

