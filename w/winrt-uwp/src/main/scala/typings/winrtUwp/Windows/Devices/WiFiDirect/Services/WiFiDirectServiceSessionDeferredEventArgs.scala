package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returned when a WiFiDirectService.SessionDeferred event is raised. */
@js.native
trait WiFiDirectServiceSessionDeferredEventArgs extends js.Object {
  
  /** Gets the service-defined session information returned by the service when it sends a deferral in response to a connection request. Note that a deferral does not indicate that the connection is refused. Rather, it indicates that the server is performing a time-consuming operation such as requesting user input. A seeker should implement a 120-second timeout after getting a deferral before giving up on the request. */
  var deferredSessionInfo: IBuffer = js.native
}
object WiFiDirectServiceSessionDeferredEventArgs {
  
  @scala.inline
  def apply(deferredSessionInfo: IBuffer): WiFiDirectServiceSessionDeferredEventArgs = {
    val __obj = js.Dynamic.literal(deferredSessionInfo = deferredSessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceSessionDeferredEventArgs]
  }
  
  @scala.inline
  implicit class WiFiDirectServiceSessionDeferredEventArgsOps[Self <: WiFiDirectServiceSessionDeferredEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDeferredSessionInfo(value: IBuffer): Self = this.set("deferredSessionInfo", value.asInstanceOf[js.Any])
  }
}
