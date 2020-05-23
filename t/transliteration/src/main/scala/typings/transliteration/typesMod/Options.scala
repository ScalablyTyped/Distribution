package typings.transliteration.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.transliteration.typesMod.OptionsTransliterate
  - typings.transliteration.typesMod.OptionsSlugify
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def OptionsTransliterate(
    ignore: js.Array[String] = null,
    replace: OptionReplaceCombined = null,
    replaceAfter: OptionReplaceCombined = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    unknown: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (replaceAfter != null) __obj.updateDynamic("replaceAfter")(replaceAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def OptionsSlugify(
    allowedChars: String = null,
    ignore: js.Array[String] = null,
    lowercase: js.UndefOr[Boolean] = js.undefined,
    replace: OptionReplaceCombined = null,
    replaceAfter: OptionReplaceCombined = null,
    separator: String = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    unknown: String = null,
    uppercase: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allowedChars != null) __obj.updateDynamic("allowedChars")(allowedChars.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase.get.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (replaceAfter != null) __obj.updateDynamic("replaceAfter")(replaceAfter.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown.asInstanceOf[js.Any])
    if (!js.isUndefined(uppercase)) __obj.updateDynamic("uppercase")(uppercase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

