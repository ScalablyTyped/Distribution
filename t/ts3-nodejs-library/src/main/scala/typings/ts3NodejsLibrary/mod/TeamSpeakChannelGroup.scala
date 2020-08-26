package typings.ts3NodejsLibrary.mod

import typings.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup.GroupType
import typings.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup.MultiGroupType
import typings.ts3NodejsLibrary.responseTypesMod.ChannelGroupEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup")
@js.native
class TeamSpeakChannelGroup protected ()
  extends typings.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup {
  def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ChannelGroupEntry) = this()
}

/* static members */
@JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup")
@js.native
object TeamSpeakChannelGroup extends js.Object {
  /** retrieves the client id from a string or teamspeak client */
  def getId[T /* <: GroupType */](): js.UndefOr[String] = js.native
  def getId[T /* <: GroupType */](channel: T): js.UndefOr[String] = js.native
  /** retrieves the clients from an array */
  def getMultipleIds(client: MultiGroupType): js.Array[String] = js.native
}

