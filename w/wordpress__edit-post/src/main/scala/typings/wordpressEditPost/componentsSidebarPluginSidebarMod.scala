package typings.wordpressEditPost

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressEditPost.componentsSidebarPluginSidebarMod.PluginSidebar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSidebarPluginSidebarMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-sidebar", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PluginSidebar {
    
    trait Props extends StObject {
      
      var children: ReactNode
      
      /**
        * An optional class name added to the sidebar body.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * A Dashicon slug or a custom JSX element to be rendered when the sidebar is pinned to
        * toolbar.
        */
      var icon: js.UndefOr[Icon | Element] = js.undefined
      
      /**
        * Whether to allow to pin sidebar to toolbar.
        * @defaultValue `true`
        */
      var isPinnable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A string identifying the sidebar. Must be unique for every sidebar registered within the
        * scope of your plugin.
        */
      var name: String
      
      /**
        * Title displayed at the top of the sidebar.
        */
      var title: String
    }
    object Props {
      
      inline def apply(name: String, title: String): Props = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setIcon(value: Icon | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setIsPinnable(value: Boolean): Self = StObject.set(x, "isPinnable", value.asInstanceOf[js.Any])
        
        inline def setIsPinnableUndefined: Self = StObject.set(x, "isPinnable", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
  }
}
