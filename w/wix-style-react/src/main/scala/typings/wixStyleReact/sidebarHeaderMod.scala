package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarHeaderMod {
  
  @JSImport("wix-style-react/dist/es/src/SidebarHeader", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SidebarHeaderProps, js.Object, js.Any]
  
  type SidebarHeader = PureComponent[SidebarHeaderProps, js.Object, js.Any]
  
  trait SidebarHeaderProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object SidebarHeaderProps {
    
    @scala.inline
    def apply(): SidebarHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarHeaderProps]
    }
    
    @scala.inline
    implicit class SidebarHeaderPropsMutableBuilder[Self <: SidebarHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
