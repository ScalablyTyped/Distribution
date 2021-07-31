package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionEntryDetails extends StObject {
  
  var docComment: String
  
  var fullSymbolName: String
  
  var kind: String
  
  var kindModifiers: String
  
  var name: String
  
  var `type`: String
}
object CompletionEntryDetails {
  
  @scala.inline
  def apply(
    docComment: String,
    fullSymbolName: String,
    kind: String,
    kindModifiers: String,
    name: String,
    `type`: String
  ): CompletionEntryDetails = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntryDetails]
  }
  
  @scala.inline
  implicit class CompletionEntryDetailsMutableBuilder[Self <: CompletionEntryDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocComment(value: String): Self = StObject.set(x, "docComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullSymbolName(value: String): Self = StObject.set(x, "fullSymbolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
