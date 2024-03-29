package typings.wixStyleReact

import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.wixStyleReact.anon.As
import typings.wixStyleReact.anon.DictadditionalProps
import typings.wixStyleReact.anon.DictadditionalPropsAs
import typings.wixStyleReact.anon.FullWidth
import typings.wixStyleReact.anon.OnClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonButtonDottypesMod {
  
  @JSImport("wix-style-react/dist/types/Button/Button.types", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ButtonProps, js.Object, Any]
  
  type Button = Component[ButtonProps, js.Object, Any]
  
  type ButtonAsAnchorProps[T] = AnchorHTMLAttributes[HTMLAnchorElement] & T & As
  
  type ButtonAsButtonProps[T] = ButtonHTMLAttributes[HTMLButtonElement] & T & OnClick
  
  type ButtonAsComponentProps[T] = T & DictadditionalProps
  
  type ButtonGenericProps[T] = T & DictadditionalPropsAs
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.primary
    - typings.wixStyleReact.wixStyleReactStrings.secondary
  */
  trait ButtonPriority extends StObject
  object ButtonPriority {
    
    inline def primary: typings.wixStyleReact.wixStyleReactStrings.primary = "primary".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.primary]
    
    inline def secondary: typings.wixStyleReact.wixStyleReactStrings.secondary = "secondary".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.secondary]
  }
  
  type ButtonProps = ButtonWithAsProp[FullWidth]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait ButtonSize extends StObject
  object ButtonSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.inverted
    - typings.wixStyleReact.wixStyleReactStrings.destructive
    - typings.wixStyleReact.wixStyleReactStrings.premium
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.light
    - typings.wixStyleReact.wixStyleReactStrings.transparent
    - typings.wixStyleReact.wixStyleReactStrings.`premium-light`
  */
  trait ButtonSkin extends StObject
  object ButtonSkin {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typings.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def inverted: typings.wixStyleReact.wixStyleReactStrings.inverted = "inverted".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.inverted]
    
    inline def light: typings.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.light]
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def `premium-light`: typings.wixStyleReact.wixStyleReactStrings.`premium-light` = "premium-light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`premium-light`]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def transparent: typings.wixStyleReact.wixStyleReactStrings.transparent = "transparent".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.transparent]
  }
  
  type ButtonWithAsProp[T] = ButtonAsButtonProps[T] | ButtonAsAnchorProps[T] | ButtonGenericProps[T] | ButtonAsComponentProps[T]
}
