package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * "uninitialized": The StreamFilter is not fully initialized. No methods may be called until a "start" event has been
  * received.
  * "transferringdata": The underlying channel is currently transferring data, which will be dispatched via "data" events.
  * "finishedtransferringdata": The underlying channel has finished transferring data. Data may still be written via write()
  * calls at this point.
  * "suspended": Data transfer is currently suspended. It may be resumed by a call to resume().
  * Data may still be written via write() calls in this state.
  * "closed": The channel has been closed by a call to close(). No further data wlil be delivered via "data" events,
  * and no further data may be written via write() calls.
  * "disconnected": The channel has been disconnected by a call to disconnect(). All further data will be delivered directly,
  * without passing through the filter. No further events will be dispatched, and no further data may be written by write()
  * calls.
  * "failed": An error has occurred and the channel is disconnected. The `error`, property contains the details of the error.
  */
/* Rewritten from type alias, can be one of: 
  - typings.webextensionPolyfill.webextensionPolyfillStrings.uninitialized
  - typings.webextensionPolyfill.webextensionPolyfillStrings.transferringdata
  - typings.webextensionPolyfill.webextensionPolyfillStrings.finishedtransferringdata
  - typings.webextensionPolyfill.webextensionPolyfillStrings.suspended
  - typings.webextensionPolyfill.webextensionPolyfillStrings.closed
  - typings.webextensionPolyfill.webextensionPolyfillStrings.disconnected
  - typings.webextensionPolyfill.webextensionPolyfillStrings.failed
*/
trait StreamFilterStatus extends StObject
object StreamFilterStatus {
  
  inline def closed: typings.webextensionPolyfill.webextensionPolyfillStrings.closed = "closed".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.closed]
  
  inline def disconnected: typings.webextensionPolyfill.webextensionPolyfillStrings.disconnected = "disconnected".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.disconnected]
  
  inline def failed: typings.webextensionPolyfill.webextensionPolyfillStrings.failed = "failed".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.failed]
  
  inline def finishedtransferringdata: typings.webextensionPolyfill.webextensionPolyfillStrings.finishedtransferringdata = "finishedtransferringdata".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.finishedtransferringdata]
  
  inline def suspended: typings.webextensionPolyfill.webextensionPolyfillStrings.suspended = "suspended".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.suspended]
  
  inline def transferringdata: typings.webextensionPolyfill.webextensionPolyfillStrings.transferringdata = "transferringdata".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.transferringdata]
  
  inline def uninitialized: typings.webextensionPolyfill.webextensionPolyfillStrings.uninitialized = "uninitialized".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.uninitialized]
}
