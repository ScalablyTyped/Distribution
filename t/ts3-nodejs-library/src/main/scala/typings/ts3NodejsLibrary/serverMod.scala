package typings.ts3NodejsLibrary

import typings.ts3NodejsLibrary.abstractMod.Abstract
import typings.ts3NodejsLibrary.responseTypesMod.ServerEntry
import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("ts3-nodejs-library/lib/node/Server", "TeamSpeakServer")
  @js.native
  class TeamSpeakServer protected () extends Abstract[ServerEntry] {
    def this(parent: TeamSpeak, list: ServerEntry) = this()
    
    def autostart: Double = js.native
    
    def clientsonline: Double = js.native
    
    /** deletes the server */
    def del(): js.Promise[js.Array[js.Any]] = js.native
    
    def id: String = js.native
    
    def machineId: String = js.native
    
    def maxclients: Double = js.native
    
    def name: String = js.native
    
    def port: Double = js.native
    
    def queryclientsonline: Double = js.native
    
    /**
      * Starts the virtual server.
      * Depending on your permissions, you're able to start either your own virtual server only or all virtual servers in the server instance.
      */
    def start(): js.Promise[js.Array[js.Any]] = js.native
    
    def status: String = js.native
    
    /**
      * Stops the virtual server.
      * Depending on your permissions, you're able to stop either your own virtual server only or all virtual servers in the server instance.
      * @param msg specifies a text message that is sent to the clients before the client disconnects (requires TeamSpeak Server 3.2.0 or newer).
      */
    def stop(): js.Promise[js.Array[js.Any]] = js.native
    def stop(msg: String): js.Promise[js.Array[js.Any]] = js.native
    
    def uniqueIdentifier: String = js.native
    
    def uptime: Double = js.native
    
    /**
      * selects a virtual server
      * @param client_nickname sets the nickname when selecting a server
      */
    def use(): js.Promise[js.Array[js.Any]] = js.native
    def use(clientNickname: String): js.Promise[js.Array[js.Any]] = js.native
  }
  /* static members */
  object TeamSpeakServer {
    
    /** retrieves the client id from a string or teamspeak client */
    @JSImport("ts3-nodejs-library/lib/node/Server", "TeamSpeakServer.getId")
    @js.native
    def getId[T /* <: ServerType */](): js.UndefOr[String] = js.native
    @JSImport("ts3-nodejs-library/lib/node/Server", "TeamSpeakServer.getId")
    @js.native
    def getId[T /* <: ServerType */](server: T): js.UndefOr[String] = js.native
    
    /** retrieves the clients from an array */
    @JSImport("ts3-nodejs-library/lib/node/Server", "TeamSpeakServer.getMultipleIds")
    @js.native
    def getMultipleIds(servers: MultiServerType): js.Array[String] = js.native
    
    type MultiServerType = (js.Array[String | TeamSpeakServer]) | ServerType
    
    type ServerType = String | TeamSpeakServer
  }
}
