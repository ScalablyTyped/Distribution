package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMobileBroadbandAccountWatcher extends StObject {
  
  var onaccountadded: js.Any = js.native
  
  var onaccountremoved: js.Any = js.native
  
  var onaccountupdated: js.Any = js.native
  
  var onenumerationcompleted: js.Any = js.native
  
  var onstopped: js.Any = js.native
  
  def start(): Unit = js.native
  
  var status: MobileBroadbandAccountWatcherStatus = js.native
  
  def stop(): Unit = js.native
}
object IMobileBroadbandAccountWatcher {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IMobileBroadbandAccountWatcherMutableBuilder[Self <: IMobileBroadbandAccountWatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnaccountadded(value: js.Any): Self = StObject.set(x, "onaccountadded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnaccountremoved(value: js.Any): Self = StObject.set(x, "onaccountremoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnaccountupdated(value: js.Any): Self = StObject.set(x, "onaccountupdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnenumerationcompleted(value: js.Any): Self = StObject.set(x, "onenumerationcompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstopped(value: js.Any): Self = StObject.set(x, "onstopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatus(value: MobileBroadbandAccountWatcherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
