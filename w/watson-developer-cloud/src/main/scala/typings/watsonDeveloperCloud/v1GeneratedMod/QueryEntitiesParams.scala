package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `queryEntities` operation. */
@js.native
trait QueryEntitiesParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String = js.native
  /** Entity text to provide context for the queried entity and rank based on that association. For example, if you wanted to query the city of London in England your query would look for `London` with the context of `England`. */
  var context: js.UndefOr[QueryEntitiesContext] = js.native
  /** The number of results to return. The default is `10`. The maximum is `1000`. */
  var count: js.UndefOr[Double] = js.native
  /** A text string that appears within the entity text field. */
  var entity: js.UndefOr[QueryEntitiesEntity] = js.native
  /** The ID of the environment. */
  var environment_id: String = js.native
  /** The number of evidence items to return for each result. The default is `0`. The maximum number of evidence items per query is 10,000. */
  var evidence_count: js.UndefOr[Double] = js.native
  /** The entity query feature to perform. Supported features are `disambiguate` and `similar_entities`. */
  var feature: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object QueryEntitiesParams {
  @scala.inline
  def apply(collection_id: String, environment_id: String): QueryEntitiesParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEntitiesParams]
  }
  @scala.inline
  implicit class QueryEntitiesParamsOps[Self <: QueryEntitiesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: QueryEntitiesContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setEntity(value: QueryEntitiesEntity): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    @scala.inline
    def setEvidence_count(value: Double): Self = this.set("evidence_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvidence_count: Self = this.set("evidence_count", js.undefined)
    @scala.inline
    def setFeature(value: String): Self = this.set("feature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

