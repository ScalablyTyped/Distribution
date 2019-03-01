package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueIPlayReadyLicense extends js.Object {
  /** The items in the collection. */ var items: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.IPlayReadyLicense
  /** The number of items in the collection. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueIPlayReadyLicense {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.IPlayReadyLicense,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueIPlayReadyLicense = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueIPlayReadyLicense]
  }
}

