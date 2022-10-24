package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingPageLayoutContentMarketingPageLayoutContentMod {
  
  /** This component is used in the MarketingPageLayout component. It includes all the content of the page. */
  @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", JSImport.Default)
  @js.native
  open class default protected () extends MarketingPageLayoutContent {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", "default.propTypes.actions")
      @js.native
      val actions: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", "default.propTypes.content")
      @js.native
      val content: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", "default.propTypes.overline")
      @js.native
      val overline: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", "default.propTypes.subtitle")
      @js.native
      val subtitle: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent/MarketingPageLayoutContent", "default.propTypes.title")
      @js.native
      val title: Requireable[ReactNodeLike] = js.native
    }
  }
  
  /** This component is used in the MarketingPageLayout component. It includes all the content of the page. */
  @js.native
  trait MarketingPageLayoutContent extends PureComponent[Any, Any, Any]
}
