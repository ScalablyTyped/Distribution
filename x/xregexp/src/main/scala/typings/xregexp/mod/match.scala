package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "match")
@js.native
object `match` extends js.Object {
  def apply(str: String, regex: RegExp): String | js.Array[String] | Null = js.native
  def apply(str: String, regex: RegExp, scope: MatchScope): String | js.Array[String] | Null = js.native
  def apply(str: String, regex: RegExp, scope: MatchScopeAll): js.Array[String] = js.native
  /**
    * Returns the first matched string, or in global mode, an array containing all matched strings.
    * This is essentially a more convenient re-implementation of `String.prototype.match` that gives
    * the result types you actually want (string instead of `exec`-style array in match-first mode,
    * and an empty array instead of `null` when no matches are found in match-all mode). It also lets
    * you override flag g and ignore `lastIndex`, and fixes browser bugs.
    *
    * @param str - String to search.
    * @param regex - Regex to search with.
    * @param scope - Use 'one' to return the first match as a string. Use 'all' to
    *   return an array of all matched strings. If not explicitly specified and `regex` uses flag g,
    *   `scope` is 'all'.
    * @returns In match-first mode: First match as a string, or `null`. In match-all
    *   mode: Array of all matched strings, or an empty array.
    * @example
    *
    * // Match first
    * XRegExp.match('abc', /\w/); // -> 'a'
    * XRegExp.match('abc', /\w/g, 'one'); // -> 'a'
    * XRegExp.match('abc', /x/g, 'one'); // -> null
    *
    * // Match all
    * XRegExp.match('abc', /\w/g); // -> ['a', 'b', 'c']
    * XRegExp.match('abc', /\w/, 'all'); // -> ['a', 'b', 'c']
    * XRegExp.match('abc', /x/, 'all'); // -> []
    */
  def apply(str: String, regex: RegExp, scope: MatchScopeOne): String | Null = js.native
}

