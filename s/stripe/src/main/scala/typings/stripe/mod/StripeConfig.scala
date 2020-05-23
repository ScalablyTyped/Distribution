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
    apiVersion: js.UndefOr[Null | String] = js.undefined,
    host: String = null,
    httpAgent: js.UndefOr[Null | Agent] = js.undefined,
    maxNetworkRetries: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    telemetry: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): StripeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apiVersion)) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(httpAgent)) __obj.updateDynamic("httpAgent")(httpAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNetworkRetries)) __obj.updateDynamic("maxNetworkRetries")(maxNetworkRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(telemetry)) __obj.updateDynamic("telemetry")(telemetry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeConfig]
  }
}

