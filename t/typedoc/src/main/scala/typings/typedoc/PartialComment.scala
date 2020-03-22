package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.tagMod.CommentTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.Comment> */
trait PartialComment extends js.Object {
  var returns: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.undefined
  var shortText: js.UndefOr[ModelToObject[String] | String] = js.undefined
  var tags: js.UndefOr[ModelToObject[js.UndefOr[js.Array[CommentTag]]] | js.Array[CommentTag]] = js.undefined
  var text: js.UndefOr[ModelToObject[String] | String] = js.undefined
}

object PartialComment {
  @scala.inline
  def apply(
    returns: ModelToObject[js.UndefOr[String]] | String = null,
    shortText: ModelToObject[String] | String = null,
    tags: ModelToObject[js.UndefOr[js.Array[CommentTag]]] | js.Array[CommentTag] = null,
    text: ModelToObject[String] | String = null
  ): PartialComment = {
    val __obj = js.Dynamic.literal()
    if (returns != null) __obj.updateDynamic("returns")(returns.asInstanceOf[js.Any])
    if (shortText != null) __obj.updateDynamic("shortText")(shortText.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialComment]
  }
}

