package typings.wixStyleReact

import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.CloseButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageBoxFunctionalLayoutHeaderLayoutMod {
  
  object default {
    
    inline def apply(param0: CloseButton): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/MessageBoxFunctionalLayout/HeaderLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/MessageBoxFunctionalLayout/HeaderLayout", "default.defaultProps.closeButton")
      @js.native
      val closeButton: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxFunctionalLayout/HeaderLayout", "default.defaultProps.theme")
      @js.native
      val theme: String = js.native
    }
  }
}
