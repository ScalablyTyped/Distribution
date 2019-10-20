package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifying the relations enrichment and related parameters. */
trait NluEnrichmentRelations extends js.Object {
  /** *For use with `natural_language_understanding` enrichments only.* The enrichement model to use with relationship extraction. May be a custom model provided by Watson Knowledge Studio, the public model for use with Knowledge Graph `en-news`, the default is`en-news`. */
  var model: js.UndefOr[String] = js.undefined
}

object NluEnrichmentRelations {
  @scala.inline
  def apply(model: String = null): NluEnrichmentRelations = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[NluEnrichmentRelations]
  }
}

