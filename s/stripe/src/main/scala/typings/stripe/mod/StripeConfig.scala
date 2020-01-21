package typings.stripe.mod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeConfig extends js.Object {
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var httpAgent: js.UndefOr[Agent | Null] = js.undefined
  var maxNetworkRetries: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var telemetry: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object StripeConfig {
  @scala.inline
  def apply(
    apiVersion: String = null,
    host: String = null,
    httpAgent: Agent = null,
    maxNetworkRetries: Int | Double = null,
    port: Int | Double = null,
    telemetry: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): StripeConfig = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent.asInstanceOf[js.Any])
    if (maxNetworkRetries != null) __obj.updateDynamic("maxNetworkRetries")(maxNetworkRetries.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(telemetry)) __obj.updateDynamic("telemetry")(telemetry.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeConfig]
  }
}

