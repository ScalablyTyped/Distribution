package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsResponse. */
trait QueryRelationsResponse extends js.Object {
  /** Array of relationships for the relations query. */
  var relations: js.UndefOr[js.Array[QueryRelationsRelationship]] = js.undefined
}

object QueryRelationsResponse {
  @scala.inline
  def apply(relations: js.Array[QueryRelationsRelationship] = null): QueryRelationsResponse = {
    val __obj = js.Dynamic.literal()
    if (relations != null) __obj.updateDynamic("relations")(relations)
    __obj.asInstanceOf[QueryRelationsResponse]
  }
}

