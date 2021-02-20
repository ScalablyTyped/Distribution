package typings.typeorm.mod

import typings.typeorm.mongodbTypingsMod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Server")
@js.native
class Server protected ()
  extends typings.typeorm.mongodbTypingsMod.Server {
  /**
    *
    * @param host The host for the server, can be either an IP4, IP6 or domain socket style host.
    * @param port The server port if IP4.
    * @param options Optional.
    */
  def this(host: String, port: scala.Double) = this()
  def this(host: String, port: scala.Double, options: ServerOptions) = this()
}
