package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.Fluid
import typings.wixStyleReact.buttonMod.ButtonWithAsProp
import typings.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textButtonMod {
  
  @JSImport("wix-style-react/dist/es/src/TextButton", JSImport.Default)
  @js.native
  class default ()
    extends Component[TextButtonProps, js.Object, js.Any]
  
  type TextButton = Component[TextButtonProps, js.Object, js.Any]
  
  type TextButtonProps = ButtonWithAsProp[Fluid]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait TextButtonSize extends StObject
  object TextButtonSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.light
    - typings.wixStyleReact.wixStyleReactStrings.premium
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.destructive
  */
  trait TextButtonSkin extends StObject
  object TextButtonSkin {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typings.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def light: typings.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.light]
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.none_
    - typings.wixStyleReact.wixStyleReactStrings.onHover
    - typings.wixStyleReact.wixStyleReactStrings.always
  */
  trait TextButtonUnderline extends StObject
  object TextButtonUnderline {
    
    inline def always: typings.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.always]
    
    inline def none: none_ = "none".asInstanceOf[none_]
    
    inline def onHover: typings.wixStyleReact.wixStyleReactStrings.onHover = "onHover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.onHover]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.thin
    - typings.wixStyleReact.wixStyleReactStrings.normal
  */
  trait TextButtonWeight extends StObject
  object TextButtonWeight {
    
    inline def normal: typings.wixStyleReact.wixStyleReactStrings.normal = "normal".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.normal]
    
    inline def thin: typings.wixStyleReact.wixStyleReactStrings.thin = "thin".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.thin]
  }
}
