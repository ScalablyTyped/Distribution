package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternativeCommandsCommand extends StObject {
  
  var alternativeCommands: js.Array[String]
  
  var command: String
  
  var description: String
  
  var exampleReferences: js.Array[String]
  
  var parameters: js.Array[Description]
  
  var ref: String
}
object AlternativeCommandsCommand {
  
  inline def apply(
    alternativeCommands: js.Array[String],
    command: String,
    description: String,
    exampleReferences: js.Array[String],
    parameters: js.Array[Description],
    ref: String
  ): AlternativeCommandsCommand = {
    val __obj = js.Dynamic.literal(alternativeCommands = alternativeCommands.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], exampleReferences = exampleReferences.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternativeCommandsCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlternativeCommandsCommand] (val x: Self) extends AnyVal {
    
    inline def setAlternativeCommands(value: js.Array[String]): Self = StObject.set(x, "alternativeCommands", value.asInstanceOf[js.Any])
    
    inline def setAlternativeCommandsVarargs(value: String*): Self = StObject.set(x, "alternativeCommands", js.Array(value*))
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExampleReferences(value: js.Array[String]): Self = StObject.set(x, "exampleReferences", value.asInstanceOf[js.Any])
    
    inline def setExampleReferencesVarargs(value: String*): Self = StObject.set(x, "exampleReferences", js.Array(value*))
    
    inline def setParameters(value: js.Array[Description]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Description*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
