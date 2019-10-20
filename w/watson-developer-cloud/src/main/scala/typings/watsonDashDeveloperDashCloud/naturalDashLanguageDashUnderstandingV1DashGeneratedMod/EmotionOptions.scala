package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Detects anger, disgust, fear, joy, or sadness that is conveyed in the content or by the context around target phrases specified in the targets parameter. You can analyze emotion for detected entities with `entities.emotion` and for keywords with `keywords.emotion`. Supported languages: English. */
trait EmotionOptions extends js.Object {
  /** Set this to `false` to hide document-level emotion results. */
  var document: js.UndefOr[Boolean] = js.undefined
  /** Emotion results will be returned for each target string that is found in the document. */
  var targets: js.UndefOr[js.Array[String]] = js.undefined
}

object EmotionOptions {
  @scala.inline
  def apply(document: js.UndefOr[Boolean] = js.undefined, targets: js.Array[String] = null): EmotionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(document)) __obj.updateDynamic("document")(document)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[EmotionOptions]
  }
}

