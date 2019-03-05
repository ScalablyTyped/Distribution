package typings
package tarantoolDashDriverLib.tarantoolDashDriverMod.TarantoolConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TarantoolOptions extends js.Object {
  var beforeReserve: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var lazyConnect: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var reserveHosts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var retryStrategy: js.UndefOr[js.Function1[/* times */ scala.Double, scala.Double]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object TarantoolOptions {
  @scala.inline
  def apply(
    beforeReserve: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    lazyConnect: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    reserveHosts: js.Array[java.lang.String] = null,
    retryStrategy: js.Function1[/* times */ scala.Double, scala.Double] = null,
    timeout: scala.Int | scala.Double = null,
    username: java.lang.String = null
  ): TarantoolOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeReserve != null) __obj.updateDynamic("beforeReserve")(beforeReserve.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(lazyConnect)) __obj.updateDynamic("lazyConnect")(lazyConnect)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (reserveHosts != null) __obj.updateDynamic("reserveHosts")(reserveHosts)
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(retryStrategy)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[TarantoolOptions]
  }
}

