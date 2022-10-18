package typings.wordpressEditPost

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressEditPost.componentsHeaderPluginSidebarMoreMenuItemMod.PluginSidebarMoreMenuItem.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHeaderPluginSidebarMoreMenuItemMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/edit-post/components/header/plugin-sidebar-more-menu-item", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PluginSidebarMoreMenuItem {
    
    trait Props extends StObject {
      
      var children: ReactNode
      
      /**
        * A Dashicon slug or a custom JSX element to be rendered to the left of the menu item
        * label.
        */
      var icon: js.UndefOr[Icon | Element] = js.undefined
      
      /**
        * A string identifying the target sidebar you wish to be activated by this menu item. Must
        * be the same as the `name` prop you have given to that sidebar.
        */
      var target: String
    }
    object Props {
      
      inline def apply(target: String): Props = {
        val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setIcon(value: Icon | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
  }
}
