package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xregexp", "replace")
@js.native
object replace extends js.Object {
  
  /**
    * Returns a new string with one or all matches of a pattern replaced. The pattern can be a string
    * or regex, and the replacement can be a string or a function to be called for each match. To
    * perform a global search and replace, use the optional `scope` argument or include flag g if using
    * a regex. Replacement strings can use `${n}` or `$<n>` for named and numbered backreferences.
    * Replacement functions can use named backreferences via `arguments[0].name`. Also fixes browser
    * bugs compared to the native `String.prototype.replace` and can be used reliably cross-browser.
    *
    * @param str - String to search.
    * @param search - Search pattern to be replaced.
    * @param replacement - Replacement string or a function invoked to create it.
    * @param scope - Use 'one' to replace the first match only, or 'all'. If not explicitly specified and using a regex with
    *        flag g, `scope` is 'all'.
    * @returns New string with one or all matches replaced.
    * @example
    *
    * // Regex search, using named backreferences in replacement string
    * const name = XRegExp('(?<first>\\w+) (?<last>\\w+)');
    * XRegExp.replace('John Smith', name, '$<last>, $<first>');
    * // -> 'Smith, John'
    *
    * // Regex search, using named backreferences in replacement function
    * XRegExp.replace('John Smith', name, (match) => `${match.last as string}, ${match.first as string}`);
    * // -> 'Smith, John'
    *
    * // String search, with replace-all
    * XRegExp.replace('RegExp builds RegExps', 'RegExp', 'XRegExp', 'all');
    * // -> 'XRegExp builds XRegExps'
    */
  def apply(str: String, search: Pattern, replacement: ReplacementValue): String = js.native
  def apply(str: String, search: Pattern, replacement: ReplacementValue, scope: MatchScope): String = js.native
}
