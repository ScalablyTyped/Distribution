package typings.winrt.Windows.UI.WebUI

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
    val __obj = js.Dynamic.literal(onactivated = onactivated, onnavigated = onnavigated, onresuming = onresuming, onsuspending = onsuspending)
  
    __obj.asInstanceOf[IWebUIActivationStatics]
  }
}

