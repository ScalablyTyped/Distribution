package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var command: String
  
  var description: String
  
  var exampleReferences: js.Array[String]
  
  var parameters: js.Array[Description]
  
  var ref: String
}
object Ref {
  
  inline def apply(
    command: String,
    description: String,
    exampleReferences: js.Array[String],
    parameters: js.Array[Description],
    ref: String
  ): Ref = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], exampleReferences = exampleReferences.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExampleReferences(value: js.Array[String]): Self = StObject.set(x, "exampleReferences", value.asInstanceOf[js.Any])
    
    inline def setExampleReferencesVarargs(value: String*): Self = StObject.set(x, "exampleReferences", js.Array(value*))
    
    inline def setParameters(value: js.Array[Description]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Description*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
