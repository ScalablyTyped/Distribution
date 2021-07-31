package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.baseModalLayoutMod.ModalTheme
import typings.wixStyleReact.buttonMod.ButtonProps
import typings.wixStyleReact.buttonMod.ButtonSize
import typings.wixStyleReact.commonMod.OmitPolyfill
import typings.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerMod {
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout/LayoutBlocks/Footer", "Footer")
  @js.native
  val Footer: FunctionComponent[FooterProps] = js.native
  
  trait FooterProps extends StObject {
    
    var actionsSize: js.UndefOr[ButtonSize] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var primaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var primaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var primaryButtonText: js.UndefOr[ReactNode] = js.undefined
    
    var secondaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var secondaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var secondaryButtonText: js.UndefOr[ReactNode] = js.undefined
    
    var showFooterDivider: js.UndefOr[Boolean] = js.undefined
    
    var sideActions: js.UndefOr[ReactNode] = js.undefined
    
    var theme: js.UndefOr[ModalTheme] = js.undefined
  }
  object FooterProps {
    
    @scala.inline
    def apply(): FooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterProps]
    }
    
    @scala.inline
    implicit class FooterPropsMutableBuilder[Self <: FooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionsSize(value: ButtonSize): Self = StObject.set(x, "actionsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsSizeUndefined: Self = StObject.set(x, "actionsSize", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setPrimaryButtonOnClick(value: () => Unit): Self = StObject.set(x, "primaryButtonOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrimaryButtonOnClickUndefined: Self = StObject.set(x, "primaryButtonOnClick", js.undefined)
      
      @scala.inline
      def setPrimaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "primaryButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonPropsUndefined: Self = StObject.set(x, "primaryButtonProps", js.undefined)
      
      @scala.inline
      def setPrimaryButtonText(value: ReactNode): Self = StObject.set(x, "primaryButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonTextUndefined: Self = StObject.set(x, "primaryButtonText", js.undefined)
      
      @scala.inline
      def setSecondaryButtonOnClick(value: () => Unit): Self = StObject.set(x, "secondaryButtonOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecondaryButtonOnClickUndefined: Self = StObject.set(x, "secondaryButtonOnClick", js.undefined)
      
      @scala.inline
      def setSecondaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "secondaryButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryButtonPropsUndefined: Self = StObject.set(x, "secondaryButtonProps", js.undefined)
      
      @scala.inline
      def setSecondaryButtonText(value: ReactNode): Self = StObject.set(x, "secondaryButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryButtonTextUndefined: Self = StObject.set(x, "secondaryButtonText", js.undefined)
      
      @scala.inline
      def setShowFooterDivider(value: Boolean): Self = StObject.set(x, "showFooterDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFooterDividerUndefined: Self = StObject.set(x, "showFooterDivider", js.undefined)
      
      @scala.inline
      def setSideActions(value: ReactNode): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      @scala.inline
      def setTheme(value: ModalTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
