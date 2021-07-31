package typings.typeorm.mongodbTypingsMod

import typings.typeorm.platformPlatformToolsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/mongodb/typings", "Server")
@js.native
class Server protected () extends EventEmitter {
  /**
    *
    * @param host The host for the server, can be either an IP4, IP6 or domain socket style host.
    * @param port The server port if IP4.
    * @param options Optional.
    */
  def this(host: String, port: scala.Double) = this()
  def this(host: String, port: scala.Double, options: ServerOptions) = this()
  
  /**
    * All raw connections.
    */
  def connections(): js.Array[js.Any] = js.native
}
