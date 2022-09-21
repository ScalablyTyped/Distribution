package typings.unsplashJs.anon

import typings.unsplashJs.photosTypesMod.StatValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  var change: Double
  
  var quantity: Double
  
  var resolution: String
  
  var values: js.Array[StatValue]
}
object Change {
  
  inline def apply(change: Double, quantity: Double, resolution: String, values: js.Array[StatValue]): Change = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  extension [Self <: Change](x: Self) {
    
    inline def setChange(value: Double): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[StatValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: StatValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
