package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayNumberPnpObject extends js.Object {
  var items: js.Array[winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObject]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValueArrayNumberPnpObject {
  @scala.inline
  def apply(
    items: js.Array[winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObject],
    returnValue: scala.Double
  ): Anon_ItemsReturnValueArrayNumberPnpObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayNumberPnpObject]
  }
}

