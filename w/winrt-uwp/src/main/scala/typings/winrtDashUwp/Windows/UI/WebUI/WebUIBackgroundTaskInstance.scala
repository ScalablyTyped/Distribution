package typings.winrtDashUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an instance of a background task that has been triggered to run. */
@JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance")
@js.native
abstract class WebUIBackgroundTaskInstance () extends js.Object

/* static members */
@JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance")
@js.native
object WebUIBackgroundTaskInstance extends js.Object {
  /** Gets the current background task. */
  var current: IWebUIBackgroundTaskInstance = js.native
}

