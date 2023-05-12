package typings.tonicUiReact.mod

import typings.tonicUiReact.anon.DefaultValue
import typings.tonicUiReact.anon.DefaultValueDark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TonicProviderProps extends StObject {
  
  var colorMode: js.UndefOr[DefaultValue] = js.undefined
  
  var colorStyle: js.UndefOr[DefaultValueDark] = js.undefined
  
  var theme: js.UndefOr[TonicProviderTheme] = js.undefined
  
  var useCSSBaseline: js.UndefOr[Boolean] = js.undefined
}
object TonicProviderProps {
  
  inline def apply(): TonicProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TonicProviderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TonicProviderProps] (val x: Self) extends AnyVal {
    
    inline def setColorMode(value: DefaultValue): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
    
    inline def setColorStyle(value: DefaultValueDark): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    inline def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    inline def setTheme(value: TonicProviderTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUseCSSBaseline(value: Boolean): Self = StObject.set(x, "useCSSBaseline", value.asInstanceOf[js.Any])
    
    inline def setUseCSSBaselineUndefined: Self = StObject.set(x, "useCSSBaseline", js.undefined)
  }
}
