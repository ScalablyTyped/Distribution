package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module
  extends StObject
     with Node
     with HasSpan
     with HasInterpreter
     with Program {
  
  var body: js.Array[ModuleItem]
  
  @JSName("type")
  var type_Module: typings.swcCore.swcCoreStrings.Module
}
object Module {
  
  inline def apply(body: js.Array[ModuleItem], interpreter: String, span: Span): Module = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], interpreter = interpreter.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Module")
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[ModuleItem]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: ModuleItem*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.Module): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
