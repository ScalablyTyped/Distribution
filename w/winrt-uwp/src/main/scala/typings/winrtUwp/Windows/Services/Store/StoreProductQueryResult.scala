package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to retrieve details about products that can be purchased from within the current app. */
@js.native
trait StoreProductQueryResult extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets the collection of products returned by the request. */
  var products: IMapView[String, StoreProduct] = js.native
}

object StoreProductQueryResult {
  @scala.inline
  def apply(extendedError: WinRTError, products: IMapView[String, StoreProduct]): StoreProductQueryResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreProductQueryResult]
  }
  @scala.inline
  implicit class StoreProductQueryResultOps[Self <: StoreProductQueryResult] (val x: Self) extends AnyVal {
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
    def setProducts(value: IMapView[String, StoreProduct]): Self = this.set("products", value.asInstanceOf[js.Any])
  }
  
}

