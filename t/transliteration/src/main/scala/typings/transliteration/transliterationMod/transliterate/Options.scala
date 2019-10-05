package typings.transliteration.transliterationMod.transliterate

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
    * Custom replacement of the strings before transliteration
    */
  var replace: js.UndefOr[js.Array[js.Array[String]] | StringDictionary[String]] = js.undefined
  /**
    * Unicode characters that are not in the database will be replaced with `unknown`
    * default: "[?]"
    */
  var unknown: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ignore: js.Array[String] = null,
    replace: js.Array[js.Array[String]] | StringDictionary[String] = null,
    unknown: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[Options]
  }
}

