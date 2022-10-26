package typings.wixStyleReact.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.distTypesBaseModalLayoutMod.ModalTheme
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonProps
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typings.wixStyleReact.distTypesCommonMod.OmitPolyfill
import typings.wixStyleReact.wixStyleReactStrings.auto
import typings.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-style-react.wix-style-react/dist/types/CustomModalLayout.CustomModalLayoutProps> */
trait PartialCustomModalLayoutP extends StObject {
  
  var actionsSize: js.UndefOr[ButtonSize] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[ReactNode] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var footnote: js.UndefOr[ReactNode] = js.undefined
  
  var height: js.UndefOr[typings.csstype.mod.Property.Height[String | Double]] = js.undefined
  
  var maxHeight: js.UndefOr[typings.csstype.mod.Property.MaxHeight[String | Double]] = js.undefined
  
  var onCloseButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  
  var onHelpButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  
  var overflowY: js.UndefOr[String] = js.undefined
  
  var primaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var primaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
  
  var primaryButtonText: js.UndefOr[ReactNode] = js.undefined
  
  var primaryButtonTooltipProps: js.UndefOr[TooltipCommonPropscontent] = js.undefined
  
  var removeContentPadding: js.UndefOr[Boolean] = js.undefined
  
  var secondaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var secondaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
  
  var secondaryButtonText: js.UndefOr[String] = js.undefined
  
  var showFooterDivider: js.UndefOr[auto | Boolean] = js.undefined
  
  var showHeaderDivider: js.UndefOr[auto | Boolean] = js.undefined
  
  var sideActions: js.UndefOr[ReactNode] = js.undefined
  
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  
  var theme: js.UndefOr[ModalTheme] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
  
  var width: js.UndefOr[typings.csstype.mod.Property.Width[String | Double]] = js.undefined
}
object PartialCustomModalLayoutP {
  
  inline def apply(): PartialCustomModalLayoutP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCustomModalLayoutP]
  }
  
  extension [Self <: PartialCustomModalLayoutP](x: Self) {
    
    inline def setActionsSize(value: ButtonSize): Self = StObject.set(x, "actionsSize", value.asInstanceOf[js.Any])
    
    inline def setActionsSizeUndefined: Self = StObject.set(x, "actionsSize", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setFootnote(value: ReactNode): Self = StObject.set(x, "footnote", value.asInstanceOf[js.Any])
    
    inline def setFootnoteUndefined: Self = StObject.set(x, "footnote", js.undefined)
    
    inline def setHeight(value: typings.csstype.mod.Property.Height[String | Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaxHeight(value: typings.csstype.mod.Property.MaxHeight[String | Double]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setOnCloseButtonClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1(value))
    
    inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
    
    inline def setOnHelpButtonClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onHelpButtonClick", js.Any.fromFunction1(value))
    
    inline def setOnHelpButtonClickUndefined: Self = StObject.set(x, "onHelpButtonClick", js.undefined)
    
    inline def setOverflowY(value: String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
    
    inline def setPrimaryButtonOnClick(value: () => Unit): Self = StObject.set(x, "primaryButtonOnClick", js.Any.fromFunction0(value))
    
    inline def setPrimaryButtonOnClickUndefined: Self = StObject.set(x, "primaryButtonOnClick", js.undefined)
    
    inline def setPrimaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "primaryButtonProps", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonPropsUndefined: Self = StObject.set(x, "primaryButtonProps", js.undefined)
    
    inline def setPrimaryButtonText(value: ReactNode): Self = StObject.set(x, "primaryButtonText", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonTextUndefined: Self = StObject.set(x, "primaryButtonText", js.undefined)
    
    inline def setPrimaryButtonTooltipProps(value: TooltipCommonPropscontent): Self = StObject.set(x, "primaryButtonTooltipProps", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonTooltipPropsUndefined: Self = StObject.set(x, "primaryButtonTooltipProps", js.undefined)
    
    inline def setRemoveContentPadding(value: Boolean): Self = StObject.set(x, "removeContentPadding", value.asInstanceOf[js.Any])
    
    inline def setRemoveContentPaddingUndefined: Self = StObject.set(x, "removeContentPadding", js.undefined)
    
    inline def setSecondaryButtonOnClick(value: () => Unit): Self = StObject.set(x, "secondaryButtonOnClick", js.Any.fromFunction0(value))
    
    inline def setSecondaryButtonOnClickUndefined: Self = StObject.set(x, "secondaryButtonOnClick", js.undefined)
    
    inline def setSecondaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "secondaryButtonProps", value.asInstanceOf[js.Any])
    
    inline def setSecondaryButtonPropsUndefined: Self = StObject.set(x, "secondaryButtonProps", js.undefined)
    
    inline def setSecondaryButtonText(value: String): Self = StObject.set(x, "secondaryButtonText", value.asInstanceOf[js.Any])
    
    inline def setSecondaryButtonTextUndefined: Self = StObject.set(x, "secondaryButtonText", js.undefined)
    
    inline def setShowFooterDivider(value: auto | Boolean): Self = StObject.set(x, "showFooterDivider", value.asInstanceOf[js.Any])
    
    inline def setShowFooterDividerUndefined: Self = StObject.set(x, "showFooterDivider", js.undefined)
    
    inline def setShowHeaderDivider(value: auto | Boolean): Self = StObject.set(x, "showHeaderDivider", value.asInstanceOf[js.Any])
    
    inline def setShowHeaderDividerUndefined: Self = StObject.set(x, "showHeaderDivider", js.undefined)
    
    inline def setSideActions(value: ReactNode): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
    
    inline def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
    
    inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTheme(value: ModalTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: typings.csstype.mod.Property.Width[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
