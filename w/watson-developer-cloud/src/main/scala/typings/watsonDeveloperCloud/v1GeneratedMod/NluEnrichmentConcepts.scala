package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifiying the concepts enrichment and related parameters. */
trait NluEnrichmentConcepts extends js.Object {
  /** The maximum number of concepts enrichments to extact from each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.undefined
}

object NluEnrichmentConcepts {
  @scala.inline
  def apply(limit: Int | Double = null): NluEnrichmentConcepts = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[NluEnrichmentConcepts]
  }
}

