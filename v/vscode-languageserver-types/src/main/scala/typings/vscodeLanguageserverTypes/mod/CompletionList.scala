package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionList extends StObject {
  
  /**
    * This list it not complete. Further typing results in recomputing this list.
    */
  var isIncomplete: Boolean = js.native
  
  /**
    * The completion items.
    */
  var items: js.Array[CompletionItem] = js.native
}
object CompletionList {
  
  @scala.inline
  def apply(isIncomplete: Boolean, items: js.Array[CompletionItem]): CompletionList = {
    val __obj = js.Dynamic.literal(isIncomplete = isIncomplete.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionList]
  }
  
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  @JSImport("vscode-languageserver-types", "CompletionList.create")
  @js.native
  def create(): CompletionList = js.native
  @JSImport("vscode-languageserver-types", "CompletionList.create")
  @js.native
  def create(items: js.UndefOr[scala.Nothing], isIncomplete: Boolean): CompletionList = js.native
  @JSImport("vscode-languageserver-types", "CompletionList.create")
  @js.native
  def create(items: js.Array[CompletionItem]): CompletionList = js.native
  @JSImport("vscode-languageserver-types", "CompletionList.create")
  @js.native
  def create(items: js.Array[CompletionItem], isIncomplete: Boolean): CompletionList = js.native
  
  @scala.inline
  implicit class CompletionListMutableBuilder[Self <: CompletionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsIncomplete(value: Boolean): Self = StObject.set(x, "isIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[CompletionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: CompletionItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
