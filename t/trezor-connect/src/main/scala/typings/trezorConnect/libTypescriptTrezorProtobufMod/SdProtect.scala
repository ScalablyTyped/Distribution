package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdProtect extends StObject {
  
  var operation: SdProtectOperationType
}
object SdProtect {
  
  inline def apply(operation: SdProtectOperationType): SdProtect = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdProtect]
  }
  
  extension [Self <: SdProtect](x: Self) {
    
    inline def setOperation(value: SdProtectOperationType): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
