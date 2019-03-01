package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueIPlayReadyDomain extends js.Object {
  /** The items in the collection. */ var items: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.IPlayReadyDomain
  /** The number of items in the collection. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueIPlayReadyDomain {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.IPlayReadyDomain,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueIPlayReadyDomain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueIPlayReadyDomain]
  }
}

