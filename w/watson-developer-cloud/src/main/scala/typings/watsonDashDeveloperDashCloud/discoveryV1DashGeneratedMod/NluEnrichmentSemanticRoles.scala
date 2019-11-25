package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifiying the semantic roles enrichment and related parameters. */
trait NluEnrichmentSemanticRoles extends js.Object {
  /** When `true`, entities are extracted from the identified sentence parts. */
  var entities: js.UndefOr[Boolean] = js.undefined
  /** When `true`, keywords are extracted from the identified sentence parts. */
  var keywords: js.UndefOr[Boolean] = js.undefined
  /** The maximum number of semantic roles enrichments to extact from each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.undefined
}

object NluEnrichmentSemanticRoles {
  @scala.inline
  def apply(
    entities: js.UndefOr[Boolean] = js.undefined,
    keywords: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null
  ): NluEnrichmentSemanticRoles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (!js.isUndefined(keywords)) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[NluEnrichmentSemanticRoles]
  }
}

