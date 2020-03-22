package typings.ts3NodejsLibrary.mod

import typings.ts3NodejsLibrary.responseTypesMod.ChannelList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel")
@js.native
class TeamSpeakChannel protected ()
  extends typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel {
  def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ChannelList) = this()
}

