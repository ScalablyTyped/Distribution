package typings.wordpressEditPost

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressEditPost.anon.OmitPropsname
import typings.wordpressEditPost.pluginDocumentSettingPanelMod.PluginDocumentSettingPanel.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginDocumentSettingPanelMod {
  
  /**
    * Renders items below the Status & Availability panel in the Document Sidebar.
    *
    * @example
    * ```jsx
    * const { registerPlugin } = wp.plugins;
    * const { PluginDocumentSettingPanel } = wp.editPost;
    *
    * const MyDocumentSettingTest = () => (
    *     <PluginDocumentSettingPanel className="my-document-setting-plugin" title="My Panel">
    *         <p>My Document Setting Panel</p>
    *     </PluginDocumentSettingPanel>
    * );
    *
    * registerPlugin( 'document-setting-test', { render: MyDocumentSettingTest } );
    * ```
    */
  object default {
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-document-setting-panel", JSImport.Default)
    @js.native
    def apply(props: Props): Element = js.native
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-document-setting-panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-document-setting-panel", "default.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object PluginDocumentSettingPanel {
    
    @js.native
    trait Props extends StObject {
      
      var children: ReactNode = js.native
      
      /**
        * An optional class name added to the row.
        */
      var className: js.UndefOr[String] = js.native
      
      /**
        * A Dashicon slug or a custom JSX element to be rendered when the sidebar is pinned to
        * toolbar.
        */
      var icon: js.UndefOr[Icon | Element] = js.native
      
      /**
        * The machine-friendly name for the panel.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * The title of the panel.
        */
      var title: js.UndefOr[String] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setIcon(value: Icon | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
