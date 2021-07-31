package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.EventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialButtonMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/SocialButton", JSImport.Default)
  @js.native
  val default: SFC[SocialButtonProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.facebook
    - typings.wixStyleReact.wixStyleReactStrings.instagram
    - typings.wixStyleReact.wixStyleReactStrings.twitter
    - typings.wixStyleReact.wixStyleReactStrings.pinterest
    - typings.wixStyleReact.wixStyleReactStrings.youtube
    - typings.wixStyleReact.wixStyleReactStrings.linkedin
  */
  trait SocialButtonIcons extends StObject
  object SocialButtonIcons {
    
    @scala.inline
    def facebook: typings.wixStyleReact.wixStyleReactStrings.facebook = "facebook".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.facebook]
    
    @scala.inline
    def instagram: typings.wixStyleReact.wixStyleReactStrings.instagram = "instagram".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.instagram]
    
    @scala.inline
    def linkedin: typings.wixStyleReact.wixStyleReactStrings.linkedin = "linkedin".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.linkedin]
    
    @scala.inline
    def pinterest: typings.wixStyleReact.wixStyleReactStrings.pinterest = "pinterest".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.pinterest]
    
    @scala.inline
    def twitter: typings.wixStyleReact.wixStyleReactStrings.twitter = "twitter".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.twitter]
    
    @scala.inline
    def youtube: typings.wixStyleReact.wixStyleReactStrings.youtube = "youtube".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.youtube]
  }
  
  trait SocialButtonProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[SocialButtonIcons] = js.undefined
    
    var onClick: js.UndefOr[EventHandler[MouseEvent[HTMLElement, NativeMouseEvent]]] = js.undefined
    
    var text: js.UndefOr[ReactNode] = js.undefined
  }
  object SocialButtonProps {
    
    @scala.inline
    def apply(): SocialButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonProps]
    }
    
    @scala.inline
    implicit class SocialButtonPropsMutableBuilder[Self <: SocialButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: SocialButtonIcons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = SFC[SocialButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `socialButtonMod.foo` */
  override def _to: SFC[SocialButtonProps] = default
}
