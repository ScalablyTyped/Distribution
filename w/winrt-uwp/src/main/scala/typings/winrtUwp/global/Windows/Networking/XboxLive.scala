package typings.winrtUwp.global.Windows.Networking

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
object XboxLive {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress")
  @js.native
  abstract class XboxLiveDeviceAddress ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress
  object XboxLiveDeviceAddress {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param base64 This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.createFromSnapshotBase64")
    @js.native
    def createFromSnapshotBase64(base64: String): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.createFromSnapshotBuffer")
    @js.native
    def createFromSnapshotBuffer(buffer: IBuffer): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.createFromSnapshotBytes")
    @js.native
    def createFromSnapshotBytes(buffer: js.Array[Double]): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.getLocal")
    @js.native
    def getLocal(): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.maxSnapshotBytesSize")
    @js.native
    def maxSnapshotBytesSize: Double = js.native
    @scala.inline
    def maxSnapshotBytesSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSnapshotBytesSize")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair")
  @js.native
  abstract class XboxLiveEndpointPair ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair
  object XboxLiveEndpointPair {
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remoteHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remotePort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair.findEndpointPairByHostNamesAndPorts")
    @js.native
    def findEndpointPairByHostNamesAndPorts(
      localHostName: typings.winrtUwp.Windows.Networking.HostName,
      localPort: String,
      remoteHostName: typings.winrtUwp.Windows.Networking.HostName,
      remotePort: String
    ): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localSocketAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remoteSocketAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair.findEndpointPairBySocketAddressBytes")
    @js.native
    def findEndpointPairBySocketAddressBytes(localSocketAddress: js.Array[Double], remoteSocketAddress: js.Array[Double]): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors")
  @js.native
  object XboxLiveEndpointPairCreationBehaviors extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors with Double
      ] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.none with Double = js.native
    
