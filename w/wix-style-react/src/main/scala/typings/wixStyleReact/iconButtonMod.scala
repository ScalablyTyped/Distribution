package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.Priority
import typings.wixStyleReact.buttonMod.ButtonWithAsProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonMod {
  
  @JSImport("wix-style-react/dist/es/src/IconButton", JSImport.Default)
  @js.native
  class default ()
    extends Component[IconButtonProps, js.Object, js.Any]
  
  type IconButton = Component[IconButtonProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.primary
    - typings.wixStyleReact.wixStyleReactStrings.secondary
  */
  trait IconButtonPriority extends StObject
  object IconButtonPriority {
    
    @scala.inline
    def primary: typings.wixStyleReact.wixStyleReactStrings.primary = "primary".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.primary]
    
    @scala.inline
    def secondary: typings.wixStyleReact.wixStyleReactStrings.secondary = "secondary".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.secondary]
  }
  
  type IconButtonProps = ButtonWithAsProp[Priority]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait IconButtonSize extends StObject
  object IconButtonSize {
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    @scala.inline
    def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.inverted
    - typings.wixStyleReact.wixStyleReactStrings.light
    - typings.wixStyleReact.wixStyleReactStrings.transparent
    - typings.wixStyleReact.wixStyleReactStrings.premium
  */
  trait IconButtonSkin extends StObject
  object IconButtonSkin {
    
    @scala.inline
    def inverted: typings.wixStyleReact.wixStyleReactStrings.inverted = "inverted".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.inverted]
    
    @scala.inline
    def light: typings.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.light]
    
    @scala.inline
    def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    @scala.inline
    def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    @scala.inline
    def transparent: typings.wixStyleReact.wixStyleReactStrings.transparent = "transparent".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.transparent]
  }
}
