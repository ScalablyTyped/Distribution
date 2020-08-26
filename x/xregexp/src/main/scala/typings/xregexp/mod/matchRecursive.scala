package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "matchRecursive")
@js.native
object matchRecursive extends js.Object {
  /**
    * Returns an array of match strings between outermost left and right delimiters, or an array of
    * objects with detailed match parts and position data. An error is thrown if delimiters are
    * unbalanced within the data.
    *
    * @param str - String to search.
    * @param left - Left delimiter as an XRegExp pattern.
    * @param right - Right delimiter as an XRegExp pattern.
    * @param flags - Any native or XRegExp flags, used for the left and right delimiters.
    * @param options - Lets you specify `valueNames` and `escapeChar` options.
    * @returns Array of matches, or an empty array.
    * @example
    *
    * // Basic usage
    * let str = '(t((e))s)t()(ing)';
    * XRegExp.matchRecursive(str, '\\(', '\\)', 'g');
    * // -> ['t((e))s', '', 'ing']
    *
    * // Extended information mode with valueNames
    * str = 'Here is <div> <div>an</div></div> example';
    * XRegExp.matchRecursive(str, '<div\\s*>', '</div>', 'gi', {
    *   valueNames: ['between', 'left', 'match', 'right']
    * });
    * // -> [
    * // {name: 'between', value: 'Here is ',       start: 0,  end: 8},
    * // {name: 'left',    value: '<div>',          start: 8,  end: 13},
    * // {name: 'match',   value: ' <div>an</div>', start: 13, end: 27},
    * // {name: 'right',   value: '</div>',         start: 27, end: 33},
    * // {name: 'between', value: ' example',       start: 33, end: 41}
    * // ]
    *
    * // Omitting unneeded parts with null valueNames, and using escapeChar
    * str = '...{1}.\\{{function(x,y){return {y:x}}}';
    * XRegExp.matchRecursive(str, '{', '}', 'g', {
    *   valueNames: ['literal', null, 'value', null],
    *   escapeChar: '\\'
    * });
    * // -> [
    * // {name: 'literal', value: '...',  start: 0, end: 3},
    * // {name: 'value',   value: '1',    start: 4, end: 5},
    * // {name: 'literal', value: '.\\{', start: 6, end: 9},
    * // {name: 'value',   value: 'function(x,y){return {y:x}}', start: 10, end: 37}
    * // ]
    *
    * // Sticky mode via flag y
    * str = '<1><<<2>>><3>4<5>';
    * XRegExp.matchRecursive(str, '<', '>', 'gy');
    * // -> ['1', '<<2>>', '3']
    */
  def apply(str: String, left: String, right: String): js.Array[String] = js.native
  def apply(str: String, left: String, right: String, flags: String): js.Array[String] = js.native
  def apply[T /* <: js.UndefOr[MatchRecursiveOptions | Null] */](str: String, left: String, right: String, flags: js.UndefOr[scala.Nothing], options: T): js.Array[MatchRecursiveValueNameMatch | String] = js.native
  def apply[T /* <: js.UndefOr[MatchRecursiveOptions | Null] */](str: String, left: String, right: String, flags: String, options: T): js.Array[MatchRecursiveValueNameMatch | String] = js.native
  def apply[T /* <: js.UndefOr[MatchRecursiveOptions | Null] */](str: String, left: String, right: String, flags: Null, options: T): js.Array[MatchRecursiveValueNameMatch | String] = js.native
}

