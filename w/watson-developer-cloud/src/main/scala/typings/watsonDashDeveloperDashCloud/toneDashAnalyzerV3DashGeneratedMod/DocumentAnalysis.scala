package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** An object of type `DocumentAnalysis` that provides the results of the analysis for the full input document. */
trait DocumentAnalysis extends js.Object {
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** An array of `ToneCategory` objects that provides the results of the tone analysis for the full document of the input content. The service returns results only for the tones specified with the `tones` parameter of the request. */
  var tone_categories: js.UndefOr[js.Array[ToneCategory]] = js.undefined
  /** **`2017-09-21`:** An array of `ToneScore` objects that provides the results of the analysis for each qualifying tone of the document. The array includes results for any tone whose score is at least 0.5. The array is empty if no tone has a score that meets this threshold. **`2016-05-19`:** Not returned. */
  var tones: js.UndefOr[js.Array[ToneScore]] = js.undefined
  /** **`2017-09-21`:** A warning message if the overall content exceeds 128 KB or contains more than 1000 sentences. The service analyzes only the first 1000 sentences for document-level analysis and the first 100 sentences for sentence-level analysis. **`2016-05-19`:** Not returned. */
  var warning: js.UndefOr[String] = js.undefined
}

object DocumentAnalysis {
  @scala.inline
  def apply(
    tone_categories: js.Array[ToneCategory] = null,
    tones: js.Array[ToneScore] = null,
    warning: String = null
  ): DocumentAnalysis = {
    val __obj = js.Dynamic.literal()
    if (tone_categories != null) __obj.updateDynamic("tone_categories")(tone_categories.asInstanceOf[js.Any])
    if (tones != null) __obj.updateDynamic("tones")(tones.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAnalysis]
  }
}

