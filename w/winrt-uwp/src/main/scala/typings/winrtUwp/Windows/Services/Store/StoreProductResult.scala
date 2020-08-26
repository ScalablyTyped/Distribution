package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to retrieve details about the current app. */
@js.native
trait StoreProductResult extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets info about the current app. */
  var product: StoreProduct = js.native
}

object StoreProductResult {
  @scala.inline
  def apply(extendedError: WinRTError, product: StoreProduct): StoreProductResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreProductResult]
  }
  @scala.inline
  implicit class StoreProductResultOps[Self <: StoreProductResult] (val x: Self) extends AnyVal {
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
    def setProduct(value: StoreProduct): Self = this.set("product", value.asInstanceOf[js.Any])
  }
  
}

