package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use by an app that provides files to indicate asynchronously that the app is finished responding to a closing event. */
@JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingDeferral")
@js.native
abstract class PickerClosingDeferral () extends js.Object {
  /** Signals that the app providing files has finished responding to a closing event. */
  def complete(): Unit = js.native
}

