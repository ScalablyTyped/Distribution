package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Globalization.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TextUpdating event. */
@js.native
trait CoreTextTextUpdatingEventArgs extends StObject {
  
  /**
    * Requests that the text update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral deferral object.
    */
  def getDeferral(): Deferral = js.native
  
  /** Gets a Language object representing the current input language. */
  var inputLanguage: Language = js.native
  
  /** Gets a value that indicates whether the text update operation is canceled. */
  var isCanceled: Boolean = js.native
  
  /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
  var newSelection: CoreTextRange = js.native
  
  /** Gets a value that indicates the range of text that the text input server needs to modify. The server populates this property before raising the event. */
  var range: CoreTextRange = js.native
  
  /** Gets or sets a value that indicates the result of handling the TextUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  var result: CoreTextTextUpdatingResult = js.native
  
  /** Gets the text that the text input server is requesting to be set into the modified range. The server populates this property before raising the event. */
  var text: String = js.native
}
object CoreTextTextUpdatingEventArgs {
  
  @scala.inline
  def apply(
    getDeferral: () => Deferral,
    inputLanguage: Language,
    isCanceled: Boolean,
    newSelection: CoreTextRange,
    range: CoreTextRange,
    result: CoreTextTextUpdatingResult,
    text: String
  ): CoreTextTextUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), inputLanguage = inputLanguage.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], newSelection = newSelection.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextTextUpdatingEventArgs]
  }
  
  @scala.inline
  implicit class CoreTextTextUpdatingEventArgsMutableBuilder[Self <: CoreTextTextUpdatingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInputLanguage(value: Language): Self = StObject.set(x, "inputLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSelection(value: CoreTextRange): Self = StObject.set(x, "newSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: CoreTextRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: CoreTextTextUpdatingResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
