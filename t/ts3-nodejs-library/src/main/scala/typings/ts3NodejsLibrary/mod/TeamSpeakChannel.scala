package typings.ts3NodejsLibrary.mod

import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel.ChannelType
import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel.MultiChannelType
import typings.ts3NodejsLibrary.responseTypesMod.ChannelEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel")
@js.native
class TeamSpeakChannel protected ()
  extends typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel {
  def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ChannelEntry) = this()
}
/* static members */
@JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel")
@js.native
object TeamSpeakChannel extends js.Object {
  
  /** retrieves the client id from a string or teamspeak client */
  def getId[T /* <: ChannelType */](): js.UndefOr[String] = js.native
  def getId[T /* <: ChannelType */](channel: T): js.UndefOr[String] = js.native
  
  /** retrieves the clients from an array */
  def getMultipleIds(channels: MultiChannelType): js.Array[String] = js.native
}
