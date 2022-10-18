package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.Bridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.PayloadTransportInfo
  - typings.trezorConnect.anon.PayloadBridge
*/
trait TransportEvent extends StObject
object TransportEvent {
  
  inline def PayloadBridge(payload: Bridge, `type`: /* "transport-error" */ String): typings.trezorConnect.anon.PayloadBridge = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.PayloadBridge]
  }
  
  inline def PayloadTransportInfo(payload: TransportInfo, `type`: /* "transport-start" */ String): typings.trezorConnect.anon.PayloadTransportInfo = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.PayloadTransportInfo]
  }
}
