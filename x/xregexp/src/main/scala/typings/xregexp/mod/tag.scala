package typings.xregexp.mod

import typings.std.RegExp
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xregexp", "tag")
@js.native
object tag extends js.Object {
  
  /**
    * Provides tagged template literals that create regexes with XRegExp syntax and flags. The
    * provided pattern is handled as a raw string, so backslashes don't need to be escaped.
    *
    * Interpolation of strings and regexes shares the features of `XRegExp.build`. Interpolated
    * patterns are treated as atomic units when quantified, interpolated strings have their special
    * characters escaped, a leading `^` and trailing unescaped `$` are stripped from interpolated
    * regexes if both are present, and any backreferences within an interpolated regex are
    * rewritten to work within the overall pattern.
    *
    * @param flags - Any combination of XRegExp flags.
    * @returns Handler for template literals that construct regexes with XRegExp syntax.
    * @example
    *
    * const h12 = /1[0-2]|0?[1-9]/;
    * const h24 = /2[0-3]|[01][0-9]/;
    * const hours = XRegExp.tag('x')`${h12} : | ${h24}`;
    * const minutes = /^[0-5][0-9]$/;
    * // Note that explicitly naming the 'minutes' group is required for named backreferences
    * const time = XRegExp.tag('x')`^ ${hours} (?<minutes>${minutes}) $`;
    * time.test('10:59'); // -> true
    * XRegExp.exec('10:59', time).minutes; // -> '59'
    */
  def apply(): js.Function2[/* literals */ TemplateStringsArray, /* repeated */ js.Any, RegExp] = js.native
  def apply(flags: String): js.Function2[/* literals */ TemplateStringsArray, /* repeated */ js.Any, RegExp] = js.native
}
