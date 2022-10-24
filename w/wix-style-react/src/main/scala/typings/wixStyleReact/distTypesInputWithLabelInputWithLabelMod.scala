package typings.wixStyleReact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputWithLabelInputWithLabelMod {
  
  @JSImport("wix-style-react/dist/types/InputWithLabel/InputWithLabel", JSImport.Default)
  @js.native
  open class default protected () extends InputWithLabel {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/InputWithLabel/InputWithLabel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/InputWithLabel/InputWithLabel", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/InputWithLabel/InputWithLabel", "default.defaultProps.statusMessage")
      @js.native
      def statusMessage: String = js.native
      inline def statusMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/InputWithLabel/InputWithLabel", "default.propTypes")
    @js.native
    def propTypes: Any = js.native
    inline def propTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait InputWithLabel extends Component[Any, Any, Any]
}
