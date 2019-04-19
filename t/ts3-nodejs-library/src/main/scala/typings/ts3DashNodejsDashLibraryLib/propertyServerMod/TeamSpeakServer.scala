package typings
package ts3DashNodejsDashLibraryLib.propertyServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSpeakServer
  extends ts3DashNodejsDashLibraryLib.propertyAbstractMod.^ {
  /**
    * Deletes the Server.
    */
  def del(): js.Promise[_] = js.native
  /**
    * Gets basic Infos about the Server
    */
  def getInfo(): js.Promise[_] = js.native
  /**
    * Starts the virtual server. Depending on your permissions, you're able to start either your own virtual server only or all virtual servers in the server instance.
    */
  def start(): js.Promise[_] = js.native
  /**
    * Stops the virtual server. Depending on your permissions, you're able to stop either your own virtual server only or all virtual servers in the server instance.
    * @param - Specifies a text message that is sent to the clients before the client disconnects (requires TeamSpeak Server 3.2.0 or newer).
    */
  def stop(): js.Promise[_] = js.native
  def stop(msg: java.lang.String): js.Promise[_] = js.native
  /**
    * Selects the Virtual Server
    * @param - Set Nickname when selecting a server
    */
  def use(): js.Promise[_] = js.native
  def use(client_nickname: java.lang.String): js.Promise[_] = js.native
}

