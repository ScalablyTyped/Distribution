package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickInfo extends js.Object {
  
  var displayParts: js.UndefOr[js.Array[SymbolDisplayPart]] = js.native
  
  var documentation: js.UndefOr[js.Array[SymbolDisplayPart]] = js.native
  
  var kind: ScriptElementKind = js.native
  
  var kindModifiers: java.lang.String = js.native
  
  var tags: js.UndefOr[js.Array[JSDocTagInfo]] = js.native
  
  var textSpan: TextSpan = js.native
}
object QuickInfo {
  
  @scala.inline
  def apply(kind: ScriptElementKind, kindModifiers: java.lang.String, textSpan: TextSpan): QuickInfo = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickInfo]
  }
  
  @scala.inline
  implicit class QuickInfoOps[Self <: QuickInfo] (val x: Self) extends AnyVal {
    
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
    def setKind(value: ScriptElementKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = this.set("kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = this.set("textSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPartsVarargs(value: SymbolDisplayPart*): Self = this.set("displayParts", js.Array(value :_*))
    
    @scala.inline
    def setDisplayParts(value: js.Array[SymbolDisplayPart]): Self = this.set("displayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayParts: Self = this.set("displayParts", js.undefined)
    
    @scala.inline
    def setDocumentationVarargs(value: SymbolDisplayPart*): Self = this.set("documentation", js.Array(value :_*))
    
    @scala.inline
    def setDocumentation(value: js.Array[SymbolDisplayPart]): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: JSDocTagInfo*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[JSDocTagInfo]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
