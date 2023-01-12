package typings.websocket.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageEvent extends StObject {
  
  var data: String | Buffer | js.typedarray.ArrayBuffer
}
object IMessageEvent {
  
  inline def apply(data: String | Buffer | js.typedarray.ArrayBuffer): IMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMessageEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | Buffer | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
