package typings.wixUiCore.anon

import typings.wixUiCore.focusableFocusableHOCDriverMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelStringValue extends StObject {
  
  var label: String
  
  var value: Window & (/* globalThis */ js.Any)
}
object LabelStringValue {
  
  inline def apply(label: String, value: Window & (/* globalThis */ js.Any)): LabelStringValue = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStringValue]
  }
  
  extension [Self <: LabelStringValue](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Window & (/* globalThis */ js.Any)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
