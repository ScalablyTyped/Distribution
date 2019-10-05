package typings.transliteration.transliterationMod.slugify

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Strings in the ignore list will be bypassed from transliteration
    */
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Whether to force slugs to be lowercased
    * default: true
    */
  var lowercase: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom replacement of the strings before transliteration
    */
  var replace: js.UndefOr[js.Array[js.Array[String]] | StringDictionary[String]] = js.undefined
  /**
    * Separator of the slug
    * default: "-"
    */
  var separator: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ignore: js.Array[String] = null,
    lowercase: js.UndefOr[Boolean] = js.undefined,
    replace: js.Array[js.Array[String]] | StringDictionary[String] = null,
    separator: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase)
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[Options]
  }
}

