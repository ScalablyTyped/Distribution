package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.Border
import typings.wixStyleReact.buttonMod.ButtonWithAsProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonMod {
  
  @JSImport("wix-style-react/dist/es/src/ToggleButton", JSImport.Default)
  @js.native
  class default ()
    extends Component[ToggleButtonProps, js.Object, js.Any]
  
  type ToggleButton = Component[ToggleButtonProps, js.Object, js.Any]
  
  type ToggleButtonProps = ButtonWithAsProp[Border]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.inverted
  */
  trait ToggleButtonSkin extends StObject
  object ToggleButtonSkin {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def inverted: typings.wixStyleReact.wixStyleReactStrings.inverted = "inverted".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.inverted]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
  }
}
