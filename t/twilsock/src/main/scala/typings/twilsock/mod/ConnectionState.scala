package typings.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates current state of connection between the client and Sync service.
  * <p>Possible values are as follows:
  * <li>'connecting' - client is offline and connection attempt is in process.
  * <li>'connected' - client is online and ready.
  * <li>'disconnecting' - client is going offline as disconnection is in process.
  * <li>'disconnected' - client is offline and no connection attempt is in process.
  * <li>'denied' - client connection is denied because of invalid JWT access token. User must refresh token in order to proceed.
  * <li>'error' - client connection is in a permanent erroneous state. Client re-initialization is required.
  * @typedef {('unknown'|'connecting'|'connected'|'disconnecting'|'disconnected'|'denied'|'error')} TwilsockClient#ConnectionState
  */
/* Rewritten from type alias, can be one of: 
  - typings.twilsock.twilsockStrings.unknown
  - typings.twilsock.twilsockStrings.disconnecting
  - typings.twilsock.twilsockStrings.disconnected
  - typings.twilsock.twilsockStrings.connecting
  - typings.twilsock.twilsockStrings.connected
  - typings.twilsock.twilsockStrings.denied
  - typings.twilsock.twilsockStrings.error
*/
trait ConnectionState extends StObject
object ConnectionState {
  
  inline def connected: typings.twilsock.twilsockStrings.connected = "connected".asInstanceOf[typings.twilsock.twilsockStrings.connected]
  
  inline def connecting: typings.twilsock.twilsockStrings.connecting = "connecting".asInstanceOf[typings.twilsock.twilsockStrings.connecting]
  
  inline def denied: typings.twilsock.twilsockStrings.denied = "denied".asInstanceOf[typings.twilsock.twilsockStrings.denied]
  
  inline def disconnected: typings.twilsock.twilsockStrings.disconnected = "disconnected".asInstanceOf[typings.twilsock.twilsockStrings.disconnected]
  
  inline def disconnecting: typings.twilsock.twilsockStrings.disconnecting = "disconnecting".asInstanceOf[typings.twilsock.twilsockStrings.disconnecting]
  
  inline def error: typings.twilsock.twilsockStrings.error = "error".asInstanceOf[typings.twilsock.twilsockStrings.error]
  
  inline def unknown: typings.twilsock.twilsockStrings.unknown = "unknown".asInstanceOf[typings.twilsock.twilsockStrings.unknown]
}
