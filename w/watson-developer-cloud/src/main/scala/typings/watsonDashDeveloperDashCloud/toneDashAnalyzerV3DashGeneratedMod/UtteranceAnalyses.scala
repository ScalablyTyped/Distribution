package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** UtteranceAnalyses. */
trait UtteranceAnalyses extends js.Object {
  /** An array of `UtteranceAnalysis` objects that provides the results for each utterance of the input. */
  var utterances_tone: js.Array[UtteranceAnalysis]
  /** **`2017-09-21`:** A warning message if the content contains more than 50 utterances. The service analyzes only the first 50 utterances. **`2016-05-19`:** Not returned. */
  var warning: js.UndefOr[String] = js.undefined
}

object UtteranceAnalyses {
  @scala.inline
  def apply(utterances_tone: js.Array[UtteranceAnalysis], warning: String = null): UtteranceAnalyses = {
    val __obj = js.Dynamic.literal(utterances_tone = utterances_tone.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtteranceAnalyses]
  }
}

