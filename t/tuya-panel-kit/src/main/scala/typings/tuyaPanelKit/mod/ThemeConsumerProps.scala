package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.tuyaPanelKit.themeMod.GlobalTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeConsumerProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var theme: js.UndefOr[GlobalTheme] = js.undefined
}
object ThemeConsumerProps {
  
  inline def apply(): ThemeConsumerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeConsumerProps]
  }
  
  extension [Self <: ThemeConsumerProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setTheme(value: GlobalTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
