package typings.wixStyleReact

import typings.csstype.mod.Property.Height
import typings.csstype.mod.Property.MaxHeight
import typings.csstype.mod.Property.Width
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import typings.wixStyleReact.anon.PartialCustomModalLayoutP
import typings.wixStyleReact.anon.TooltipCommonPropscontent
import typings.wixStyleReact.anon.WeakValidationMapCustomMo
import typings.wixStyleReact.anon.`1`
import typings.wixStyleReact.distTypesBaseModalLayoutMod.BaseModalLayoutProps
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonProps
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typings.wixStyleReact.distTypesCommonMod.OmitPolyfill
import typings.wixStyleReact.wixStyleReactStrings.auto
import typings.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCustomModalLayoutMod {
  
  /* Inlined react.react.FC<wix-style-react.wix-style-react/dist/types/CustomModalLayout.CustomModalLayoutProps> & {  Title :react.react.FunctionComponent<{  children :react.react.ReactNode | undefined}>} */
  object default {
    
    inline def apply(props: CustomModalLayoutProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: CustomModalLayoutProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("wix-style-react/dist/types/CustomModalLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/CustomModalLayout", "default.Title")
    @js.native
    def Title: FunctionComponent[`1`] = js.native
    inline def Title_=(x: FunctionComponent[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/CustomModalLayout", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/CustomModalLayout", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCustomModalLayoutP] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialCustomModalLayoutP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/CustomModalLayout", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/CustomModalLayout", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCustomMo] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapCustomMo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait CustomModalLayoutProps
    extends StObject
       with BaseModalLayoutProps {
    
    var actionsSize: js.UndefOr[ButtonSize] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var footnote: js.UndefOr[ReactNode] = js.undefined
    
    var height: js.UndefOr[Height[String | Double]] = js.undefined
    
    var maxHeight: js.UndefOr[MaxHeight[String | Double]] = js.undefined
    
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
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var width: js.UndefOr[Width[String | Double]] = js.undefined
  }
  object CustomModalLayoutProps {
    
    inline def apply(): CustomModalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomModalLayoutProps]
    }
    
    extension [Self <: CustomModalLayoutProps](x: Self) {
      
      inline def setActionsSize(value: ButtonSize): Self = StObject.set(x, "actionsSize", value.asInstanceOf[js.Any])
      
      inline def setActionsSizeUndefined: Self = StObject.set(x, "actionsSize", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFootnote(value: ReactNode): Self = StObject.set(x, "footnote", value.asInstanceOf[js.Any])
      
      inline def setFootnoteUndefined: Self = StObject.set(x, "footnote", js.undefined)
      
      inline def setHeight(value: Height[String | Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaxHeight(value: MaxHeight[String | Double]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
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
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Width[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
