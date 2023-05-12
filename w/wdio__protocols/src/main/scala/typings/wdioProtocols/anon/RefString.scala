package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefString extends StObject {
  
  var command: String
  
  var description: String
  
  var parameters: js.Array[Default | DefaultDescription]
  
  var ref: String
  
  var support: IosUIAutomationString
}
object RefString {
  
  inline def apply(
    command: String,
    description: String,
    parameters: js.Array[Default | DefaultDescription],
    ref: String,
    support: IosUIAutomationString
  ): RefString = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefString] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Default | DefaultDescription]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (Default | DefaultDescription)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: IosUIAutomationString): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
  }
}
