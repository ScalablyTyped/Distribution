package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionEntryDetails extends StObject {
  
  var codeActions: js.UndefOr[js.Array[CodeAction]] = js.undefined
  
  var displayParts: js.Array[SymbolDisplayPart]
  
  var documentation: js.UndefOr[js.Array[SymbolDisplayPart]] = js.undefined
  
  var kind: ScriptElementKind
  
  var kindModifiers: java.lang.String
  
  var name: java.lang.String
  
  /** @deprecated Use `sourceDisplay` instead. */
  var source: js.UndefOr[js.Array[SymbolDisplayPart]] = js.undefined
  
  var sourceDisplay: js.UndefOr[js.Array[SymbolDisplayPart]] = js.undefined
  
  var tags: js.UndefOr[js.Array[JSDocTagInfo]] = js.undefined
}
object CompletionEntryDetails {
  
  inline def apply(
    displayParts: js.Array[SymbolDisplayPart],
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    name: java.lang.String
  ): CompletionEntryDetails = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntryDetails]
  }
  
  extension [Self <: CompletionEntryDetails](x: Self) {
    
    inline def setCodeActions(value: js.Array[CodeAction]): Self = StObject.set(x, "codeActions", value.asInstanceOf[js.Any])
    
    inline def setCodeActionsUndefined: Self = StObject.set(x, "codeActions", js.undefined)
    
    inline def setCodeActionsVarargs(value: CodeAction*): Self = StObject.set(x, "codeActions", js.Array(value*))
    
    inline def setDisplayParts(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "displayParts", value.asInstanceOf[js.Any])
    
    inline def setDisplayPartsVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "displayParts", js.Array(value*))
    
    inline def setDocumentation(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "documentation", js.Array(value*))
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceDisplay(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "sourceDisplay", value.asInstanceOf[js.Any])
    
    inline def setSourceDisplayUndefined: Self = StObject.set(x, "sourceDisplay", js.undefined)
    
    inline def setSourceDisplayVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "sourceDisplay", js.Array(value*))
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setTags(value: js.Array[JSDocTagInfo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: JSDocTagInfo*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
