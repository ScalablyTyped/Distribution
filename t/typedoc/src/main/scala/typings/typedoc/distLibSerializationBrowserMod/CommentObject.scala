package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentObject extends js.Object {
  var returns: js.UndefOr[String] = js.undefined
  var shortText: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[CommentTagObject]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object CommentObject {
  @scala.inline
  def apply(
    returns: String = null,
    shortText: String = null,
    tags: js.Array[CommentTagObject] = null,
    text: String = null
  ): CommentObject = {
    val __obj = js.Dynamic.literal()
    if (returns != null) __obj.updateDynamic("returns")(returns.asInstanceOf[js.Any])
    if (shortText != null) __obj.updateDynamic("shortText")(shortText.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentObject]
  }
}

