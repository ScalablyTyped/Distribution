package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionEntryDetails extends js.Object {
  
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
  implicit class CompletionEntryDetailsOps[Self <: CompletionEntryDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayPartsVarargs(value: SymbolDisplayPart*): Self = this.set("displayParts", js.Array(value :_*))
    
    @scala.inline
    def setDisplayParts(value: js.Array[SymbolDisplayPart]): Self = this.set("displayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ScriptElementKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = this.set("kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeActionsVarargs(value: CodeAction*): Self = this.set("codeActions", js.Array(value :_*))
    
    @scala.inline
    def setCodeActions(value: js.Array[CodeAction]): Self = this.set("codeActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeActions: Self = this.set("codeActions", js.undefined)
    
    @scala.inline
    def setDocumentationVarargs(value: SymbolDisplayPart*): Self = this.set("documentation", js.Array(value :_*))
    
    @scala.inline
    def setDocumentation(value: js.Array[SymbolDisplayPart]): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: SymbolDisplayPart*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Array[SymbolDisplayPart]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: JSDocTagInfo*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[JSDocTagInfo]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
