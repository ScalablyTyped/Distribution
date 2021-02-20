package typings.wordpressEditPost

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressEditPost.pluginSidebarMoreMenuItemMod.PluginSidebarMoreMenuItem.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginSidebarMoreMenuItemMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/edit-post/components/header/plugin-sidebar-more-menu-item", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PluginSidebarMoreMenuItem {
    
    @js.native
    trait Props extends StObject {
      
      var children: ReactNode = js.native
      
      /**
        * A Dashicon slug or a custom JSX element to be rendered to the left of the menu item
        * label.
        */
      var icon: js.UndefOr[Icon | Element] = js.native
      
      /**
        * A string identifying the target sidebar you wish to be activated by this menu item. Must
        * be the same as the `name` prop you have given to that sidebar.
        */
      var target: String = js.native
    }
    object Props {
      
      @scala.inline
      def apply(target: String): Props = {
        val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setIcon(value: Icon | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
  }
}
