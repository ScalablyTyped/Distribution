package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionList extends StObject {
  
  /**
    * This list it not complete. Further typing results in recomputing this list.
    */
  var isIncomplete: Boolean
  
  /**
    * The completion items.
    */
  var items: js.Array[CompletionItem]
}
object CompletionList {
  
  inline def apply(isIncomplete: Boolean, items: js.Array[CompletionItem]): CompletionList = {
    val __obj = js.Dynamic.literal(isIncomplete = isIncomplete.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionList]
  }
  
  @JSImport("vscode-languageserver-types", "CompletionList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  inline def create(): CompletionList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CompletionList]
  inline def create(items: js.Array[CompletionItem]): CompletionList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(items.asInstanceOf[js.Any]).asInstanceOf[CompletionList]
  inline def create(items: js.Array[CompletionItem], isIncomplete: Boolean): CompletionList = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(items.asInstanceOf[js.Any], isIncomplete.asInstanceOf[js.Any])).asInstanceOf[CompletionList]
  inline def create(items: Unit, isIncomplete: Boolean): CompletionList = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(items.asInstanceOf[js.Any], isIncomplete.asInstanceOf[js.Any])).asInstanceOf[CompletionList]
  
  extension [Self <: CompletionList](x: Self) {
    
    inline def setIsIncomplete(value: Boolean): Self = StObject.set(x, "isIncomplete", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[CompletionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: CompletionItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
