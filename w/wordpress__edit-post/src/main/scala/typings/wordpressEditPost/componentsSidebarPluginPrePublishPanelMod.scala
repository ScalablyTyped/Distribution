package typings.wordpressEditPost

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressEditPost.anon.OmitPropsname
import typings.wordpressEditPost.componentsSidebarPluginPrePublishPanelMod.PluginPrePublishPanel.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSidebarPluginPrePublishPanelMod {
  
  /**
    * Renders provided content to the pre-publish side panel in the publish flow (side panel that opens
    * when a user first pushes "Publish" from the main editor).
    *
    * @example
    * ```jsx
    * const { PluginPrePublishPanel } = wp.editPost;
    *
    * const MyPluginPrePublishPanel = () => (
    *     <PluginPrePublishPanel
    *         className="my-plugin-pre-publish-panel"
    *         title="My panel title"
    *         initialOpen={true}
    *     >
    *         My panel content
    *     </PluginPrePublishPanel>
    * );
    * ```
    */
  object default {
    
    inline def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-pre-publish-panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-pre-publish-panel", "default.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object PluginPrePublishPanel {
    
    trait Props extends StObject {
      
      var children: ReactNode
      
      /**
        * An optional class name added to the panel.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Whether to have the panel initially opened. When no title is provided it is always
        * opened.
        * @defaultValue `false`
        */
      var initialOpen: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Title displayed at the top of the panel.
        */
      var title: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setInitialOpen(value: Boolean): Self = StObject.set(x, "initialOpen", value.asInstanceOf[js.Any])
        
        inline def setInitialOpenUndefined: Self = StObject.set(x, "initialOpen", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
