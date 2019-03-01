package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /** Boolean indicating whether the parser should accept typedefs as valid members of interfaces. */
  var allowNestedTypedefs: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(allowNestedTypedefs: js.UndefOr[scala.Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNestedTypedefs)) __obj.updateDynamic("allowNestedTypedefs")(allowNestedTypedefs)
    __obj.asInstanceOf[ParseOptions]
  }
}

