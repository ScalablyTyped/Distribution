package typings.swfobject.swfobject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwfObjectAttribute extends js.Object {
  var height: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object ISwfObjectAttribute {
  @scala.inline
  def apply(height: String = null, id: String = null, width: String = null): ISwfObjectAttribute = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwfObjectAttribute]
  }
}

