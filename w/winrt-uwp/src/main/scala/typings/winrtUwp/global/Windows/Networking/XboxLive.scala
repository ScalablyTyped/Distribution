package typings.winrtUwp.global.Windows.Networking

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive")
@js.native
object XboxLive extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveDeviceAddress ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveEndpointPair ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveEndpointPairCreationResult ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveEndpointPairStateChangedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveEndpointPairTemplate ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveInboundEndpointPairCreatedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  class XboxLiveQualityOfServiceMeasurement ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveQualityOfServiceMetricResult ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveQualityOfServicePrivatePayloadResult ()
    extends typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult
  
  /* static members */
  @js.native
  object XboxLiveDeviceAddress extends js.Object {
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var maxSnapshotBytesSize: Double = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param base64 This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def createFromSnapshotBase64(base64: String): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def createFromSnapshotBuffer(buffer: IBuffer): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def createFromSnapshotBytes(buffer: js.Array[Double]): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def getLocal(): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
  }
  
  /* static members */
  @js.native
  object XboxLiveEndpointPair extends js.Object {
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remoteHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remotePort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
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
    def findEndpointPairBySocketAddressBytes(localSocketAddress: js.Array[Double], remoteSocketAddress: js.Array[Double]): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveEndpointPairCreationBehaviors extends js.Object {
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.none with Double = js.native
    /* 1 */ val reevaluatePath: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.reevaluatePath with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors with Double
      ] = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveEndpointPairCreationStatus extends js.Object {
    /* 4 */ val canceled: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.canceled with Double = js.native
    /* 3 */ val localSystemNotAuthorized: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.localSystemNotAuthorized with Double = js.native
    /* 2 */ val noCompatibleNetworkPaths: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noCompatibleNetworkPaths with Double = js.native
    /* 1 */ val noLocalNetworks: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noLocalNetworks with Double = js.native
    /* 7 */ val refusedDueToConfiguration: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.refusedDueToConfiguration with Double = js.native
    /* 6 */ val remoteSystemNotAuthorized: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.remoteSystemNotAuthorized with Double = js.native
    /* 0 */ val succeeded: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.succeeded with Double = js.native
    /* 5 */ val timedOut: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.timedOut with Double = js.native
    /* 8 */ val unexpectedInternalError: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.unexpectedInternalError with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus with Double
      ] = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveEndpointPairState extends js.Object {
    /* 2 */ val creatingInbound: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingInbound with Double = js.native
    /* 1 */ val creatingOutbound: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingOutbound with Double = js.native
    /* 6 */ val deleted: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deleted with Double = js.native
    /* 4 */ val deletingLocally: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deletingLocally with Double = js.native
    /* 0 */ val invalid: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.invalid with Double = js.native
    /* 3 */ val ready: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.ready with Double = js.native
    /* 5 */ val remoteEndpointTerminating: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.remoteEndpointTerminating with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object XboxLiveEndpointPairTemplate extends js.Object {
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var templates: IVectorView[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate] = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param name This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def getTemplateByName(name: String): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveNetworkAccessKind extends js.Object {
    /* 1 */ val moderate: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.moderate with Double = js.native
    /* 0 */ val open: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.open with Double = js.native
    /* 2 */ val strict: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.strict with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object XboxLiveQualityOfServiceMeasurement extends js.Object {
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var isSystemInboundBandwidthConstrained: Boolean = js.native
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var isSystemOutboundBandwidthConstrained: Boolean = js.native
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var maxPrivatePayloadSize: Double = js.native
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var maxSimultaneousProbeConnections: Double = js.native
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var publishedPrivatePayload: IBuffer = js.native
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    def clearPrivatePayload(): Unit = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param payload This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def publishPrivatePayloadBytes(payload: js.Array[Double]): Unit = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveQualityOfServiceMeasurementStatus extends js.Object {
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
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus with Double
      ] = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveQualityOfServiceMetric extends js.Object {
    /* 6 */ val averageInboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageInboundBitsPerSecond with Double = js.native
    /* 0 */ val averageLatencyInMilliseconds: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageLatencyInMilliseconds with Double = js.native
    /* 3 */ val averageOutboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageOutboundBitsPerSecond with Double = js.native
    /* 8 */ val maxInboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxInboundBitsPerSecond with Double = js.native
    /* 2 */ val maxLatencyInMilliseconds: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxLatencyInMilliseconds with Double = js.native
    /* 5 */ val maxOutboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxOutboundBitsPerSecond with Double = js.native
    /* 7 */ val minInboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minInboundBitsPerSecond with Double = js.native
    /* 1 */ val minLatencyInMilliseconds: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minLatencyInMilliseconds with Double = js.native
    /* 4 */ val minOutboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minOutboundBitsPerSecond with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric with Double
      ] = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveSocketKind extends js.Object {
    /* 1 */ val datagram: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.datagram with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.none with Double = js.native
    /* 2 */ val stream: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.stream with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind with Double] = js.native
  }
  
}

