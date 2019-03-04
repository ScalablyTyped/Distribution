package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientOptions extends js.Object {
  /**
    * Options passed to the socketIO client when connecting to the sever.
    *   config.socketIO.clientOptions = see config
    */
  var clientOptions: js.Any
  /**
    * Options passed to the socketIO server when attaching to the server.
    *   config.socketIO.serverOptions = see config
    */
  var serverOptions: js.Any
}

object Anon_ClientOptions {
  @scala.inline
  def apply(clientOptions: js.Any, serverOptions: js.Any): Anon_ClientOptions = {
    val __obj = js.Dynamic.literal(clientOptions = clientOptions, serverOptions = serverOptions)
  
    __obj.asInstanceOf[Anon_ClientOptions]
  }
}

