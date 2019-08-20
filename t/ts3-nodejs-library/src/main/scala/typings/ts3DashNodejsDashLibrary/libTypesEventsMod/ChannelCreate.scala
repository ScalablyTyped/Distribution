package typings.ts3DashNodejsDashLibrary.libTypesEventsMod

import typings.std.Partial
import typings.ts3DashNodejsDashLibrary.libNodeChannelMod.TeamSpeakChannel
import typings.ts3DashNodejsDashLibrary.libNodeClientMod.TeamSpeakClient
import typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponseTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelCreate extends js.Object {
  var channel: TeamSpeakChannel
  var cpid: Double
  var invoker: TeamSpeakClient
  var modified: Partial[QueryResponseTypes]
}

object ChannelCreate {
  @scala.inline
  def apply(
    channel: TeamSpeakChannel,
    cpid: Double,
    invoker: TeamSpeakClient,
    modified: Partial[QueryResponseTypes]
  ): ChannelCreate = {
    val __obj = js.Dynamic.literal(channel = channel, cpid = cpid, invoker = invoker, modified = modified)
  
    __obj.asInstanceOf[ChannelCreate]
  }
}

