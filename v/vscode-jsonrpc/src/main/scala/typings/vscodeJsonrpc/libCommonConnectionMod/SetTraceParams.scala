package typings.vscodeJsonrpc.libCommonConnectionMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTraceParams] (val x: Self) extends AnyVal {
    
    inline def setValue(value: TraceValues): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
