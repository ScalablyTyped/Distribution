package typings.winrt.Windows.Media.Protection

import typings.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRevocationAndRenewalInformation extends js.Object {
  
  var items: IVector[RevocationAndRenewalItem] = js.native
}
object IRevocationAndRenewalInformation {
  
  @scala.inline
  def apply(items: IVector[RevocationAndRenewalItem]): IRevocationAndRenewalInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRevocationAndRenewalInformation]
  }
  
  @scala.inline
  implicit class IRevocationAndRenewalInformationOps[Self <: IRevocationAndRenewalInformation] (val x: Self) extends AnyVal {
    
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
