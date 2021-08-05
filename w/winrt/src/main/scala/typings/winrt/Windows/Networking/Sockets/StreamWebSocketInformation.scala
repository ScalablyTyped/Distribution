package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamWebSocketInformation
  extends StObject
     with IWebSocketInformation
object StreamWebSocketInformation {
  
  inline def apply(bandwidthStatistics: BandwidthStatistics, localAddress: HostName, protocol: String): StreamWebSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamWebSocketInformation]
  }
}
