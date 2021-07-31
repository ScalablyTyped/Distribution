package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSocketInformation
  extends StObject
     with IStreamSocketInformation
object StreamSocketInformation {
  
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
  ): StreamSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any], roundTripTimeStatistics = roundTripTimeStatistics.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketInformation]
  }
}
