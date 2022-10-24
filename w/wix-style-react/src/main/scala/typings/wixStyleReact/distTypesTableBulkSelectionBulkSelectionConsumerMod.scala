package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableBulkSelectionBulkSelectionConsumerMod {
  
  object BulkSelectionConsumer {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelectionConsumer", "BulkSelectionConsumer")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelectionConsumer", "BulkSelectionConsumer.defaultProps.consumerCompName_1")
      @js.native
      val consumerCompName1: String = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelectionConsumer", "BulkSelectionConsumer.defaultProps.providerCompName_1")
      @js.native
      val providerCompName1: String = js.native
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelectionConsumer", "BulkSelectionConsumer.propTypes.children")
      @js.native
      val children: Validator[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelectionConsumer", "BulkSelectionConsumer.propTypes.consumerCompName")
      @js.native
      val consumerCompName: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelectionConsumer", "BulkSelectionConsumer.propTypes.providerCompName")
      @js.native
      val providerCompName: Requireable[String] = js.native
    }
  }
}
