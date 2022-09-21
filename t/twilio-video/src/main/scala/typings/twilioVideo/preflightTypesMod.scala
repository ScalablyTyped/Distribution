package typings.twilioVideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preflightTypesMod {
  
  trait NetworkTiming extends StObject {
    
    var connect: js.UndefOr[TimeMeasurement] = js.undefined
    
    var dtls: js.UndefOr[TimeMeasurement] = js.undefined
    
    var ice: js.UndefOr[TimeMeasurement] = js.undefined
    
    var media: js.UndefOr[TimeMeasurement] = js.undefined
    
    var peerConnection: js.UndefOr[TimeMeasurement] = js.undefined
  }
  object NetworkTiming {
    
    inline def apply(): NetworkTiming = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkTiming]
    }
    
    extension [Self <: NetworkTiming](x: Self) {
      
      inline def setConnect(value: TimeMeasurement): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setDtls(value: TimeMeasurement): Self = StObject.set(x, "dtls", value.asInstanceOf[js.Any])
      
      inline def setDtlsUndefined: Self = StObject.set(x, "dtls", js.undefined)
      
      inline def setIce(value: TimeMeasurement): Self = StObject.set(x, "ice", value.asInstanceOf[js.Any])
      
      inline def setIceUndefined: Self = StObject.set(x, "ice", js.undefined)
      
      inline def setMedia(value: TimeMeasurement): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setPeerConnection(value: TimeMeasurement): Self = StObject.set(x, "peerConnection", value.asInstanceOf[js.Any])
      
      inline def setPeerConnectionUndefined: Self = StObject.set(x, "peerConnection", js.undefined)
    }
  }
  
  trait PreflightOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
  }
  object PreflightOptions {
    
    inline def apply(): PreflightOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreflightOptions]
    }
    
    extension [Self <: PreflightOptions](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  trait PreflightReportStats extends StObject {
    
    var jitter: Stats | Null
    
    var packetLoss: Stats | Null
    
    var rtt: Stats | Null
  }
  object PreflightReportStats {
    
    inline def apply(): PreflightReportStats = {
      val __obj = js.Dynamic.literal(jitter = null, packetLoss = null, rtt = null)
      __obj.asInstanceOf[PreflightReportStats]
    }
    
    extension [Self <: PreflightReportStats](x: Self) {
      
      inline def setJitter(value: Stats): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      inline def setJitterNull: Self = StObject.set(x, "jitter", null)
      
      inline def setPacketLoss(value: Stats): Self = StObject.set(x, "packetLoss", value.asInstanceOf[js.Any])
      
      inline def setPacketLossNull: Self = StObject.set(x, "packetLoss", null)
      
      inline def setRtt(value: Stats): Self = StObject.set(x, "rtt", value.asInstanceOf[js.Any])
      
      inline def setRttNull: Self = StObject.set(x, "rtt", null)
    }
  }
  
  trait PreflightTestReport extends StObject {
    
    var iceCandidateStats: js.Array[RTCIceCandidateStats]
    
    var networkTiming: NetworkTiming
    
    var progressEvents: js.Array[ProgressEvent]
    
    var selectedIceCandidatePairStats: SelectedIceCandidatePairStats | Null
    
    var stats: PreflightReportStats
    
    var testTiming: TimeMeasurement
  }
  object PreflightTestReport {
    
    inline def apply(
      iceCandidateStats: js.Array[RTCIceCandidateStats],
      networkTiming: NetworkTiming,
      progressEvents: js.Array[ProgressEvent],
      stats: PreflightReportStats,
      testTiming: TimeMeasurement
    ): PreflightTestReport = {
      val __obj = js.Dynamic.literal(iceCandidateStats = iceCandidateStats.asInstanceOf[js.Any], networkTiming = networkTiming.asInstanceOf[js.Any], progressEvents = progressEvents.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], testTiming = testTiming.asInstanceOf[js.Any], selectedIceCandidatePairStats = null)
      __obj.asInstanceOf[PreflightTestReport]
    }
    
    extension [Self <: PreflightTestReport](x: Self) {
      
      inline def setIceCandidateStats(value: js.Array[RTCIceCandidateStats]): Self = StObject.set(x, "iceCandidateStats", value.asInstanceOf[js.Any])
      
      inline def setIceCandidateStatsVarargs(value: RTCIceCandidateStats*): Self = StObject.set(x, "iceCandidateStats", js.Array(value*))
      
      inline def setNetworkTiming(value: NetworkTiming): Self = StObject.set(x, "networkTiming", value.asInstanceOf[js.Any])
      
      inline def setProgressEvents(value: js.Array[ProgressEvent]): Self = StObject.set(x, "progressEvents", value.asInstanceOf[js.Any])
      
      inline def setProgressEventsVarargs(value: ProgressEvent*): Self = StObject.set(x, "progressEvents", js.Array(value*))
      
      inline def setSelectedIceCandidatePairStats(value: SelectedIceCandidatePairStats): Self = StObject.set(x, "selectedIceCandidatePairStats", value.asInstanceOf[js.Any])
      
      inline def setSelectedIceCandidatePairStatsNull: Self = StObject.set(x, "selectedIceCandidatePairStats", null)
      
      inline def setStats(value: PreflightReportStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setTestTiming(value: TimeMeasurement): Self = StObject.set(x, "testTiming", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProgressEvent extends StObject {
    
    var duration: Double
    
    var name: String
  }
  object ProgressEvent {
    
    inline def apply(duration: Double, name: String): ProgressEvent = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressEvent]
    }
    
    extension [Self <: ProgressEvent](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RTCIceCandidateStats extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var candidateType: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var relayProtocol: js.UndefOr[String] = js.undefined
    
    var transportId: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object RTCIceCandidateStats {
    
    inline def apply(): RTCIceCandidateStats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RTCIceCandidateStats]
    }
    
    extension [Self <: RTCIceCandidateStats](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setCandidateType(value: String): Self = StObject.set(x, "candidateType", value.asInstanceOf[js.Any])
      
      inline def setCandidateTypeUndefined: Self = StObject.set(x, "candidateType", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRelayProtocol(value: String): Self = StObject.set(x, "relayProtocol", value.asInstanceOf[js.Any])
      
      inline def setRelayProtocolUndefined: Self = StObject.set(x, "relayProtocol", js.undefined)
      
      inline def setTransportId(value: String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
      
      inline def setTransportIdUndefined: Self = StObject.set(x, "transportId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait SelectedIceCandidatePairStats extends StObject {
    
    var localCandidate: RTCIceCandidateStats
    
    var remoteCandidate: RTCIceCandidateStats
  }
  object SelectedIceCandidatePairStats {
    
    inline def apply(localCandidate: RTCIceCandidateStats, remoteCandidate: RTCIceCandidateStats): SelectedIceCandidatePairStats = {
      val __obj = js.Dynamic.literal(localCandidate = localCandidate.asInstanceOf[js.Any], remoteCandidate = remoteCandidate.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectedIceCandidatePairStats]
    }
    
    extension [Self <: SelectedIceCandidatePairStats](x: Self) {
      
      inline def setLocalCandidate(value: RTCIceCandidateStats): Self = StObject.set(x, "localCandidate", value.asInstanceOf[js.Any])
      
      inline def setRemoteCandidate(value: RTCIceCandidateStats): Self = StObject.set(x, "remoteCandidate", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stats extends StObject {
    
    var average: Double
    
    var max: Double
    
    var min: Double
  }
  object Stats {
    
    inline def apply(average: Double, max: Double, min: Double): Stats = {
      val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeMeasurement extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var start: Double
  }
  object TimeMeasurement {
    
    inline def apply(start: Double): TimeMeasurement = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeMeasurement]
    }
    
    extension [Self <: TimeMeasurement](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
