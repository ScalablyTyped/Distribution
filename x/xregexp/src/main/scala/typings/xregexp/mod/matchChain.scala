package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "matchChain")
@js.native
object matchChain extends js.Object {
  /**
    * Retrieves the matches from searching a string using a chain of regexes that successively search
    * within previous matches. The provided `chain` array can contain regexes and or objects with
    * `regex` and `backref` properties. When a backreference is specified, the named or numbered
    * backreference is passed forward to the next regex or returned.
    *
    * @param str - String to search.
    * @param chain - Regexes that each search for matches within preceding results.
    * @returns Matches by the last regex in the chain, or an empty array.
    * @example
    *
    * // Basic usage; matches numbers within <b> tags
    * XRegExp.matchChain('1 <b>2</b> 3 <b>4 a 56</b>', [
    *   XRegExp('(?is)<b>.*?</b>'),
    *   /\d+/
    * ]);
    * // -> ['2', '4', '56']
    *
    * // Passing forward and returning specific backreferences
    * html = '<a href="http://xregexp.com/api/">XRegExp</a>\
    *         <a href="http://www.google.com/">Google</a>';
    * XRegExp.matchChain(html, [
    *   {regex: /<a href="([^"]+)">/i, backref: 1},
    *   {regex: XRegExp('(?i)^https?://(?<domain>[^/?#]+)'), backref: 'domain'}
    * ]);
    * // -> ['xregexp.com', 'www.google.com']
    */
  def apply(str: String, chain: MatchChainArray): MatchArray = js.native
}

