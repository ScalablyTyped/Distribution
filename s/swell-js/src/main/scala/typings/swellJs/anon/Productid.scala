package typings.swellJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Productid extends StObject {
  
  var product_id: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value_amount: js.UndefOr[Double] = js.undefined
  
  var value_type: js.UndefOr[String] = js.undefined
}
object Productid {
  
  inline def apply(): Productid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Productid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Productid] (val x: Self) extends AnyVal {
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setProduct_idUndefined: Self = StObject.set(x, "product_id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue_amount(value: Double): Self = StObject.set(x, "value_amount", value.asInstanceOf[js.Any])
    
    inline def setValue_amountUndefined: Self = StObject.set(x, "value_amount", js.undefined)
    
    inline def setValue_type(value: String): Self = StObject.set(x, "value_type", value.asInstanceOf[js.Any])
    
    inline def setValue_typeUndefined: Self = StObject.set(x, "value_type", js.undefined)
  }
}
