package typings.ts3NodejsLibrary.mod

import typings.ts3NodejsLibrary.responseTypesMod.ClientList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", "TeamSpeakClient")
@js.native
class TeamSpeakClient protected ()
  extends typings.ts3NodejsLibrary.clientMod.TeamSpeakClient {
  def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ClientList) = this()
}

