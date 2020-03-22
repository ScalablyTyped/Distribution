package typings.ts3NodejsLibrary.mod

import typings.ts3NodejsLibrary.responseTypesMod.ServerList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", "TeamSpeakServer")
@js.native
class TeamSpeakServer protected ()
  extends typings.ts3NodejsLibrary.serverMod.TeamSpeakServer {
  def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ServerList) = this()
}

