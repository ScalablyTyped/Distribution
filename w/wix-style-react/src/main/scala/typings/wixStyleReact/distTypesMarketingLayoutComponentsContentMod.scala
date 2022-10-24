package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingLayoutComponentsContentMod {
  
  object default {
    
    inline def apply(param0: Actions): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/MarketingLayout/components/Content", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/components/Content", "default.propTypes.actions")
      @js.native
      val actions: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/components/Content", "default.propTypes.description")
      @js.native
      val description: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/components/Content", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/components/Content", "default.propTypes.title")
      @js.native
      val title: Requireable[ReactNodeLike] = js.native
    }
  }
}
