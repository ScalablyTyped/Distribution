package typings.tuyaPanelKit.anon

import typings.std.Record
import typings.tuyaPanelKit.mod.DevInfo
import typings.tuyaPanelKit.mod.DpType
import typings.tuyaPanelKit.mod.DpValue
import typings.tuyaPanelKit.tuyaPanelKitStrings.devInfo_
import typings.tuyaPanelKit.tuyaPanelKitStrings.deviceOnline
import typings.tuyaPanelKit.tuyaPanelKitStrings.dpData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayloadType extends js.Object {
  
  var payload: (Record[String, DpValue]) | (DevInfo[Record[String, DpType]]) | Boolean = js.native
  
  var `type`: dpData | devInfo_ | deviceOnline = js.native
}
object PayloadType {
  
  @scala.inline
  def apply(
    payload: (Record[String, DpValue]) | (DevInfo[Record[String, DpType]]) | Boolean,
    `type`: dpData | devInfo_ | deviceOnline
  ): PayloadType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadType]
  }
  
  @scala.inline
  implicit class PayloadTypeOps[Self <: PayloadType] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: (Record[String, DpValue]) | (DevInfo[Record[String, DpType]]) | Boolean): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: dpData | devInfo_ | deviceOnline): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
