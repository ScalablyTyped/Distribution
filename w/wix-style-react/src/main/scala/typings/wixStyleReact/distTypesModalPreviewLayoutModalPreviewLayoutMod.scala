package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ChildIndexDisplayed
import typings.wixStyleReact.anon.TargetIdAny
import typings.wixStyleReact.anon.TooltipText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalPreviewLayoutModalPreviewLayoutMod {
  
  /** This is a fullscreen modal to present a document to the user overlaying the entire view port */
  @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", JSImport.Default)
  @js.native
  open class default protected () extends ModalPreviewLayout {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.defaultProps.shouldCloseOnOverlayClick")
      @js.native
      def shouldCloseOnOverlayClick: Boolean = js.native
      inline def shouldCloseOnOverlayClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldCloseOnOverlayClick")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** component to be displayed in header strip to preform actions relevant to the displayed content */
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.propTypes.actions")
      @js.native
      def actions: Requireable[ReactNodeLike] = js.native
      inline def actions_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("actions")(x.asInstanceOf[js.Any])
      
      /** modal content displayed mid-screen*/
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.propTypes.children")
      @js.native
      def children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def children_=(x: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Tooltip close button text */
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.propTypes.closeButtonTooltipText")
      @js.native
      def closeButtonTooltipText: Requireable[ReactNodeLike] = js.native
      inline def closeButtonTooltipText_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeButtonTooltipText")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Next button props
        * ##### onClick signature:
        * function(childIndexDisplayed: number) => void
        * * `childIndexDisplayed`: the index of the child component displayed.
        */
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.propTypes.nextButtonProps")
      @js.native
      def nextButtonProps: Requireable[InferProps[TooltipText]] = js.native
      inline def nextButtonProps_=(x: Requireable[InferProps[TooltipText]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextButtonProps")(x.asInstanceOf[js.Any])
      
      /** callback for when the modal is closed */
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.propTypes.onClose")
      @js.native
      def onClose: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClose_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      /** Previous button props
        * ##### onClick signature:
        * function(childIndexDisplayed: number) => void
        * * `childIndexDisplayed`: the index of the child component displayed.
        */
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.propTypes.prevButtonProps")
      @js.native
      def prevButtonProps: Requireable[InferProps[TooltipText]] = js.native
      inline def prevButtonProps_=(x: Requireable[InferProps[TooltipText]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prevButtonProps")(x.asInstanceOf[js.Any])
      
      /** boolean to determine whether closing the overlay on click */
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.propTypes.shouldCloseOnOverlayClick")
      @js.native
      def shouldCloseOnOverlayClick: Requireable[Boolean] = js.native
      inline def shouldCloseOnOverlayClick_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldCloseOnOverlayClick")(x.asInstanceOf[js.Any])
      
      /** title text to be displayed in the header strip */
      @JSImport("wix-style-react/dist/types/ModalPreviewLayout/ModalPreviewLayout", "default.propTypes.title")
      @js.native
      def title: Requireable[String] = js.native
      inline def title_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  /** This is a fullscreen modal to present a document to the user overlaying the entire view port */
  @js.native
  trait ModalPreviewLayout extends PureComponent[Any, Any, Any] {
    
    def _onLeftNavigationClick(): Unit = js.native
    
    def _onOverlayClick(onClose: Any): js.Function1[/* param0 */ TargetIdAny, Unit] = js.native
    
    def _onRightNavigationClick(): Unit = js.native
    
    def _renderNavigationButtons(hasLeft: Any, hasRight: Any): Element = js.native
    
    def _shouldClose(id: Any): Any = js.native
    
    @JSName("state")
    var state_ModalPreviewLayout: ChildIndexDisplayed = js.native
  }
}
