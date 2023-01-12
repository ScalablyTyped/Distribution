package typings.swellJs.mod

import typings.swellJs.anon.Planid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartInput extends StObject {
  
  var options: js.UndefOr[js.Array[CartOption]] = js.undefined
  
  var product_id: String
  
  var purchase_option: js.UndefOr[Planid] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
}
object CartInput {
  
  inline def apply(product_id: String): CartInput = {
    val __obj = js.Dynamic.literal(product_id = product_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartInput] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: js.Array[CartOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: CartOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setPurchase_option(value: Planid): Self = StObject.set(x, "purchase_option", value.asInstanceOf[js.Any])
    
    inline def setPurchase_optionUndefined: Self = StObject.set(x, "purchase_option", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
