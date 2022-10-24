package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.AppearanceChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingLayoutComponentsTitleMod {
  
  object default {
    
    inline def apply(param0: AppearanceChildren): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/MarketingLayout/components/Title", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/components/Title", "default.propTypes.appearance")
      @js.native
      val appearance: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/components/Title", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
    }
  }
}
