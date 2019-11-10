package typings.ts3DashNodejsDashLibrary

import typings.ts3DashNodejsDashLibrary.libNodeAbstractMod.Abstract
import typings.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak
import typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponseTypes
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/node/Server", JSImport.Namespace)
@js.native
object libNodeServerMod extends js.Object {
  @js.native
  class TeamSpeakServer protected () extends Abstract {
    def this(parent: TeamSpeak, list: ServerList) = this()
    def autostart(): Double = js.native
    def clientsonline(): Double = js.native
    /** deletes the server */
    def del(): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def id(): Double = js.native
    def machineId(): String = js.native
    def maxclients(): Double = js.native
    def name(): String = js.native
    def port(): Double = js.native
    def queryclientsonline(): Double = js.native
    /**
      * Starts the virtual server.
      * Depending on your permissions, you're able to start either your own virtual server only or all virtual servers in the server instance.
      */
    def start(): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def status(): String = js.native
    /**
      * Stops the virtual server.
      * Depending on your permissions, you're able to stop either your own virtual server only or all virtual servers in the server instance.
      * @param msg specifies a text message that is sent to the clients before the client disconnects (requires TeamSpeak Server 3.2.0 or newer).
      */
    def stop(): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def stop(msg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def uniqueIdentifier(): js.UndefOr[String] = js.native
    def uptime(): Double = js.native
    /**
      * selects a virtual server
      * @param client_nickname sets the nickname when selecting a server
      */
    def use(): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def use(client_nickname: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  }
  
}

