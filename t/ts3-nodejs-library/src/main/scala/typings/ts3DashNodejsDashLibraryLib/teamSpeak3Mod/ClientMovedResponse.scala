package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMovedResponse extends js.Object {
  var channel: ts3DashNodejsDashLibraryLib.propertyChannelMod.^
  var client: ts3DashNodejsDashLibraryLib.propertyClientMod.^
  var reasonid: scala.Double
}

object ClientMovedResponse {
  @scala.inline
  def apply(
    channel: ts3DashNodejsDashLibraryLib.propertyChannelMod.^,
    client: ts3DashNodejsDashLibraryLib.propertyClientMod.^,
    reasonid: scala.Double
  ): ClientMovedResponse = {
    val __obj = js.Dynamic.literal(channel = channel, client = client, reasonid = reasonid)
  
    __obj.asInstanceOf[ClientMovedResponse]
  }
}

