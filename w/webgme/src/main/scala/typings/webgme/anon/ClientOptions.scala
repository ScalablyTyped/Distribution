package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  /**
    * Options passed to the socketIO client when connecting to the sever.
    *   config.socketIO.clientOptions = see config
    */
  var clientOptions: js.Any = js.native
  /**
    * Options passed to the socketIO server when attaching to the server.
    *   config.socketIO.serverOptions = see config
    */
  var serverOptions: js.Any = js.native
}

object ClientOptions {
  @scala.inline
  def apply(clientOptions: js.Any, serverOptions: js.Any): ClientOptions = {
    val __obj = js.Dynamic.literal(clientOptions = clientOptions.asInstanceOf[js.Any], serverOptions = serverOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientOptions(value: js.Any): Self = this.set("clientOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerOptions(value: js.Any): Self = this.set("serverOptions", value.asInstanceOf[js.Any])
  }
  
}

