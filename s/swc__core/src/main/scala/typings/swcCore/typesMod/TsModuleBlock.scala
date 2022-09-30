package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsModuleBlock
  extends StObject
     with Node
     with HasSpan
     with TsNamespaceBody {
  
  var body: js.Array[ModuleItem]
  
  @JSName("type")
  var type_TsModuleBlock: typings.swcCore.swcCoreStrings.TsModuleBlock
}
object TsModuleBlock {
  
  inline def apply(body: js.Array[ModuleItem], span: Span): TsModuleBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsModuleBlock")
    __obj.asInstanceOf[TsModuleBlock]
  }
  
  extension [Self <: TsModuleBlock](x: Self) {
    
    inline def setBody(value: js.Array[ModuleItem]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: ModuleItem*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsModuleBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
