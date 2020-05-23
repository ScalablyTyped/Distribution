package typings.winrtUwp.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the results of a window (app view) consolidation operation. */
trait ApplicationViewConsolidatedEventArgs extends js.Object {
  /** Indicates whether the window consolidation was user- or system-initiated. */
  var isUserInitiated: Boolean
}

object ApplicationViewConsolidatedEventArgs {
  @scala.inline
  def apply(isUserInitiated: Boolean): ApplicationViewConsolidatedEventArgs = {
    val __obj = js.Dynamic.literal(isUserInitiated = isUserInitiated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationViewConsolidatedEventArgs]
  }
}

