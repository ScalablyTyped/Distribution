package typings
package winkDashTokenizerLib.winkDashTokenizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * It defines 0 or more properties from the list of 14 properties.
	 * A true value for a property ensures tokenization for that type of text;
	 * whereas false value will mean that the tokenization of that type of text will not be attempted.
	 *
	 * An empty config object is equivalent to splitting on spaces.
	 * Whatever tokens are created like this are tagged as alien
	 * and z is the finger print code of this token type.
	 */
trait Config extends js.Object {
  /**
  		 * such as $ or £ symbols
  		 * @default true
  		 */
  var currency: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var email: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var emoji: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var emoticon: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var hashtag: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var mention: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var number: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * ordinals like 1st , 2nd , 3rd , 4th or 12th or 91st
  		 * @default true
  		 */
  var ordinal: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var punctuation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var quoted_phrase: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var symbol: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var time: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var url: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * @default true
  		 */
  var word: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    currency: js.UndefOr[scala.Boolean] = js.undefined,
    email: js.UndefOr[scala.Boolean] = js.undefined,
    emoji: js.UndefOr[scala.Boolean] = js.undefined,
    emoticon: js.UndefOr[scala.Boolean] = js.undefined,
    hashtag: js.UndefOr[scala.Boolean] = js.undefined,
    mention: js.UndefOr[scala.Boolean] = js.undefined,
    number: js.UndefOr[scala.Boolean] = js.undefined,
    ordinal: js.UndefOr[scala.Boolean] = js.undefined,
    punctuation: js.UndefOr[scala.Boolean] = js.undefined,
    quoted_phrase: js.UndefOr[scala.Boolean] = js.undefined,
    symbol: js.UndefOr[scala.Boolean] = js.undefined,
    time: js.UndefOr[scala.Boolean] = js.undefined,
    url: js.UndefOr[scala.Boolean] = js.undefined,
    word: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currency)) __obj.updateDynamic("currency")(currency)
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(emoji)) __obj.updateDynamic("emoji")(emoji)
    if (!js.isUndefined(emoticon)) __obj.updateDynamic("emoticon")(emoticon)
    if (!js.isUndefined(hashtag)) __obj.updateDynamic("hashtag")(hashtag)
    if (!js.isUndefined(mention)) __obj.updateDynamic("mention")(mention)
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number)
    if (!js.isUndefined(ordinal)) __obj.updateDynamic("ordinal")(ordinal)
    if (!js.isUndefined(punctuation)) __obj.updateDynamic("punctuation")(punctuation)
    if (!js.isUndefined(quoted_phrase)) __obj.updateDynamic("quoted_phrase")(quoted_phrase)
    if (!js.isUndefined(symbol)) __obj.updateDynamic("symbol")(symbol)
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time)
    if (!js.isUndefined(url)) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(word)) __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[Config]
  }
}

