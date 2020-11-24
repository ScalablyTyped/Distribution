package typings.symphonyApiClientNode.adminClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportMessageResult extends js.Object {
  
  var diagnostic: js.UndefOr[String] = js.native
  
  var messageId: js.UndefOr[String] = js.native
  
  var originalMessageId: js.UndefOr[String] = js.native
  
  var originatingSystemId: String = js.native
}
object ImportMessageResult {
  
  @scala.inline
  def apply(originatingSystemId: String): ImportMessageResult = {
    val __obj = js.Dynamic.literal(originatingSystemId = originatingSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportMessageResult]
  }
  
  @scala.inline
  implicit class ImportMessageResultOps[Self <: ImportMessageResult] (val x: Self) extends AnyVal {
    
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
    def setOriginatingSystemId(value: String): Self = this.set("originatingSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnostic(value: String): Self = this.set("diagnostic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnostic: Self = this.set("diagnostic", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    
    @scala.inline
    def setOriginalMessageId(value: String): Self = this.set("originalMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalMessageId: Self = this.set("originalMessageId", js.undefined)
  }
}
