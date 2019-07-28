package typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the CompositionStarted event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs")
@js.native
abstract class CoreTextCompositionStartedEventArgs () extends js.Object {
  /** Gets a value that indicates whether the operation is canceled. */
  var isCanceled: Boolean = js.native
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
}

