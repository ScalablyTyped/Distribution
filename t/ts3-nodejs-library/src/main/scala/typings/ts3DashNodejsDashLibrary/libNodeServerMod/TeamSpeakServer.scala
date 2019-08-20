package typings.ts3DashNodejsDashLibrary.libNodeServerMod

import typings.ts3DashNodejsDashLibrary.libNodeAbstractMod.Abstract
import typings.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak
import typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponseTypes
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/node/Server", "TeamSpeakServer")
@js.native
class TeamSpeakServer protected () extends Abstract {
  def this(parent: TeamSpeak, list: ServerList) = this()
  val autostart: Double = js.native
  val clientsonline: Double = js.native
  val id: Double = js.native
  val machineId: String = js.native
  val maxclients: Double = js.native
  val name: String = js.native
  val port: Double = js.native
  val queryclientsonline: Double = js.native
  val status: String = js.native
  val uniqueIdentifier: js.UndefOr[String] = js.native
  val uptime: Double = js.native
  /** deletes the server */
  def del(): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Starts the virtual server.
    * Depending on your permissions, you're able to start either your own virtual server only or all virtual servers in the server instance.
    */
  def start(): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Stops the virtual server.
    * Depending on your permissions, you're able to stop either your own virtual server only or all virtual servers in the server instance.
    * @param msg specifies a text message that is sent to the clients before the client disconnects (requires TeamSpeak Server 3.2.0 or newer).
    */
  def stop(): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def stop(msg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * selects a virtual server
    * @param client_nickname sets the nickname when selecting a server
    */
  def use(): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def use(client_nickname: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
}

