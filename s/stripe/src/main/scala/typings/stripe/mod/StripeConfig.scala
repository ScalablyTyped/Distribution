package typings.stripe.mod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeConfig extends js.Object {
  var apiVersion: js.UndefOr[String | Null] = js.native
  var host: js.UndefOr[String] = js.native
  var httpAgent: js.UndefOr[Agent | Null] = js.native
  var maxNetworkRetries: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  var telemetry: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object StripeConfig {
  @scala.inline
  def apply(): StripeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeConfig]
  }
  @scala.inline
  implicit class StripeConfigOps[Self <: StripeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setApiVersionNull: Self = this.set("apiVersion", null)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setHttpAgent(value: Agent): Self = this.set("httpAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpAgent: Self = this.set("httpAgent", js.undefined)
    @scala.inline
    def setHttpAgentNull: Self = this.set("httpAgent", null)
    @scala.inline
    def setMaxNetworkRetries(value: Double): Self = this.set("maxNetworkRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNetworkRetries: Self = this.set("maxNetworkRetries", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setTelemetry(value: Boolean): Self = this.set("telemetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelemetry: Self = this.set("telemetry", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

