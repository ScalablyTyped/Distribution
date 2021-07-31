package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IClosable
import typings.winrt.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreamSocketListener
  extends StObject
     with IClosable {
  
  def bindEndpointAsync(localHostName: HostName, localServiceName: String): IAsyncAction
  
  def bindServiceNameAsync(localServiceName: String): IAsyncAction
  
  var control: StreamSocketListenerControl
  
  var information: StreamSocketListenerInformation
  
  var onconnectionreceived: js.Any
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
  implicit class IStreamSocketListenerMutableBuilder[Self <: IStreamSocketListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindEndpointAsync(value: (HostName, String) => IAsyncAction): Self = StObject.set(x, "bindEndpointAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBindServiceNameAsync(value: String => IAsyncAction): Self = StObject.set(x, "bindServiceNameAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setControl(value: StreamSocketListenerControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformation(value: StreamSocketListenerInformation): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnconnectionreceived(value: js.Any): Self = StObject.set(x, "onconnectionreceived", value.asInstanceOf[js.Any])
  }
}
