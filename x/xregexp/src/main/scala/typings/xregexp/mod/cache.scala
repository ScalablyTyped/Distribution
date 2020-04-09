package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "cache")
@js.native
object cache extends js.Object {
  /**
    * Caches and returns the result of calling `XRegExp(pattern, flags)`. On any subsequent call with
    * the same pattern and flag combination, the cached copy of the regex is returned.
    *
    * @param pattern - Regex pattern string.
    * @param [flags] - Any combination of XRegExp flags.
    * @returns Cached XRegExp object.
    * @example
    *
    * while (match = XRegExp.cache('.', 'gs').exec(str)) {
    *   // The regex is compiled once only
    * }
    */
  def apply(pattern: String, flags: String): RegExp = js.native
}

