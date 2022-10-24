package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var disabled: Any
  
  var id: Any
  
  var label: Any
  
  var overrideOptionStyle: Boolean
  
  def value(param0: Dictx): typings.react.mod.global.JSX.Element
}
object Label {
  
  inline def apply(
    disabled: Any,
    id: Any,
    label: Any,
    overrideOptionStyle: Boolean,
    value: Dictx => typings.react.mod.global.JSX.Element
  ): Label = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], overrideOptionStyle = overrideOptionStyle.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOverrideOptionStyle(value: Boolean): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Dictx => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
