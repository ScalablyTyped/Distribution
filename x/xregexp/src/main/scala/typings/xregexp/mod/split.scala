package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "split")
@js.native
object split extends js.Object {
  /**
    * Splits a string into an array of strings using a regex or string separator. Matches of the
    * separator are not included in the result array. However, if `separator` is a regex that contains
    * capturing groups, backreferences are spliced into the result each time `separator` is matched.
    * Fixes browser bugs compared to the native `String.prototype.split` and can be used reliably
    * cross-browser.
    *
    * @param str - String to split.
    * @param separator - Regex or string to use for separating the string.
    * @param limit - Maximum number of items to include in the result array.
    * @returns Array of substrings.
    * @example
    *
    * // Basic use
    * XRegExp.split('a b c', ' ');
    * // -> ['a', 'b', 'c']
    *
    * // With limit
    * XRegExp.split('a b c', ' ', 2);
    * // -> ['a', 'b']
    *
    * // Backreferences in result array
    * XRegExp.split('..word1..', /([a-z]+)(\d+)/i);
    * // -> ['..', 'word', '1', '..']
    */
  def apply(str: String, separator: Pattern): js.Array[String] = js.native
  def apply(str: String, separator: Pattern, limit: Double): js.Array[String] = js.native
}

