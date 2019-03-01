package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignProperty extends js.Object {
  var align: js.UndefOr[ProductionRule[ScaledValueRef[Align]]] = js.undefined
}

object AlignProperty {
  @scala.inline
  def apply(align: ProductionRule[ScaledValueRef[Align]] = null): AlignProperty = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignProperty]
  }
}

