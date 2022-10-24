package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputInputConsumerInputConsumerMod {
  
  object InputConsumer {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Input/InputConsumer/InputConsumer", "InputConsumer")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Input/InputConsumer/InputConsumer", "InputConsumer.defaultProps.consumerCompName_1")
      @js.native
      val consumerCompName1: String = js.native
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Input/InputConsumer/InputConsumer", "InputConsumer.propTypes.children")
      @js.native
      val children: Validator[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputConsumer/InputConsumer", "InputConsumer.propTypes.consumerCompName")
      @js.native
      val consumerCompName: Requireable[String] = js.native
    }
  }
}
