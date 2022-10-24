package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesBaseModalLayoutMod.BaseModalLayoutProps
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonProps
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typings.wixStyleReact.distTypesCommonMod.OmitPolyfill
import typings.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageModalLayoutMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/MessageModalLayout", JSImport.Default)
  @js.native
  val default: FC[MessageModalLayoutProps] = js.native
  
  trait MessageModalLayoutProps
    extends StObject
       with BaseModalLayoutProps {
    
    var actionsSize: js.UndefOr[ButtonSize] = js.undefined
    
    var content: js.UndefOr[String | ReactNode] = js.undefined
    
    var footnote: js.UndefOr[ReactNode] = js.undefined
    
    var illustration: js.UndefOr[String | ReactNode] = js.undefined
    
    var primaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var primaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var primaryButtonText: js.UndefOr[String] = js.undefined
    
    var secondaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var secondaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var secondaryButtonText: js.UndefOr[String] = js.undefined
    
    var sideActions: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[String | ReactNode] = js.undefined
  }
  object MessageModalLayoutProps {
    
    inline def apply(): MessageModalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageModalLayoutProps]
    }
    
    extension [Self <: MessageModalLayoutProps](x: Self) {
      
      inline def setActionsSize(value: ButtonSize): Self = StObject.set(x, "actionsSize", value.asInstanceOf[js.Any])
      
      inline def setActionsSizeUndefined: Self = StObject.set(x, "actionsSize", js.undefined)
      
      inline def setContent(value: String | ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFootnote(value: ReactNode): Self = StObject.set(x, "footnote", value.asInstanceOf[js.Any])
      
      inline def setFootnoteUndefined: Self = StObject.set(x, "footnote", js.undefined)
      
      inline def setIllustration(value: String | ReactNode): Self = StObject.set(x, "illustration", value.asInstanceOf[js.Any])
      
      inline def setIllustrationUndefined: Self = StObject.set(x, "illustration", js.undefined)
      
      inline def setPrimaryButtonOnClick(value: () => Unit): Self = StObject.set(x, "primaryButtonOnClick", js.Any.fromFunction0(value))
      
      inline def setPrimaryButtonOnClickUndefined: Self = StObject.set(x, "primaryButtonOnClick", js.undefined)
      
      inline def setPrimaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "primaryButtonProps", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonPropsUndefined: Self = StObject.set(x, "primaryButtonProps", js.undefined)
      
      inline def setPrimaryButtonText(value: String): Self = StObject.set(x, "primaryButtonText", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonTextUndefined: Self = StObject.set(x, "primaryButtonText", js.undefined)
      
      inline def setSecondaryButtonOnClick(value: () => Unit): Self = StObject.set(x, "secondaryButtonOnClick", js.Any.fromFunction0(value))
      
      inline def setSecondaryButtonOnClickUndefined: Self = StObject.set(x, "secondaryButtonOnClick", js.undefined)
      
      inline def setSecondaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "secondaryButtonProps", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonPropsUndefined: Self = StObject.set(x, "secondaryButtonProps", js.undefined)
      
      inline def setSecondaryButtonText(value: String): Self = StObject.set(x, "secondaryButtonText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonTextUndefined: Self = StObject.set(x, "secondaryButtonText", js.undefined)
      
      inline def setSideActions(value: ReactNode): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
      
      inline def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      inline def setTitle(value: String | ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FC[MessageModalLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesMessageModalLayoutMod.foo` */
  override def _to: FC[MessageModalLayoutProps] = default
}
