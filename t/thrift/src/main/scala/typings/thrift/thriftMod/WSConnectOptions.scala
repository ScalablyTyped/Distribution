package typings.thrift.thriftMod

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
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (path != null) __obj.updateDynamic("path")(path)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (wsOptions != null) __obj.updateDynamic("wsOptions")(wsOptions)
    __obj.asInstanceOf[WSConnectOptions]
  }
}

