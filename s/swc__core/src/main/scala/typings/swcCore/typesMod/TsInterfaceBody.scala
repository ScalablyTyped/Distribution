package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsInterfaceBody
  extends StObject
     with Node
     with HasSpan {
  
  var body: js.Array[TsTypeElement]
  
  @JSName("type")
  var type_TsInterfaceBody: typings.swcCore.swcCoreStrings.TsInterfaceBody
}
object TsInterfaceBody {
  
  inline def apply(body: js.Array[TsTypeElement], span: Span): TsInterfaceBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInterfaceBody")
    __obj.asInstanceOf[TsInterfaceBody]
  }
  
  extension [Self <: TsInterfaceBody](x: Self) {
    
    inline def setBody(value: js.Array[TsTypeElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: TsTypeElement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsInterfaceBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
