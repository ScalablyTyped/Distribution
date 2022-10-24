package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorProgressBarProgressBarMod {
  
  @JSImport("wix-style-react/dist/types/Selector/ProgressBar/ProgressBar", JSImport.Default)
  @js.native
  open class default protected () extends ProgressBar {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Selector/ProgressBar/ProgressBar", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Selector/ProgressBar/ProgressBar", "default.propTypes.progress")
      @js.native
      val progress: Validator[Double] = js.native
    }
  }
  
  @js.native
  trait ProgressBar extends PureComponent[Any, Any, Any]
}
