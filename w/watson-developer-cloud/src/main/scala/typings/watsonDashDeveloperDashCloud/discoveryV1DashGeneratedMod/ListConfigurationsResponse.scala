package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ListConfigurationsResponse. */
trait ListConfigurationsResponse extends js.Object {
  /** An array of Configurations that are available for the service instance. */
  var configurations: js.UndefOr[js.Array[Configuration]] = js.undefined
}

object ListConfigurationsResponse {
  @scala.inline
  def apply(configurations: js.Array[Configuration] = null): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (configurations != null) __obj.updateDynamic("configurations")(configurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
}

