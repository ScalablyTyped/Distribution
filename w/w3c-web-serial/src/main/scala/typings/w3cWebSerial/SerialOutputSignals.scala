package typings.w3cWebSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/serial/#dom-serialoutputsignals */
trait SerialOutputSignals extends StObject {
  
  var break: js.UndefOr[Boolean] = js.undefined
  
  var dataTerminalReady: js.UndefOr[Boolean] = js.undefined
  
  var requestToSend: js.UndefOr[Boolean] = js.undefined
}
object SerialOutputSignals {
  
  inline def apply(): SerialOutputSignals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerialOutputSignals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerialOutputSignals] (val x: Self) extends AnyVal {
    
    inline def setBreak(value: Boolean): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
    
    inline def setBreakUndefined: Self = StObject.set(x, "break", js.undefined)
    
    inline def setDataTerminalReady(value: Boolean): Self = StObject.set(x, "dataTerminalReady", value.asInstanceOf[js.Any])
    
    inline def setDataTerminalReadyUndefined: Self = StObject.set(x, "dataTerminalReady", js.undefined)
    
    inline def setRequestToSend(value: Boolean): Self = StObject.set(x, "requestToSend", value.asInstanceOf[js.Any])
    
    inline def setRequestToSendUndefined: Self = StObject.set(x, "requestToSend", js.undefined)
  }
}
