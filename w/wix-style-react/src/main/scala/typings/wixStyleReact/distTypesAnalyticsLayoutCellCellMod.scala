package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.IsHovered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnalyticsLayoutCellCellMod {
  
  /** Cell */
  @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Cell", JSImport.Default)
  @js.native
  open class default protected () extends Cell {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Cell", "default.defaultProps.children_1")
      @js.native
      val children1: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Cell", "default.defaultProps.disableHighlight_1")
      @js.native
      val disableHighlight1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Cell", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Cell", "default.propTypes.children")
      @js.native
      val children: Validator[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Cell", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AnalyticsLayout/Cell/Cell", "default.propTypes.disableHighlight")
      @js.native
      val disableHighlight: Requireable[Boolean] = js.native
    }
  }
  
  /** Cell */
  @js.native
  trait Cell extends PureComponent[Any, Any, Any] {
    
    def _setHover(isHovered: Any): Unit = js.native
    
    @JSName("state")
    var state_Cell: IsHovered = js.native
  }
}
