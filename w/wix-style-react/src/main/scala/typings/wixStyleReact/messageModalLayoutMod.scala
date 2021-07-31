package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.wixStyleReact.baseModalLayoutMod.BaseModalLayoutProps
import typings.wixStyleReact.buttonMod.ButtonProps
import typings.wixStyleReact.buttonMod.ButtonSize
import typings.wixStyleReact.commonMod.OmitPolyfill
import typings.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageModalLayoutMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/MessageModalLayout", JSImport.Default)
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
    
    var title: js.UndefOr[String] = js.undefined
  }
  object MessageModalLayoutProps {
    
    @scala.inline
    def apply(): MessageModalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageModalLayoutProps]
    }
    
    @scala.inline
    implicit class MessageModalLayoutPropsMutableBuilder[Self <: MessageModalLayoutProps] (val x: Self) extends AnyVal {
      
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
      def setIllustration(value: String | ReactNode): Self = StObject.set(x, "illustration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIllustrationUndefined: Self = StObject.set(x, "illustration", js.undefined)
      
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
      def setSideActions(value: ReactNode): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FC[MessageModalLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `messageModalLayoutMod.foo` */
  override def _to: FC[MessageModalLayoutProps] = default
}
