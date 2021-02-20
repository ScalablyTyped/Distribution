package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionEntryDetails extends StObject {
  
  var codeActions: js.UndefOr[js.Array[CodeAction]] = js.native
  
  var displayParts: js.Array[SymbolDisplayPart] = js.native
  
  var documentation: js.UndefOr[js.Array[SymbolDisplayPart]] = js.native
  
  var kind: ScriptElementKind = js.native
  
  var kindModifiers: java.lang.String = js.native
  
  var name: java.lang.String = js.native
  
  var source: js.UndefOr[js.Array[SymbolDisplayPart]] = js.native
  
  var tags: js.UndefOr[js.Array[JSDocTagInfo]] = js.native
}
object CompletionEntryDetails {
  
  @scala.inline
  def apply(
    displayParts: js.Array[SymbolDisplayPart],
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    name: java.lang.String
  ): CompletionEntryDetails = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntryDetails]
  }
  
  @scala.inline
  implicit class CompletionEntryDetailsMutableBuilder[Self <: CompletionEntryDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeActions(value: js.Array[CodeAction]): Self = StObject.set(x, "codeActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeActionsUndefined: Self = StObject.set(x, "codeActions", js.undefined)
    
    @scala.inline
    def setCodeActionsVarargs(value: CodeAction*): Self = StObject.set(x, "codeActions", js.Array(value :_*))
    
    @scala.inline
    def setDisplayParts(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "displayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPartsVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "displayParts", js.Array(value :_*))
    
    @scala.inline
    def setDocumentation(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setDocumentationVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "source", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[JSDocTagInfo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: JSDocTagInfo*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
