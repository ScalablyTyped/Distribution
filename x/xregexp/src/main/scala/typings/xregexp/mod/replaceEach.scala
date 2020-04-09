package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "replaceEach")
@js.native
object replaceEach extends js.Object {
  /**
    * Performs batch processing of string replacements. Used like `XRegExp.replace`, but accepts an
    * array of replacement details. Later replacements operate on the output of earlier replacements.
    * Replacement details are accepted as an array with a regex or string to search for, the
    * replacement string or function, and an optional scope of 'one' or 'all'. Uses the XRegExp
    * replacement text syntax, which supports named backreference properties via `${name}` or
    * `$<name>`.
    *
    * @param str - String to search.
    * @param replacements - Array of replacement detail arrays.
    * @returns New string with all replacements.
    * @example
    *
    * str = XRegExp.replaceEach(str, [
    *   [XRegExp('(?<name>a)'), 'z${name}'],
    *   [/b/gi, 'y'],
    *   [/c/g, 'x', 'one'], // scope 'one' overrides /g
    *   [/d/, 'w', 'all'],  // scope 'all' overrides lack of /g
    *   ['e', 'v', 'all'],  // scope 'all' allows replace-all for strings
    *   [/f/g, ($0) => $0.toUpperCase()]
    * ]);
    */
  def apply(str: String, replacements: js.Array[ReplacementDetail]): String = js.native
}

