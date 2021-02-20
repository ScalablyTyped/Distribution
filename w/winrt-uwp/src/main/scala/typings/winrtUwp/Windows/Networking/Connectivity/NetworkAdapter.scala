package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a network adapter. */
@js.native
trait NetworkAdapter extends StObject {
  
  /**
    * Gets the connection profile currently associated with the network adapter.
    * @return The connection profile associated with this network adapter.
    */
  def getConnectedProfileAsync(): IPromiseWithIAsyncOperation[ConnectionProfile] = js.native
  
  /** Gets a value indicating the network interface type as defined by the Internet Assigned Names Authority (IANA) for the NetworkAdapter . */
  var ianaInterfaceType: Double = js.native
  
  /** Gets a value indicating the maximum inbound data transfer rate in bits per second. */
  var inboundMaxBitsPerSecond: Double = js.native
  
  /** Gets the network adapter ID. */
  var networkAdapterId: String = js.native
  
  /** Gets the NetworkItem object that represents the connected network. */
  var networkItem: NetworkItem = js.native
  
  /** Gets a value indicating the maximum outbound speed in bits per second. */
  var outboundMaxBitsPerSecond: Double = js.native
}
object NetworkAdapter {
  
  @scala.inline
  def apply(
    getConnectedProfileAsync: () => IPromiseWithIAsyncOperation[ConnectionProfile],
    ianaInterfaceType: Double,
    inboundMaxBitsPerSecond: Double,
    networkAdapterId: String,
    networkItem: NetworkItem,
    outboundMaxBitsPerSecond: Double
  ): NetworkAdapter = {
    val __obj = js.Dynamic.literal(getConnectedProfileAsync = js.Any.fromFunction0(getConnectedProfileAsync), ianaInterfaceType = ianaInterfaceType.asInstanceOf[js.Any], inboundMaxBitsPerSecond = inboundMaxBitsPerSecond.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], networkItem = networkItem.asInstanceOf[js.Any], outboundMaxBitsPerSecond = outboundMaxBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAdapter]
  }
  
  @scala.inline
  implicit class NetworkAdapterMutableBuilder[Self <: NetworkAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetConnectedProfileAsync(value: () => IPromiseWithIAsyncOperation[ConnectionProfile]): Self = StObject.set(x, "getConnectedProfileAsync", js.Any.fromFunction0(value))
    
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
