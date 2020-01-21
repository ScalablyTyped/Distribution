package typings.winrt

import typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueArrayNumberPnpObject extends js.Object {
  var items: js.Array[PnpObject]
  var returnValue: Double
}

object AnonItemsReturnValueArrayNumberPnpObject {
  @scala.inline
  def apply(items: js.Array[PnpObject], returnValue: Double): AnonItemsReturnValueArrayNumberPnpObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueArrayNumberPnpObject]
  }
}

