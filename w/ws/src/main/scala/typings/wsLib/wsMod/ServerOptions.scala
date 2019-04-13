package typings
package wsLib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var backlog: js.UndefOr[scala.Double] = js.undefined
  var clientTracking: js.UndefOr[scala.Boolean] = js.undefined
  var handleProtocols: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var maxPayload: js.UndefOr[scala.Double] = js.undefined
  var noServer: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var perMessageDeflate: js.UndefOr[scala.Boolean | PerMessageDeflateOptions] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var server: js.UndefOr[nodeLib.httpMod.Server | nodeLib.httpsMod.Server] = js.undefined
  var verifyClient: js.UndefOr[VerifyClientCallbackAsync | VerifyClientCallbackSync] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    backlog: scala.Int | scala.Double = null,
    clientTracking: js.UndefOr[scala.Boolean] = js.undefined,
    handleProtocols: js.Any = null,
    host: java.lang.String = null,
    maxPayload: scala.Int | scala.Double = null,
    noServer: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    perMessageDeflate: scala.Boolean | PerMessageDeflateOptions = null,
    port: scala.Int | scala.Double = null,
    server: nodeLib.httpMod.Server | nodeLib.httpsMod.Server = null,
    verifyClient: VerifyClientCallbackAsync | VerifyClientCallbackSync = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    if (!js.isUndefined(clientTracking)) __obj.updateDynamic("clientTracking")(clientTracking)
    if (handleProtocols != null) __obj.updateDynamic("handleProtocols")(handleProtocols)
    if (host != null) __obj.updateDynamic("host")(host)
    if (maxPayload != null) __obj.updateDynamic("maxPayload")(maxPayload.asInstanceOf[js.Any])
    if (!js.isUndefined(noServer)) __obj.updateDynamic("noServer")(noServer)
    if (path != null) __obj.updateDynamic("path")(path)
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (verifyClient != null) __obj.updateDynamic("verifyClient")(verifyClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

