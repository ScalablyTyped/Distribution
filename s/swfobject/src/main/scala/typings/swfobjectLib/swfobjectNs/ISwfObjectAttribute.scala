package typings
package swfobjectLib.swfobjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwfObjectAttribute extends js.Object {
  var height: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object ISwfObjectAttribute {
  @scala.inline
  def apply(height: java.lang.String = null, id: java.lang.String = null, width: java.lang.String = null): ISwfObjectAttribute = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (id != null) __obj.updateDynamic("id")(id)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ISwfObjectAttribute]
  }
}

