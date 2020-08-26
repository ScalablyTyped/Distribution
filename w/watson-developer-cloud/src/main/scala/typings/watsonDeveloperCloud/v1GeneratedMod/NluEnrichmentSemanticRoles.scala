package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifiying the semantic roles enrichment and related parameters. */
@js.native
trait NluEnrichmentSemanticRoles extends js.Object {
  /** When `true`, entities are extracted from the identified sentence parts. */
  var entities: js.UndefOr[Boolean] = js.native
  /** When `true`, keywords are extracted from the identified sentence parts. */
  var keywords: js.UndefOr[Boolean] = js.native
  /** The maximum number of semantic roles enrichments to extact from each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.native
}

object NluEnrichmentSemanticRoles {
  @scala.inline
  def apply(): NluEnrichmentSemanticRoles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentSemanticRoles]
  }
  @scala.inline
  implicit class NluEnrichmentSemanticRolesOps[Self <: NluEnrichmentSemanticRoles] (val x: Self) extends AnyVal {
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
    def setEntities(value: Boolean): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setKeywords(value: Boolean): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
  
}

