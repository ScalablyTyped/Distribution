package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarSectionTitleMod {
  
  @JSImport("wix-style-react/dist/es/src/SidebarSectionTitle", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SidebarSectionTitleProps, js.Object, js.Any]
  
  type SidebarSectionTitle = PureComponent[SidebarSectionTitleProps, js.Object, js.Any]
  
  trait SidebarSectionTitleProps extends StObject {
    
    var children: ReactNode
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object SidebarSectionTitleProps {
    
    @scala.inline
    def apply(): SidebarSectionTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarSectionTitleProps]
    }
    
    @scala.inline
    implicit class SidebarSectionTitlePropsMutableBuilder[Self <: SidebarSectionTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
}
