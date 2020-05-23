package typings.winrtUwp.global.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the results of a window (app view) consolidation operation. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewConsolidatedEventArgs")
@js.native
abstract class ApplicationViewConsolidatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewConsolidatedEventArgs {
  /** Indicates whether the window consolidation was user- or system-initiated. */
  /* CompleteClass */
  override var isUserInitiated: Boolean = js.native
}