    /* 1 */ val reevaluatePath: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.reevaluatePath with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult")
  @js.native
  abstract class XboxLiveEndpointPairCreationResult ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus")
  @js.native
  object XboxLiveEndpointPairCreationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus with Double
      ] = js.native
    
    /* 4 */ val canceled: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.canceled with Double = js.native
    
    /* 3 */ val localSystemNotAuthorized: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.localSystemNotAuthorized with Double = js.native
    
    /* 2 */ val noCompatibleNetworkPaths: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noCompatibleNetworkPaths with Double = js.native
    
    /* 1 */ val noLocalNetworks: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noLocalNetworks with Double = js.native
    
    /* 7 */ val refusedDueToConfiguration: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.refusedDueToConfiguration with Double = js.native
    
    /* 6 */ val remoteSystemNotAuthorized: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.remoteSystemNotAuthorized with Double = js.native
    
    /* 0 */ val succeeded: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.succeeded with Double = js.native
    
    /* 5 */ val timedOut: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.timedOut with Double = js.native
    
    /* 8 */ val unexpectedInternalError: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.unexpectedInternalError with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairState")
  @js.native
  object XboxLiveEndpointPairState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState with Double
      ] = js.native
    
    /* 2 */ val creatingInbound: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingInbound with Double = js.native
    
    /* 1 */ val creatingOutbound: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingOutbound with Double = js.native
    
    /* 6 */ val deleted: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deleted with Double = js.native
    
    /* 4 */ val deletingLocally: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deletingLocally with Double = js.native
    
    /* 0 */ val invalid: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.invalid with Double = js.native
    
    /* 3 */ val ready: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.ready with Double = js.native
    
    /* 5 */ val remoteEndpointTerminating: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.remoteEndpointTerminating with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs")
  @js.native
  abstract class XboxLiveEndpointPairStateChangedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
  @js.native
  abstract class XboxLiveEndpointPairTemplate ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate
  object XboxLiveEndpointPairTemplate {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param name This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate.getTemplateByName")
    @js.native
    def getTemplateByName(name: String): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate.templates")
    @js.native
    def templates: IVectorView[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate] = js.native
    @scala.inline
    def templates_=(x: IVectorView[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templates")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs")
  @js.native
  abstract class XboxLiveInboundEndpointPairCreatedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveNetworkAccessKind")
  @js.native
  object XboxLiveNetworkAccessKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind with Double
      ] = js.native
    
    /* 1 */ val moderate: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.moderate with Double = js.native
    
    /* 0 */ val open: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.open with Double = js.native
    
    /* 2 */ val strict: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.strict with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement")
  @js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  class XboxLiveQualityOfServiceMeasurement ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement
  object XboxLiveQualityOfServiceMeasurement {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement")
    @js.native
    val ^ : js.Any = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.clearPrivatePayload")
    @js.native
    def clearPrivatePayload(): Unit = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.isSystemInboundBandwidthConstrained")
    @js.native
    def isSystemInboundBandwidthConstrained: Boolean = js.native
    @scala.inline
    def isSystemInboundBandwidthConstrained_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSystemInboundBandwidthConstrained")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.isSystemOutboundBandwidthConstrained")
    @js.native
    def isSystemOutboundBandwidthConstrained: Boolean = js.native
    @scala.inline
    def isSystemOutboundBandwidthConstrained_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSystemOutboundBandwidthConstrained")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.maxPrivatePayloadSize")
    @js.native
    def maxPrivatePayloadSize: Double = js.native
    @scala.inline
    def maxPrivatePayloadSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxPrivatePayloadSize")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.maxSimultaneousProbeConnections")
    @js.native
    def maxSimultaneousProbeConnections: Double = js.native
    @scala.inline
    def maxSimultaneousProbeConnections_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSimultaneousProbeConnections")(x.asInstanceOf[js.Any])
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param payload This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.publishPrivatePayloadBytes")
    @js.native
    def publishPrivatePayloadBytes(payload: js.Array[Double]): Unit = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.publishedPrivatePayload")
    @js.native
    def publishedPrivatePayload: IBuffer = js.native
    @scala.inline
    def publishedPrivatePayload_=(x: IBuffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("publishedPrivatePayload")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus")
  @js.native
  object XboxLiveQualityOfServiceMeasurementStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus with Double
      ] = js.native
    
    /* 7 */ val canceled: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.canceled with Double = js.native
    
    /* 1 */ val inProgress: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.inProgress with Double = js.native
    
    /* 2 */ val inProgressWithProvisionalResults: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.inProgressWithProvisionalResults with Double = js.native
    
    /* 6 */ val localSystemNotAuthorized: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.localSystemNotAuthorized with Double = js.native
    
    /* 5 */ val noCompatibleNetworkPaths: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.noCompatibleNetworkPaths with Double = js.native
    
    /* 4 */ val noLocalNetworks: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.noLocalNetworks with Double = js.native
    
    /* 0 */ val notStarted: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.notStarted with Double = js.native
    
    /* 10 */ val refusedDueToConfiguration: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.refusedDueToConfiguration with Double = js.native
    
    /* 9 */ val remoteSystemNotAuthorized: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.remoteSystemNotAuthorized with Double = js.native
    
    /* 3 */ val succeeded: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.succeeded with Double = js.native
    
    /* 8 */ val timedOut: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.timedOut with Double = js.native
    
    /* 11 */ val unexpectedInternalError: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.unexpectedInternalError with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric")
  @js.native
  object XboxLiveQualityOfServiceMetric extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric with Double
      ] = js.native
    
    /* 6 */ val averageInboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageInboundBitsPerSecond with Double = js.native
    
    /* 0 */ val averageLatencyInMilliseconds: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageLatencyInMilliseconds with Double = js.native
    
    /* 3 */ val averageOutboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageOutboundBitsPerSecond with Double = js.native
    
    /* 8 */ val maxInboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxInboundBitsPerSecond with Double = js.native
    
    /* 2 */ val maxLatencyInMilliseconds: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxLatencyInMilliseconds with Double = js.native
    
    /* 5 */ val maxOutboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxOutboundBitsPerSecond with Double = js.native
    
    /* 7 */ val minInboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minInboundBitsPerSecond with Double = js.native
    
    /* 1 */ val minLatencyInMilliseconds: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minLatencyInMilliseconds with Double = js.native
    
    /* 4 */ val minOutboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minOutboundBitsPerSecond with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult")
  @js.native
  abstract class XboxLiveQualityOfServiceMetricResult ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult")
  @js.native
  abstract class XboxLiveQualityOfServicePrivatePayloadResult ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveSocketKind")
  @js.native
  object XboxLiveSocketKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind with Double] = js.native
    
    /* 1 */ val datagram: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.datagram with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.none with Double = js.native
    
    /* 2 */ val stream: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.stream with Double = js.native
  }
}
