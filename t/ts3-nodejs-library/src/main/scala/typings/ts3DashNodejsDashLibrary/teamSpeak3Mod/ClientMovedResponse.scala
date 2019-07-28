package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMovedResponse extends js.Object {
  var channel: typings.ts3DashNodejsDashLibrary.propertyChannelMod.^
  var client: typings.ts3DashNodejsDashLibrary.propertyClientMod.^
  var reasonid: Double
}

object ClientMovedResponse {
  @scala.inline
  def apply(
    channel: typings.ts3DashNodejsDashLibrary.propertyChannelMod.^,
    client: typings.ts3DashNodejsDashLibrary.propertyClientMod.^,
    reasonid: Double
  ): ClientMovedResponse = {
    val __obj = js.Dynamic.literal(channel = channel, client = client, reasonid = reasonid)
  
    __obj.asInstanceOf[ClientMovedResponse]
  }
}

