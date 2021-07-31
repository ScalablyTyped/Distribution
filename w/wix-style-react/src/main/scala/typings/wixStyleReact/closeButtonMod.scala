package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.Size
import typings.wixStyleReact.buttonMod.ButtonWithAsProp
import typings.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeButtonMod {
  
  @JSImport("wix-style-react/dist/es/src/CloseButton", JSImport.Default)
  @js.native
  class default ()
    extends Component[CloseButtonProps, js.Object, js.Any]
  
  type CloseButton = Component[CloseButtonProps, js.Object, js.Any]
  
  type CloseButtonProps = ButtonWithAsProp[Size]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.none_
    - typings.wixStyleReact.wixStyleReactStrings.hover
    - typings.wixStyleReact.wixStyleReactStrings.always
  */
  trait CloseButtonSelectionArea extends StObject
  object CloseButtonSelectionArea {
    
    @scala.inline
    def always: typings.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.always]
    
    @scala.inline
    def hover: typings.wixStyleReact.wixStyleReactStrings.hover = "hover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.hover]
    
    @scala.inline
    def none: none_ = "none".asInstanceOf[none_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait CloseButtonSize extends StObject
  object CloseButtonSize {
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.standardFilled
    - typings.wixStyleReact.wixStyleReactStrings.light
    - typings.wixStyleReact.wixStyleReactStrings.lightFilled
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.transparent
  */
  trait CloseButtonSkin extends StObject
  object CloseButtonSkin {
    
    @scala.inline
    def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    @scala.inline
    def light: typings.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.light]
    
    @scala.inline
    def lightFilled: typings.wixStyleReact.wixStyleReactStrings.lightFilled = "lightFilled".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.lightFilled]
    
    @scala.inline
    def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    @scala.inline
    def standardFilled: typings.wixStyleReact.wixStyleReactStrings.standardFilled = "standardFilled".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standardFilled]
    
    @scala.inline
    def transparent: typings.wixStyleReact.wixStyleReactStrings.transparent = "transparent".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.transparent]
  }
}
