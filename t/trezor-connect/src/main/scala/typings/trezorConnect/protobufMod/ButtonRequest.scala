package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonRequest extends StObject {
  
  var code: js.UndefOr[ButtonRequestType] = js.undefined
  
  var pages: js.UndefOr[Double] = js.undefined
}
object ButtonRequest {
  
  inline def apply(): ButtonRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonRequest]
  }
  
  extension [Self <: ButtonRequest](x: Self) {
    
    inline def setCode(value: ButtonRequestType): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
  }
}
