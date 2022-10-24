package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCloseButtonCloseButtonMod {
  
  @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", JSImport.Default)
  @js.native
  open class default protected () extends CloseButton {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** render as some other component or DOM tag */
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.propTypes.as")
      @js.native
      def as: Requireable[String | js.Object] = js.native
      inline def as_=(x: Requireable[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("as")(x.asInstanceOf[js.Any])
      
      /** Used for passing any wix-style-react icon. For external icon make sure to follow ux sizing guidelines */
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** additional css classes */
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** string based data hook for testing */
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** applies disabled styles */
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** Click event handler  */
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      /** size of closebutton */
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** skins of closebutton */
      @JSImport("wix-style-react/dist/types/CloseButton/CloseButton", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CloseButton extends PureComponent[Any, Any, Any] {
    
    def _renderCloseIcon(Icon: Any, size: Any): Element = js.native
  }
}
