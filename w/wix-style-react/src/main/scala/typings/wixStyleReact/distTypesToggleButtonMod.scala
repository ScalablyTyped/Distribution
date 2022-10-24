package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.Border
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonWithAsProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToggleButtonMod {
  
  @JSImport("wix-style-react/dist/types/ToggleButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ToggleButtonProps, js.Object, Any]
  
  type ToggleButton = Component[ToggleButtonProps, js.Object, Any]
  
  type ToggleButtonProps = ButtonWithAsProp[Border]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.inverted
    - typings.wixStyleReact.wixStyleReactStrings.destructive
    - typings.wixStyleReact.wixStyleReactStrings.success
  */
  trait ToggleButtonSkin extends StObject
  object ToggleButtonSkin {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typings.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def inverted: typings.wixStyleReact.wixStyleReactStrings.inverted = "inverted".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.inverted]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
  }
}
