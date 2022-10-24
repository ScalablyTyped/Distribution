package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ContentAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabsCoreSideContentMod {
  
  object default {
    
    inline def apply(param0: ContentAny): Element | Null = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("wix-style-react/dist/types/Tabs/core/SideContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Tabs/core/SideContent", "default.propTypes.content")
      @js.native
      val content: Requireable[ReactNodeLike] = js.native
    }
  }
}
