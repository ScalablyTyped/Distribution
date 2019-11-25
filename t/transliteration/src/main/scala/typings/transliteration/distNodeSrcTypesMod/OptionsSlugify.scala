package typings.transliteration.distNodeSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.transliteration.distNodeSrcTypesMod.Options because Already inherited */ trait OptionsSlugify extends OptionsTransliterate {
  /**
    * Allowed characters.
    * When `allowedChars` is set to `'abc'`, then only characters match `/[abc]/g` will be preserved.
    * Other characters will all be converted to `separator`
    * @default 'a-zA-Z0-9-_.~''
    */
  var allowedChars: js.UndefOr[String] = js.undefined
  /**
    * Whether the result need to be converted into lowercase
    * @default true
    */
  var lowercase: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom separator string
    * @default '-'
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Whether the result need to be converted into uppercase
    * @default false
    */
  var uppercase: js.UndefOr[Boolean] = js.undefined
}

object OptionsSlugify {
  @scala.inline
  def apply(
    allowedChars: String = null,
    ignore: js.Array[String] = null,
    lowercase: js.UndefOr[Boolean] = js.undefined,
    replace: OptionReplaceCombined = null,
    replaceAfter: OptionReplaceCombined = null,
    separator: String = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    unknown: String = null,
    uppercase: js.UndefOr[Boolean] = js.undefined
  ): OptionsSlugify = {
    val __obj = js.Dynamic.literal()
    if (allowedChars != null) __obj.updateDynamic("allowedChars")(allowedChars.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (replaceAfter != null) __obj.updateDynamic("replaceAfter")(replaceAfter.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown.asInstanceOf[js.Any])
    if (!js.isUndefined(uppercase)) __obj.updateDynamic("uppercase")(uppercase.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSlugify]
  }
}

