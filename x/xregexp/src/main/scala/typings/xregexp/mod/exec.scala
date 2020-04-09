package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "exec")
@js.native
object exec extends js.Object {
  /**
    * Executes a regex search in a specified string. Returns a match array or `null`. If the provided
    * regex uses named capture, named capture groups properties are included on the match array.
    * Optional `pos` and `sticky` arguments specify the search start position, and whether the match
    * must start at the specified position only. The `lastIndex` property of the provided regex is not
    * used, but is updated for compatibility. Also fixes browser bugs compared to the native
    * `RegExp.prototype.exec` and can be used reliably cross-browser.
    *
    * @param str - String to search.
    * @param regex - Regex to search with.
    * @param pos - Zero-based index at which to start the search.
    * @param sticky - Whether the match must start at the specified position
    *   only. The string `'sticky'` is accepted as an alternative to `true`.
    * @returns Match array with named capture groups properties, or `null`.
    * @example
    *
    * // Basic use, with named capture groups
    * let match = XRegExp.exec('U+2620', XRegExp('U\\+(?<hex>[0-9A-F]{4})'));
    * match.hex; // -> '2620'
    *
    * // With pos and sticky, in a loop
    * let pos = 2, result = [], match;
    * while (match = XRegExp.exec('<1><2><3><4>5<6>', /<(\d)>/, pos, 'sticky')) {
    *   result.push(match[1]);
    *   pos = match.index + match[0].length;
    * }
    * // result -> ['2', '3', '4']
    */
  def apply(str: String, regex: RegExp): ExecArray | Null = js.native
  def apply(str: String, regex: RegExp, pos: Double): ExecArray | Null = js.native
  def apply(str: String, regex: RegExp, pos: Double, sticky: Boolean): ExecArray | Null = js.native
}

