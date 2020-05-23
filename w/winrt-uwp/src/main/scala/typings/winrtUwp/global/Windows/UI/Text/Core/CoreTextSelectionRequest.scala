package typings.winrtUwp.global.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a SelectionRequested event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextSelectionRequest")
@js.native
abstract class CoreTextSelectionRequest ()
  extends typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionRequest {
  /** Gets a value that indicates whether the selection request operation is canceled. */
  /* CompleteClass */
  override var isCanceled: Boolean = js.native
  /** Gets or sets the selection range that the text input server is requesting. The application should set the current range of selection before returning from the event handler. */
  /* CompleteClass */
  override var selection: CoreTextRange = js.native
  /**
    * Requests that the selection request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): Deferral = js.native
}

