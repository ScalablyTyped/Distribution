package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentTagObject extends js.Object {
  var param: js.UndefOr[java.lang.String] = js.undefined
  var tag: java.lang.String
  var text: java.lang.String
}

object CommentTagObject {
  @scala.inline
  def apply(tag: java.lang.String, text: java.lang.String, param: java.lang.String = null): CommentTagObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tag")(tag)
    __obj.updateDynamic("text")(text)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[CommentTagObject]
  }
}

