package typings.winrtDashUwp.Windows.Services.Store

import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to retrieve details about products that can be purchased from within the current app. */
@JSGlobal("Windows.Services.Store.StoreProductQueryResult")
@js.native
abstract class StoreProductQueryResult () extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets the collection of products returned by the request. */
  var products: IMapView[String, StoreProduct] = js.native
}

