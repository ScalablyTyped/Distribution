package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getGateway` operation. */
@js.native
trait GetGatewayParams extends js.Object {
  /** The ID of the environment. */
  var environment_id: String = js.native
  /** The requested gateway ID. */
  var gateway_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object GetGatewayParams {
  @scala.inline
  def apply(environment_id: String, gateway_id: String): GetGatewayParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any], gateway_id = gateway_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayParams]
  }
  @scala.inline
  implicit class GetGatewayParamsOps[Self <: GetGatewayParams] (val x: Self) extends AnyVal {
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
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setGateway_id(value: String): Self = this.set("gateway_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

