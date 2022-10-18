package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFrameError extends StObject {
  
  var payload: Code
  
  var `type`: /* "iframe-error" */ String
}
object IFrameError {
  
  inline def apply(payload: Code, `type`: /* "iframe-error" */ String): IFrameError = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFrameError]
  }
  
  extension [Self <: IFrameError](x: Self) {
    
    inline def setPayload(value: Code): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "iframe-error" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
