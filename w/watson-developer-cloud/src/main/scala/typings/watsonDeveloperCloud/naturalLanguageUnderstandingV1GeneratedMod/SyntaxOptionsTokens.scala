package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tokenization options. */
trait SyntaxOptionsTokens extends js.Object {
  /** Set this to `true` to return the lemma for each token. */
  var lemma: js.UndefOr[Boolean] = js.undefined
  /** Set this to `true` to return the part of speech for each token. */
  var part_of_speech: js.UndefOr[Boolean] = js.undefined
}

object SyntaxOptionsTokens {
  @scala.inline
  def apply(lemma: js.UndefOr[Boolean] = js.undefined, part_of_speech: js.UndefOr[Boolean] = js.undefined): SyntaxOptionsTokens = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lemma)) __obj.updateDynamic("lemma")(lemma.asInstanceOf[js.Any])
    if (!js.isUndefined(part_of_speech)) __obj.updateDynamic("part_of_speech")(part_of_speech.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxOptionsTokens]
  }
}

