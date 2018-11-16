package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a LayoutRequested event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextLayoutRequest")
@js.native
abstract class CoreTextLayoutRequest () extends js.Object {
  /** Gets a value that indicates whether the layout request operation is canceled. */
  var isCanceled: scala.Boolean = js.native
  /** Gets an object that represents the layout bounds information requested by the text input server. The application should populate the properties of this object to the layout bounds being requested before returning from the event handler. */
  var layoutBounds: CoreTextLayoutBounds = js.native
  /** Gets a value that indicates the range of text whose bounding box is being requested by the text input server. The server populates this property before raising the event. */
  var range: CoreTextRange = js.native
  /**
                       * Requests that the layout request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
                       * @return A Deferral object.
                       */
  def getDeferral(): winrtDashUwpLib.WindowsNs.FoundationNs.Deferral = js.native
}

