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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SdProtect] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: SdProtectOperationType): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
