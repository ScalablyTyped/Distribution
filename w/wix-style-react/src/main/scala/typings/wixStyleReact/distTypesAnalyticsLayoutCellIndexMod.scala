package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnalyticsLayoutCellIndexMod {
  
  /** Cell */
  @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Index", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.wixStyleReact.distTypesAnalyticsLayoutCellCellMod.default {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Index", "default.defaultProps.children_1")
      @js.native
      val children1: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Index", "default.defaultProps.disableHighlight_1")
      @js.native
      val disableHighlight1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Index", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Index", "default.propTypes.children")
      @js.native
      val children: Validator[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Index", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Index", "default.propTypes.disableHighlight")
      @js.native
      val disableHighlight: Requireable[Boolean] = js.native
    }
  }
}
