package typings.winrtUwp.global.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a LayoutRequested event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextLayoutRequest")
@js.native
abstract class CoreTextLayoutRequest ()
  extends typings.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutRequest {
  /** Gets a value that indicates whether the layout request operation is canceled. */
  /* CompleteClass */
  override var isCanceled: Boolean = js.native
  /** Gets an object that represents the layout bounds information requested by the text input server. The application should populate the properties of this object to the layout bounds being requested before returning from the event handler. */
  /* CompleteClass */
  override var layoutBounds: typings.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutBounds = js.native
  /** Gets a value that indicates the range of text whose bounding box is being requested by the text input server. The server populates this property before raising the event. */
  /* CompleteClass */
  override var range: CoreTextRange = js.native
  /**
    * Requests that the layout request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): Deferral = js.native
}

