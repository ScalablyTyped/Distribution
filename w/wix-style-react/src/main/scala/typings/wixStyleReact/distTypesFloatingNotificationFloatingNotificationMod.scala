package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingNotificationFloatingNotificationMod {
  
  /**
    * Displays simple and temporary messages or destructive events
    */
  @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", JSImport.Default)
  @js.native
  open class default protected () extends FloatingNotification {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.defaultProps.showCloseButton")
      @js.native
      def showCloseButton: Boolean = js.native
      inline def showCloseButton_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.defaultProps.type")
      @js.native
      val `type`: String = js.native
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** props to pass to button - renders the Button when not empty */
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.buttonProps")
      @js.native
      def buttonProps: Requireable[InferProps[Href]] = js.native
      inline def buttonProps_=(x: Requireable[InferProps[Href]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buttonProps")(x.asInstanceOf[js.Any])
      
      /** A css class to be applied to the component's root element */
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Is notification full width (removes left and right border, border radius, more height and bigger paddings) */
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.fullWidth")
      @js.native
      def fullWidth: Requireable[Boolean] = js.native
      inline def fullWidth_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(x.asInstanceOf[js.Any])
      
      /** close button on click handler */
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.onClose")
      @js.native
      def onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      /** An icon element to appear before content */
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.prefixIcon")
      @js.native
      def prefixIcon: Requireable[ReactElementLike] = js.native
      inline def prefixIcon_=(x: Requireable[ReactElementLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixIcon")(x.asInstanceOf[js.Any])
      
      /** decides if to show the close button */
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.showCloseButton")
      @js.native
      def showCloseButton: Requireable[Boolean] = js.native
      inline def showCloseButton_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(x.asInstanceOf[js.Any])
      
      /** The text content of the notification */
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.text")
      @js.native
      def text: Requireable[ReactNodeLike] = js.native
      
      /** props to pass to textButton - renders the TextButton when not empty*/
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.textButtonProps")
      @js.native
      def textButtonProps: Requireable[InferProps[Href]] = js.native
      inline def textButtonProps_=(x: Requireable[InferProps[Href]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textButtonProps")(x.asInstanceOf[js.Any])
      
      inline def text_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
      
      /** the type of notification */
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
      
      /** The width of the content container of the notification */
      @JSImport("wix-style-react/dist/types/FloatingNotification/FloatingNotification", "default.propTypes.width")
      @js.native
      def width: Requireable[String] = js.native
      inline def width_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Displays simple and temporary messages or destructive events
    */
  @js.native
  trait FloatingNotification extends PureComponent[Any, Any, Any] {
    
    def _getButton(): Element | Null = js.native
    
    def _getClose(): Element | Null = js.native
    
    def _getContent(): Element = js.native
    
    def _getIcon(): Element | Null = js.native
    
    def _getTextButton(): Element | Null = js.native
  }
}
