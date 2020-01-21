package typings.wordpressApiFetch.mod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressApiFetch.wordpressApiFetchStrings.draft
  - typings.wordpressApiFetch.wordpressApiFetchStrings.future
  - typings.wordpressApiFetch.wordpressApiFetchStrings.pending
  - typings.wordpressApiFetch.wordpressApiFetchStrings.`private`
  - typings.wordpressApiFetch.wordpressApiFetchStrings.publish
*/
trait PostStatus extends js.Object

object PostStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def draft: typings.wordpressApiFetch.wordpressApiFetchStrings.draft = this.cast("draft")
  @scala.inline
  def future: typings.wordpressApiFetch.wordpressApiFetchStrings.future = this.cast("future")
  @scala.inline
  def pending: typings.wordpressApiFetch.wordpressApiFetchStrings.pending = this.cast("pending")
  @scala.inline
  def `private`: typings.wordpressApiFetch.wordpressApiFetchStrings.`private` = this.cast("private")
  @scala.inline
  def publish: typings.wordpressApiFetch.wordpressApiFetchStrings.publish = this.cast("publish")
}

