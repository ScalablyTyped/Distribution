package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineCompletionContext extends StObject {
  
  /**
    * Provides information about the currently selected item in the autocomplete widget if it is visible.
    *
    * If set, provided inline completions must extend the text of the selected item
    * and use the same range, otherwise they are not shown as preview.
    * As an example, if the document text is `console.` and the selected item is `.log` replacing the `.` in the document,
    * the inline completion must also replace `.` and start with `.log`, for example `.log()`.
    *
    * Inline completion providers are requested again whenever the selected item changes.
    */
  val selectedCompletionInfo: js.UndefOr[SelectedCompletionInfo] = js.undefined
  
  /**
    * Describes how the inline completion was triggered.
    */
  val triggerKind: InlineCompletionTriggerKind
}
object InlineCompletionContext {
  
  inline def apply(triggerKind: InlineCompletionTriggerKind): InlineCompletionContext = {
    val __obj = js.Dynamic.literal(triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineCompletionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineCompletionContext] (val x: Self) extends AnyVal {
    
    inline def setSelectedCompletionInfo(value: SelectedCompletionInfo): Self = StObject.set(x, "selectedCompletionInfo", value.asInstanceOf[js.Any])
    
    inline def setSelectedCompletionInfoUndefined: Self = StObject.set(x, "selectedCompletionInfo", js.undefined)
    
    inline def setTriggerKind(value: InlineCompletionTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
  }
}
