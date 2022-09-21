package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionItemLabel extends StObject {
  
  /**
    * An optional string which is rendered less prominently after {@link CompletionItemLabel.detail}. Should be used
    * for fully qualified names or file path.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * An optional string which is rendered less prominently directly after {@link CompletionItemLabel.label label},
    * without any spacing. Should be used for function signatures or type annotations.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * The label of this completion item.
    *
    * By default this is also the text that is inserted when this completion is selected.
    */
  var label: String
}
object CompletionItemLabel {
  
  inline def apply(label: String): CompletionItemLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItemLabel]
  }
  
  extension [Self <: CompletionItemLabel](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
