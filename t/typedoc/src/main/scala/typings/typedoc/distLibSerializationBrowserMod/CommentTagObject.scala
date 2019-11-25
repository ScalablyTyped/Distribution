package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentTagObject extends js.Object {
  var param: js.UndefOr[String] = js.undefined
  var tag: String
  var text: String
}

object CommentTagObject {
  @scala.inline
  def apply(tag: String, text: String, param: String = null): CommentTagObject = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentTagObject]
  }
}

