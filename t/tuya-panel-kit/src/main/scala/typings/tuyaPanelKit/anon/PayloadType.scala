package typings.tuyaPanelKit.anon

import typings.std.Record
import typings.tuyaPanelKit.mod.DevInfo
import typings.tuyaPanelKit.mod.DpType
import typings.tuyaPanelKit.mod.DpValue
import typings.tuyaPanelKit.tuyaPanelKitStrings.devInfo_
import typings.tuyaPanelKit.tuyaPanelKitStrings.deviceOnline
import typings.tuyaPanelKit.tuyaPanelKitStrings.dpData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadType extends StObject {
  
  var payload: (Record[String, DpValue]) | (DevInfo[Record[String, DpType]]) | Boolean
  
  var `type`: dpData | devInfo_ | deviceOnline
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
  implicit class PayloadTypeMutableBuilder[Self <: PayloadType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: (Record[String, DpValue]) | (DevInfo[Record[String, DpType]]) | Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: dpData | devInfo_ | deviceOnline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
