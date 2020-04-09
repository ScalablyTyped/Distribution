package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "addToken")
@js.native
object addToken extends js.Object {
  //#endregion
  //#region methods
  /**
    * Extends XRegExp syntax and allows custom flags. This is used internally and can be used to
    * create XRegExp addons. If more than one token can match the same string, the last added wins.
    *
    * @param regex - Regex object that matches the new token.
    * @param handler - Function that returns a new pattern string (using native regex syntax)
    *   to replace the matched token within all future XRegExp regexes. Has access to persistent
    *   properties of the regex being built, through `this`.  The handler function becomes part
    *   of the XRegExp construction process, so be careful not to construct XRegExps within the
    *   function or you will trigger infinite recursion.
    * @param options - Options object with optional properties.
    * @example
    *
    * // Basic usage: Add \a for the ALERT control code
    * XRegExp.addToken(
    *   /\\a/,
    *   () => '\\x07',
    *   { scope: 'all' }
    * );
    * XRegExp('\\a[\\a-\\n]+').test('\x07\n\x07'); // -> true
    *
    * // Add the U (ungreedy) flag from PCRE and RE2, which reverses greedy and lazy quantifiers.
    * // Since `scope` is not specified, it uses 'default' (i.e., transformations apply outside of
    * // character classes only)
    * XRegExp.addToken(
    *   /([?*+]|{\d+(?:,\d*)?})(\??)/,
    *   (match) => `${match[1]}${match[2] ? '' : '?'}`,
    *   { flag: 'U' }
    * );
    * XRegExp('a+', 'U').exec('aaa')[0]; // -> 'a'
    * XRegExp('a+?', 'U').exec('aaa')[0]; // -> 'aaa'
    */
  def apply(
    regex: RegExp,
    handler: js.Function3[/* match */ MatchArray, /* scope */ TokenScope, /* flags */ String, String]
  ): Unit = js.native
  def apply(
    regex: RegExp,
    handler: js.Function3[/* match */ MatchArray, /* scope */ TokenScope, /* flags */ String, String],
    options: TokenOptions
  ): Unit = js.native
}

