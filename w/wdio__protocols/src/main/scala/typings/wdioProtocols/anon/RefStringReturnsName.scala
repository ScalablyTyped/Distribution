package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefStringReturnsName extends StObject {
  
  var command: String
  
  var description: String
  
  var parameters: js.Array[NameRequired | DefaultDescription | DefaultDescriptionName]
  
  var ref: String
  
  var returns: Name
}
object RefStringReturnsName {
  
  inline def apply(
    command: String,
    description: String,
    parameters: js.Array[NameRequired | DefaultDescription | DefaultDescriptionName],
    ref: String,
    returns: Name
  ): RefStringReturnsName = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefStringReturnsName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefStringReturnsName] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[NameRequired | DefaultDescription | DefaultDescriptionName]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (NameRequired | DefaultDescription | DefaultDescriptionName)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setReturns(value: Name): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
  }
}
