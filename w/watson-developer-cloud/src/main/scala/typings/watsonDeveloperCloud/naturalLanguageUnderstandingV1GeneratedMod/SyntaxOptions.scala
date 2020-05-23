package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns tokens and sentences from the input text. */
trait SyntaxOptions extends js.Object {
  /** Set this to `true` to return sentence information. */
  var sentences: js.UndefOr[Boolean] = js.undefined
  /** Tokenization options. */
  var tokens: js.UndefOr[SyntaxOptionsTokens] = js.undefined
}

object SyntaxOptions {
  @scala.inline
  def apply(sentences: js.UndefOr[Boolean] = js.undefined, tokens: SyntaxOptionsTokens = null): SyntaxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sentences)) __obj.updateDynamic("sentences")(sentences.get.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxOptions]
  }
}

