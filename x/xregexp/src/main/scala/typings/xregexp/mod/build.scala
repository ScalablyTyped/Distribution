package typings.xregexp.mod

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xregexp", "build")
@js.native
object build extends js.Object {
  
  /**
    * Builds regexes using named subpatterns, for readability and pattern reuse. Backreferences in
    * the outer pattern and provided subpatterns are automatically renumbered to work correctly.
    * Native flags used by provided subpatterns are ignored in favor of the `flags` argument.
    *
    * @param pattern - XRegExp pattern using `{{name}}` for embedded subpatterns. Allows
    *   `({{name}})` as shorthand for `(?<name>{{name}})`. Patterns cannot be embedded within
    *   character classes.
    * @param subs - Lookup object for named subpatterns. Values can be strings or regexes. A
    *   leading `^` and trailing unescaped `$` are stripped from subpatterns, if both are present.
    * @param flags - Any combination of XRegExp flags.
    * @returns Regex with interpolated subpatterns.
    * @example
    *
    * const time = XRegExp.build('(?x)^ {{hours}} ({{minutes}}) $', {
    *   hours: XRegExp.build('{{h12}} : | {{h24}}', {
    *     h12: /1[0-2]|0?[1-9]/,
    *     h24: /2[0-3]|[01][0-9]/
    *   }, 'x'),
    *   minutes: /^[0-5][0-9]$/
    * });
    * time.test('10:59'); // -> true
    * XRegExp.exec('10:59', time).minutes; // -> '59'
    */
  def apply(pattern: String, subs: Record[String, Pattern]): RegExp = js.native
  def apply(pattern: String, subs: Record[String, Pattern], flags: String): RegExp = js.native
}
