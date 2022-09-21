package typings.websocket.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.websocket.mod.IUtf8Message
  - typings.websocket.mod.IBinaryMessage
*/
trait Message extends StObject
object Message {
  
  inline def IBinaryMessage(binaryData: Buffer): typings.websocket.mod.IBinaryMessage = {
    val __obj = js.Dynamic.literal(binaryData = binaryData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[typings.websocket.mod.IBinaryMessage]
  }
  
  inline def IUtf8Message(utf8Data: String): typings.websocket.mod.IUtf8Message = {
    val __obj = js.Dynamic.literal(utf8Data = utf8Data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("utf8")
    __obj.asInstanceOf[typings.websocket.mod.IUtf8Message]
  }
}
