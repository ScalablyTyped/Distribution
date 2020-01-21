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
    backlog: Int | Double = null,
    clientTracking: js.UndefOr[Boolean] = js.undefined,
    handleProtocols: js.Any = null,
    host: String = null,
    maxPayload: Int | Double = null,
    noServer: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    perMessageDeflate: Boolean | PerMessageDeflateOptions = null,
    port: Int | Double = null,
    server: typings.node.httpMod.Server | typings.node.httpsMod.Server = null,
    verifyClient: VerifyClientCallbackAsync | VerifyClientCallbackSync = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    if (!js.isUndefined(clientTracking)) __obj.updateDynamic("clientTracking")(clientTracking.asInstanceOf[js.Any])
    if (handleProtocols != null) __obj.updateDynamic("handleProtocols")(handleProtocols.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (maxPayload != null) __obj.updateDynamic("maxPayload")(maxPayload.asInstanceOf[js.Any])
    if (!js.isUndefined(noServer)) __obj.updateDynamic("noServer")(noServer.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (verifyClient != null) __obj.updateDynamic("verifyClient")(verifyClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

