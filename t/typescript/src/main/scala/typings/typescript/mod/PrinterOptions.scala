package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterOptions extends js.Object {
  var newLine: js.UndefOr[NewLineKind] = js.undefined
  var noEmitHelpers: js.UndefOr[Boolean] = js.undefined
  var omitTrailingSemicolon: js.UndefOr[Boolean] = js.undefined
  var removeComments: js.UndefOr[Boolean] = js.undefined
}

object PrinterOptions {
  @scala.inline
  def apply(
    newLine: NewLineKind = null,
    noEmitHelpers: js.UndefOr[Boolean] = js.undefined,
    omitTrailingSemicolon: js.UndefOr[Boolean] = js.undefined,
    removeComments: js.UndefOr[Boolean] = js.undefined
  ): PrinterOptions = {
    val __obj = js.Dynamic.literal()
    if (newLine != null) __obj.updateDynamic("newLine")(newLine.asInstanceOf[js.Any])
    if (!js.isUndefined(noEmitHelpers)) __obj.updateDynamic("noEmitHelpers")(noEmitHelpers.asInstanceOf[js.Any])
    if (!js.isUndefined(omitTrailingSemicolon)) __obj.updateDynamic("omitTrailingSemicolon")(omitTrailingSemicolon.asInstanceOf[js.Any])
    if (!js.isUndefined(removeComments)) __obj.updateDynamic("removeComments")(removeComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterOptions]
  }
}

