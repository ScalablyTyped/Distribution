package typings.winrt.Windows.Media.Protection

import typings.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRevocationAndRenewalInformation extends js.Object {
  var items: IVector[RevocationAndRenewalItem]
}

object IRevocationAndRenewalInformation {
  @scala.inline
  def apply(items: IVector[RevocationAndRenewalItem]): IRevocationAndRenewalInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRevocationAndRenewalInformation]
  }
}

