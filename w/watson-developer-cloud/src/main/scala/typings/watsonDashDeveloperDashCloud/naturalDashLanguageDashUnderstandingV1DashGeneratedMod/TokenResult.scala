package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TokenResult. */
trait TokenResult extends js.Object {
  /** The [lemma](https://wikipedia.org/wiki/Lemma_%28morphology%29) of the token. */
  var lemma: js.UndefOr[String] = js.undefined
  /** Character offsets indicating the beginning and end of the token in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.undefined
  /** The part of speech of the token. For descriptions of the values, see [Universal Dependencies POS tags](https://universaldependencies.org/u/pos/). */
  var part_of_speech: js.UndefOr[String] = js.undefined
  /** The token as it appears in the analyzed text. */
  var text: js.UndefOr[String] = js.undefined
}

object TokenResult {
  @scala.inline
  def apply(
    lemma: String = null,
    location: js.Array[Double] = null,
    part_of_speech: String = null,
    text: String = null
  ): TokenResult = {
    val __obj = js.Dynamic.literal()
    if (lemma != null) __obj.updateDynamic("lemma")(lemma.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (part_of_speech != null) __obj.updateDynamic("part_of_speech")(part_of_speech.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResult]
  }
}

