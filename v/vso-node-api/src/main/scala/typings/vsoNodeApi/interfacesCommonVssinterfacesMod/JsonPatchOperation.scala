package typings.vsoNodeApi.interfacesCommonVssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonPatchOperation extends StObject {
  
  /**
    * The path to copy from for the Move/Copy operation.
    */
  var from: String
  
  /**
    * The patch operation
    */
  var op: Operation
  
  /**
    * The path for the operation
    */
  var path: String
  
  /**
    * The value for the operation. This is either a primitive or a JToken.
    */
  var value: Any
}
object JsonPatchOperation {
  
  inline def apply(from: String, op: Operation, path: String, value: Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonPatchOperation]
  }
  
  extension [Self <: JsonPatchOperation](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setOp(value: Operation): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
