package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCounterBadgeCounterBadgeMod {
  
  /** CounterBadge */
  @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", JSImport.Default)
  @js.native
  open class default protected () extends CounterBadge {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", "default.defaultProps.showShadow_1")
      @js.native
      val showShadow1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
      
      @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", "default.defaultProps.skin_1")
      @js.native
      val skin1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", "default.propTypes.showShadow")
      @js.native
      val showShadow: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CounterBadge/CounterBadge", "default.propTypes.skin")
      @js.native
      val skin: Requireable[String] = js.native
    }
  }
  
  /** CounterBadge */
  @js.native
  trait CounterBadge extends PureComponent[Any, Any, Any] {
    
    def _renderCounterBadgeContent(size: Any, content: Any): Element = js.native
    
    def _renderNumberContent(n: Any): Any = js.native
  }
}
