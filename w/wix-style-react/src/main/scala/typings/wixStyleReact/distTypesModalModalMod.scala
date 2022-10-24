package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalModalMod {
  
  @JSImport("wix-style-react/dist/types/Modal/Modal", JSImport.Default)
  @js.native
  open class default protected () extends Modal {
    def this(props: Any) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.borderRadius")
      @js.native
      def borderRadius: Double = js.native
      inline def borderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.closeTimeoutMS")
      @js.native
      def closeTimeoutMS: Double = js.native
      inline def closeTimeoutMS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeTimeoutMS")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.height")
      @js.native
      def height: String = js.native
      inline def height_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.horizontalPosition")
      @js.native
      def horizontalPosition: String = js.native
      inline def horizontalPosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontalPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.maxHeight")
      @js.native
      def maxHeight: String = js.native
      inline def maxHeight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.overlayPosition")
      @js.native
      def overlayPosition: String = js.native
      inline def overlayPosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overlayPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.screen")
      @js.native
      def screen: String = js.native
      inline def screen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screen")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.scrollable")
      @js.native
      def scrollable: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.scrollableContent")
      @js.native
      def scrollableContent: Boolean = js.native
      inline def scrollableContent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollableContent")(x.asInstanceOf[js.Any])
      
      inline def scrollable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.shouldCloseOnOverlayClick")
      @js.native
      def shouldCloseOnOverlayClick: Boolean = js.native
      inline def shouldCloseOnOverlayClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldCloseOnOverlayClick")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.shouldDisplayCloseButton")
      @js.native
      def shouldDisplayCloseButton: Boolean = js.native
      inline def shouldDisplayCloseButton_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldDisplayCloseButton")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.defaultProps.verticalPosition")
      @js.native
      def verticalPosition: String = js.native
      inline def verticalPosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verticalPosition")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Selector specifying where to apply the aria-hidden attribute */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.appElement")
      @js.native
      def appElement: Requireable[String] = js.native
      inline def appElement_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appElement")(x.asInstanceOf[js.Any])
      
      /** Border radius of modal */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.borderRadius")
      @js.native
      def borderRadius: Requireable[Double] = js.native
      inline def borderRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
      
      /** Renders modal content */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.children")
      @js.native
      def children: Requireable[Any] = js.native
      inline def children_=(x: Requireable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Number indicating the milliseconds to wait before closing the modal */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.closeTimeoutMS")
      @js.native
      def closeTimeoutMS: Requireable[Double] = js.native
      inline def closeTimeoutMS_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeTimeoutMS")(x.asInstanceOf[js.Any])
      
      /** a11y: The value of contentLabel is set as an aria-label on the modal element. This helps assistive technology, like screen readers, to add a label to an element that would otherwise be anonymous */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.contentLabel")
      @js.native
      def contentLabel: Requireable[String] = js.native
      inline def contentLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentLabel")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used to create driver in testing */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Sets the height for modal's content container */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.height")
      @js.native
      def height: Requireable[String] = js.native
      inline def height_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      /** Horizontal position of the modal */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.horizontalPosition")
      @js.native
      def horizontalPosition: Requireable[String] = js.native
      inline def horizontalPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontalPosition")(x.asInstanceOf[js.Any])
      
      /** Controls if modal is open or closed */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.isOpen")
      @js.native
      def isOpen: Validator[Boolean] = js.native
      inline def isOpen_=(x: Validator[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      /** Sets the maximum height for a scrollable content */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.maxHeight")
      @js.native
      def maxHeight: Requireable[String] = js.native
      inline def maxHeight_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(x.asInstanceOf[js.Any])
      
      /** Label used for navigation control next button tooltip */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.navigationNextLabel")
      @js.native
      def navigationNextLabel: Requireable[String] = js.native
      inline def navigationNextLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigationNextLabel")(x.asInstanceOf[js.Any])
      
      /** Label used for navigation control previous button tooltip */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.navigationPreviousLabel")
      @js.native
      def navigationPreviousLabel: Requireable[String] = js.native
      inline def navigationPreviousLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigationPreviousLabel")(x.asInstanceOf[js.Any])
      
      /** Callback that will be executed after the modal has been closed */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.onAfterClose")
      @js.native
      def onAfterClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onAfterClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAfterClose")(x.asInstanceOf[js.Any])
      
      /** Callback that will be executed after the modal has been opened */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.onAfterOpen")
      @js.native
      def onAfterOpen: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onAfterOpen_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAfterOpen")(x.asInstanceOf[js.Any])
      
      /** Callback that will be executed when the navigation control next is clicked */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.onNavigationClickNext")
      @js.native
      def onNavigationClickNext: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onNavigationClickNext_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onNavigationClickNext")(x.asInstanceOf[js.Any])
      
      /** Callback that will be executed when the navigation control previous is clicked */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.onNavigationClickPrevious")
      @js.native
      def onNavigationClickPrevious: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onNavigationClickPrevious_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onNavigationClickPrevious")(x.asInstanceOf[js.Any])
      
      /** Callback that will be executed when the modal is requested to be closed, prior to actually closing */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.onRequestClose")
      @js.native
      def onRequestClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onRequestClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(x.asInstanceOf[js.Any])
      
      /** css position of the modal overlay */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.overlayPosition")
      @js.native
      def overlayPosition: Requireable[String] = js.native
      inline def overlayPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overlayPosition")(x.asInstanceOf[js.Any])
      
      /** A function that returns a DOM element on which the modal should be appended to */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.parentSelector")
      @js.native
      def parentSelector: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def parentSelector_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentSelector")(x.asInstanceOf[js.Any])
      
      /** Specifies minimum spacing between full viewport and modal content */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.screen")
      @js.native
      def screen: Requireable[String] = js.native
      inline def screen_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screen")(x.asInstanceOf[js.Any])
      
      /** Specifies if modal portal supports scroll */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.scrollable")
      @js.native
      def scrollable: Requireable[Boolean] = js.native
      
      /** Specifies if modal content should become scrollable when modal size will fit the window */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.scrollableContent")
      @js.native
      def scrollableContent: Requireable[Boolean] = js.native
      inline def scrollableContent_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollableContent")(x.asInstanceOf[js.Any])
      
      inline def scrollable_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(x.asInstanceOf[js.Any])
      
      /** Enables to close modal when mouse clicked on overlay area */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.shouldCloseOnOverlayClick")
      @js.native
      def shouldCloseOnOverlayClick: Requireable[Boolean] = js.native
      inline def shouldCloseOnOverlayClick_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldCloseOnOverlayClick")(x.asInstanceOf[js.Any])
      
      /** Displays a close button on the top right corner of the overlay */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.shouldDisplayCloseButton")
      @js.native
      def shouldDisplayCloseButton: Requireable[Boolean] = js.native
      inline def shouldDisplayCloseButton_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldDisplayCloseButton")(x.asInstanceOf[js.Any])
      
      /** Enable navigation next button to the side of the content and listen on clicks by using onNavigationClickNext */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.showNavigationNextButton")
      @js.native
      def showNavigationNextButton: Requireable[Boolean] = js.native
      inline def showNavigationNextButton_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showNavigationNextButton")(x.asInstanceOf[js.Any])
      
      /** Enable navigation previous buttons to the side of the content and listen on clicks by using onNavigationClickPrevious */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.showNavigationPreviousButton")
      @js.native
      def showNavigationPreviousButton: Requireable[Boolean] = js.native
      inline def showNavigationPreviousButton_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showNavigationPreviousButton")(x.asInstanceOf[js.Any])
      
      /** Vertical position of the modal */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.verticalPosition")
      @js.native
      def verticalPosition: Requireable[String] = js.native
      inline def verticalPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verticalPosition")(x.asInstanceOf[js.Any])
      
      /** Controls z-index of the modal overlay */
      @JSImport("wix-style-react/dist/types/Modal/Modal", "default.propTypes.zIndex")
      @js.native
      def zIndex: Requireable[Double] = js.native
      inline def zIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Modal extends PureComponent[Any, Any, Any] {
    
    var CHILDREN_WRAPPER_DIV_ID: String = js.native
    
    def handleOverlayClick(event: Any): Unit = js.native
    
    def renderCloseButton(): Element = js.native
    
    def renderNavigationControls(): Element = js.native
  }
}
