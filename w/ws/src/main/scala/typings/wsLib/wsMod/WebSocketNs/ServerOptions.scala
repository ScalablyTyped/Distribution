package typings
package wsLib.wsMod.WebSocketNs

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

