package typings.winrtUwp.Windows.Media.Protection

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about components that need to be revoked and renewed. */
@js.native
trait RevocationAndRenewalInformation extends js.Object {
  /** Returns a list of components that need to be revoked and renewed with updated components. */
  var items: IVector[RevocationAndRenewalItem] = js.native
}

object RevocationAndRenewalInformation {
  @scala.inline
  def apply(items: IVector[RevocationAndRenewalItem]): RevocationAndRenewalInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocationAndRenewalInformation]
  }
  @scala.inline
  implicit class RevocationAndRenewalInformationOps[Self <: RevocationAndRenewalInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItems(value: IVector[RevocationAndRenewalItem]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

