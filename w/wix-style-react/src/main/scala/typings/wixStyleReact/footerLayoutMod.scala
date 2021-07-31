package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.std.HTMLButtonElement
import typings.wixStyleReact.commonMod.IconElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerLayoutMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/MessageBox/FunctionalLayout/FooterLayout", JSImport.Default)
  @js.native
  val default: SFC[FooterLayoutProps] = js.native
  
  trait FooterLayoutProps extends StObject {
    
    var bottomChildren: js.UndefOr[ReactNode] = js.undefined
    
    var buttonsHeight: js.UndefOr[String] = js.undefined
    
    var cancelPrefixIcon: js.UndefOr[IconElement] = js.undefined
    
    var cancelSuffixIcon: js.UndefOr[IconElement] = js.undefined
    
    var cancelText: js.UndefOr[ReactNode] = js.undefined
    
    var confirmPrefixIcon: js.UndefOr[IconElement] = js.undefined
    
    var confirmSuffixIcon: js.UndefOr[IconElement] = js.undefined
    
    var confirmText: js.UndefOr[ReactNode] = js.undefined
    
    var enableCancel: js.UndefOr[Boolean] = js.undefined
    
    var enableOk: js.UndefOr[Boolean] = js.undefined
    
    var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onOk: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var sideActions: js.UndefOr[ReactNode] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object FooterLayoutProps {
    
    @scala.inline
    def apply(): FooterLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterLayoutProps]
    }
    
    @scala.inline
    implicit class FooterLayoutPropsMutableBuilder[Self <: FooterLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomChildren(value: ReactNode): Self = StObject.set(x, "bottomChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomChildrenUndefined: Self = StObject.set(x, "bottomChildren", js.undefined)
      
      @scala.inline
      def setButtonsHeight(value: String): Self = StObject.set(x, "buttonsHeight", value.asInstanceOf[js.Any])
      
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
      def setEnableCancel(value: Boolean): Self = StObject.set(x, "enableCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCancelUndefined: Self = StObject.set(x, "enableCancel", js.undefined)
      
      @scala.inline
      def setEnableOk(value: Boolean): Self = StObject.set(x, "enableOk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableOkUndefined: Self = StObject.set(x, "enableOk", js.undefined)
      
      @scala.inline
      def setOnCancel(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnOk(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setSideActions(value: ReactNode): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = SFC[FooterLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `footerLayoutMod.foo` */
  override def _to: SFC[FooterLayoutProps] = default
}
