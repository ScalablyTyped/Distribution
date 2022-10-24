package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorProgressBarMod {
  
  @JSImport("wix-style-react/dist/types/Selector/ProgressBar", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.wixStyleReact.distTypesSelectorProgressBarProgressBarMod.default {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Selector/ProgressBar", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Selector/ProgressBar", "default.propTypes.progress")
      @js.native
      val progress: Validator[Double] = js.native
    }
  }
}
