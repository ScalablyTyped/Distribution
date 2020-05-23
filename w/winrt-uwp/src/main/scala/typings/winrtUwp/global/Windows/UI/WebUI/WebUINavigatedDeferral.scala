package typings.winrtUwp.global.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages delayed navigation for an app. */
@JSGlobal("Windows.UI.WebUI.WebUINavigatedDeferral")
@js.native
abstract class WebUINavigatedDeferral ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUINavigatedDeferral {
  /** Notifies the system that the app has set up its state and UI and is ready to be displayed after a top level navigation. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}

