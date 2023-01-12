package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PassphraseRequest extends StObject {
  
  var _on_device: js.UndefOr[Boolean] = js.undefined
}
object PassphraseRequest {
  
  inline def apply(): PassphraseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PassphraseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PassphraseRequest] (val x: Self) extends AnyVal {
    
    inline def set_on_device(value: Boolean): Self = StObject.set(x, "_on_device", value.asInstanceOf[js.Any])
    
    inline def set_on_deviceUndefined: Self = StObject.set(x, "_on_device", js.undefined)
  }
}
