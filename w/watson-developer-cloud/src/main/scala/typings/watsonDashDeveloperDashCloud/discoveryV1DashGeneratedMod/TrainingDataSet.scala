package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingDataSet. */
trait TrainingDataSet extends js.Object {
  /** The collection id associated with this training data set. */
  var collection_id: js.UndefOr[String] = js.undefined
  /** The environment id associated with this training data set. */
  var environment_id: js.UndefOr[String] = js.undefined
  /** Array of training queries. */
  var queries: js.UndefOr[js.Array[TrainingQuery]] = js.undefined
}

object TrainingDataSet {
  @scala.inline
  def apply(
    collection_id: String = null,
    environment_id: String = null,
    queries: js.Array[TrainingQuery] = null
  ): TrainingDataSet = {
    val __obj = js.Dynamic.literal()
    if (collection_id != null) __obj.updateDynamic("collection_id")(collection_id.asInstanceOf[js.Any])
    if (environment_id != null) __obj.updateDynamic("environment_id")(environment_id.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingDataSet]
  }
}

