package typings.winrtDashUwp.Windows.Services.Store

import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to acquire a downloadable content (DLC) package license. */
@JSGlobal("Windows.Services.Store.StoreAcquireLicenseResult")
@js.native
abstract class StoreAcquireLicenseResult () extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets an object that represents the downloadable content (DLC) package license. */
  var storePackageLicense: StorePackageLicense = js.native
}

