package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a request to acquire a downloadable content (DLC) package license. */
@js.native
trait StoreAcquireLicenseResult extends js.Object {
  
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  
  /** Gets an object that represents the downloadable content (DLC) package license. */
  var storePackageLicense: StorePackageLicense = js.native
}
object StoreAcquireLicenseResult {
  
  @scala.inline
  def apply(extendedError: WinRTError, storePackageLicense: StorePackageLicense): StoreAcquireLicenseResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], storePackageLicense = storePackageLicense.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreAcquireLicenseResult]
  }
  
  @scala.inline
  implicit class StoreAcquireLicenseResultOps[Self <: StoreAcquireLicenseResult] (val x: Self) extends AnyVal {
    
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
    def setExtendedError(value: WinRTError): Self = this.set("extendedError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorePackageLicense(value: StorePackageLicense): Self = this.set("storePackageLicense", value.asInstanceOf[js.Any])
  }
}
