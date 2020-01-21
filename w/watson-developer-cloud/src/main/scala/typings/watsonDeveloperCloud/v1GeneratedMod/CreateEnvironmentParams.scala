package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `createEnvironment` operation. */
trait CreateEnvironmentParams extends js.Object {
  /** Description of the environment. */
  var description: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Name that identifies the environment. */
  var name: String
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Size of the environment. In the Lite plan the default and only accepted value is `LT`, in all other plans the default is `S`. */
  var size: js.UndefOr[Size | String] = js.undefined
}

object CreateEnvironmentParams {
  @scala.inline
  def apply(
    name: String,
    description: String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    size: Size | String = null
  ): CreateEnvironmentParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentParams]
  }
}

