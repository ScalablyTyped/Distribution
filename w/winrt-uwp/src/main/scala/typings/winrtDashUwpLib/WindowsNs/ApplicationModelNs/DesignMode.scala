package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables you to detect whether your app is in design mode in a visual designer. */
@JSGlobal("Windows.ApplicationModel.DesignMode")
@js.native
abstract class DesignMode () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.DesignMode")
@js.native
object DesignMode extends js.Object {
  /** Gets a value that indicates whether the process is running in design mode. */
  var designModeEnabled: scala.Boolean = js.native
}

