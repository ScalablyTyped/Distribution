package typings.winrtUwp.global.Windows.Networking

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus
import typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState
import typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus
import typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
object XboxLive {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress")
  @js.native
  abstract class XboxLiveDeviceAddress ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress
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
    inline def createFromSnapshotBase64(base64: String): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromSnapshotBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress]
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def createFromSnapshotBuffer(buffer: IBuffer): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromSnapshotBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress]
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def createFromSnapshotBytes(buffer: js.Array[Double]): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromSnapshotBytes")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress]
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def getLocal(): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocal")().asInstanceOf[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress]
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.maxSnapshotBytesSize")
    @js.native
    def maxSnapshotBytesSize: Double = js.native
    inline def maxSnapshotBytesSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSnapshotBytesSize")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair")
  @js.native
  abstract class XboxLiveEndpointPair ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair
  object XboxLiveEndpointPair {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remoteHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remotePort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def findEndpointPairByHostNamesAndPorts(
      localHostName: typings.winrtUwp.Windows.Networking.HostName,
      localPort: String,
      remoteHostName: typings.winrtUwp.Windows.Networking.HostName,
      remotePort: String
    ): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = (^.asInstanceOf[js.Dynamic].applyDynamic("findEndpointPairByHostNamesAndPorts")(localHostName.asInstanceOf[js.Any], localPort.asInstanceOf[js.Any], remoteHostName.asInstanceOf[js.Any], remotePort.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair]
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localSocketAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remoteSocketAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def findEndpointPairBySocketAddressBytes(localSocketAddress: js.Array[Double], remoteSocketAddress: js.Array[Double]): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = (^.asInstanceOf[js.Dynamic].applyDynamic("findEndpointPairBySocketAddressBytes")(localSocketAddress.asInstanceOf[js.Any], remoteSocketAddress.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair]
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors")
  @js.native
  object XboxLiveEndpointPairCreationBehaviors extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors & Double
      ] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.none & Double = js.native
    
    /* 1 */ val reevaluatePath: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.reevaluatePath & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult")
  @js.native
  abstract class XboxLiveEndpointPairCreationResult ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var deviceAddress: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var endpointPair: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var isExistingPathEvaluation: Boolean = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var status: XboxLiveEndpointPairCreationStatus = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus")
  @js.native
  object XboxLiveEndpointPairCreationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus & Double
      ] = js.native
    
    /* 4 */ val canceled: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.canceled & Double = js.native
    
    /* 3 */ val localSystemNotAuthorized: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.localSystemNotAuthorized & Double = js.native
    
    /* 2 */ val noCompatibleNetworkPaths: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noCompatibleNetworkPaths & Double = js.native
    
    /* 1 */ val noLocalNetworks: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noLocalNetworks & Double = js.native
    
    /* 7 */ val refusedDueToConfiguration: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.refusedDueToConfiguration & Double = js.native
    
    /* 6 */ val remoteSystemNotAuthorized: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.remoteSystemNotAuthorized & Double = js.native
    
    /* 0 */ val succeeded: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.succeeded & Double = js.native
    
    /* 5 */ val timedOut: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.timedOut & Double = js.native
    
    /* 8 */ val unexpectedInternalError: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.unexpectedInternalError & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairState")
  @js.native
  object XboxLiveEndpointPairState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState & Double] = js.native
    
    /* 2 */ val creatingInbound: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingInbound & Double = js.native
    
    /* 1 */ val creatingOutbound: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingOutbound & Double = js.native
    
    /* 6 */ val deleted: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deleted & Double = js.native
    
    /* 4 */ val deletingLocally: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deletingLocally & Double = js.native
    
    /* 0 */ val invalid: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.invalid & Double = js.native
    
    /* 3 */ val ready: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.ready & Double = js.native
    
    /* 5 */ val remoteEndpointTerminating: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.remoteEndpointTerminating & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs")
  @js.native
  abstract class XboxLiveEndpointPairStateChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var newState: XboxLiveEndpointPairState = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var oldState: XboxLiveEndpointPairState = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
  @js.native
  abstract class XboxLiveEndpointPairTemplate ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate
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
    inline def getTemplateByName(name: String): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateByName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate]
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate.templates")
    @js.native
    def templates: IVectorView[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate] = js.native
    inline def templates_=(x: IVectorView[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templates")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs")
  @js.native
  abstract class XboxLiveInboundEndpointPairCreatedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var endpointPair: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveNetworkAccessKind")
  @js.native
  object XboxLiveNetworkAccessKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind & Double] = js.native
    
    /* 1 */ val moderate: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.moderate & Double = js.native
    
    /* 0 */ val open: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.open & Double = js.native
    
    /* 2 */ val strict: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.strict & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement")
  @js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  open class XboxLiveQualityOfServiceMeasurement ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var deviceAddresses: IVector[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress] = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* CompleteClass */
    override def getMetricResult(
      deviceAddress: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress,
      metric: XboxLiveQualityOfServiceMetric
    ): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* CompleteClass */
    override def getMetricResultsForDevice(deviceAddress: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress): IVectorView[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult
      ] = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* CompleteClass */
    override def getMetricResultsForMetric(metric: XboxLiveQualityOfServiceMetric): IVectorView[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult
      ] = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* CompleteClass */
    override def getPrivatePayloadResult(deviceAddress: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress): typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* CompleteClass */
    override def measureAsync(): IPromiseWithIAsyncAction = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var metricResults: IVectorView[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult
      ] = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var metrics: IVector[XboxLiveQualityOfServiceMetric] = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var numberOfProbesToAttempt: Double = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var numberOfResultsPending: Double = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var privatePayloadResults: IVectorView[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult
      ] = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var shouldRequestPrivatePayloads: Boolean = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var timeoutInMilliseconds: Double = js.native
  }
  object XboxLiveQualityOfServiceMeasurement {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement")
    @js.native
    val ^ : js.Any = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    inline def clearPrivatePayload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPrivatePayload")().asInstanceOf[Unit]
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.isSystemInboundBandwidthConstrained")
    @js.native
    def isSystemInboundBandwidthConstrained: Boolean = js.native
    inline def isSystemInboundBandwidthConstrained_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSystemInboundBandwidthConstrained")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.isSystemOutboundBandwidthConstrained")
    @js.native
    def isSystemOutboundBandwidthConstrained: Boolean = js.native
    inline def isSystemOutboundBandwidthConstrained_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSystemOutboundBandwidthConstrained")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.maxPrivatePayloadSize")
    @js.native
    def maxPrivatePayloadSize: Double = js.native
    inline def maxPrivatePayloadSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxPrivatePayloadSize")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.maxSimultaneousProbeConnections")
    @js.native
    def maxSimultaneousProbeConnections: Double = js.native
    inline def maxSimultaneousProbeConnections_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSimultaneousProbeConnections")(x.asInstanceOf[js.Any])
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param payload This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    inline def publishPrivatePayloadBytes(payload: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("publishPrivatePayloadBytes")(payload.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.publishedPrivatePayload")
    @js.native
    def publishedPrivatePayload: IBuffer = js.native
    inline def publishedPrivatePayload_=(x: IBuffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("publishedPrivatePayload")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus")
  @js.native
  object XboxLiveQualityOfServiceMeasurementStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus & Double
      ] = js.native
    
    /* 7 */ val canceled: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.canceled & Double = js.native
    
    /* 1 */ val inProgress: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.inProgress & Double = js.native
    
    /* 2 */ val inProgressWithProvisionalResults: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.inProgressWithProvisionalResults & Double = js.native
    
    /* 6 */ val localSystemNotAuthorized: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.localSystemNotAuthorized & Double = js.native
    
    /* 5 */ val noCompatibleNetworkPaths: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.noCompatibleNetworkPaths & Double = js.native
    
    /* 4 */ val noLocalNetworks: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.noLocalNetworks & Double = js.native
    
    /* 0 */ val notStarted: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.notStarted & Double = js.native
    
    /* 10 */ val refusedDueToConfiguration: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.refusedDueToConfiguration & Double = js.native
    
    /* 9 */ val remoteSystemNotAuthorized: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.remoteSystemNotAuthorized & Double = js.native
    
    /* 3 */ val succeeded: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.succeeded & Double = js.native
    
    /* 8 */ val timedOut: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.timedOut & Double = js.native
    
    /* 11 */ val unexpectedInternalError: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.unexpectedInternalError & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric")
  @js.native
  object XboxLiveQualityOfServiceMetric extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric & Double
      ] = js.native
    
    /* 6 */ val averageInboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageInboundBitsPerSecond & Double = js.native
    
    /* 0 */ val averageLatencyInMilliseconds: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageLatencyInMilliseconds & Double = js.native
    
    /* 3 */ val averageOutboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageOutboundBitsPerSecond & Double = js.native
    
    /* 8 */ val maxInboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxInboundBitsPerSecond & Double = js.native
    
    /* 2 */ val maxLatencyInMilliseconds: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxLatencyInMilliseconds & Double = js.native
    
    /* 5 */ val maxOutboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxOutboundBitsPerSecond & Double = js.native
    
    /* 7 */ val minInboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minInboundBitsPerSecond & Double = js.native
    
    /* 1 */ val minLatencyInMilliseconds: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minLatencyInMilliseconds & Double = js.native
    
    /* 4 */ val minOutboundBitsPerSecond: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minOutboundBitsPerSecond & Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult")
  @js.native
  abstract class XboxLiveQualityOfServiceMetricResult ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var deviceAddress: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var metric: XboxLiveQualityOfServiceMetric = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var status: XboxLiveQualityOfServiceMeasurementStatus = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var value: Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult")
  @js.native
  abstract class XboxLiveQualityOfServicePrivatePayloadResult ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var deviceAddress: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var status: XboxLiveQualityOfServiceMeasurementStatus = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* CompleteClass */
    var value: IBuffer = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveSocketKind")
  @js.native
  object XboxLiveSocketKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind & Double] = js.native
    
    /* 1 */ val datagram: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.datagram & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.none & Double = js.native
    
    /* 2 */ val stream: typings.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.stream & Double = js.native
  }
}
