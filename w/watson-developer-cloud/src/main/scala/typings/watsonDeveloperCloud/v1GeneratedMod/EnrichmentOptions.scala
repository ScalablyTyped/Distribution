package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object representing the configuration options to use for the `elements` enrichment. */
@js.native
trait EnrichmentOptions extends js.Object {
  var features: js.UndefOr[NluEnrichmentFeatures] = js.native
  /** ISO 639-1 code indicating the language to use for the analysis. This code overrides the automatic language detection performed by the service. Valid codes are `ar` (Arabic), `en` (English), `fr` (French), `de` (German), `it` (Italian), `pt` (Portuguese), `ru` (Russian), `es` (Spanish), and `sv` (Swedish). **Note:** Not all features support all languages, automatic detection is recommended. */
  var language: js.UndefOr[String] = js.native
  /** *For use with `elements` enrichments only.* The element extraction model to use. Models available are: `contract`. */
  var model: js.UndefOr[String] = js.native
}

object EnrichmentOptions {
  @scala.inline
  def apply(): EnrichmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrichmentOptions]
  }
  @scala.inline
  implicit class EnrichmentOptionsOps[Self <: EnrichmentOptions] (val x: Self) extends AnyVal {
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
    def setFeatures(value: NluEnrichmentFeatures): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
  
}

