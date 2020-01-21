package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFoldingRange extends js.Object {
  /**
    * Capabilities specific to `textDocument/foldingRange` requests
    */
  var foldingRange: js.UndefOr[AnonDynamicRegistrationLineFoldingOnly] = js.undefined
}

object AnonFoldingRange {
  @scala.inline
  def apply(foldingRange: AnonDynamicRegistrationLineFoldingOnly = null): AnonFoldingRange = {
    val __obj = js.Dynamic.literal()
    if (foldingRange != null) __obj.updateDynamic("foldingRange")(foldingRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFoldingRange]
  }
}

