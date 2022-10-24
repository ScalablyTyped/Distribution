package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ChildrenValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputAffixAffixMod {
  
  object default {
    
    inline def apply(param0: ChildrenValue): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Input/Affix/Affix", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Input/Affix/Affix", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Input/Affix/Affix", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/Affix/Affix", "default.propTypes.value")
      @js.native
      val value: Requireable[String] = js.native
    }
  }
}
