package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.buttonMod.ButtonSize
import typings.wixStyleReact.commonMod.IconElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBoxFunctionalLayoutMod {
  
  @JSImport("wix-style-react/dist/es/src/MessageBox/FunctionalLayout/MessageBoxFunctionalLayout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[MessageBoxFunctionalLayoutProps, js.Object, js.Any]
  
  type MessageBoxFunctionalLayout = PureComponent[MessageBoxFunctionalLayoutProps, js.Object, js.Any]
  
  trait MessageBoxFunctionalLayoutProps extends StObject {
    
    var buttonsHeight: js.UndefOr[ButtonSize] = js.undefined
    
    var cancelPrefixIcon: js.UndefOr[IconElement] = js.undefined
    
    var cancelSuffixIcon: js.UndefOr[IconElement] = js.undefined
    
    var cancelText: js.UndefOr[ReactNode] = js.undefined
    
    var closeButton: js.UndefOr[Boolean] = js.undefined
    
    var confirmPrefixIcon: js.UndefOr[IconElement] = js.undefined
    
    var confirmSuffixIcon: js.UndefOr[IconElement] = js.undefined
    
    var confirmText: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disableCancel: js.UndefOr[Boolean] = js.undefined
    
    var disableConfirmation: js.UndefOr[Boolean] = js.undefined
    
    var footerBottomChildren: js.UndefOr[ReactNode] = js.undefined
    
    var fullscreen: js.UndefOr[Boolean] = js.undefined
    
    var hideFooter: js.UndefOr[Boolean] = js.undefined
    
    var image: js.UndefOr[ReactNode] = js.undefined
    
    var margin: js.UndefOr[String] = js.undefined
    
    var maxHeight: js.UndefOr[String | Double] = js.undefined
    
    var noBodyPadding: js.UndefOr[Boolean] = js.undefined
    
    var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onOk: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var sideActions: js.UndefOr[ReactNode] = js.undefined
    
    var theme: js.UndefOr[MessageBoxFunctionalLayoutTheme] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
    
    var withEmptyState: js.UndefOr[Boolean] = js.undefined
  }
  object MessageBoxFunctionalLayoutProps {
    
    @scala.inline
    def apply(): MessageBoxFunctionalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageBoxFunctionalLayoutProps]
    }
    
    @scala.inline
    implicit class MessageBoxFunctionalLayoutPropsMutableBuilder[Self <: MessageBoxFunctionalLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonsHeight(value: ButtonSize): Self = StObject.set(x, "buttonsHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsHeightUndefined: Self = StObject.set(x, "buttonsHeight", js.undefined)
      
      @scala.inline
      def setCancelPrefixIcon(value: IconElement): Self = StObject.set(x, "cancelPrefixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelPrefixIconUndefined: Self = StObject.set(x, "cancelPrefixIcon", js.undefined)
      
      @scala.inline
      def setCancelSuffixIcon(value: IconElement): Self = StObject.set(x, "cancelSuffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelSuffixIconUndefined: Self = StObject.set(x, "cancelSuffixIcon", js.undefined)
      
      @scala.inline
      def setCancelText(value: ReactNode): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      @scala.inline
      def setConfirmPrefixIcon(value: IconElement): Self = StObject.set(x, "confirmPrefixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmPrefixIconUndefined: Self = StObject.set(x, "confirmPrefixIcon", js.undefined)
      
      @scala.inline
      def setConfirmSuffixIcon(value: IconElement): Self = StObject.set(x, "confirmSuffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmSuffixIconUndefined: Self = StObject.set(x, "confirmSuffixIcon", js.undefined)
      
      @scala.inline
      def setConfirmText(value: ReactNode): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDisableCancel(value: Boolean): Self = StObject.set(x, "disableCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCancelUndefined: Self = StObject.set(x, "disableCancel", js.undefined)
      
      @scala.inline
      def setDisableConfirmation(value: Boolean): Self = StObject.set(x, "disableConfirmation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableConfirmationUndefined: Self = StObject.set(x, "disableConfirmation", js.undefined)
      
      @scala.inline
      def setFooterBottomChildren(value: ReactNode): Self = StObject.set(x, "footerBottomChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterBottomChildrenUndefined: Self = StObject.set(x, "footerBottomChildren", js.undefined)
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setHideFooter(value: Boolean): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
      
      @scala.inline
      def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setNoBodyPadding(value: Boolean): Self = StObject.set(x, "noBodyPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoBodyPaddingUndefined: Self = StObject.set(x, "noBodyPadding", js.undefined)
      
      @scala.inline
      def setOnCancel(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnClose(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOk(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setSideActions(value: ReactNode): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      @scala.inline
      def setTheme(value: MessageBoxFunctionalLayoutTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWithEmptyState(value: Boolean): Self = StObject.set(x, "withEmptyState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithEmptyStateUndefined: Self = StObject.set(x, "withEmptyState", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.red
    - typings.wixStyleReact.wixStyleReactStrings.blue
    - typings.wixStyleReact.wixStyleReactStrings.purple
  */
  trait MessageBoxFunctionalLayoutTheme extends StObject
  object MessageBoxFunctionalLayoutTheme {
    
    @scala.inline
    def blue: typings.wixStyleReact.wixStyleReactStrings.blue = "blue".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.blue]
    
    @scala.inline
    def purple: typings.wixStyleReact.wixStyleReactStrings.purple = "purple".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.purple]
    
    @scala.inline
    def red: typings.wixStyleReact.wixStyleReactStrings.red = "red".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.red]
  }
}
