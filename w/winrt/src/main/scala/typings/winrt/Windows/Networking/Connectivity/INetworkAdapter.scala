package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INetworkAdapter extends StObject {
  
  def getConnectedProfileAsync(): IAsyncOperation[ConnectionProfile] = js.native
  
  var ianaInterfaceType: Double = js.native
  
  var inboundMaxBitsPerSecond: Double = js.native
  
  var networkAdapterId: String = js.native
  
  var networkItem: NetworkItem = js.native
  
  var outboundMaxBitsPerSecond: Double = js.native
}
object INetworkAdapter {
  
  @scala.inline
  def apply(
    getConnectedProfileAsync: () => IAsyncOperation[ConnectionProfile],
    ianaInterfaceType: Double,
    inboundMaxBitsPerSecond: Double,
    networkAdapterId: String,
    networkItem: NetworkItem,
    outboundMaxBitsPerSecond: Double
  ): INetworkAdapter = {
    val __obj = js.Dynamic.literal(getConnectedProfileAsync = js.Any.fromFunction0(getConnectedProfileAsync), ianaInterfaceType = ianaInterfaceType.asInstanceOf[js.Any], inboundMaxBitsPerSecond = inboundMaxBitsPerSecond.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], networkItem = networkItem.asInstanceOf[js.Any], outboundMaxBitsPerSecond = outboundMaxBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkAdapter]
  }
  
  @scala.inline
  implicit class INetworkAdapterMutableBuilder[Self <: INetworkAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetConnectedProfileAsync(value: () => IAsyncOperation[ConnectionProfile]): Self = StObject.set(x, "getConnectedProfileAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIanaInterfaceType(value: Double): Self = StObject.set(x, "ianaInterfaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundMaxBitsPerSecond(value: Double): Self = StObject.set(x, "inboundMaxBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAdapterId(value: String): Self = StObject.set(x, "networkAdapterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkItem(value: NetworkItem): Self = StObject.set(x, "networkItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundMaxBitsPerSecond(value: Double): Self = StObject.set(x, "outboundMaxBitsPerSecond", value.asInstanceOf[js.Any])
  }
}
