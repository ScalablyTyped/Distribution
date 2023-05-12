package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartItemOptionsSnake extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var price: js.UndefOr[Double] = js.undefined
  
  var shipment_weight: Double
  
  var value: js.UndefOr[String] = js.undefined
  
  var variant: js.UndefOr[Boolean] = js.undefined
}
object CartItemOptionsSnake {
  
  inline def apply(shipment_weight: Double): CartItemOptionsSnake = {
    val __obj = js.Dynamic.literal(shipment_weight = shipment_weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartItemOptionsSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartItemOptionsSnake] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setShipment_weight(value: Double): Self = StObject.set(x, "shipment_weight", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: Boolean): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
