package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostInfo extends ResponseEntry {
  
  var connectionBandwidthReceivedLastMinuteTotal: Double = js.native
  
  var connectionBandwidthReceivedLastSecondTotal: Double = js.native
  
  var connectionBandwidthSentLastMinuteTotal: Double = js.native
  
  var connectionBandwidthSentLastSecondTotal: Double = js.native
  
  var connectionBytesReceivedTotal: Double = js.native
  
  var connectionBytesSentTotal: Double = js.native
  
  var connectionFiletransferBandwidthReceived: Double = js.native
  
  var connectionFiletransferBandwidthSent: Double = js.native
  
  var connectionFiletransferBytesReceivedTotal: Double = js.native
  
  var connectionFiletransferBytesSentTotal: Double = js.native
  
  var connectionPacketsReceivedTotal: Double = js.native
  
  var connectionPacketsSentTotal: Double = js.native
  
  var hostTimestampUtc: Double = js.native
  
  var instanceUptime: Double = js.native
  
  var virtualserversRunningTotal: Double = js.native
  
  var virtualserversTotalChannelsOnline: Double = js.native
  
  var virtualserversTotalClientsOnline: Double = js.native
  
  var virtualserversTotalMaxclients: Double = js.native
}
object HostInfo {
  
  @scala.inline
  def apply(
    connectionBandwidthReceivedLastMinuteTotal: Double,
    connectionBandwidthReceivedLastSecondTotal: Double,
    connectionBandwidthSentLastMinuteTotal: Double,
    connectionBandwidthSentLastSecondTotal: Double,
    connectionBytesReceivedTotal: Double,
    connectionBytesSentTotal: Double,
    connectionFiletransferBandwidthReceived: Double,
    connectionFiletransferBandwidthSent: Double,
    connectionFiletransferBytesReceivedTotal: Double,
    connectionFiletransferBytesSentTotal: Double,
    connectionPacketsReceivedTotal: Double,
    connectionPacketsSentTotal: Double,
    hostTimestampUtc: Double,
    instanceUptime: Double,
    virtualserversRunningTotal: Double,
    virtualserversTotalChannelsOnline: Double,
    virtualserversTotalClientsOnline: Double,
    virtualserversTotalMaxclients: Double
  ): HostInfo = {
    val __obj = js.Dynamic.literal(connectionBandwidthReceivedLastMinuteTotal = connectionBandwidthReceivedLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthReceivedLastSecondTotal = connectionBandwidthReceivedLastSecondTotal.asInstanceOf[js.Any], connectionBandwidthSentLastMinuteTotal = connectionBandwidthSentLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthSentLastSecondTotal = connectionBandwidthSentLastSecondTotal.asInstanceOf[js.Any], connectionBytesReceivedTotal = connectionBytesReceivedTotal.asInstanceOf[js.Any], connectionBytesSentTotal = connectionBytesSentTotal.asInstanceOf[js.Any], connectionFiletransferBandwidthReceived = connectionFiletransferBandwidthReceived.asInstanceOf[js.Any], connectionFiletransferBandwidthSent = connectionFiletransferBandwidthSent.asInstanceOf[js.Any], connectionFiletransferBytesReceivedTotal = connectionFiletransferBytesReceivedTotal.asInstanceOf[js.Any], connectionFiletransferBytesSentTotal = connectionFiletransferBytesSentTotal.asInstanceOf[js.Any], connectionPacketsReceivedTotal = connectionPacketsReceivedTotal.asInstanceOf[js.Any], connectionPacketsSentTotal = connectionPacketsSentTotal.asInstanceOf[js.Any], hostTimestampUtc = hostTimestampUtc.asInstanceOf[js.Any], instanceUptime = instanceUptime.asInstanceOf[js.Any], virtualserversRunningTotal = virtualserversRunningTotal.asInstanceOf[js.Any], virtualserversTotalChannelsOnline = virtualserversTotalChannelsOnline.asInstanceOf[js.Any], virtualserversTotalClientsOnline = virtualserversTotalClientsOnline.asInstanceOf[js.Any], virtualserversTotalMaxclients = virtualserversTotalMaxclients.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostInfo]
  }
  
  @scala.inline
  implicit class HostInfoMutableBuilder[Self <: HostInfo] (val x: Self) extends AnyVal {
    
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
    def setConnectionFiletransferBandwidthReceived(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBandwidthSent(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBytesReceivedTotal(value: Double): Self = StObject.set(x, "connectionFiletransferBytesReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBytesSentTotal(value: Double): Self = StObject.set(x, "connectionFiletransferBytesSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsReceivedTotal(value: Double): Self = StObject.set(x, "connectionPacketsReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsSentTotal(value: Double): Self = StObject.set(x, "connectionPacketsSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostTimestampUtc(value: Double): Self = StObject.set(x, "hostTimestampUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUptime(value: Double): Self = StObject.set(x, "instanceUptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserversRunningTotal(value: Double): Self = StObject.set(x, "virtualserversRunningTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserversTotalChannelsOnline(value: Double): Self = StObject.set(x, "virtualserversTotalChannelsOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserversTotalClientsOnline(value: Double): Self = StObject.set(x, "virtualserversTotalClientsOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserversTotalMaxclients(value: Double): Self = StObject.set(x, "virtualserversTotalMaxclients", value.asInstanceOf[js.Any])
  }
}
