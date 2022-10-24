package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCircularProgressBarCircularProgressBarMod {
  
  @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", JSImport.Default)
  @js.native
  open class default protected () extends CircularProgressBar {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.defaultProps.size")
      @js.native
      val size: String = js.native
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.defaultProps.skin")
      @js.native
      val skin: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.propTypes.error")
      @js.native
      val error: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.propTypes.errorLabel")
      @js.native
      val errorLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.propTypes.errorMessage")
      @js.native
      val errorMessage: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.propTypes.label")
      @js.native
      val label: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.propTypes.light")
      @js.native
      val light: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.propTypes.showProgressIndication")
      @js.native
      val showProgressIndication: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.propTypes.size_1")
      @js.native
      val size1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.propTypes.skin_1")
      @js.native
      val skin1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBar", "default.propTypes.value")
      @js.native
      val value: Requireable[String | Double] = js.native
    }
  }
  
  @js.native
  trait CircularProgressBar extends PureComponent[Any, Any, Any] {
    
    def _renderProgressBar(): Element = js.native
    
    def _renderSuccessIcon(size: Any): Element = js.native
  }
}
