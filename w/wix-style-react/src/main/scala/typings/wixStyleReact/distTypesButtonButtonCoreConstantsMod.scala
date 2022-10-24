package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonButtonCoreConstantsMod {
  
  @js.native
  sealed trait dataHooks extends StObject
  @JSImport("wix-style-react/dist/types/Button/ButtonCore/constants", "dataHooks")
  @js.native
  object dataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[dataHooks & String] = js.native
    
    @js.native
    sealed trait button
      extends StObject
         with dataHooks
    /* "button" */ val button: typings.wixStyleReact.distTypesButtonButtonCoreConstantsMod.dataHooks.button & String = js.native
    
    @js.native
    sealed trait prefixIcon
      extends StObject
         with dataHooks
    /* "prefix-icon" */ val prefixIcon: typings.wixStyleReact.distTypesButtonButtonCoreConstantsMod.dataHooks.prefixIcon & String = js.native
    
    @js.native
    sealed trait suffixIcon
      extends StObject
         with dataHooks
    /* "suffix-icon" */ val suffixIcon: typings.wixStyleReact.distTypesButtonButtonCoreConstantsMod.dataHooks.suffixIcon & String = js.native
  }
}
