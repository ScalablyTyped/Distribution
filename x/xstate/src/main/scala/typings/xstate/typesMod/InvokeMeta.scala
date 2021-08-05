package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeMeta extends StObject {
  
  var data: js.Any
  
  var src: InvokeSourceDefinition
}
object InvokeMeta {
  
  inline def apply(data: js.Any, src: InvokeSourceDefinition): InvokeMeta = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeMeta]
  }
  
  extension [Self <: InvokeMeta](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: InvokeSourceDefinition): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
