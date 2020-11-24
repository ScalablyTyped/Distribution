package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xregexp", "union")
@js.native
object union extends js.Object {
  
  /**
    * Returns an XRegExp object that is the union of the given patterns. Patterns can be provided as
    * regex objects or strings. Metacharacters are escaped in patterns provided as strings.
    * Backreferences in provided regex objects are automatically renumbered to work correctly within
    * the larger combined pattern. Native flags used by provided regexes are ignored in favor of the
    * `flags` argument.
    *
    * @param patterns - Regexes and strings to combine.
    * @param flags - Any combination of XRegExp flags.
    * @param options - Options object with optional properties.
    * @returns Union of the provided regexes and strings.
    * @example
    *
    * XRegExp.union(['a+b*c', /(dogs)\1/, /(cats)\1/], 'i');
    * // -> /a\+b\*c|(dogs)\1|(cats)\2/i
    *
    * XRegExp.union([/man/, /bear/, /pig/], 'i', {conjunction: 'none'});
    * // -> /manbearpig/i
    */
  def apply(patterns: js.Array[Pattern]): RegExp = js.native
  def apply(patterns: js.Array[Pattern], flags: js.UndefOr[scala.Nothing], options: UnionOptions): RegExp = js.native
  def apply(patterns: js.Array[Pattern], flags: String): RegExp = js.native
  def apply(patterns: js.Array[Pattern], flags: String, options: UnionOptions): RegExp = js.native
  def apply(patterns: js.Array[Pattern], flags: Null, options: UnionOptions): RegExp = js.native
}
