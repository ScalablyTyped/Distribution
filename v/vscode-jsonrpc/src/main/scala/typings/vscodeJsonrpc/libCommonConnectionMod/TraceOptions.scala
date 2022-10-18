package typings.vscodeJsonrpc.libCommonConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceOptions extends StObject {
  
  var sendNotification: js.UndefOr[Boolean] = js.undefined
  
  var traceFormat: js.UndefOr[TraceFormat] = js.undefined
}
object TraceOptions {
  
  inline def apply(): TraceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceOptions]
  }
  
  extension [Self <: TraceOptions](x: Self) {
    
    inline def setSendNotification(value: Boolean): Self = StObject.set(x, "sendNotification", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationUndefined: Self = StObject.set(x, "sendNotification", js.undefined)
    
    inline def setTraceFormat(value: TraceFormat): Self = StObject.set(x, "traceFormat", value.asInstanceOf[js.Any])
    
    inline def setTraceFormatUndefined: Self = StObject.set(x, "traceFormat", js.undefined)
  }
}
