package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a request to retrieve details about the current app. */
@js.native
trait StoreProductResult extends StObject {
  
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
  implicit class StoreProductResultMutableBuilder[Self <: StoreProductResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: StoreProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
  }
}
