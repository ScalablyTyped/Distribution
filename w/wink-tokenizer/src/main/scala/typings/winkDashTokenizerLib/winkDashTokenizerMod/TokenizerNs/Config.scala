package typings
package winkDashTokenizerLib.winkDashTokenizerMod.TokenizerNs

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

