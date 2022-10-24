package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStatusIndicatorStatusIndicatorMod {
  
  /** StatusIndicator */
  @JSImport("wix-style-react/dist/types/StatusIndicator/StatusIndicator", JSImport.Default)
  @js.native
  open class default protected () extends StatusIndicator {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/StatusIndicator/StatusIndicator", "default.defaultProps.status_1")
      @js.native
      val status1: String = js.native
      
      @JSImport("wix-style-react/dist/types/StatusIndicator/StatusIndicator", "default.defaultProps.tooltipPlacement_1")
      @js.native
      val tooltipPlacement1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/StatusIndicator/StatusIndicator", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/StatusIndicator/StatusIndicator", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/StatusIndicator/StatusIndicator", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/StatusIndicator/StatusIndicator", "default.propTypes.message")
      @js.native
      val message: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/StatusIndicator/StatusIndicator", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/StatusIndicator/StatusIndicator", "default.propTypes.tooltipPlacement")
      @js.native
      val tooltipPlacement: Requireable[String] = js.native
    }
  }
  
  /** StatusIndicator */
  @js.native
  trait StatusIndicator extends PureComponent[Any, Any, Any] {
    
    def _renderStatus(): Element = js.native
  }
}
