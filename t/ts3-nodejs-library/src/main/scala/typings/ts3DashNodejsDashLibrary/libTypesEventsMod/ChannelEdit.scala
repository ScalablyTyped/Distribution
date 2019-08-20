package typings.ts3DashNodejsDashLibrary.libTypesEventsMod

import typings.std.Partial
import typings.ts3DashNodejsDashLibrary.libNodeChannelMod.TeamSpeakChannel
import typings.ts3DashNodejsDashLibrary.libNodeClientMod.TeamSpeakClient
import typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponseTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelEdit extends js.Object {
  var channel: TeamSpeakChannel
  var invoker: TeamSpeakClient
  var modified: Partial[QueryResponseTypes]
  var reasonid: Double
}

object ChannelEdit {
  @scala.inline
  def apply(
    channel: TeamSpeakChannel,
    invoker: TeamSpeakClient,
    modified: Partial[QueryResponseTypes],
    reasonid: Double
  ): ChannelEdit = {
    val __obj = js.Dynamic.literal(channel = channel, invoker = invoker, modified = modified, reasonid = reasonid)
  
    __obj.asInstanceOf[ChannelEdit]
  }
}

