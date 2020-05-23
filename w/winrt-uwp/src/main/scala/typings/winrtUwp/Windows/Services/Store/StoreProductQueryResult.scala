package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to retrieve details about products that can be purchased from within the current app. */
trait StoreProductQueryResult extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError
  /** Gets the collection of products returned by the request. */
  var products: IMapView[String, StoreProduct]
}

object StoreProductQueryResult {
  @scala.inline
  def apply(extendedError: WinRTError, products: IMapView[String, StoreProduct]): StoreProductQueryResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreProductQueryResult]
  }
}

