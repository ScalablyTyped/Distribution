package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingPageLayoutMarketingPageLayoutMod {
  
  /** Marketing Page Layout */
  @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", JSImport.Default)
  @js.native
  open class default protected () extends MarketingPageLayout {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.defaultProps.horizontalSize_1")
      @js.native
      val horizontalSize1: String = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.defaultProps.removeImageHorizontalPadding_1")
      @js.native
      val removeImageHorizontalPadding1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.defaultProps.removeImageVerticalPadding_1")
      @js.native
      val removeImageVerticalPadding1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.defaultProps.verticalSize_1")
      @js.native
      val verticalSize1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.propTypes.content")
      @js.native
      val content: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.propTypes.footer")
      @js.native
      val footer: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.propTypes.horizontalSize")
      @js.native
      val horizontalSize: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.propTypes.image")
      @js.native
      val image: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.propTypes.removeImageHorizontalPadding")
      @js.native
      val removeImageHorizontalPadding: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.propTypes.removeImageVerticalPadding")
      @js.native
      val removeImageVerticalPadding: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingPageLayout/MarketingPageLayout", "default.propTypes.verticalSize")
      @js.native
      val verticalSize: Requireable[String] = js.native
    }
  }
  
  /** Marketing Page Layout */
  @js.native
  trait MarketingPageLayout extends PureComponent[Any, Any, Any]
}
