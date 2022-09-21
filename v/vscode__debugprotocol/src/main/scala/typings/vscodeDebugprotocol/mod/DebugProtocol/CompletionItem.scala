package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** CompletionItems are the suggestions returned from the CompletionsRequest. */
trait CompletionItem extends StObject {
  
  /** A human-readable string with additional information about this item, like type or symbol information. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** The label of this completion item. By default this is also the text that is inserted when selecting this completion. */
  var label: String
  
  /** This value determines how many characters are overwritten by the completion text.
  			If missing the value 0 is assumed which results in the completion text being inserted.
  		*/
  var length: js.UndefOr[Double] = js.undefined
  
  /** Determines the length of the new selection after the text has been inserted (or replaced).
  			The selection can not extend beyond the bounds of the completion text.
  			If omitted the length is assumed to be 0.
  		*/
  var selectionLength: js.UndefOr[Double] = js.undefined
  
  /** Determines the start of the new selection after the text has been inserted (or replaced).
  			The start position must be in the range 0 and length of the completion text.
  			If omitted the selection starts at the end of the completion text.
  		*/
  var selectionStart: js.UndefOr[Double] = js.undefined
  
  /** A string that should be used when comparing this item with other items. If not returned or an empty string, the `label` is used instead. */
  var sortText: js.UndefOr[String] = js.undefined
  
  /** This value determines the location (in the `completions` request's `text` attribute) where the completion text is added.
  			If missing the text is added at the location specified by the `completions` request's `column` attribute.
  		*/
  var start: js.UndefOr[Double] = js.undefined
  
  /** If text is returned and not an empty string, then it is inserted instead of the label. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The item's type. Typically the client uses this information to render the item in the UI with an icon. */
  var `type`: js.UndefOr[CompletionItemType] = js.undefined
}
object CompletionItem {
  
  inline def apply(label: String): CompletionItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem]
  }
  
  extension [Self <: CompletionItem](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setSelectionLength(value: Double): Self = StObject.set(x, "selectionLength", value.asInstanceOf[js.Any])
    
    inline def setSelectionLengthUndefined: Self = StObject.set(x, "selectionLength", js.undefined)
    
    inline def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    
    inline def setSelectionStartUndefined: Self = StObject.set(x, "selectionStart", js.undefined)
    
    inline def setSortText(value: String): Self = StObject.set(x, "sortText", value.asInstanceOf[js.Any])
    
    inline def setSortTextUndefined: Self = StObject.set(x, "sortText", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: CompletionItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
