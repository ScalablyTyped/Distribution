package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinValue extends StObject {
  
  var maxValue: typings.wixStyleReact.distTypesInputMod.MaxValue
  
  var minValue: typings.wixStyleReact.distTypesInputMod.MinValue
  
  var value: Double
}
object MinValue {
  
  inline def apply(value: Double): MinValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinValue]
  }
  
  extension [Self <: MinValue](x: Self) {
    
    inline def setMaxValue(value: typings.wixStyleReact.distTypesInputMod.MaxValue): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: typings.wixStyleReact.distTypesInputMod.MinValue): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
