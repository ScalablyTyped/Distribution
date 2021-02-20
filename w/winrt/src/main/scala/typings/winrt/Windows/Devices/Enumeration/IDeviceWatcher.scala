package typings.winrt.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceWatcher extends StObject {
  
  var onadded: js.Any = js.native
  
  var onenumerationcompleted: js.Any = js.native
  
  var onremoved: js.Any = js.native
  
  var onstopped: js.Any = js.native
  
  var onupdated: js.Any = js.native
  
  def start(): Unit = js.native
  
  var status: DeviceWatcherStatus = js.native
  
  def stop(): Unit = js.native
}
object IDeviceWatcher {
  
  @scala.inline
  def apply(
    onadded: js.Any,
    onenumerationcompleted: js.Any,
    onremoved: js.Any,
    onstopped: js.Any,
    onupdated: js.Any,
    start: () => Unit,
    status: DeviceWatcherStatus,
    stop: () => Unit
  ): IDeviceWatcher = {
    val __obj = js.Dynamic.literal(onadded = onadded.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onremoved = onremoved.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], onupdated = onupdated.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), status = status.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IDeviceWatcher]
  }
  
  @scala.inline
  implicit class IDeviceWatcherMutableBuilder[Self <: IDeviceWatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnadded(value: js.Any): Self = StObject.set(x, "onadded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnenumerationcompleted(value: js.Any): Self = StObject.set(x, "onenumerationcompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnremoved(value: js.Any): Self = StObject.set(x, "onremoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstopped(value: js.Any): Self = StObject.set(x, "onstopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnupdated(value: js.Any): Self = StObject.set(x, "onupdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatus(value: DeviceWatcherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
