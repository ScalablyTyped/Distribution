package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INetworkAdapter extends js.Object {
  
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
  implicit class INetworkAdapterOps[Self <: INetworkAdapter] (val x: Self) extends AnyVal {
    
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
    def setGetConnectedProfileAsync(value: () => IAsyncOperation[ConnectionProfile]): Self = this.set("getConnectedProfileAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIanaInterfaceType(value: Double): Self = this.set("ianaInterfaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundMaxBitsPerSecond(value: Double): Self = this.set("inboundMaxBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAdapterId(value: String): Self = this.set("networkAdapterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkItem(value: NetworkItem): Self = this.set("networkItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundMaxBitsPerSecond(value: Double): Self = this.set("outboundMaxBitsPerSecond", value.asInstanceOf[js.Any])
  }
}
