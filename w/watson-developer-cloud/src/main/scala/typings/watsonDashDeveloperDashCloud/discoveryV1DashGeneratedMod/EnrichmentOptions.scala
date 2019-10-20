package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object representing the configuration options to use for the `elements` enrichment. */
trait EnrichmentOptions extends js.Object {
  var features: js.UndefOr[NluEnrichmentFeatures] = js.undefined
  /** ISO 639-1 code indicating the language to use for the analysis. This code overrides the automatic language detection performed by the service. Valid codes are `ar` (Arabic), `en` (English), `fr` (French), `de` (German), `it` (Italian), `pt` (Portuguese), `ru` (Russian), `es` (Spanish), and `sv` (Swedish). **Note:** Not all features support all languages, automatic detection is recommended. */
  var language: js.UndefOr[String] = js.undefined
  /** *For use with `elements` enrichments only.* The element extraction model to use. Models available are: `contract`. */
  var model: js.UndefOr[String] = js.undefined
}

object EnrichmentOptions {
  @scala.inline
  def apply(features: NluEnrichmentFeatures = null, language: String = null, model: String = null): EnrichmentOptions = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    if (language != null) __obj.updateDynamic("language")(language)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[EnrichmentOptions]
  }
}

