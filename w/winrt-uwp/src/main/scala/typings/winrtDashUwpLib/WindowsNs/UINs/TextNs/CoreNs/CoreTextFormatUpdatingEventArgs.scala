package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the FormatUpdating event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingEventArgs")
@js.native
abstract class CoreTextFormatUpdatingEventArgs () extends js.Object {
  /** Gets a value that represents the background color to be applied to the text range. The text input server populates this property before raising the event. */
  var backgroundColor: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType = js.native
  /** Gets a value that indicates whether the format update operation is canceled. */
  var isCanceled: scala.Boolean = js.native
  /** Gets a value that indicates the range of text that the text input server needs to format. The server populates this property before raising the event. */
  var range: CoreTextRange = js.native
  /** Gets a value that indicates the reason that the text input server needs to apply formatting to this range of text. The server populates this property before raising the event. */
  var reason: CoreTextFormatUpdatingReason = js.native
  /** Gets or sets a value that indicates the result of handling the FormatUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  var result: CoreTextFormatUpdatingResult = js.native
  /** Gets a value that represents the text color to be applied to the text range. The text input server populates this property before raising the event. */
  var textColor: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType = js.native
  /** Gets a value that represents the underline color to be applied to the text range. The text input server populates this property before raising the event. */
  var underlineColor: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType = js.native
  /** Gets a value that represents the underline type to be applied to the text range. The text input server populates this property before raising the event. */
  var underlineType: winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType = js.native
  /**
    * Requests that the format update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): winrtDashUwpLib.WindowsNs.FoundationNs.Deferral = js.native
}

