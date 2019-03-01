package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUIActivationStatics extends js.Object {
  var onactivated: js.Any
  var onnavigated: js.Any
  var onresuming: js.Any
  var onsuspending: js.Any
}

object IWebUIActivationStatics {
  @scala.inline
  def apply(onactivated: js.Any, onnavigated: js.Any, onresuming: js.Any, onsuspending: js.Any): IWebUIActivationStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onactivated")(onactivated)
    __obj.updateDynamic("onnavigated")(onnavigated)
    __obj.updateDynamic("onresuming")(onresuming)
    __obj.updateDynamic("onsuspending")(onsuspending)
    __obj.asInstanceOf[IWebUIActivationStatics]
  }
}

