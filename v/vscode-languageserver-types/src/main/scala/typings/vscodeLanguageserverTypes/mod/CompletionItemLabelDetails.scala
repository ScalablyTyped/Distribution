package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionItemLabelDetails extends StObject {
  
  /**
    * An optional string which is rendered less prominently after {@link CompletionItem.detail}. Should be used
    * for fully qualified names and file paths.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * An optional string which is rendered less prominently directly after {@link CompletionItem.label label},
    * without any spacing. Should be used for function signatures and type annotations.
    */
  var detail: js.UndefOr[String] = js.undefined
}
object CompletionItemLabelDetails {
  
  inline def apply(): CompletionItemLabelDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletionItemLabelDetails]
  }
  
  @JSImport("vscode-languageserver-types", "CompletionItemLabelDetails")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CompletionItemLabelDetails */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CompletionItemLabelDetails */ Boolean]
  
  extension [Self <: CompletionItemLabelDetails](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
  }
}
