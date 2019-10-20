package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object that contains an array of entities resulting from the query. */
trait QueryEntitiesResponse extends js.Object {
  /** Array of entities that results from the query. */
  var entities: js.UndefOr[js.Array[QueryEntitiesResponseItem]] = js.undefined
}

object QueryEntitiesResponse {
  @scala.inline
  def apply(entities: js.Array[QueryEntitiesResponseItem] = null): QueryEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities)
    __obj.asInstanceOf[QueryEntitiesResponse]
  }
}

