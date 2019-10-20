package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsFilter. */
trait QueryRelationsFilter extends js.Object {
  /** A comma-separated list of document IDs to include in the query. */
  var document_ids: js.UndefOr[js.Array[String]] = js.undefined
  var entity_types: js.UndefOr[QueryFilterType] = js.undefined
  var relation_types: js.UndefOr[QueryFilterType] = js.undefined
}

object QueryRelationsFilter {
  @scala.inline
  def apply(
    document_ids: js.Array[String] = null,
    entity_types: QueryFilterType = null,
    relation_types: QueryFilterType = null
  ): QueryRelationsFilter = {
    val __obj = js.Dynamic.literal()
    if (document_ids != null) __obj.updateDynamic("document_ids")(document_ids)
    if (entity_types != null) __obj.updateDynamic("entity_types")(entity_types)
    if (relation_types != null) __obj.updateDynamic("relation_types")(relation_types)
    __obj.asInstanceOf[QueryRelationsFilter]
  }
}

