package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifying the emotion detection enrichment and related parameters. */
trait NluEnrichmentEmotion extends js.Object {
  /** When `true`, emotion detection is performed on the entire field. */
  var document: js.UndefOr[Boolean] = js.undefined
  /** A comma-separated list of target strings that will have any associated emotions detected. */
  var targets: js.UndefOr[js.Array[String]] = js.undefined
}

object NluEnrichmentEmotion {
  @scala.inline
  def apply(document: js.UndefOr[Boolean] = js.undefined, targets: js.Array[String] = null): NluEnrichmentEmotion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(document)) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[NluEnrichmentEmotion]
  }
}

