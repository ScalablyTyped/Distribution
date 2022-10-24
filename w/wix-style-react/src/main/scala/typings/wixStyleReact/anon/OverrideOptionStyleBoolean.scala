package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideOptionStyleBoolean extends StObject {
  
  var disabled: Boolean
  
  var id: Any
  
  var overrideOptionStyle: Boolean
  
  def value(props: Any): typings.react.mod.global.JSX.Element
}
object OverrideOptionStyleBoolean {
  
  inline def apply(
    disabled: Boolean,
    id: Any,
    overrideOptionStyle: Boolean,
    value: Any => typings.react.mod.global.JSX.Element
  ): OverrideOptionStyleBoolean = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], overrideOptionStyle = overrideOptionStyle.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[OverrideOptionStyleBoolean]
  }
  
  extension [Self <: OverrideOptionStyleBoolean](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverrideOptionStyle(value: Boolean): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
