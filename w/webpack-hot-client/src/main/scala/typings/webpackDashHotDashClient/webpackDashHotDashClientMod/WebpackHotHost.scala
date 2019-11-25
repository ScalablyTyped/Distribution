package typings.webpackDashHotDashClient.webpackDashHotDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackHotHost extends js.Object {
  /** Client hostname that is used in the browser by WebSockets */
  var client: String
  /** Server hostname */
  var server: String
}

object WebpackHotHost {
  @scala.inline
  def apply(client: String, server: String): WebpackHotHost = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebpackHotHost]
  }
}

