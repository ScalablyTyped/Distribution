package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelectionRange extends js.Object {
  /**
    * Capabilities specific to `textDocument/selectionRange` requests
    */
  var selectionRange: js.UndefOr[Anon_DynamicRegistration] = js.undefined
}

object Anon_SelectionRange {
  @scala.inline
  def apply(selectionRange: Anon_DynamicRegistration = null): Anon_SelectionRange = {
    val __obj = js.Dynamic.literal()
    if (selectionRange != null) __obj.updateDynamic("selectionRange")(selectionRange)
    __obj.asInstanceOf[Anon_SelectionRange]
  }
}

