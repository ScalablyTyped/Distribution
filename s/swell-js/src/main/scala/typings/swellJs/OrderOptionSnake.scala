package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderOptionSnake extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var price: js.UndefOr[Double] = js.undefined
  
  var shipment_weight: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var value_id: String
  
  var variant: js.UndefOr[Boolean] = js.undefined
}
object OrderOptionSnake {
  
  inline def apply(value_id: String): OrderOptionSnake = {
    val __obj = js.Dynamic.literal(value_id = value_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderOptionSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderOptionSnake] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setShipment_weight(value: Double): Self = StObject.set(x, "shipment_weight", value.asInstanceOf[js.Any])
    
    inline def setShipment_weightUndefined: Self = StObject.set(x, "shipment_weight", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValue_id(value: String): Self = StObject.set(x, "value_id", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: Boolean): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
