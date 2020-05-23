package typings.winrtUwp.global.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to acquire a downloadable content (DLC) package license. */
@JSGlobal("Windows.Services.Store.StoreAcquireLicenseResult")
@js.native
abstract class StoreAcquireLicenseResult ()
  extends typings.winrtUwp.Windows.Services.Store.StoreAcquireLicenseResult {
  /** Gets the error code for the request, if the operation encountered an error. */
  /* CompleteClass */
  override var extendedError: WinRTError = js.native
  /** Gets an object that represents the downloadable content (DLC) package license. */
  /* CompleteClass */
  override var storePackageLicense: typings.winrtUwp.Windows.Services.Store.StorePackageLicense = js.native
}

