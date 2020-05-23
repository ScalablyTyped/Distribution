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
  def apply(limit: js.UndefOr[Double] = js.undefined): NluEnrichmentConcepts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NluEnrichmentConcepts]
  }
}

