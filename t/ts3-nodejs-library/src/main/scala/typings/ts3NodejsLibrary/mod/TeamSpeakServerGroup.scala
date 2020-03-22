package typings.ts3NodejsLibrary.mod

import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup")
@js.native
class TeamSpeakServerGroup protected ()
  extends typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup {
  def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ServerGroupList) = this()
}

