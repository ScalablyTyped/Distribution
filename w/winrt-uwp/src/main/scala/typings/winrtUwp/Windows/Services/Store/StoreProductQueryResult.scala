package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a request to retrieve details about products that can be purchased from within the current app. */
@js.native
trait StoreProductQueryResult extends StObject {
  
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
  implicit class StoreProductQueryResultMutableBuilder[Self <: StoreProductQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducts(value: IMapView[String, StoreProduct]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
  }
}
