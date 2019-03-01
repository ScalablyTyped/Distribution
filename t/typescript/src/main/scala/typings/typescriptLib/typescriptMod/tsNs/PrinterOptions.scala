package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterOptions extends js.Object {
  var newLine: js.UndefOr[NewLineKind] = js.undefined
  var noEmitHelpers: js.UndefOr[scala.Boolean] = js.undefined
  var omitTrailingSemicolon: js.UndefOr[scala.Boolean] = js.undefined
  var removeComments: js.UndefOr[scala.Boolean] = js.undefined
}

object PrinterOptions {
  @scala.inline
  def apply(
    newLine: NewLineKind = null,
    noEmitHelpers: js.UndefOr[scala.Boolean] = js.undefined,
    omitTrailingSemicolon: js.UndefOr[scala.Boolean] = js.undefined,
    removeComments: js.UndefOr[scala.Boolean] = js.undefined
  ): PrinterOptions = {
    val __obj = js.Dynamic.literal()
    if (newLine != null) __obj.updateDynamic("newLine")(newLine)
    if (!js.isUndefined(noEmitHelpers)) __obj.updateDynamic("noEmitHelpers")(noEmitHelpers)
    if (!js.isUndefined(omitTrailingSemicolon)) __obj.updateDynamic("omitTrailingSemicolon")(omitTrailingSemicolon)
    if (!js.isUndefined(removeComments)) __obj.updateDynamic("removeComments")(removeComments)
    __obj.asInstanceOf[PrinterOptions]
  }
}

