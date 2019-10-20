package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Summary of the document usage statistics for the environment. */
trait EnvironmentDocuments extends js.Object {
  /** Number of documents indexed for the environment. */
  var indexed: js.UndefOr[Double] = js.undefined
  /** Total number of documents allowed in the environment's capacity. */
  var maximum_allowed: js.UndefOr[Double] = js.undefined
}

object EnvironmentDocuments {
  @scala.inline
  def apply(indexed: Int | Double = null, maximum_allowed: Int | Double = null): EnvironmentDocuments = {
    val __obj = js.Dynamic.literal()
    if (indexed != null) __obj.updateDynamic("indexed")(indexed.asInstanceOf[js.Any])
    if (maximum_allowed != null) __obj.updateDynamic("maximum_allowed")(maximum_allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentDocuments]
  }
}

