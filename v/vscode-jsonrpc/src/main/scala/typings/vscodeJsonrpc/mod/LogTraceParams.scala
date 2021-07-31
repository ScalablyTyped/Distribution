package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogTraceParams extends StObject {
  
  var message: String
  
  var verbose: js.UndefOr[String] = js.undefined
}
object LogTraceParams {
  
  @scala.inline
  def apply(message: String): LogTraceParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogTraceParams]
  }
  
  @scala.inline
  implicit class LogTraceParamsMutableBuilder[Self <: LogTraceParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: String): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
