package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for an app navigation event. */
@JSGlobal("Windows.UI.WebUI.WebUINavigatedEventArgs")
@js.native
abstract class WebUINavigatedEventArgs () extends js.Object {
  /** Gets the app navigation operation. */
  var navigatedOperation: WebUINavigatedOperation = js.native
}

