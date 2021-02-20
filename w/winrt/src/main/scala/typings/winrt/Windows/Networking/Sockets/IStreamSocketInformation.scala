package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamSocketInformation extends StObject {
  
  var bandwidthStatistics: BandwidthStatistics = js.native
  
  var localAddress: HostName = js.native
  
  var localPort: String = js.native
  
  var protectionLevel: SocketProtectionLevel = js.native
  
  var remoteAddress: HostName = js.native
  
  var remoteHostName: HostName = js.native
  
  var remotePort: String = js.native
  
  var remoteServiceName: String = js.native
  
  var roundTripTimeStatistics: RoundTripTimeStatistics = js.native
  
  var sessionKey: IBuffer = js.native
}
object IStreamSocketInformation {
  
  @scala.inline
  def apply(
    bandwidthStatistics: BandwidthStatistics,
    localAddress: HostName,
    localPort: String,
    protectionLevel: SocketProtectionLevel,
    remoteAddress: HostName,
    remoteHostName: HostName,
    remotePort: String,
    remoteServiceName: String,
    roundTripTimeStatistics: RoundTripTimeStatistics,
    sessionKey: IBuffer
  ): IStreamSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any], roundTripTimeStatistics = roundTripTimeStatistics.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketInformation]
  }
  
  @scala.inline
  implicit class IStreamSocketInformationMutableBuilder[Self <: IStreamSocketInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidthStatistics(value: BandwidthStatistics): Self = StObject.set(x, "bandwidthStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPort(value: String): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionLevel(value: SocketProtectionLevel): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAddress(value: HostName): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteHostName(value: HostName): Self = StObject.set(x, "remoteHostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePort(value: String): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundTripTimeStatistics(value: RoundTripTimeStatistics): Self = StObject.set(x, "roundTripTimeStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKey(value: IBuffer): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
  }
}
