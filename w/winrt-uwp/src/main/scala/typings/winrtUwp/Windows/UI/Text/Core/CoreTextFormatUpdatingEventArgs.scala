package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.UI.Text.UnderlineType
import typings.winrtUwp.Windows.UI.ViewManagement.UIElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the FormatUpdating event. */
@js.native
trait CoreTextFormatUpdatingEventArgs extends StObject {
  
  /** Gets a value that represents the background color to be applied to the text range. The text input server populates this property before raising the event. */
  var backgroundColor: UIElementType = js.native
  
  /**
    * Requests that the format update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
  
  /** Gets a value that indicates whether the format update operation is canceled. */
  var isCanceled: Boolean = js.native
  
  /** Gets a value that indicates the range of text that the text input server needs to format. The server populates this property before raising the event. */
  var range: CoreTextRange = js.native
  
  /** Gets a value that indicates the reason that the text input server needs to apply formatting to this range of text. The server populates this property before raising the event. */
  var reason: CoreTextFormatUpdatingReason = js.native
  
  /** Gets or sets a value that indicates the result of handling the FormatUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  var result: CoreTextFormatUpdatingResult = js.native
  
  /** Gets a value that represents the text color to be applied to the text range. The text input server populates this property before raising the event. */
  var textColor: UIElementType = js.native
  
  /** Gets a value that represents the underline color to be applied to the text range. The text input server populates this property before raising the event. */
  var underlineColor: UIElementType = js.native
  
  /** Gets a value that represents the underline type to be applied to the text range. The text input server populates this property before raising the event. */
  var underlineType: UnderlineType = js.native
}
object CoreTextFormatUpdatingEventArgs {
  
  @scala.inline
  def apply(
    backgroundColor: UIElementType,
    getDeferral: () => Deferral,
    isCanceled: Boolean,
    range: CoreTextRange,
    reason: CoreTextFormatUpdatingReason,
    result: CoreTextFormatUpdatingResult,
    textColor: UIElementType,
    underlineColor: UIElementType,
    underlineType: UnderlineType
  ): CoreTextFormatUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], underlineColor = underlineColor.asInstanceOf[js.Any], underlineType = underlineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextFormatUpdatingEventArgs]
  }
  
  @scala.inline
  implicit class CoreTextFormatUpdatingEventArgsMutableBuilder[Self <: CoreTextFormatUpdatingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: UIElementType): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: CoreTextRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: CoreTextFormatUpdatingReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: CoreTextFormatUpdatingResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: UIElementType): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineColor(value: UIElementType): Self = StObject.set(x, "underlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineType(value: UnderlineType): Self = StObject.set(x, "underlineType", value.asInstanceOf[js.Any])
  }
}
