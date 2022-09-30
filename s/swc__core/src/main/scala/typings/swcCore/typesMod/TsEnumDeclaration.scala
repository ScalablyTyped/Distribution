package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsEnumDeclaration
  extends StObject
     with Node
     with HasSpan
     with Declaration {
  
  var declare: Boolean
  
  var id: Identifier
  
  var isConst: Boolean
  
  var members: js.Array[TsEnumMember]
  
  @JSName("type")
  var type_TsEnumDeclaration: typings.swcCore.swcCoreStrings.TsEnumDeclaration
}
object TsEnumDeclaration {
  
  inline def apply(declare: Boolean, id: Identifier, isConst: Boolean, members: js.Array[TsEnumMember], span: Span): TsEnumDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isConst = isConst.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsEnumDeclaration")
    __obj.asInstanceOf[TsEnumDeclaration]
  }
  
  extension [Self <: TsEnumDeclaration](x: Self) {
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsConst(value: Boolean): Self = StObject.set(x, "isConst", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[TsEnumMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: TsEnumMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
