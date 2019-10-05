package typings.winrtDashUwp.Windows.Services.Store

import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to retrieve details about the current app. */
@JSGlobal("Windows.Services.Store.StoreProductResult")
@js.native
abstract class StoreProductResult () extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets info about the current app. */
  var product: StoreProduct = js.native
}

