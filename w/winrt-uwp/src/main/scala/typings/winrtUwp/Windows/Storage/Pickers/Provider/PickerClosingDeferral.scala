package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use by an app that provides files to indicate asynchronously that the app is finished responding to a closing event. */
trait PickerClosingDeferral extends js.Object {
  /** Signals that the app providing files has finished responding to a closing event. */
  def complete(): Unit
}

object PickerClosingDeferral {
  @scala.inline
  def apply(complete: () => Unit): PickerClosingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PickerClosingDeferral]
  }
}

