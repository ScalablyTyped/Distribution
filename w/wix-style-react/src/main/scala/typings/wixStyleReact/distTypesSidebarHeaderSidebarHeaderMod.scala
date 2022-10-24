package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarHeaderSidebarHeaderMod {
  
  /** A header within the sidebar with title, subtitle and custom content at the bottom. */
  @JSImport("wix-style-react/dist/types/SidebarHeader/SidebarHeader", JSImport.Default)
  @js.native
  open class default protected () extends SidebarHeader {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SidebarHeader/SidebarHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SidebarHeader/SidebarHeader", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SidebarHeader/SidebarHeader", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** A custom node to render from the bottom */
      @JSImport("wix-style-react/dist/types/SidebarHeader/SidebarHeader", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/SidebarHeader/SidebarHeader", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** A text to show as the header subtitle */
      @JSImport("wix-style-react/dist/types/SidebarHeader/SidebarHeader", "default.propTypes.subtitle")
      @js.native
      def subtitle: Requireable[ReactNodeLike] = js.native
      inline def subtitle_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(x.asInstanceOf[js.Any])
      
      /** A text to show as the header title */
      @JSImport("wix-style-react/dist/types/SidebarHeader/SidebarHeader", "default.propTypes.title")
      @js.native
      def title: Requireable[ReactNodeLike] = js.native
      inline def title_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  /** A header within the sidebar with title, subtitle and custom content at the bottom. */
  @js.native
  trait SidebarHeader extends PureComponent[Any, Any, Any]
}
