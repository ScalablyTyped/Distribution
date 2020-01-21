package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tryghostContentApi.tryghostContentApiStrings.public
  - typings.tryghostContentApi.tryghostContentApiStrings.draft
  - typings.tryghostContentApi.tryghostContentApiStrings.scheduled
*/
trait TagVisibility extends js.Object

object TagVisibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def draft: typings.tryghostContentApi.tryghostContentApiStrings.draft = this.cast("draft")
  @scala.inline
  def public: typings.tryghostContentApi.tryghostContentApiStrings.public = this.cast("public")
  @scala.inline
  def scheduled: typings.tryghostContentApi.tryghostContentApiStrings.scheduled = this.cast("scheduled")
}

