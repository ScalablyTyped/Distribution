package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalMobileLayoutModalMobileLayoutMod {
  
  @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", JSImport.Default)
  @js.native
  open class default protected () extends ModalMobileLayout {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.defaultProps.fullscreen")
      @js.native
      def fullscreen: Boolean = js.native
      inline def fullscreen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.defaultProps.stickyFooter")
      @js.native
      def stickyFooter: Boolean = js.native
      inline def stickyFooter_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyFooter")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.defaultProps.stickyTitle")
      @js.native
      def stickyTitle: Boolean = js.native
      inline def stickyTitle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyTitle")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** A css class to be applied to the component's root element */
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** content node to be displayed */
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes.content")
      @js.native
      def content: Requireable[ReactNodeLike] = js.native
      inline def content_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** footer node to be displayed */
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes.footer")
      @js.native
      def footer: Requireable[ReactNodeLike] = js.native
      inline def footer_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footer")(x.asInstanceOf[js.Any])
      
      /** If true, the modal will take all of the screen */
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes.fullscreen")
      @js.native
      def fullscreen: Requireable[Boolean] = js.native
      inline def fullscreen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(x.asInstanceOf[js.Any])
      
      /** callback for when the the close button is clicked.  **Note**: if this prop is not provided, then the close button will not be shown. */
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes.onCloseButtonClick")
      @js.native
      def onCloseButtonClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCloseButtonClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCloseButtonClick")(x.asInstanceOf[js.Any])
      
      /** callback for when there's a click on the overlay (in case the modal in not fullscreen) */
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes.onOverlayClick")
      @js.native
      def onOverlayClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onOverlayClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOverlayClick")(x.asInstanceOf[js.Any])
      
      /** If true, the footer will be sticky to the bottom of the modal */
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes.stickyFooter")
      @js.native
      def stickyFooter: Requireable[Boolean] = js.native
      inline def stickyFooter_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyFooter")(x.asInstanceOf[js.Any])
      
      /** If true, the title will be sticky to the top of the modal */
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes.stickyTitle")
      @js.native
      def stickyTitle: Requireable[Boolean] = js.native
      inline def stickyTitle_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyTitle")(x.asInstanceOf[js.Any])
      
      /** title node to be displayed in the header strip */
      @JSImport("wix-style-react/dist/types/ModalMobileLayout/ModalMobileLayout", "default.propTypes.title")
      @js.native
      def title: Requireable[ReactNodeLike] = js.native
      inline def title_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModalMobileLayout extends PureComponent[Any, Any, Any] {
    
    def _renderFooter(): Element = js.native
    
    def _renderTitle(): Element = js.native
  }
}
