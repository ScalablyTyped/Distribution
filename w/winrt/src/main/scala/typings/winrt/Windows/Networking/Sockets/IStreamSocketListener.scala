package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IClosable
import typings.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamSocketListener extends IClosable {
  
  def bindEndpointAsync(localHostName: HostName, localServiceName: String): IAsyncAction = js.native
  
  def bindServiceNameAsync(localServiceName: String): IAsyncAction = js.native
  
  var control: StreamSocketListenerControl = js.native
  
  var information: StreamSocketListenerInformation = js.native
  
  var onconnectionreceived: js.Any = js.native
}
object IStreamSocketListener {
  
  @scala.inline
  def apply(
    bindEndpointAsync: (HostName, String) => IAsyncAction,
    bindServiceNameAsync: String => IAsyncAction,
    close: () => Unit,
    control: StreamSocketListenerControl,
    information: StreamSocketListenerInformation,
    onconnectionreceived: js.Any
  ): IStreamSocketListener = {
    val __obj = js.Dynamic.literal(bindEndpointAsync = js.Any.fromFunction2(bindEndpointAsync), bindServiceNameAsync = js.Any.fromFunction1(bindServiceNameAsync), close = js.Any.fromFunction0(close), control = control.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], onconnectionreceived = onconnectionreceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketListener]
  }
  
  @scala.inline
  implicit class IStreamSocketListenerOps[Self <: IStreamSocketListener] (val x: Self) extends AnyVal {
    
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
    def setBindEndpointAsync(value: (HostName, String) => IAsyncAction): Self = this.set("bindEndpointAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBindServiceNameAsync(value: String => IAsyncAction): Self = this.set("bindServiceNameAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setControl(value: StreamSocketListenerControl): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformation(value: StreamSocketListenerInformation): Self = this.set("information", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnconnectionreceived(value: js.Any): Self = this.set("onconnectionreceived", value.asInstanceOf[js.Any])
  }
}
