package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** NluEnrichmentFeatures. */
@js.native
trait NluEnrichmentFeatures extends js.Object {
  /** An object that indicates the Categories enrichment will be applied to the specified field. */
  var categories: js.UndefOr[NluEnrichmentCategories] = js.native
  /** An object specifiying the concepts enrichment and related parameters. */
  var concepts: js.UndefOr[NluEnrichmentConcepts] = js.native
  /** An object specifying the emotion detection enrichment and related parameters. */
  var emotion: js.UndefOr[NluEnrichmentEmotion] = js.native
  /** An object speficying the Entities enrichment and related parameters. */
  var entities: js.UndefOr[NluEnrichmentEntities] = js.native
  /** An object specifying the Keyword enrichment and related parameters. */
  var keywords: js.UndefOr[NluEnrichmentKeywords] = js.native
  /** An object specifying the relations enrichment and related parameters. */
  var relations: js.UndefOr[NluEnrichmentRelations] = js.native
  /** An object specifiying the semantic roles enrichment and related parameters. */
  var semantic_roles: js.UndefOr[NluEnrichmentSemanticRoles] = js.native
  /** An object specifying the sentiment extraction enrichment and related parameters. */
  var sentiment: js.UndefOr[NluEnrichmentSentiment] = js.native
}

object NluEnrichmentFeatures {
  @scala.inline
  def apply(): NluEnrichmentFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentFeatures]
  }
  @scala.inline
  implicit class NluEnrichmentFeaturesOps[Self <: NluEnrichmentFeatures] (val x: Self) extends AnyVal {
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
    def setCategories(value: NluEnrichmentCategories): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setConcepts(value: NluEnrichmentConcepts): Self = this.set("concepts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcepts: Self = this.set("concepts", js.undefined)
    @scala.inline
    def setEmotion(value: NluEnrichmentEmotion): Self = this.set("emotion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmotion: Self = this.set("emotion", js.undefined)
    @scala.inline
    def setEntities(value: NluEnrichmentEntities): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setKeywords(value: NluEnrichmentKeywords): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setRelations(value: NluEnrichmentRelations): Self = this.set("relations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
    @scala.inline
    def setSemantic_roles(value: NluEnrichmentSemanticRoles): Self = this.set("semantic_roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemantic_roles: Self = this.set("semantic_roles", js.undefined)
    @scala.inline
    def setSentiment(value: NluEnrichmentSentiment): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
  }
  
}

