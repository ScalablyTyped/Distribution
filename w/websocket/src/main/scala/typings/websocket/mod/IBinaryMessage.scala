package typings.websocket.mod

import typings.node.bufferMod.global.Buffer
import typings.websocket.websocketStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBinaryMessage
  extends StObject
     with Message {
  
  var binaryData: Buffer
  
  var `type`: binary
}
object IBinaryMessage {
  
  inline def apply(binaryData: Buffer): IBinaryMessage = {
    val __obj = js.Dynamic.literal(binaryData = binaryData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[IBinaryMessage]
  }
  
  extension [Self <: IBinaryMessage](x: Self) {
    
    inline def setBinaryData(value: Buffer): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    inline def setType(value: binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
