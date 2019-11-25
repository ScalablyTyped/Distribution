package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ListEnvironmentsResponse. */
trait ListEnvironmentsResponse extends js.Object {
  /** An array of [environments] that are available for the service instance. */
  var environments: js.UndefOr[js.Array[Environment]] = js.undefined
}

object ListEnvironmentsResponse {
  @scala.inline
  def apply(environments: js.Array[Environment] = null): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (environments != null) __obj.updateDynamic("environments")(environments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
}

