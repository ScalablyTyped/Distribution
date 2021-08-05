package typings.websocket.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessage extends StObject {
  
  var binaryData: js.UndefOr[Buffer] = js.undefined
  
  var `type`: String
  
  var utf8Data: js.UndefOr[String] = js.undefined
}
object IMessage {
  
  inline def apply(`type`: String): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
  
  extension [Self <: IMessage](x: Self) {
    
    inline def setBinaryData(value: Buffer): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    inline def setBinaryDataUndefined: Self = StObject.set(x, "binaryData", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUtf8Data(value: String): Self = StObject.set(x, "utf8Data", value.asInstanceOf[js.Any])
    
    inline def setUtf8DataUndefined: Self = StObject.set(x, "utf8Data", js.undefined)
  }
}
