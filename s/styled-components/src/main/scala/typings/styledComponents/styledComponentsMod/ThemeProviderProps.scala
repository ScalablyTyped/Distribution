package typings.styledComponents.styledComponentsMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeProviderProps[T /* <: js.Object */, U /* <: js.Object */] extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var theme: T | (js.Function1[/* theme */ U, T])
}
object ThemeProviderProps {
  
  inline def apply[T /* <: js.Object */, U /* <: js.Object */](theme: T | (js.Function1[/* theme */ U, T])): ThemeProviderProps[T, U] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[T, U]]
  }
  
  extension [Self <: ThemeProviderProps[?, ?], T /* <: js.Object */, U /* <: js.Object */](x: Self & (ThemeProviderProps[T, U])) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setTheme(value: T | (js.Function1[/* theme */ U, T])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeFunction1(value: /* theme */ U => T): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
  }
}
