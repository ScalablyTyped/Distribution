package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.OnCloseButtonClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidePanelSidePanelMod {
  
  @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", JSImport.Default)
  @js.native
  open class default protected () extends SidePanel {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onCloseButtonClick(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("onCloseButtonClick")().asInstanceOf[Null]
      
      @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", "default.defaultProps.width")
      @js.native
      def width: String = js.native
      inline def width_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** SidePanel.Header, SidePanel.Content, SidePanel.Footer, SidePanel.Divider or Any element to be rendered inside */
      @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Define styles through a classname */
      @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Callback for close button */
      @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", "default.propTypes.onCloseButtonClick")
      @js.native
      def onCloseButtonClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCloseButtonClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCloseButtonClick")(x.asInstanceOf[js.Any])
      
      /** Width of the SidePanel */
      @JSImport("wix-style-react/dist/types/SidePanel/SidePanel", "default.propTypes.width")
      @js.native
      def width: Requireable[String | Double] = js.native
      inline def width_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SidePanel extends PureComponent[Any, Any, Any] {
    
    var sidePanelContext: OnCloseButtonClick = js.native
  }
}
