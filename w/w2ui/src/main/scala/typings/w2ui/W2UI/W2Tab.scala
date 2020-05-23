package typings.w2ui.W2UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait W2Tab extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object W2Tab {
  @scala.inline
  def apply(caption: String = null, id: String = null): W2Tab = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[W2Tab]
  }
}

