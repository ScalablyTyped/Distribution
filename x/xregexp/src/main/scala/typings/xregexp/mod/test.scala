package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xregexp", "test")
@js.native
object test extends js.Object {
  
  /**
    * Executes a regex search in a specified string. Returns `true` or `false`. Optional `pos` and
    * `sticky` arguments specify the search start position, and whether the match must start at the
    * specified position only. The `lastIndex` property of the provided regex is not used, but is
    * updated for compatibility. Also fixes browser bugs compared to the native
    * `RegExp.prototype.test` and can be used reliably cross-browser.
    *
    * @param str - String to search.
    * @param regex - Regex to search with.
    * @param pos - Zero-based index at which to start the search.
    * @param sticky - Whether the match must start at the specified position
    *   only. The string `'sticky'` is accepted as an alternative to `true`.
    * @returns Whether the regex matched the provided value.
    * @example
    *
    * // Basic use
    * XRegExp.test('abc', /c/); // -> true
    *
    * // With pos and sticky
    * XRegExp.test('abc', /c/, 0, 'sticky'); // -> false
    * XRegExp.test('abc', /c/, 2, 'sticky'); // -> true
    */
  def apply(str: String, regex: Pattern): Boolean = js.native
  def apply(str: String, regex: Pattern, pos: js.UndefOr[scala.Nothing], sticky: Boolean): Boolean = js.native
  def apply(str: String, regex: Pattern, pos: Double): Boolean = js.native
  def apply(str: String, regex: Pattern, pos: Double, sticky: Boolean): Boolean = js.native
}
