package typings.winrt.Windows.ApplicationModel.Store

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILicenseInformation extends js.Object {
  
  var expirationDate: Date = js.native
  
  var isActive: Boolean = js.native
  
  var isTrial: Boolean = js.native
  
  var onlicensechanged: js.Any = js.native
  
  var productLicenses: IMapView[String, ProductLicense] = js.native
}
object ILicenseInformation {
  
  @scala.inline
  def apply(
    expirationDate: Date,
    isActive: Boolean,
    isTrial: Boolean,
    onlicensechanged: js.Any,
    productLicenses: IMapView[String, ProductLicense]
  ): ILicenseInformation = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isTrial = isTrial.asInstanceOf[js.Any], onlicensechanged = onlicensechanged.asInstanceOf[js.Any], productLicenses = productLicenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILicenseInformation]
  }
  
  @scala.inline
  implicit class ILicenseInformationOps[Self <: ILicenseInformation] (val x: Self) extends AnyVal {
    
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
    def setExpirationDate(value: Date): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTrial(value: Boolean): Self = this.set("isTrial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlicensechanged(value: js.Any): Self = this.set("onlicensechanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductLicenses(value: IMapView[String, ProductLicense]): Self = this.set("productLicenses", value.asInstanceOf[js.Any])
  }
}
