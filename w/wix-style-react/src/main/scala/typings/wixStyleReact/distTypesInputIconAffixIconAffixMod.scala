package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ChildrenDataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputIconAffixIconAffixMod {
  
  object default {
    
    inline def apply(param0: ChildrenDataHook): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Input/IconAffix/IconAffix", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Input/IconAffix/IconAffix", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Input/IconAffix/IconAffix", "default.propTypes.children")
      @js.native
      val children: Validator[ReactElementLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/IconAffix/IconAffix", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
    }
  }
}
