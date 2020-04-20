package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientOptions extends js.Object {
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

object AnonClientOptions {
  @scala.inline
  def apply(clientOptions: js.Any, serverOptions: js.Any): AnonClientOptions = {
    val __obj = js.Dynamic.literal(clientOptions = clientOptions.asInstanceOf[js.Any], serverOptions = serverOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientOptions]
  }
}

