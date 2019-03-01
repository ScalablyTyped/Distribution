package typings
package winrtLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRevocationAndRenewalInformation extends js.Object {
  var items: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[RevocationAndRenewalItem]
}

object IRevocationAndRenewalInformation {
  @scala.inline
  def apply(items: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[RevocationAndRenewalItem]): IRevocationAndRenewalInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[IRevocationAndRenewalInformation]
  }
}

