package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FoldingRange extends js.Object {
  /**
    * Capabilities specific to `textDocument/foldingRange` requests
    */
  var foldingRange: js.UndefOr[Anon_DynamicRegistrationLineFoldingOnly] = js.undefined
}

object Anon_FoldingRange {
  @scala.inline
  def apply(foldingRange: Anon_DynamicRegistrationLineFoldingOnly = null): Anon_FoldingRange = {
    val __obj = js.Dynamic.literal()
    if (foldingRange != null) __obj.updateDynamic("foldingRange")(foldingRange)
    __obj.asInstanceOf[Anon_FoldingRange]
  }
}

