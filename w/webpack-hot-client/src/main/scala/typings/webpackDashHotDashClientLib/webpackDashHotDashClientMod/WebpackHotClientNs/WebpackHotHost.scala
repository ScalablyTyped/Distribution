package typings
package webpackDashHotDashClientLib.webpackDashHotDashClientMod.WebpackHotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackHotHost extends js.Object {
  /** Client hostname that is used in the browser by WebSockets */
  var client: java.lang.String
  /** Server hostname */
  var server: java.lang.String
}

object WebpackHotHost {
  @scala.inline
  def apply(client: java.lang.String, server: java.lang.String): WebpackHotHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[WebpackHotHost]
  }
}

