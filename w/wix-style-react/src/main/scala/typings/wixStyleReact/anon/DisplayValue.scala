package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayValue extends StObject {
  
  var displayValue: Requireable[String]
  
  var label: Validator[String]
  
  var value: Validator[Double]
}
object DisplayValue {
  
  inline def apply(displayValue: Requireable[String], label: Validator[String], value: Validator[Double]): DisplayValue = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayValue]
  }
  
  extension [Self <: DisplayValue](x: Self) {
    
    inline def setDisplayValue(value: Requireable[String]): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Validator[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Validator[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
