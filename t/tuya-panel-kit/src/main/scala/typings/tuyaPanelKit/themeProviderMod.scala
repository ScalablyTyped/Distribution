package typings.tuyaPanelKit

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.tuyaPanelKit.nativeTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/native/theming/ThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasValueChildren: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasValueChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  trait Props extends StObject {
    
    var children: ReactNode
    
    var value: Theme
  }
  object Props {
    
    @scala.inline
    def apply(value: Theme): Props = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setValue(value: Theme): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
