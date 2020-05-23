package typings.transliteration.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTransliterate extends Options {
  /**
    * Ignore a list of strings untouched
    * @example tr('你好，世界', { ignore: ['你'] }) // 你 Hao , Shi Jie
    */
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Replace a list of string / regex in the source string into the provided target string before transliteration
    * The option can either be an array or an object
    * @example tr('你好，世界', { replace: {你: 'You'} }) // You Hao , Shi Jie
    * @example tr('你好，世界', { replace: [['你', 'You']] }) // You Hao , Shi Jie
    * @example tr('你好，世界', { replace: [[/你/g, 'You']] }) // You Hao , Shi Jie
    */
  var replace: js.UndefOr[OptionReplaceCombined] = js.undefined
  /**
    * Same as `replace` but after transliteration
    */
  var replaceAfter: js.UndefOr[OptionReplaceCombined] = js.undefined
  /**
    * Decides whether or not to trim the result string after transliteration
    * @default false
    */
  var trim: js.UndefOr[Boolean] = js.undefined
  /**
    * Any characters not known by this library will be replaced by a specific string `unknown`
    * @default ''
    */
  var unknown: js.UndefOr[String] = js.undefined
}

object OptionsTransliterate {
  @scala.inline
  def apply(
    ignore: js.Array[String] = null,
    replace: OptionReplaceCombined = null,
    replaceAfter: OptionReplaceCombined = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    unknown: String = null
  ): OptionsTransliterate = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (replaceAfter != null) __obj.updateDynamic("replaceAfter")(replaceAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTransliterate]
  }
}

