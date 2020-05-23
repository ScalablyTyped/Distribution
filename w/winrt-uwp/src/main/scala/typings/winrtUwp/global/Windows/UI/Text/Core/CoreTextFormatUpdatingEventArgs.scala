package typings.winrtUwp.global.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextRange
import typings.winrtUwp.Windows.UI.Text.UnderlineType
import typings.winrtUwp.Windows.UI.ViewManagement.UIElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the FormatUpdating event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingEventArgs")
@js.native
abstract class CoreTextFormatUpdatingEventArgs ()
  extends typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingEventArgs {
  /** Gets a value that represents the background color to be applied to the text range. The text input server populates this property before raising the event. */
  /* CompleteClass */
  override var backgroundColor: UIElementType = js.native
  /** Gets a value that indicates whether the format update operation is canceled. */
  /* CompleteClass */
  override var isCanceled: Boolean = js.native
  /** Gets a value that indicates the range of text that the text input server needs to format. The server populates this property before raising the event. */
  /* CompleteClass */
  override var range: CoreTextRange = js.native
  /** Gets a value that indicates the reason that the text input server needs to apply formatting to this range of text. The server populates this property before raising the event. */
  /* CompleteClass */
  override var reason: typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason = js.native
  /** Gets or sets a value that indicates the result of handling the FormatUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  /* CompleteClass */
  override var result: typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult = js.native
  /** Gets a value that represents the text color to be applied to the text range. The text input server populates this property before raising the event. */
  /* CompleteClass */
  override var textColor: UIElementType = js.native
  /** Gets a value that represents the underline color to be applied to the text range. The text input server populates this property before raising the event. */
  /* CompleteClass */
  override var underlineColor: UIElementType = js.native
  /** Gets a value that represents the underline type to be applied to the text range. The text input server populates this property before raising the event. */
  /* CompleteClass */
  override var underlineType: UnderlineType = js.native
  /**
    * Requests that the format update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): Deferral = js.native
}

