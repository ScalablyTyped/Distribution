package typings.winrtUwp.global.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app navigation operation. */
@JSGlobal("Windows.UI.WebUI.WebUINavigatedOperation")
@js.native
abstract class WebUINavigatedOperation ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUINavigatedOperation {
  /**
    * Requests that the completion of app navigation be delayed.
    * @return The navigated deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.UI.WebUI.WebUINavigatedDeferral = js.native
}

