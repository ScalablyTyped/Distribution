package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayValueLabel extends StObject {
  
  var displayValue: Any
  
  var label: Any
  
  var value: Any
}
object DisplayValueLabel {
  
  inline def apply(displayValue: Any, label: Any, value: Any): DisplayValueLabel = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayValueLabel]
  }
  
  extension [Self <: DisplayValueLabel](x: Self) {
    
    inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
