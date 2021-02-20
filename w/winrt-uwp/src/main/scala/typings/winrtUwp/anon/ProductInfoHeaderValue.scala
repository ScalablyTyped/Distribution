package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpProductInfoHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductInfoHeaderValue extends StObject {
  
  /** The HttpProductInfoHeaderValue version of the string. */ var productInfoHeaderValue: HttpProductInfoHeaderValue = js.native
  
  /** true if input is valid HttpProductInfoHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}
object ProductInfoHeaderValue {
  
  @scala.inline
  def apply(productInfoHeaderValue: HttpProductInfoHeaderValue, returnValue: Boolean): ProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(productInfoHeaderValue = productInfoHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductInfoHeaderValue]
  }
  
  @scala.inline
  implicit class ProductInfoHeaderValueMutableBuilder[Self <: ProductInfoHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductInfoHeaderValue(value: HttpProductInfoHeaderValue): Self = StObject.set(x, "productInfoHeaderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
