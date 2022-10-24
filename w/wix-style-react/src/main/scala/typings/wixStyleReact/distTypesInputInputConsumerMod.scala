package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputInputConsumerMod {
  
  object default {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Input/InputConsumer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Input/InputConsumer", "default.defaultProps.consumerCompName_1")
      @js.native
      val consumerCompName1: String = js.native
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Input/InputConsumer", "default.propTypes.children")
      @js.native
      val children: Validator[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputConsumer", "default.propTypes.consumerCompName")
      @js.native
      val consumerCompName: Requireable[String] = js.native
    }
  }
}
