package typings.ts3NodejsLibrary.mod

import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupEntry
import typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType
import typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.MultiGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup")
@js.native
class TeamSpeakServerGroup protected ()
  extends typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup {
  def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ServerGroupEntry) = this()
}
/* static members */
@JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup")
@js.native
object TeamSpeakServerGroup extends js.Object {
  
  /** retrieves the client id from a string or teamspeak client */
  def getId[T /* <: GroupType */](): js.UndefOr[String] = js.native
  def getId[T /* <: GroupType */](group: T): js.UndefOr[String] = js.native
  
  /** retrieves the clients from an array */
  def getMultipleIds(groups: MultiGroupType): js.Array[String] = js.native
}
