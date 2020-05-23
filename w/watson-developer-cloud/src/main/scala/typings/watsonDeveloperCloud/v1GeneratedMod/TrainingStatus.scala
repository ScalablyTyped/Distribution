package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingStatus. */
trait TrainingStatus extends js.Object {
  /** When `true`, the collection has been successfully trained. */
  var available: js.UndefOr[Boolean] = js.undefined
  /** The timestamp of when the data was uploaded. */
  var data_updated: js.UndefOr[String] = js.undefined
  /** When `true`, the collection has a sufficent amount of examples added for training to occur. */
  var minimum_examples_added: js.UndefOr[Boolean] = js.undefined
  /** When `true`, the collection has a sufficent amount of queries added for training to occur. */
  var minimum_queries_added: js.UndefOr[Boolean] = js.undefined
  /** The number of notices associated with this data set. */
  var notices: js.UndefOr[Double] = js.undefined
  /** When `true`, the collection is currently processing training. */
  var processing: js.UndefOr[Boolean] = js.undefined
  /** The timestamp of when the collection was successfully trained. */
  var successfully_trained: js.UndefOr[String] = js.undefined
  /** When `true`, the collection has a sufficent amount of diversity in labeled results for training to occur. */
  var sufficient_label_diversity: js.UndefOr[Boolean] = js.undefined
  /** The total number of training examples uploaded to this collection. */
  var total_examples: js.UndefOr[Double] = js.undefined
}

object TrainingStatus {
  @scala.inline
  def apply(
    available: js.UndefOr[Boolean] = js.undefined,
    data_updated: String = null,
    minimum_examples_added: js.UndefOr[Boolean] = js.undefined,
    minimum_queries_added: js.UndefOr[Boolean] = js.undefined,
    notices: js.UndefOr[Double] = js.undefined,
    processing: js.UndefOr[Boolean] = js.undefined,
    successfully_trained: String = null,
    sufficient_label_diversity: js.UndefOr[Boolean] = js.undefined,
    total_examples: js.UndefOr[Double] = js.undefined
  ): TrainingStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.get.asInstanceOf[js.Any])
    if (data_updated != null) __obj.updateDynamic("data_updated")(data_updated.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum_examples_added)) __obj.updateDynamic("minimum_examples_added")(minimum_examples_added.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum_queries_added)) __obj.updateDynamic("minimum_queries_added")(minimum_queries_added.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notices)) __obj.updateDynamic("notices")(notices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(processing)) __obj.updateDynamic("processing")(processing.get.asInstanceOf[js.Any])
    if (successfully_trained != null) __obj.updateDynamic("successfully_trained")(successfully_trained.asInstanceOf[js.Any])
    if (!js.isUndefined(sufficient_label_diversity)) __obj.updateDynamic("sufficient_label_diversity")(sufficient_label_diversity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_examples)) __obj.updateDynamic("total_examples")(total_examples.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingStatus]
  }
}

