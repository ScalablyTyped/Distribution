package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnalyticsLayoutAnalyticsLayoutMod {
  
  /** AnalyticsLayout */
  @JSImport("wix-style-react/dist/types/AnalyticsLayout/AnalyticsLayout", JSImport.Default)
  @js.native
  open class default protected () extends AnalyticsLayout {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/AnalyticsLayout", "default.defaultProps.items_1")
      @js.native
      val items1: js.Array[scala.Nothing] = js.native
    }
    
    @JSImport("wix-style-react/dist/types/AnalyticsLayout/AnalyticsLayout", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/AnalyticsLayout", "default.propTypes.children")
      @js.native
      val children: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/AnalyticsLayout", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/AnalyticsLayout", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/AnalyticsLayout", "default.propTypes.items")
      @js.native
      val items: Validator[Any] = js.native
    }
  }
  
  /** AnalyticsLayout */
  @js.native
  trait AnalyticsLayout extends PureComponent[Any, Any, Any]
}
