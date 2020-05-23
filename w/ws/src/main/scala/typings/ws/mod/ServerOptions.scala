package typings.ws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var backlog: js.UndefOr[Double] = js.undefined
  var clientTracking: js.UndefOr[Boolean] = js.undefined
  var handleProtocols: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var maxPayload: js.UndefOr[Double] = js.undefined
  var noServer: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var perMessageDeflate: js.UndefOr[Boolean | PerMessageDeflateOptions] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var server: js.UndefOr[typings.node.httpMod.Server | typings.node.httpsMod.Server] = js.undefined
  var verifyClient: js.UndefOr[VerifyClientCallbackAsync | VerifyClientCallbackSync] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    backlog: js.UndefOr[Double] = js.undefined,
    clientTracking: js.UndefOr[Boolean] = js.undefined,
    handleProtocols: js.Any = null,
    host: String = null,
    maxPayload: js.UndefOr[Double] = js.undefined,
    noServer: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    perMessageDeflate: Boolean | PerMessageDeflateOptions = null,
    port: js.UndefOr[Double] = js.undefined,
    server: typings.node.httpMod.Server | typings.node.httpsMod.Server = null,
    verifyClient: VerifyClientCallbackAsync | VerifyClientCallbackSync = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backlog)) __obj.updateDynamic("backlog")(backlog.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientTracking)) __obj.updateDynamic("clientTracking")(clientTracking.get.asInstanceOf[js.Any])
    if (handleProtocols != null) __obj.updateDynamic("handleProtocols")(handleProtocols.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPayload)) __obj.updateDynamic("maxPayload")(maxPayload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noServer)) __obj.updateDynamic("noServer")(noServer.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (verifyClient != null) __obj.updateDynamic("verifyClient")(verifyClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

