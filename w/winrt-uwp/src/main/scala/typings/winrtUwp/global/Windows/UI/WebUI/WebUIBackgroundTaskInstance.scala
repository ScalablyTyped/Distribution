package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.UI.WebUI.IWebUIBackgroundTaskInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an instance of a background task that has been triggered to run. */
@JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance")
@js.native
abstract class WebUIBackgroundTaskInstance ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIBackgroundTaskInstance

/* static members */
@JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance")
@js.native
object WebUIBackgroundTaskInstance extends js.Object {
  /** Gets the current background task. */
  var current: IWebUIBackgroundTaskInstance = js.native
}

