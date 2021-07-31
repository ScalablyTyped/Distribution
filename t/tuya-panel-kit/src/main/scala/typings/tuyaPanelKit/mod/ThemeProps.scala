package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeProps extends StObject {
  
  var children: ReactNode
}
object ThemeProps {
  
  @scala.inline
  def apply(): ThemeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProps]
  }
  
  @scala.inline
  implicit class ThemePropsMutableBuilder[Self <: ThemeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
