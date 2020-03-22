package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.CommentTag, 'text'> */
trait CommentTag
  extends __ModelToObject[js.Any] {
  var param: js.UndefOr[String] = js.undefined
  var tag: String
  var text: ModelToObject[String] | String
}

object CommentTag {
  @scala.inline
  def apply(tag: String, text: ModelToObject[String] | String, param: String = null): CommentTag = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentTag]
  }
}

