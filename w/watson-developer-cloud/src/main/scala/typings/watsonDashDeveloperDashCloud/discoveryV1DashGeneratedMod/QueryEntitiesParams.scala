package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `queryEntities` operation. */
trait QueryEntitiesParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** Entity text to provide context for the queried entity and rank based on that association. For example, if you wanted to query the city of London in England your query would look for `London` with the context of `England`. */
  var context: js.UndefOr[QueryEntitiesContext] = js.undefined
  /** The number of results to return. The default is `10`. The maximum is `1000`. */
  var count: js.UndefOr[Double] = js.undefined
  /** A text string that appears within the entity text field. */
  var entity: js.UndefOr[QueryEntitiesEntity] = js.undefined
  /** The ID of the environment. */
  var environment_id: String
  /** The number of evidence items to return for each result. The default is `0`. The maximum number of evidence items per query is 10,000. */
  var evidence_count: js.UndefOr[Double] = js.undefined
  /** The entity query feature to perform. Supported features are `disambiguate` and `similar_entities`. */
  var feature: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object QueryEntitiesParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    context: QueryEntitiesContext = null,
    count: Int | Double = null,
    entity: QueryEntitiesEntity = null,
    evidence_count: Int | Double = null,
    feature: String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): QueryEntitiesParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (evidence_count != null) __obj.updateDynamic("evidence_count")(evidence_count.asInstanceOf[js.Any])
    if (feature != null) __obj.updateDynamic("feature")(feature.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEntitiesParams]
  }
}

