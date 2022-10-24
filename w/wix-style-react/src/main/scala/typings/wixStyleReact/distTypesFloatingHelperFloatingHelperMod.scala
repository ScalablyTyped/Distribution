package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Appearance
import typings.wixStyleReact.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperFloatingHelperMod {
  
  @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", JSImport.Default)
  @js.native
  open class default protected () extends FloatingHelper {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.defaultProps.appearance_1")
      @js.native
      val appearance1: String = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.defaultProps.appendTo_1")
      @js.native
      val appendTo1: String = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.defaultProps.initiallyOpened_1")
      @js.native
      val initiallyOpened1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.defaultProps.width_1")
      @js.native
      val width1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.appearance")
      @js.native
      val appearance: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.appendTo")
      @js.native
      val appendTo: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.content")
      @js.native
      val content: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.hideDelay")
      @js.native
      val hideDelay: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.initiallyOpened")
      @js.native
      val initiallyOpened: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.moveBy")
      @js.native
      val moveBy: Requireable[InferProps[X]] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.onClose")
      @js.native
      val onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.onOpen")
      @js.native
      val onOpen: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.opened")
      @js.native
      val opened: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.placement")
      @js.native
      val placement: Validator[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.target")
      @js.native
      val target: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.width")
      @js.native
      val width: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelper", "default.propTypes.zIndex")
      @js.native
      val zIndex: Requireable[Double] = js.native
    }
  }
  
  @js.native
  trait FloatingHelper extends Component[Any, Any, Any] {
    
    def _getCloseButtonHandler(closableActions: Any): Any = js.native
    
    def _isControlled(): Boolean = js.native
    
    def _renderContent(closableActions: Any, param1: Appearance): Element = js.native
    
    var closablePopoverRef: Any = js.native
    
    def close(): Any = js.native
    
    def open(): Any = js.native
  }
}
