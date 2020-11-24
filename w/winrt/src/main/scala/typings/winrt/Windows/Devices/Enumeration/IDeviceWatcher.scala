package typings.winrt.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceWatcher extends js.Object {
  
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
  implicit class IDeviceWatcherOps[Self <: IDeviceWatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnadded(value: js.Any): Self = this.set("onadded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnenumerationcompleted(value: js.Any): Self = this.set("onenumerationcompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnremoved(value: js.Any): Self = this.set("onremoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstopped(value: js.Any): Self = this.set("onstopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnupdated(value: js.Any): Self = this.set("onupdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatus(value: DeviceWatcherStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
