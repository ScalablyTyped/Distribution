package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tryghostContentApi.tryghostContentApiStrings.authors
  - typings.tryghostContentApi.tryghostContentApiStrings.tags
  - typings.tryghostContentApi.tryghostContentApiStrings.countDotposts
*/
trait IncludeParam extends js.Object

object IncludeParam {
  @scala.inline
  def authors: typings.tryghostContentApi.tryghostContentApiStrings.authors = this.cast("authors")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def countDotposts: typings.tryghostContentApi.tryghostContentApiStrings.countDotposts = this.cast("count.posts")
  @scala.inline
  def tags: typings.tryghostContentApi.tryghostContentApiStrings.tags = this.cast("tags")
}

