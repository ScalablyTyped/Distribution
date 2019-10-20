package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about the Continuous Relevancy Training for this environment. */
trait SearchStatus extends js.Object {
  /** The date stamp of the most recent completed training for this environment. */
  var last_trained: js.UndefOr[String] = js.undefined
  /** Current scope of the training. Always returned as `environment`. */
  var scope: js.UndefOr[String] = js.undefined
  /** The current status of Continuous Relevancy Training for this environment. */
  var status: js.UndefOr[String] = js.undefined
  /** Long description of the current Continuous Relevancy Training status. */
  var status_description: js.UndefOr[String] = js.undefined
}

object SearchStatus {
  @scala.inline
  def apply(
    last_trained: String = null,
    scope: String = null,
    status: String = null,
    status_description: String = null
  ): SearchStatus = {
    val __obj = js.Dynamic.literal()
    if (last_trained != null) __obj.updateDynamic("last_trained")(last_trained)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (status != null) __obj.updateDynamic("status")(status)
    if (status_description != null) __obj.updateDynamic("status_description")(status_description)
    __obj.asInstanceOf[SearchStatus]
  }
}

