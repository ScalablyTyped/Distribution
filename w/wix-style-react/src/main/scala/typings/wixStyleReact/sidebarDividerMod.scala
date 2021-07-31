package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarDividerMod {
  
  @JSImport("wix-style-react/dist/es/src/SidebarDivider", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SidebarDividerProps, js.Object, js.Any]
  
  type SidebarDivider = PureComponent[SidebarDividerProps, js.Object, js.Any]
  
  trait SidebarDividerProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
  }
  object SidebarDividerProps {
    
    @scala.inline
    def apply(): SidebarDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarDividerProps]
    }
    
    @scala.inline
    implicit class SidebarDividerPropsMutableBuilder[Self <: SidebarDividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    }
  }
}
