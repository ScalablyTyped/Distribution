package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinearProgressBarLinearProgressBarMod {
  
  /**
    * This component is used for indicating a progress along a process.*/
  @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBar", JSImport.Default)
  @js.native
  open class default protected () extends LinearProgressBar {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBar", "default.defaultProps.skin_1")
      @js.native
      val skin1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBar", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBar", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBar", "default.propTypes.error")
      @js.native
      val error: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBar", "default.propTypes.errorMessage")
      @js.native
      val errorMessage: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBar", "default.propTypes.light")
      @js.native
      val light: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBar", "default.propTypes.showProgressIndication")
      @js.native
      val showProgressIndication: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBar", "default.propTypes.skin")
      @js.native
      val skin: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBar", "default.propTypes.value")
      @js.native
      val value: Requireable[String | Double] = js.native
    }
  }
  
  /**
    * This component is used for indicating a progress along a process.*/
  @js.native
  trait LinearProgressBar extends PureComponent[Any, Any, Any]
}
