package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages delayed navigation for an app. */
trait WebUINavigatedDeferral extends js.Object {
  /** Notifies the system that the app has set up its state and UI and is ready to be displayed after a top level navigation. */
  def complete(): Unit
}

object WebUINavigatedDeferral {
  @scala.inline
  def apply(complete: () => Unit): WebUINavigatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[WebUINavigatedDeferral]
  }
}

