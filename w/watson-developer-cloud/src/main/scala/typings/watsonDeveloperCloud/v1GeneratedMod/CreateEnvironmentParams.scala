package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `createEnvironment` operation. */
@js.native
trait CreateEnvironmentParams extends js.Object {
  /** Description of the environment. */
  var description: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** Name that identifies the environment. */
  var name: String = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Size of the environment. In the Lite plan the default and only accepted value is `LT`, in all other plans the default is `S`. */
  var size: js.UndefOr[Size | String] = js.native
}

object CreateEnvironmentParams {
  @scala.inline
  def apply(name: String): CreateEnvironmentParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentParams]
  }
  @scala.inline
  implicit class CreateEnvironmentParamsOps[Self <: CreateEnvironmentParams] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setSize(value: Size | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

