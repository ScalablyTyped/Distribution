package typings.winrtUwp.global.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a TextRequested event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextTextRequest")
@js.native
abstract class CoreTextTextRequest ()
  extends typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextRequest {
  /** Gets a value that indicates whether the text request operation is canceled. */
  /* CompleteClass */
  override var isCanceled: Boolean = js.native
  /** Gets a value that indicates the range of text being requested by the text input server. The server populates this property before raising the event. */
  /* CompleteClass */
  override var range: CoreTextRange = js.native
  /** Gets or sets the text that the text input server is requesting. The application should set the text being requested before returning from the event handler. */
  /* CompleteClass */
  override var text: String = js.native
  /**
    * Requests that the text request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): Deferral = js.native
}

