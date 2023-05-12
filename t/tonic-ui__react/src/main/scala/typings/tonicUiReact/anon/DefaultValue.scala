package typings.tonicUiReact.anon

import typings.tonicUiReact.mod.ThemeColorModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  var defaultValue: ThemeColorModes
  
  var value: js.UndefOr[ThemeColorModes] = js.undefined
}
object DefaultValue {
  
  inline def apply(defaultValue: ThemeColorModes): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: ThemeColorModes): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ThemeColorModes): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
