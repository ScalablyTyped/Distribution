package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExamplesParameters extends StObject {
  
  var command: String
  
  var description: String
  
  var examples: js.Array[js.Array[String]]
  
  var parameters: js.Array[scala.Nothing]
  
  var ref: String
  
  var returns: Name
}
object ExamplesParameters {
  
  inline def apply(
    command: String,
    description: String,
    examples: js.Array[js.Array[String]],
    parameters: js.Array[scala.Nothing],
    ref: String,
    returns: Name
  ): ExamplesParameters = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExamplesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExamplesParameters] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExamples(value: js.Array[js.Array[String]]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesVarargs(value: js.Array[String]*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setParameters(value: js.Array[scala.Nothing]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: scala.Nothing*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setReturns(value: Name): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
  }
}
