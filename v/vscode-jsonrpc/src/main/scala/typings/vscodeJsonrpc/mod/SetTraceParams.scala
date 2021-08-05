package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTraceParams extends StObject {
  
  var value: TraceValues
}
object SetTraceParams {
  
  inline def apply(value: TraceValues): SetTraceParams = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTraceParams]
  }
  
  extension [Self <: SetTraceParams](x: Self) {
    
    inline def setValue(value: TraceValues): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
