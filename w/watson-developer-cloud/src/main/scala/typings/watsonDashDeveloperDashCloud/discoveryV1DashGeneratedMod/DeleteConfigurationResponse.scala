package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DeleteConfigurationResponse. */
trait DeleteConfigurationResponse extends js.Object {
  /** The unique identifier for the configuration. */
  var configuration_id: String
  /** An array of notice messages, if any. */
  var notices: js.UndefOr[js.Array[Notice]] = js.undefined
  /** Status of the configuration. A deleted configuration has the status deleted. */
  var status: String
}

object DeleteConfigurationResponse {
  @scala.inline
  def apply(configuration_id: String, status: String, notices: js.Array[Notice] = null): DeleteConfigurationResponse = {
    val __obj = js.Dynamic.literal(configuration_id = configuration_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (notices != null) __obj.updateDynamic("notices")(notices.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationResponse]
  }
}

