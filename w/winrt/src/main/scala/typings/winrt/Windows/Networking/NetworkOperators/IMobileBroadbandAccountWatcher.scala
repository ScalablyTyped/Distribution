package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMobileBroadbandAccountWatcher extends StObject {
  
  var onaccountadded: js.Any
  
  var onaccountremoved: js.Any
  
  var onaccountupdated: js.Any
  
  var onenumerationcompleted: js.Any
  
  var onstopped: js.Any
  
  def start(): Unit
  
  var status: MobileBroadbandAccountWatcherStatus
  
  def stop(): Unit
}
object IMobileBroadbandAccountWatcher {
  
  inline def apply(
    onaccountadded: js.Any,
    onaccountremoved: js.Any,
    onaccountupdated: js.Any,
    onenumerationcompleted: js.Any,
    onstopped: js.Any,
    start: () => Unit,
    status: MobileBroadbandAccountWatcherStatus,
    stop: () => Unit
  ): IMobileBroadbandAccountWatcher = {
    val __obj = js.Dynamic.literal(onaccountadded = onaccountadded.asInstanceOf[js.Any], onaccountremoved = onaccountremoved.asInstanceOf[js.Any], onaccountupdated = onaccountupdated.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), status = status.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IMobileBroadbandAccountWatcher]
  }
  
  extension [Self <: IMobileBroadbandAccountWatcher](x: Self) {
    
    inline def setOnaccountadded(value: js.Any): Self = StObject.set(x, "onaccountadded", value.asInstanceOf[js.Any])
    
    inline def setOnaccountremoved(value: js.Any): Self = StObject.set(x, "onaccountremoved", value.asInstanceOf[js.Any])
    
    inline def setOnaccountupdated(value: js.Any): Self = StObject.set(x, "onaccountupdated", value.asInstanceOf[js.Any])
    
    inline def setOnenumerationcompleted(value: js.Any): Self = StObject.set(x, "onenumerationcompleted", value.asInstanceOf[js.Any])
    
    inline def setOnstopped(value: js.Any): Self = StObject.set(x, "onstopped", value.asInstanceOf[js.Any])
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStatus(value: MobileBroadbandAccountWatcherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
