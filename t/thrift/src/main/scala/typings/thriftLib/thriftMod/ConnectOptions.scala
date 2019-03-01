package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var connect_timeout: js.UndefOr[scala.Double] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var https: js.UndefOr[scala.Boolean] = js.undefined
  var max_attempts: js.UndefOr[scala.Double] = js.undefined
  var nodeOptions: js.UndefOr[nodeLib.httpMod.RequestOptions | nodeLib.httpsMod.RequestOptions] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var protocol: js.UndefOr[TProtocolConstructor] = js.undefined
  var retry_max_delay: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transport: js.UndefOr[TTransportConstructor] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    connect_timeout: scala.Int | scala.Double = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    headers: HttpHeaders = null,
    https: js.UndefOr[scala.Boolean] = js.undefined,
    max_attempts: scala.Int | scala.Double = null,
    nodeOptions: nodeLib.httpMod.RequestOptions | nodeLib.httpsMod.RequestOptions = null,
    path: java.lang.String = null,
    protocol: TProtocolConstructor = null,
    retry_max_delay: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    transport: TTransportConstructor = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (connect_timeout != null) __obj.updateDynamic("connect_timeout")(connect_timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (max_attempts != null) __obj.updateDynamic("max_attempts")(max_attempts.asInstanceOf[js.Any])
    if (nodeOptions != null) __obj.updateDynamic("nodeOptions")(nodeOptions.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (retry_max_delay != null) __obj.updateDynamic("retry_max_delay")(retry_max_delay.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[ConnectOptions]
  }
}

