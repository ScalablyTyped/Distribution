package typings.wordpressEditPost

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressEditPost.anon.OmitPropsname
import typings.wordpressEditPost.pluginPostStatusInfoMod.PluginPostStatusInfo.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginPostStatusInfoMod {
  
  /**
    * Renders a row in the Status & Visibility panel of the Document sidebar.
    * It should be noted that this is named and implemented around the function it serves
    * and not its location, which may change in future iterations.
    *
    * @example
    * ```jsx
    * const { PluginPostStatusInfo } = wp.editPost;
    *
    * const MyPluginPostStatusInfo = () => (
    *     <PluginPostStatusInfo className="my-plugin-post-status-info">
    *         My post status info
    *     </PluginPostStatusInfo>
    * );
    * ```
    */
  object default {
    
    @scala.inline
    def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-post-status-info", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-post-status-info", "default.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object PluginPostStatusInfo {
    
    trait Props extends StObject {
      
      var children: ReactNode
      
      /**
        * An optional class name added to the row.
        */
      var className: js.UndefOr[String] = js.undefined
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
      }
    }
  }
}
