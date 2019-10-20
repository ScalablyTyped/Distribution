package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingExample. */
trait TrainingExample extends js.Object {
  /** The cross reference associated with this training example. */
  var cross_reference: js.UndefOr[String] = js.undefined
  /** The document ID associated with this training example. */
  var document_id: js.UndefOr[String] = js.undefined
  /** The relevance of the training example. */
  var relevance: js.UndefOr[Double] = js.undefined
}

object TrainingExample {
  @scala.inline
  def apply(cross_reference: String = null, document_id: String = null, relevance: Int | Double = null): TrainingExample = {
    val __obj = js.Dynamic.literal()
    if (cross_reference != null) __obj.updateDynamic("cross_reference")(cross_reference)
    if (document_id != null) __obj.updateDynamic("document_id")(document_id)
    if (relevance != null) __obj.updateDynamic("relevance")(relevance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingExample]
  }
}

