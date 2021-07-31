package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.MemberName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeInfo extends StObject {
  
  var docComment: String
  
  var fullSymbolName: String
  
  var kind: String
  
  var limChar: Double
  
  var memberName: MemberName
  
  var minChar: Double
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
  implicit class TypeInfoMutableBuilder[Self <: TypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocComment(value: String): Self = StObject.set(x, "docComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullSymbolName(value: String): Self = StObject.set(x, "fullSymbolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimChar(value: Double): Self = StObject.set(x, "limChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberName(value: MemberName): Self = StObject.set(x, "memberName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
  }
}
