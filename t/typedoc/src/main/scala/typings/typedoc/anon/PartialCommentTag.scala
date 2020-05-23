package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.CommentTag> */
trait PartialCommentTag extends js.Object {
  var param: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[ModelToObject[String] | String] = js.undefined
}

object PartialCommentTag {
  @scala.inline
  def apply(param: String = null, tag: String = null, text: ModelToObject[String] | String = null): PartialCommentTag = {
    val __obj = js.Dynamic.literal()
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCommentTag]
  }
}

