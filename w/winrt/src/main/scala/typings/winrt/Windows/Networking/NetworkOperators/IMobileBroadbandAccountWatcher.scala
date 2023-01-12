package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMobileBroadbandAccountWatcher extends StObject {
  
  var onaccountadded: Any
  
  var onaccountremoved: Any
  
  var onaccountupdated: Any
  
  var onenumerationcompleted: Any
  
  var onstopped: Any
  
  def start(): Unit
  
  var status: MobileBroadbandAccountWatcherStatus
  
  def stop(): Unit
}
object IMobileBroadbandAccountWatcher {
  
  inline def apply(
    onaccountadded: Any,
    onaccountremoved: Any,
    onaccountupdated: Any,
    onenumerationcompleted: Any,
    onstopped: Any,
    start: () => Unit,
    status: MobileBroadbandAccountWatcherStatus,
    stop: () => Unit
  ): IMobileBroadbandAccountWatcher = {
    val __obj = js.Dynamic.literal(onaccountadded = onaccountadded.asInstanceOf[js.Any], onaccountremoved = onaccountremoved.asInstanceOf[js.Any], onaccountupdated = onaccountupdated.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), status = status.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IMobileBroadbandAccountWatcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMobileBroadbandAccountWatcher] (val x: Self) extends AnyVal {
    
    inline def setOnaccountadded(value: Any): Self = StObject.set(x, "onaccountadded", value.asInstanceOf[js.Any])
    
    inline def setOnaccountremoved(value: Any): Self = StObject.set(x, "onaccountremoved", value.asInstanceOf[js.Any])
    
    inline def setOnaccountupdated(value: Any): Self = StObject.set(x, "onaccountupdated", value.asInstanceOf[js.Any])
    
    inline def setOnenumerationcompleted(value: Any): Self = StObject.set(x, "onenumerationcompleted", value.asInstanceOf[js.Any])
    
    inline def setOnstopped(value: Any): Self = StObject.set(x, "onstopped", value.asInstanceOf[js.Any])
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStatus(value: MobileBroadbandAccountWatcherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
