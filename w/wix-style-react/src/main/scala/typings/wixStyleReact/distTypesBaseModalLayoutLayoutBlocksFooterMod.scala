package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.TooltipCommonPropscontent
import typings.wixStyleReact.distTypesBaseModalLayoutMod.ModalTheme
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonProps
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typings.wixStyleReact.distTypesCommonMod.OmitPolyfill
import typings.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksFooterMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Footer", "Footer")
  @js.native
  val Footer: FunctionComponent[FooterProps] = js.native
  
  trait FooterProps extends StObject {
    
    var actionsSize: js.UndefOr[ButtonSize] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var primaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var primaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var primaryButtonText: js.UndefOr[ReactNode] = js.undefined
    
    var primaryButtonTooltipProps: js.UndefOr[TooltipCommonPropscontent] = js.undefined
    
    var secondaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var secondaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var secondaryButtonText: js.UndefOr[ReactNode] = js.undefined
    
    var showFooterDivider: js.UndefOr[Boolean] = js.undefined
    
    var sideActions: js.UndefOr[ReactNode] = js.undefined
    
    var theme: js.UndefOr[ModalTheme] = js.undefined
  }
  object FooterProps {
    
    inline def apply(): FooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterProps]
    }
    
    extension [Self <: FooterProps](x: Self) {
      
      inline def setActionsSize(value: ButtonSize): Self = StObject.set(x, "actionsSize", value.asInstanceOf[js.Any])
      
      inline def setActionsSizeUndefined: Self = StObject.set(x, "actionsSize", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setPrimaryButtonOnClick(value: () => Unit): Self = StObject.set(x, "primaryButtonOnClick", js.Any.fromFunction0(value))
      
      inline def setPrimaryButtonOnClickUndefined: Self = StObject.set(x, "primaryButtonOnClick", js.undefined)
      
      inline def setPrimaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "primaryButtonProps", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonPropsUndefined: Self = StObject.set(x, "primaryButtonProps", js.undefined)
      
      inline def setPrimaryButtonText(value: ReactNode): Self = StObject.set(x, "primaryButtonText", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonTextUndefined: Self = StObject.set(x, "primaryButtonText", js.undefined)
      
      inline def setPrimaryButtonTooltipProps(value: TooltipCommonPropscontent): Self = StObject.set(x, "primaryButtonTooltipProps", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonTooltipPropsUndefined: Self = StObject.set(x, "primaryButtonTooltipProps", js.undefined)
      
      inline def setSecondaryButtonOnClick(value: () => Unit): Self = StObject.set(x, "secondaryButtonOnClick", js.Any.fromFunction0(value))
      
      inline def setSecondaryButtonOnClickUndefined: Self = StObject.set(x, "secondaryButtonOnClick", js.undefined)
      
      inline def setSecondaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "secondaryButtonProps", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonPropsUndefined: Self = StObject.set(x, "secondaryButtonProps", js.undefined)
      
      inline def setSecondaryButtonText(value: ReactNode): Self = StObject.set(x, "secondaryButtonText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonTextUndefined: Self = StObject.set(x, "secondaryButtonText", js.undefined)
      
      inline def setShowFooterDivider(value: Boolean): Self = StObject.set(x, "showFooterDivider", value.asInstanceOf[js.Any])
      
      inline def setShowFooterDividerUndefined: Self = StObject.set(x, "showFooterDivider", js.undefined)
      
      inline def setSideActions(value: ReactNode): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
      
      inline def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      inline def setTheme(value: ModalTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
