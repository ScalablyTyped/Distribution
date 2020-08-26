package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `getModel` operation. */
@js.native
trait GetModelParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.native
  /** The identifier of the model in the form of its name from the output of the **Get a model** method. */
  var model_id: ModelId | String = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object GetModelParams {
  @scala.inline
  def apply(model_id: ModelId | String): GetModelParams = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelParams]
  }
  @scala.inline
  implicit class GetModelParamsOps[Self <: GetModelParams] (val x: Self) extends AnyVal {
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
    def setModel_id(value: ModelId | String): Self = this.set("model_id", value.asInstanceOf[js.Any])
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

