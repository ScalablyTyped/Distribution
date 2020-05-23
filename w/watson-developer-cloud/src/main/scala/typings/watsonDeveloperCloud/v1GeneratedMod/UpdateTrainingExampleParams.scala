package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateTrainingExample` operation. */
trait UpdateTrainingExampleParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The example to add. */
  var cross_reference: js.UndefOr[String] = js.undefined
  /** The ID of the environment. */
  var environment_id: String
  /** The ID of the document as it is indexed. */
  var example_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The ID of the query used for training. */
  var query_id: String
  /** The relevance value for this example. */
  var relevance: js.UndefOr[Double] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object UpdateTrainingExampleParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    example_id: String,
    query_id: String,
    cross_reference: String = null,
    headers: js.Object = null,
    relevance: js.UndefOr[Double] = js.undefined,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateTrainingExampleParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], example_id = example_id.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    if (cross_reference != null) __obj.updateDynamic("cross_reference")(cross_reference.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(relevance)) __obj.updateDynamic("relevance")(relevance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrainingExampleParams]
  }
}

