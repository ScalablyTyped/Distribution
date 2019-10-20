package typings.atWebpackDashBlocksDevDashServer.atWebpackDashBlocksDevDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportMode extends js.Object {
  var client: js.UndefOr[String | PathFunction] = js.undefined
  var server: js.UndefOr[String | PathFunction] = js.undefined
}

object TransportMode {
  @scala.inline
  def apply(client: String | PathFunction = null, server: String | PathFunction = null): TransportMode = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportMode]
  }
}

