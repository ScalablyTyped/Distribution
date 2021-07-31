package typings.wixStyleReact

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("wix-style-react/dist/es/src/Modal", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[ModalProps, js.Object, js.Any]
  
  type Modal = PureComponent[ModalProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.start
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.end
  */
  trait ModalHorizontalPostion extends StObject
  object ModalHorizontalPostion {
    
    @scala.inline
    def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    @scala.inline
    def end: typings.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.end]
    
    @scala.inline
    def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.static
    - typings.wixStyleReact.wixStyleReactStrings.relative
    - typings.wixStyleReact.wixStyleReactStrings.absolute
    - typings.wixStyleReact.wixStyleReactStrings.fixed
    - typings.wixStyleReact.wixStyleReactStrings.sticky
  */
  trait ModalOverlayPosition extends StObject
  object ModalOverlayPosition {
    
    @scala.inline
    def absolute: typings.wixStyleReact.wixStyleReactStrings.absolute = "absolute".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.absolute]
    
    @scala.inline
    def fixed: typings.wixStyleReact.wixStyleReactStrings.fixed = "fixed".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.fixed]
    
    @scala.inline
    def relative: typings.wixStyleReact.wixStyleReactStrings.relative = "relative".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.relative]
    
    @scala.inline
    def static: typings.wixStyleReact.wixStyleReactStrings.static = "static".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.static]
    
    @scala.inline
    def sticky: typings.wixStyleReact.wixStyleReactStrings.sticky = "sticky".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.sticky]
  }
  
  trait ModalProps extends StObject {
    
    var appElement: js.UndefOr[String] = js.undefined
    
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    var closeTimeoutMS: js.UndefOr[Double] = js.undefined
    
    var contentLabel: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var horizontalPosition: js.UndefOr[ModalHorizontalPostion] = js.undefined
    
    var isOpen: Boolean
    
    var maxHeight: js.UndefOr[String] = js.undefined
    
    var onAfterOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onRequestClose: js.UndefOr[
        js.Function1[
          /* event */ js.UndefOr[(MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element]], 
          Unit
        ]
      ] = js.undefined
    
    var overlayPosition: js.UndefOr[ModalOverlayPosition] = js.undefined
    
    var parentSelector: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var scrollableContent: js.UndefOr[Boolean] = js.undefined
    
    var shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.undefined
    
    var shouldDisplayCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var verticalPosition: js.UndefOr[ModalVerticalPosition] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ModalProps {
    
    @scala.inline
    def apply(isOpen: Boolean): ModalProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppElement(value: String): Self = StObject.set(x, "appElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppElementUndefined: Self = StObject.set(x, "appElement", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setCloseTimeoutMS(value: Double): Self = StObject.set(x, "closeTimeoutMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTimeoutMSUndefined: Self = StObject.set(x, "closeTimeoutMS", js.undefined)
      
      @scala.inline
      def setContentLabel(value: String): Self = StObject.set(x, "contentLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLabelUndefined: Self = StObject.set(x, "contentLabel", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizontalPosition(value: ModalHorizontalPostion): Self = StObject.set(x, "horizontalPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalPositionUndefined: Self = StObject.set(x, "horizontalPosition", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setOnAfterOpen(value: () => Unit): Self = StObject.set(x, "onAfterOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAfterOpenUndefined: Self = StObject.set(x, "onAfterOpen", js.undefined)
      
      @scala.inline
      def setOnOk(value: () => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnRequestClose(
        value: /* event */ js.UndefOr[(MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element]] => Unit
      ): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
      
      @scala.inline
      def setOverlayPosition(value: ModalOverlayPosition): Self = StObject.set(x, "overlayPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayPositionUndefined: Self = StObject.set(x, "overlayPosition", js.undefined)
      
      @scala.inline
      def setParentSelector(value: () => HTMLElement): Self = StObject.set(x, "parentSelector", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParentSelectorUndefined: Self = StObject.set(x, "parentSelector", js.undefined)
      
      @scala.inline
      def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableContent(value: Boolean): Self = StObject.set(x, "scrollableContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableContentUndefined: Self = StObject.set(x, "scrollableContent", js.undefined)
      
      @scala.inline
      def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      @scala.inline
      def setShouldCloseOnOverlayClick(value: Boolean): Self = StObject.set(x, "shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldCloseOnOverlayClickUndefined: Self = StObject.set(x, "shouldCloseOnOverlayClick", js.undefined)
      
      @scala.inline
      def setShouldDisplayCloseButton(value: Boolean): Self = StObject.set(x, "shouldDisplayCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldDisplayCloseButtonUndefined: Self = StObject.set(x, "shouldDisplayCloseButton", js.undefined)
      
      @scala.inline
      def setVerticalPosition(value: ModalVerticalPosition): Self = StObject.set(x, "verticalPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalPositionUndefined: Self = StObject.set(x, "verticalPosition", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.start
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.end
  */
  trait ModalVerticalPosition extends StObject
  object ModalVerticalPosition {
    
    @scala.inline
    def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    @scala.inline
    def end: typings.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.end]
    
    @scala.inline
    def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
}
