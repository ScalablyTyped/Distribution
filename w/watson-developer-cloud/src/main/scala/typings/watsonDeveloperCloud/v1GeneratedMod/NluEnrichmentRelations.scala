package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifying the relations enrichment and related parameters. */
@js.native
trait NluEnrichmentRelations extends js.Object {
  /** *For use with `natural_language_understanding` enrichments only.* The enrichement model to use with relationship extraction. May be a custom model provided by Watson Knowledge Studio, the public model for use with Knowledge Graph `en-news`, the default is`en-news`. */
  var model: js.UndefOr[String] = js.native
}

object NluEnrichmentRelations {
  @scala.inline
  def apply(): NluEnrichmentRelations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentRelations]
  }
  @scala.inline
  implicit class NluEnrichmentRelationsOps[Self <: NluEnrichmentRelations] (val x: Self) extends AnyVal {
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
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
  
}

