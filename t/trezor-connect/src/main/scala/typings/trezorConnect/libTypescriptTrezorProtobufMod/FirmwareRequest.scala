package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirmwareRequest extends StObject {
  
  var length: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
}
object FirmwareRequest {
  
  inline def apply(): FirmwareRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirmwareRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirmwareRequest] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
