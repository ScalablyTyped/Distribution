package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentObject extends js.Object {
  var returns: js.UndefOr[java.lang.String] = js.undefined
  var shortText: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[CommentTagObject]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object CommentObject {
  @scala.inline
  def apply(
    returns: java.lang.String = null,
    shortText: java.lang.String = null,
    tags: js.Array[CommentTagObject] = null,
    text: java.lang.String = null
  ): CommentObject = {
    val __obj = js.Dynamic.literal()
    if (returns != null) __obj.updateDynamic("returns")(returns)
    if (shortText != null) __obj.updateDynamic("shortText")(shortText)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CommentObject]
  }
}

