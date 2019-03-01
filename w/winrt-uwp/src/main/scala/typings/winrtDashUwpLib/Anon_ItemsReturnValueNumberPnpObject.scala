package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberPnpObject extends js.Object {
  /** Provides the destination for the result. Size the initial array size as a "capacity" in order to specify how many results should be retrieved. */ var items: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObject
  /** The number of items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueNumberPnpObject {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObject,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueNumberPnpObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberPnpObject]
  }
}

