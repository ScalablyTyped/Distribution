package typings.webpackHotClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackHotHost extends js.Object {
  
  /** Client hostname that is used in the browser by WebSockets */
  var client: String = js.native
  
  /** Server hostname */
  var server: String = js.native
}
object WebpackHotHost {
  
  @scala.inline
  def apply(client: String, server: String): WebpackHotHost = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpackHotHost]
  }
  
  @scala.inline
  implicit class WebpackHotHostOps[Self <: WebpackHotHost] (val x: Self) extends AnyVal {
    
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
    def setClient(value: String): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
  }
}
