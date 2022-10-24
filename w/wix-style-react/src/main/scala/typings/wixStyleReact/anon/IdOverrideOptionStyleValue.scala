package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdOverrideOptionStyleValue extends StObject {
  
  var disabled: Any
  
  var id: Any
  
  var overrideOptionStyle: Boolean
  
  def value(param0: HoveredAny): typings.react.mod.global.JSX.Element
}
object IdOverrideOptionStyleValue {
  
  inline def apply(
    disabled: Any,
    id: Any,
    overrideOptionStyle: Boolean,
    value: HoveredAny => typings.react.mod.global.JSX.Element
  ): IdOverrideOptionStyleValue = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], overrideOptionStyle = overrideOptionStyle.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[IdOverrideOptionStyleValue]
  }
  
  extension [Self <: IdOverrideOptionStyleValue](x: Self) {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverrideOptionStyle(value: Boolean): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: HoveredAny => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
