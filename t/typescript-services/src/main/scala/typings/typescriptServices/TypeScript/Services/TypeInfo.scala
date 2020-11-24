package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.MemberName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeInfo extends js.Object {
  
  var docComment: String = js.native
  
  var fullSymbolName: String = js.native
  
  var kind: String = js.native
  
  var limChar: Double = js.native
  
  var memberName: MemberName = js.native
  
  var minChar: Double = js.native
}
object TypeInfo {
  
  @scala.inline
  def apply(
    docComment: String,
    fullSymbolName: String,
    kind: String,
    limChar: Double,
    memberName: MemberName,
    minChar: Double
  ): TypeInfo = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeInfo]
  }
  
  @scala.inline
  implicit class TypeInfoOps[Self <: TypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocComment(value: String): Self = this.set("docComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullSymbolName(value: String): Self = this.set("fullSymbolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimChar(value: Double): Self = this.set("limChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberName(value: MemberName): Self = this.set("memberName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinChar(value: Double): Self = this.set("minChar", value.asInstanceOf[js.Any])
  }
}
