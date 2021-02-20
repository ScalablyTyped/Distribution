package typings.websocket.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessage extends StObject {
  
  var binaryData: js.UndefOr[Buffer] = js.native
  
  var `type`: String = js.native
  
  var utf8Data: js.UndefOr[String] = js.native
}
object IMessage {
  
  @scala.inline
  def apply(`type`: String): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
  
  @scala.inline
  implicit class IMessageMutableBuilder[Self <: IMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryData(value: Buffer): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryDataUndefined: Self = StObject.set(x, "binaryData", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf8Data(value: String): Self = StObject.set(x, "utf8Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf8DataUndefined: Self = StObject.set(x, "utf8Data", js.undefined)
  }
}
