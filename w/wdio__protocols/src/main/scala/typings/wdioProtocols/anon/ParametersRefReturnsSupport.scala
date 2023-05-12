package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersRefReturnsSupport extends StObject {
  
  var command: String
  
  var description: String
  
  var parameters: js.Array[scala.Nothing]
  
  var ref: String
  
  var returns: Name
  
  var support: AndroidUiAutomator
}
object ParametersRefReturnsSupport {
  
  inline def apply(
    command: String,
    description: String,
    parameters: js.Array[scala.Nothing],
    ref: String,
    returns: Name,
    support: AndroidUiAutomator
  ): ParametersRefReturnsSupport = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRefReturnsSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersRefReturnsSupport] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[scala.Nothing]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: scala.Nothing*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setReturns(value: Name): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: AndroidUiAutomator): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
  }
}
