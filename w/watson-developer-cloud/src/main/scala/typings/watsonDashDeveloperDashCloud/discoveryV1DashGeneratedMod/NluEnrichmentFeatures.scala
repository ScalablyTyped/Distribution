package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** NluEnrichmentFeatures. */
trait NluEnrichmentFeatures extends js.Object {
  /** An object that indicates the Categories enrichment will be applied to the specified field. */
  var categories: js.UndefOr[NluEnrichmentCategories] = js.undefined
  /** An object specifiying the concepts enrichment and related parameters. */
  var concepts: js.UndefOr[NluEnrichmentConcepts] = js.undefined
  /** An object specifying the emotion detection enrichment and related parameters. */
  var emotion: js.UndefOr[NluEnrichmentEmotion] = js.undefined
  /** An object speficying the Entities enrichment and related parameters. */
  var entities: js.UndefOr[NluEnrichmentEntities] = js.undefined
  /** An object specifying the Keyword enrichment and related parameters. */
  var keywords: js.UndefOr[NluEnrichmentKeywords] = js.undefined
  /** An object specifying the relations enrichment and related parameters. */
  var relations: js.UndefOr[NluEnrichmentRelations] = js.undefined
  /** An object specifiying the semantic roles enrichment and related parameters. */
  var semantic_roles: js.UndefOr[NluEnrichmentSemanticRoles] = js.undefined
  /** An object specifying the sentiment extraction enrichment and related parameters. */
  var sentiment: js.UndefOr[NluEnrichmentSentiment] = js.undefined
}

object NluEnrichmentFeatures {
  @scala.inline
  def apply(
    categories: NluEnrichmentCategories = null,
    concepts: NluEnrichmentConcepts = null,
    emotion: NluEnrichmentEmotion = null,
    entities: NluEnrichmentEntities = null,
    keywords: NluEnrichmentKeywords = null,
    relations: NluEnrichmentRelations = null,
    semantic_roles: NluEnrichmentSemanticRoles = null,
    sentiment: NluEnrichmentSentiment = null
  ): NluEnrichmentFeatures = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (concepts != null) __obj.updateDynamic("concepts")(concepts)
    if (emotion != null) __obj.updateDynamic("emotion")(emotion)
    if (entities != null) __obj.updateDynamic("entities")(entities)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (relations != null) __obj.updateDynamic("relations")(relations)
    if (semantic_roles != null) __obj.updateDynamic("semantic_roles")(semantic_roles)
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment)
    __obj.asInstanceOf[NluEnrichmentFeatures]
  }
}

