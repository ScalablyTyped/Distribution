package typings.winrt.WindowsNs.MediaNs.ProtectionNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRevocationAndRenewalInformation extends js.Object {
  var items: IVector[RevocationAndRenewalItem]
}

object IRevocationAndRenewalInformation {
  @scala.inline
  def apply(items: IVector[RevocationAndRenewalItem]): IRevocationAndRenewalInformation = {
    val __obj = js.Dynamic.literal(items = items)
  
    __obj.asInstanceOf[IRevocationAndRenewalInformation]
  }
}

