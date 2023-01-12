package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirmwareErase extends StObject {
  
  var length: js.UndefOr[Double] = js.undefined
}
object FirmwareErase {
  
  inline def apply(): FirmwareErase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirmwareErase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirmwareErase] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
