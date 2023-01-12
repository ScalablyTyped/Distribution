package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypeLiteral
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var members: js.Array[TsTypeElement]
  
  @JSName("type")
  var type_TsTypeLiteral: typings.swcCore.swcCoreStrings.TsTypeLiteral
}
object TsTypeLiteral {
  
  inline def apply(members: js.Array[TsTypeElement], span: Span): TsTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeLiteral")
    __obj.asInstanceOf[TsTypeLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsTypeLiteral] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: js.Array[TsTypeElement]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: TsTypeElement*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsTypeLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
