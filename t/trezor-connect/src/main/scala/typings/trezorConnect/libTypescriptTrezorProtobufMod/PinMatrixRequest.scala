package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinMatrixRequest extends StObject {
  
  var `type`: js.UndefOr[PinMatrixRequestType] = js.undefined
}
object PinMatrixRequest {
  
  inline def apply(): PinMatrixRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinMatrixRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PinMatrixRequest] (val x: Self) extends AnyVal {
    
    inline def setType(value: PinMatrixRequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
