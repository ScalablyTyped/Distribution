package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportVariables extends StObject {
  
  var command: String
  
  var parameters: js.Array[Description]
  
  var ref: String
  
  var support: IosXCUITest
  
  var variables: js.Array[DescriptionName]
}
object SupportVariables {
  
  inline def apply(
    command: String,
    parameters: js.Array[Description],
    ref: String,
    support: IosXCUITest,
    variables: js.Array[DescriptionName]
  ): SupportVariables = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportVariables] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Description]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Description*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: IosXCUITest): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: js.Array[DescriptionName]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: DescriptionName*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
