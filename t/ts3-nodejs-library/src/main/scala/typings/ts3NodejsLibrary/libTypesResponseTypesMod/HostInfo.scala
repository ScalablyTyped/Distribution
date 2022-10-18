package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostInfo
  extends StObject
     with ResponseEntry {
  
  var connectionBandwidthReceivedLastMinuteTotal: Double
  
  var connectionBandwidthReceivedLastSecondTotal: Double
  
  var connectionBandwidthSentLastMinuteTotal: Double
  
  var connectionBandwidthSentLastSecondTotal: Double
  
  var connectionBytesReceivedTotal: Double
  
  var connectionBytesSentTotal: Double
  
  var connectionFiletransferBandwidthReceived: Double
  
  var connectionFiletransferBandwidthSent: Double
  
  var connectionFiletransferBytesReceivedTotal: Double
  
  var connectionFiletransferBytesSentTotal: Double
  
  var connectionPacketsReceivedTotal: Double
  
  var connectionPacketsSentTotal: Double
  
  var hostTimestampUtc: Double
  
  var instanceUptime: Double
  
  var virtualserversRunningTotal: Double
  
  var virtualserversTotalChannelsOnline: Double
  
  var virtualserversTotalClientsOnline: Double
  
  var virtualserversTotalMaxclients: Double
}
object HostInfo {
  
  inline def apply(
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
  
  extension [Self <: HostInfo](x: Self) {
    
    inline def setConnectionBandwidthReceivedLastMinuteTotal(value: Double): Self = StObject.set(x, "connectionBandwidthReceivedLastMinuteTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionBandwidthReceivedLastSecondTotal(value: Double): Self = StObject.set(x, "connectionBandwidthReceivedLastSecondTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionBandwidthSentLastMinuteTotal(value: Double): Self = StObject.set(x, "connectionBandwidthSentLastMinuteTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionBandwidthSentLastSecondTotal(value: Double): Self = StObject.set(x, "connectionBandwidthSentLastSecondTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionBytesReceivedTotal(value: Double): Self = StObject.set(x, "connectionBytesReceivedTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionBytesSentTotal(value: Double): Self = StObject.set(x, "connectionBytesSentTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionFiletransferBandwidthReceived(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthReceived", value.asInstanceOf[js.Any])
    
    inline def setConnectionFiletransferBandwidthSent(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthSent", value.asInstanceOf[js.Any])
    
    inline def setConnectionFiletransferBytesReceivedTotal(value: Double): Self = StObject.set(x, "connectionFiletransferBytesReceivedTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionFiletransferBytesSentTotal(value: Double): Self = StObject.set(x, "connectionFiletransferBytesSentTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionPacketsReceivedTotal(value: Double): Self = StObject.set(x, "connectionPacketsReceivedTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionPacketsSentTotal(value: Double): Self = StObject.set(x, "connectionPacketsSentTotal", value.asInstanceOf[js.Any])
    
    inline def setHostTimestampUtc(value: Double): Self = StObject.set(x, "hostTimestampUtc", value.asInstanceOf[js.Any])
    
    inline def setInstanceUptime(value: Double): Self = StObject.set(x, "instanceUptime", value.asInstanceOf[js.Any])
    
    inline def setVirtualserversRunningTotal(value: Double): Self = StObject.set(x, "virtualserversRunningTotal", value.asInstanceOf[js.Any])
    
    inline def setVirtualserversTotalChannelsOnline(value: Double): Self = StObject.set(x, "virtualserversTotalChannelsOnline", value.asInstanceOf[js.Any])
    
    inline def setVirtualserversTotalClientsOnline(value: Double): Self = StObject.set(x, "virtualserversTotalClientsOnline", value.asInstanceOf[js.Any])
    
    inline def setVirtualserversTotalMaxclients(value: Double): Self = StObject.set(x, "virtualserversTotalMaxclients", value.asInstanceOf[js.Any])
  }
}
