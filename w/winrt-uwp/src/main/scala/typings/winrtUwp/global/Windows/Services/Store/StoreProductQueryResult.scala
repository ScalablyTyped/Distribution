package typings.winrtUwp.global.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to retrieve details about products that can be purchased from within the current app. */
@JSGlobal("Windows.Services.Store.StoreProductQueryResult")
@js.native
abstract class StoreProductQueryResult ()
  extends typings.winrtUwp.Windows.Services.Store.StoreProductQueryResult {
  /** Gets the error code for the request, if the operation encountered an error. */
  /* CompleteClass */
  override var extendedError: WinRTError = js.native
  /** Gets the collection of products returned by the request. */
  /* CompleteClass */
  override var products: IMapView[String, typings.winrtUwp.Windows.Services.Store.StoreProduct] = js.native
}

