package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `setVariable` request. */
trait SetVariableArguments extends StObject {
  
  /** Specifies details on how to format the response value. */
  var format: js.UndefOr[ValueFormat] = js.undefined
  
  /** The name of the variable in the container. */
  var name: String
  
  /** The value of the variable. */
  var value: String
  
  /** The reference of the variable container. */
  var variablesReference: Double
}
object SetVariableArguments {
  
  inline def apply(name: String, value: String, variablesReference: Double): SetVariableArguments = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variablesReference = variablesReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVariableArguments]
  }
  
  extension [Self <: SetVariableArguments](x: Self) {
    
    inline def setFormat(value: ValueFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVariablesReference(value: Double): Self = StObject.set(x, "variablesReference", value.asInstanceOf[js.Any])
  }
}
