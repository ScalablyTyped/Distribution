package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEventConstants.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createEvent` operation. */
trait CreateEventParams extends js.Object {
  /** Query event data object. */
  var data: EventData
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The event type to be created. */
  var `type`: Type | String
}

object CreateEventParams {
  @scala.inline
  def apply(
    data: EventData,
    `type`: Type | String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateEventParams = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[CreateEventParams]
  }
}

