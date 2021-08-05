package typings.websocket.mod

import typings.node.Buffer
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageEvent extends StObject {
  
  var data: String | Buffer | ArrayBuffer
}
object IMessageEvent {
  
  inline def apply(data: String | Buffer | ArrayBuffer): IMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageEvent]
  }
  
  extension [Self <: IMessageEvent](x: Self) {
    
    inline def setData(value: String | Buffer | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
