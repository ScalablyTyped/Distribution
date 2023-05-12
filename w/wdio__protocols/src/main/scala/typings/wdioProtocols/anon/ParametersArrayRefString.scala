package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersArrayRefString extends StObject {
  
  var command: String
  
  var description: String
  
  var parameters: js.Array[RequiredType]
  
  var ref: String
  
  var support: IosXCUITest
}
object ParametersArrayRefString {
  
  inline def apply(
    command: String,
    description: String,
    parameters: js.Array[RequiredType],
    ref: String,
    support: IosXCUITest
  ): ParametersArrayRefString = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersArrayRefString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersArrayRefString] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[RequiredType]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: RequiredType*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: IosXCUITest): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
  }
}
