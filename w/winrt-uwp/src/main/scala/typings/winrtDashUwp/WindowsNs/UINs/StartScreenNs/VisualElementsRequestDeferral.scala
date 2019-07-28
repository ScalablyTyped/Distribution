package typings.winrtDashUwp.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A deferral object used during the creation of the Pin to Start flyout. By using this object, the app can delay the display of the flyout while it gathers the information and assets that will be shown in that flyout. */
@JSGlobal("Windows.UI.StartScreen.VisualElementsRequestDeferral")
@js.native
abstract class VisualElementsRequestDeferral () extends js.Object {
  /** Tells Windows that the app is ready to display the Pin to Start flyout. The app calls this method when it has finished setting the properties that specify what to show in that flyout. */
  def complete(): Unit = js.native
}

