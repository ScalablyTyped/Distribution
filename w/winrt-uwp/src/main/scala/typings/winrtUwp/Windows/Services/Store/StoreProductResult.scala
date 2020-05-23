package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to retrieve details about the current app. */
trait StoreProductResult extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError
  /** Gets info about the current app. */
  var product: StoreProduct
}

object StoreProductResult {
  @scala.inline
  def apply(extendedError: WinRTError, product: StoreProduct): StoreProductResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreProductResult]
  }
}

