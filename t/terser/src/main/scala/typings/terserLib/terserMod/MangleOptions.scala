package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MangleOptions extends js.Object {
  /** Pass true to mangle names visible in scopes where `eval` or with are used. */
  var eval: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass true to not mangle function names. Useful for code relying on `Function.prototype.name`. */
  var keep_fnames: js.UndefOr[scala.Boolean] = js.undefined
  var properties: js.UndefOr[scala.Boolean | ManglePropertiesOptions] = js.undefined
  /** Pass an array of identifiers that should be excluded from mangling. Example: `["foo", "bar"]`. */
  var reserved: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Pass true to mangle names declared in the top level scope. */
  var toplevel: js.UndefOr[scala.Boolean] = js.undefined
}

