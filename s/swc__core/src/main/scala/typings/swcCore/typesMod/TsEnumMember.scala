package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsEnumMember
  extends StObject
     with Node
     with HasSpan {
  
  var id: TsEnumMemberId
  
  var init: js.UndefOr[Expression] = js.undefined
  
  @JSName("type")
  var type_TsEnumMember: typings.swcCore.swcCoreStrings.TsEnumMember
}
object TsEnumMember {
  
  inline def apply(id: TsEnumMemberId, span: Span): TsEnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsEnumMember")
    __obj.asInstanceOf[TsEnumMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsEnumMember] (val x: Self) extends AnyVal {
    
    inline def setId(value: TsEnumMemberId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsEnumMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
