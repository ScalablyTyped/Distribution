package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTraceParams extends StObject {
  
  var value: TraceValues = js.native
}
object SetTraceParams {
  
  @scala.inline
  def apply(value: TraceValues): SetTraceParams = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTraceParams]
  }
  
  @scala.inline
  implicit class SetTraceParamsMutableBuilder[Self <: SetTraceParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: TraceValues): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
