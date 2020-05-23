package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages delayed activation for an app. */
trait ActivatedDeferral extends js.Object {
  /** Notifies the system that the app has set up its state and initial UI and is ready to be displayed. */
  def complete(): Unit
}

object ActivatedDeferral {
  @scala.inline
  def apply(complete: () => Unit): ActivatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ActivatedDeferral]
  }
}

