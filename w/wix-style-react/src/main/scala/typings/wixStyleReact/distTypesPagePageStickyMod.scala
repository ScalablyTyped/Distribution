package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPagePageStickyMod {
  
  object PageSticky {
    
    inline def apply(param0: Style): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Page/PageSticky", "PageSticky")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Page/PageSticky", "PageSticky.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Page/PageSticky", "PageSticky.propTypes.children")
      @js.native
      val children: Validator[ReactElementLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/PageSticky", "PageSticky.propTypes.style")
      @js.native
      val style: Requireable[js.Object] = js.native
    }
  }
}
