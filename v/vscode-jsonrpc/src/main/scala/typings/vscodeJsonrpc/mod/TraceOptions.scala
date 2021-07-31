package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceOptions extends StObject {
  
  var sendNotification: js.UndefOr[Boolean] = js.undefined
  
  var traceFormat: js.UndefOr[TraceFormat] = js.undefined
}
object TraceOptions {
  
  @scala.inline
  def apply(): TraceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceOptions]
  }
  
  @scala.inline
  implicit class TraceOptionsMutableBuilder[Self <: TraceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendNotification(value: Boolean): Self = StObject.set(x, "sendNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotificationUndefined: Self = StObject.set(x, "sendNotification", js.undefined)
    
    @scala.inline
    def setTraceFormat(value: TraceFormat): Self = StObject.set(x, "traceFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceFormatUndefined: Self = StObject.set(x, "traceFormat", js.undefined)
  }
}
