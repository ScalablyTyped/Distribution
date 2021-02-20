package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerRequestConnectionInfo extends ResponseEntry {
  
  var connectionBandwidthReceivedLastMinuteTotal: Double = js.native
  
  var connectionBandwidthReceivedLastSecondTotal: Double = js.native
  
  var connectionBandwidthSentLastMinuteTotal: Double = js.native
  
  var connectionBandwidthSentLastSecondTotal: Double = js.native
  
  var connectionBytesReceivedTotal: Double = js.native
  
  var connectionBytesSentTotal: Double = js.native
  
  var connectionConnectedTime: Double = js.native
  
  var connectionFiletransferBandwidthReceived: Double = js.native
  
  var connectionFiletransferBandwidthSent: Double = js.native
  
  var connectionFiletransferBytesReceivedTotal: Double = js.native
  
  var connectionFiletransferBytesSentTotal: Double = js.native
  
  var connectionPacketlossTotal: Double = js.native
  
  var connectionPacketsReceivedTotal: Double = js.native
  
  var connectionPacketsSentTotal: Double = js.native
  
  var connectionPing: Double = js.native
}
object ServerRequestConnectionInfo {
  
  @scala.inline
  def apply(
    connectionBandwidthReceivedLastMinuteTotal: Double,
    connectionBandwidthReceivedLastSecondTotal: Double,
    connectionBandwidthSentLastMinuteTotal: Double,
    connectionBandwidthSentLastSecondTotal: Double,
    connectionBytesReceivedTotal: Double,
    connectionBytesSentTotal: Double,
    connectionConnectedTime: Double,
    connectionFiletransferBandwidthReceived: Double,
    connectionFiletransferBandwidthSent: Double,
    connectionFiletransferBytesReceivedTotal: Double,
    connectionFiletransferBytesSentTotal: Double,
    connectionPacketlossTotal: Double,
    connectionPacketsReceivedTotal: Double,
    connectionPacketsSentTotal: Double,
    connectionPing: Double
  ): ServerRequestConnectionInfo = {
    val __obj = js.Dynamic.literal(connectionBandwidthReceivedLastMinuteTotal = connectionBandwidthReceivedLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthReceivedLastSecondTotal = connectionBandwidthReceivedLastSecondTotal.asInstanceOf[js.Any], connectionBandwidthSentLastMinuteTotal = connectionBandwidthSentLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthSentLastSecondTotal = connectionBandwidthSentLastSecondTotal.asInstanceOf[js.Any], connectionBytesReceivedTotal = connectionBytesReceivedTotal.asInstanceOf[js.Any], connectionBytesSentTotal = connectionBytesSentTotal.asInstanceOf[js.Any], connectionConnectedTime = connectionConnectedTime.asInstanceOf[js.Any], connectionFiletransferBandwidthReceived = connectionFiletransferBandwidthReceived.asInstanceOf[js.Any], connectionFiletransferBandwidthSent = connectionFiletransferBandwidthSent.asInstanceOf[js.Any], connectionFiletransferBytesReceivedTotal = connectionFiletransferBytesReceivedTotal.asInstanceOf[js.Any], connectionFiletransferBytesSentTotal = connectionFiletransferBytesSentTotal.asInstanceOf[js.Any], connectionPacketlossTotal = connectionPacketlossTotal.asInstanceOf[js.Any], connectionPacketsReceivedTotal = connectionPacketsReceivedTotal.asInstanceOf[js.Any], connectionPacketsSentTotal = connectionPacketsSentTotal.asInstanceOf[js.Any], connectionPing = connectionPing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRequestConnectionInfo]
  }
  
  @scala.inline
  implicit class ServerRequestConnectionInfoMutableBuilder[Self <: ServerRequestConnectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionBandwidthReceivedLastMinuteTotal(value: Double): Self = StObject.set(x, "connectionBandwidthReceivedLastMinuteTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthReceivedLastSecondTotal(value: Double): Self = StObject.set(x, "connectionBandwidthReceivedLastSecondTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthSentLastMinuteTotal(value: Double): Self = StObject.set(x, "connectionBandwidthSentLastMinuteTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthSentLastSecondTotal(value: Double): Self = StObject.set(x, "connectionBandwidthSentLastSecondTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesReceivedTotal(value: Double): Self = StObject.set(x, "connectionBytesReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesSentTotal(value: Double): Self = StObject.set(x, "connectionBytesSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionConnectedTime(value: Double): Self = StObject.set(x, "connectionConnectedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBandwidthReceived(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBandwidthSent(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBytesReceivedTotal(value: Double): Self = StObject.set(x, "connectionFiletransferBytesReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBytesSentTotal(value: Double): Self = StObject.set(x, "connectionFiletransferBytesSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketlossTotal(value: Double): Self = StObject.set(x, "connectionPacketlossTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsReceivedTotal(value: Double): Self = StObject.set(x, "connectionPacketsReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsSentTotal(value: Double): Self = StObject.set(x, "connectionPacketsSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPing(value: Double): Self = StObject.set(x, "connectionPing", value.asInstanceOf[js.Any])
  }
}
