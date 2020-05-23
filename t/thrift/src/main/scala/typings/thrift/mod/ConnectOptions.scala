package typings.thrift.mod

import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var connect_timeout: js.UndefOr[Double] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var https: js.UndefOr[Boolean] = js.undefined
  var max_attempts: js.UndefOr[Double] = js.undefined
  var nodeOptions: js.UndefOr[RequestOptions | typings.node.httpsMod.RequestOptions] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[TProtocolConstructor] = js.undefined
  var retry_max_delay: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var transport: js.UndefOr[TTransportConstructor] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    connect_timeout: js.UndefOr[Double] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    headers: HttpHeaders = null,
    https: js.UndefOr[Boolean] = js.undefined,
    max_attempts: js.UndefOr[Double] = js.undefined,
    nodeOptions: RequestOptions | typings.node.httpsMod.RequestOptions = null,
    path: String = null,
    protocol: TProtocolConstructor = null,
    retry_max_delay: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    transport: TTransportConstructor = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connect_timeout)) __obj.updateDynamic("connect_timeout")(connect_timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_attempts)) __obj.updateDynamic("max_attempts")(max_attempts.get.asInstanceOf[js.Any])
    if (nodeOptions != null) __obj.updateDynamic("nodeOptions")(nodeOptions.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_max_delay)) __obj.updateDynamic("retry_max_delay")(retry_max_delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

