package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to acquire a downloadable content (DLC) package license. */
trait StoreAcquireLicenseResult extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError
  /** Gets an object that represents the downloadable content (DLC) package license. */
  var storePackageLicense: StorePackageLicense
}

object StoreAcquireLicenseResult {
  @scala.inline
  def apply(extendedError: WinRTError, storePackageLicense: StorePackageLicense): StoreAcquireLicenseResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], storePackageLicense = storePackageLicense.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreAcquireLicenseResult]
  }
}

