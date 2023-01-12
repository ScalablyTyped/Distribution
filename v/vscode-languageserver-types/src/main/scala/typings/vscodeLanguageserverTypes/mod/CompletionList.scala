package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.anon.CommitCharacters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionList extends StObject {
  
  /**
    * This list it not complete. Further typing results in recomputing this list.
    *
    * Recomputed lists have all their items replaced (not appended) in the
    * incomplete completion sessions.
    */
  var isIncomplete: Boolean
  
  /**
    * In many cases the items of an actual completion result share the same
    * value for properties like `commitCharacters` or the range of a text
    * edit. A completion list can therefore define item defaults which will
    * be used if a completion item itself doesn't specify the value.
    *
    * If a completion list specifies a default value and a completion item
    * also specifies a corresponding value the one from the item is used.
    *
    * Servers are only allowed to return default values if the client
    * signals support for this via the `completionList.itemDefaults`
    * capability.
    *
    * @since 3.17.0
    */
  var itemDefaults: js.UndefOr[CommitCharacters] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionList] (val x: Self) extends AnyVal {
    
    inline def setIsIncomplete(value: Boolean): Self = StObject.set(x, "isIncomplete", value.asInstanceOf[js.Any])
    
    inline def setItemDefaults(value: CommitCharacters): Self = StObject.set(x, "itemDefaults", value.asInstanceOf[js.Any])
    
    inline def setItemDefaultsUndefined: Self = StObject.set(x, "itemDefaults", js.undefined)
    
    inline def setItems(value: js.Array[CompletionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: CompletionItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
