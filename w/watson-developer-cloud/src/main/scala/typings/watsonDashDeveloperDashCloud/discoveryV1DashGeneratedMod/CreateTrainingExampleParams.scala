package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createTrainingExample` operation. */
trait CreateTrainingExampleParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The cross reference associated with this training example. */
  var cross_reference: js.UndefOr[String] = js.undefined
  /** The document ID associated with this training example. */
  var document_id: js.UndefOr[String] = js.undefined
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The ID of the query used for training. */
  var query_id: String
  /** The relevance of the training example. */
  var relevance: js.UndefOr[Double] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object CreateTrainingExampleParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    query_id: String,
    cross_reference: String = null,
    document_id: String = null,
    headers: js.Object = null,
    relevance: Int | Double = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateTrainingExampleParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    if (cross_reference != null) __obj.updateDynamic("cross_reference")(cross_reference.asInstanceOf[js.Any])
    if (document_id != null) __obj.updateDynamic("document_id")(document_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (relevance != null) __obj.updateDynamic("relevance")(relevance.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrainingExampleParams]
  }
}

