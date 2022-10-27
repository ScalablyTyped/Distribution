package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketClient extends StObject {
  
  /**
    * Send custom event
    */
  def send(event: String): Unit = js.native
  /**
    * Send event to the client
    */
  def send(
    payload: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HMRPayload */ Any
  ): Unit = js.native
  @JSName("send")
  def send_data(
    event: String,
    payload: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomPayload * / any['data'] */ js.Any
  ): Unit = js.native
  
  /**
    * The raw WebSocket instance
    * @advanced
    */
  var socket: WebSocket2 = js.native
}
