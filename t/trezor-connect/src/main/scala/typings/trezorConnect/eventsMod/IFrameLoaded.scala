package typings.trezorConnect.eventsMod

import typings.trezorConnect.anon.UseBroadcastChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFrameLoaded extends StObject {
  
  var payload: UseBroadcastChannel
  
  var `type`: /* "iframe-loaded" */ String
}
object IFrameLoaded {
  
  inline def apply(payload: UseBroadcastChannel, `type`: /* "iframe-loaded" */ String): IFrameLoaded = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFrameLoaded]
  }
  
  extension [Self <: IFrameLoaded](x: Self) {
    
    inline def setPayload(value: UseBroadcastChannel): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "iframe-loaded" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
