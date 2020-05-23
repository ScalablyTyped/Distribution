package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WSConnectOptions extends js.Object {
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[TProtocolConstructor] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var transport: js.UndefOr[TTransportConstructor] = js.undefined
  var wsOptions: js.UndefOr[WSOptions] = js.undefined
}

object WSConnectOptions {
  @scala.inline
  def apply(
    headers: HttpHeaders = null,
    path: String = null,
    protocol: TProtocolConstructor = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    transport: TTransportConstructor = null,
    wsOptions: WSOptions = null
  ): WSConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (wsOptions != null) __obj.updateDynamic("wsOptions")(wsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WSConnectOptions]
  }
}

