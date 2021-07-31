package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.MaxHeightProperty
import typings.csstype.mod.WidthProperty
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.wixStyleReact.baseModalLayoutMod.BaseModalLayoutProps
import typings.wixStyleReact.buttonMod.ButtonProps
import typings.wixStyleReact.buttonMod.ButtonSize
import typings.wixStyleReact.commonMod.OmitPolyfill
import typings.wixStyleReact.wixStyleReactStrings.auto
import typings.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customModalLayoutMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/CustomModalLayout", JSImport.Default)
  @js.native
  val default: FC[CustomModalLayoutProps] = js.native
  
  trait CustomModalLayoutProps
    extends StObject
       with BaseModalLayoutProps {
    
    var actionsSize: js.UndefOr[ButtonSize] = js.undefined
    
    var content: js.UndefOr[String | ReactNode] = js.undefined
    
    var footnote: js.UndefOr[ReactNode] = js.undefined
    
    var height: js.UndefOr[HeightProperty[String | Double]] = js.undefined
    
    var hideContentDividers: js.UndefOr[Boolean] = js.undefined
    
    var maxHeight: js.UndefOr[MaxHeightProperty[String | Double]] = js.undefined
    
    var primaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var primaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var primaryButtonText: js.UndefOr[String] = js.undefined
    
    var removeContentPadding: js.UndefOr[Boolean] = js.undefined
    
    var secondaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var secondaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var secondaryButtonText: js.UndefOr[String] = js.undefined
    
    var showFooterDivider: js.UndefOr[auto | Boolean] = js.undefined
    
    var showHeaderDivider: js.UndefOr[auto | Boolean] = js.undefined
    
    var sideActions: js.UndefOr[ReactNode] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var width: js.UndefOr[WidthProperty[String | Double]] = js.undefined
  }
  object CustomModalLayoutProps {
    
    @scala.inline
    def apply(): CustomModalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomModalLayoutProps]
    }
    
    @scala.inline
    implicit class CustomModalLayoutPropsMutableBuilder[Self <: CustomModalLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionsSize(value: ButtonSize): Self = StObject.set(x, "actionsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsSizeUndefined: Self = StObject.set(x, "actionsSize", js.undefined)
      
      @scala.inline
      def setContent(value: String | ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFootnote(value: ReactNode): Self = StObject.set(x, "footnote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFootnoteUndefined: Self = StObject.set(x, "footnote", js.undefined)
      
      @scala.inline
      def setHeight(value: HeightProperty[String | Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHideContentDividers(value: Boolean): Self = StObject.set(x, "hideContentDividers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideContentDividersUndefined: Self = StObject.set(x, "hideContentDividers", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: MaxHeightProperty[String | Double]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setPrimaryButtonOnClick(value: () => Unit): Self = StObject.set(x, "primaryButtonOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrimaryButtonOnClickUndefined: Self = StObject.set(x, "primaryButtonOnClick", js.undefined)
      
      @scala.inline
      def setPrimaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "primaryButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonPropsUndefined: Self = StObject.set(x, "primaryButtonProps", js.undefined)
      
      @scala.inline
      def setPrimaryButtonText(value: String): Self = StObject.set(x, "primaryButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonTextUndefined: Self = StObject.set(x, "primaryButtonText", js.undefined)
      
      @scala.inline
      def setRemoveContentPadding(value: Boolean): Self = StObject.set(x, "removeContentPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveContentPaddingUndefined: Self = StObject.set(x, "removeContentPadding", js.undefined)
      
      @scala.inline
      def setSecondaryButtonOnClick(value: () => Unit): Self = StObject.set(x, "secondaryButtonOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecondaryButtonOnClickUndefined: Self = StObject.set(x, "secondaryButtonOnClick", js.undefined)
      
      @scala.inline
      def setSecondaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "secondaryButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryButtonPropsUndefined: Self = StObject.set(x, "secondaryButtonProps", js.undefined)
      
      @scala.inline
      def setSecondaryButtonText(value: String): Self = StObject.set(x, "secondaryButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryButtonTextUndefined: Self = StObject.set(x, "secondaryButtonText", js.undefined)
      
      @scala.inline
      def setShowFooterDivider(value: auto | Boolean): Self = StObject.set(x, "showFooterDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFooterDividerUndefined: Self = StObject.set(x, "showFooterDivider", js.undefined)
      
      @scala.inline
      def setShowHeaderDivider(value: auto | Boolean): Self = StObject.set(x, "showHeaderDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderDividerUndefined: Self = StObject.set(x, "showHeaderDivider", js.undefined)
      
      @scala.inline
      def setSideActions(value: ReactNode): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: WidthProperty[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = FC[CustomModalLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `customModalLayoutMod.foo` */
  override def _to: FC[CustomModalLayoutProps] = default
}
