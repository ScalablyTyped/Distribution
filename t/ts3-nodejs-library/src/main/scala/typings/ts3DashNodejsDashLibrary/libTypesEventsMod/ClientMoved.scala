package typings.ts3DashNodejsDashLibrary.libTypesEventsMod

import typings.ts3DashNodejsDashLibrary.libNodeChannelMod.TeamSpeakChannel
import typings.ts3DashNodejsDashLibrary.libNodeClientMod.TeamSpeakClient
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ReasonIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMoved extends js.Object {
  var channel: TeamSpeakChannel
  var client: TeamSpeakClient
  var reasonid: ReasonIdentifier
}

object ClientMoved {
  @scala.inline
  def apply(channel: TeamSpeakChannel, client: TeamSpeakClient, reasonid: ReasonIdentifier): ClientMoved = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientMoved]
  }
}

