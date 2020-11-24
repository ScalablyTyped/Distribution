package typings.websocket.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessage extends js.Object {
  
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
  implicit class IMessageOps[Self <: IMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryData(value: Buffer): Self = this.set("binaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryData: Self = this.set("binaryData", js.undefined)
    
    @scala.inline
    def setUtf8Data(value: String): Self = this.set("utf8Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtf8Data: Self = this.set("utf8Data", js.undefined)
  }
}
