package typings.winrtUwp.global.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the CompositionStarted event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs")
@js.native
abstract class CoreTextCompositionStartedEventArgs ()
  extends typings.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs {
  /** Gets a value that indicates whether the operation is canceled. */
  /* CompleteClass */
  override var isCanceled: Boolean = js.native
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): Deferral = js.native
}

