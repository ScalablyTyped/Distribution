package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait W2Tab extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object W2Tab {
  @scala.inline
  def apply(caption: java.lang.String = null, id: java.lang.String = null): W2Tab = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[W2Tab]
  }
}

