package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds
import typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod
import typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes that support connecting to associated Wi-Fi Direct devices and associated endpoints for PCs, tablets, and phones. */
object WiFiDirect {
  
  /** Provides support for implementing your own Wi-Fi Direct Services. */
  object Services {
    
    /** Represents a Wi-Fi Direct service. This class is used by code on a device that seeks to use a Wi-Fi Direct Service, to establish a Wi-Fi Direct Service session with the service provider. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectService")
    @js.native
    abstract class WiFiDirectService ()
      extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectService
    object WiFiDirectService {
      
      /**
        * Static method that retrieves a WiFiDirectService instance for a Wi-Fi Direct Service offered by the device with a given device ID.
        * @param deviceId Device ID of the device that advertises the desired Wi-Fi Direct Service.
        * @return An asynchronous retrieval operation. On successful completion, returns an instance of WiFiDirectService specific to the desired service instance, advertised by the indicated device.
        */
      /* static member */
      @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectService.fromIdAsync")
      @js.native
      def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectService] = js.native
      
      /**
        * Gets an Advanced Query Syntax (AQS) string to be used to find Wi-Fi Direct Service advertisers for a particular service.
        * @param serviceName The service name to be found.
        * @return The AQS string for the requested advertiser query.
        */
      /* static member */
      @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectService.getSelector")
      @js.native
      def getSelector(serviceName: String): String = js.native
      /**
        * Gets an Advanced Query Syntax (AQS) string to be used to find Wi-Fi Direct Service advertisers for a particular service, where a given byte sequence appears in the advertiser's service information blob.
        * @param serviceName The service name to be found.
        * @param serviceInfoFilter A byte sequence that must be found in the advertiser's service information blob.
        * @return The AQS string for the requested advertiser query.
        */
      /* static member */
      @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectService.getSelector")
      @js.native
      def getSelector(serviceName: String, serviceInfoFilter: IBuffer): String = js.native
    }
    
    /** Values used for WiFiDirectServiceAdvertiser.AdvertisementStatus . */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus")
    @js.native
    object WiFiDirectServiceAdvertisementStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus with Double
          ] = js.native
      
      /* 3 */ val aborted: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.aborted with Double = js.native
      
      /* 0 */ val created: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.created with Double = js.native
      
      /* 1 */ val started: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.started with Double = js.native
      
      /* 2 */ val stopped: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.stopped with Double = js.native
    }
    
    /** Represents a Service Advertiser. This class is used by code on a device that advertises Wi-Fi Direct Services, to advertise the service. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertiser")
    @js.native
    class WiFiDirectServiceAdvertiser protected ()
      extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertiser {
      /**
        * Creates an instance of the WiFiDirectServiceAdvertiser class. To start advertising a Wi-Fi Direct Service, create an instance of this class, set its properties appropriately for your service, and then call its Start method.
        * @param serviceName The name of the service to be advertised. Service names are UTF-8 strings no more than 255 characters long. It is recommended that names use reverse domain name notation, where the service owner's DNS name (such as "contoso.com") is reversed and used as the beginning of the service name (such as "com.contoso.serviceX"). This convention is intended to make it easy to choose unique service names. Service names that start with "org.wi-fi.wfds" are reserved for use by the Wi-Fi Alliance, and you may not use such names for your service.
        */
      def this(serviceName: String) = this()
    }
    
    /** Returned when a WiFiDirectServiceAdvertiser.AutoAcceptSessionConnected event is raised. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAutoAcceptSessionConnectedEventArgs")
    @js.native
    abstract class WiFiDirectServiceAutoAcceptSessionConnectedEventArgs ()
      extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAutoAcceptSessionConnectedEventArgs
    
    /** Values describing how service configuration is performed when a session is being established. Typically, either no input is required, or one device in the session displays a PIN and the other device requires that the PIN be entered. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod")
    @js.native
    object WiFiDirectServiceConfigurationMethod extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod with Double
          ] = js.native
      
      /* 0 */ val default: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.default with Double = js.native
      
      /* 1 */ val pinDisplay: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.pinDisplay with Double = js.native
      
      /* 2 */ val pinEntry: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.pinEntry with Double = js.native
    }
    
    /** Values used for the WiFiDirectServiceAdvertiser.ServiceError property. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError")
    @js.native
    object WiFiDirectServiceError extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError with Double
          ] = js.native
      
      /* 4 */ val noHardware: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.noHardware with Double = js.native
      
      /* 1 */ val radioNotAvailable: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.radioNotAvailable with Double = js.native
      
      /* 2 */ val resourceInUse: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.resourceInUse with Double = js.native
      
      /* 0 */ val success: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.success with Double = js.native
      
      /* 3 */ val unsupportedHardware: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.unsupportedHardware with Double = js.native
    }
    
    /** Values that specify the IP protocol of the new port when a WiFiDirectServiceSession.RemotePortAdded event is raised. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol")
    @js.native
    object WiFiDirectServiceIPProtocol extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol with Double
          ] = js.native
      
      /* 0 */ val tcp: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol.tcp with Double = js.native
      
      /* 1 */ val udp: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol.udp with Double = js.native
    }
    
    /** Contains provisioning information about a Wi-Fi Direct Service. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceProvisioningInfo")
    @js.native
    abstract class WiFiDirectServiceProvisioningInfo ()
      extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceProvisioningInfo
    
    /** Returned when a WiFiDirectServiceSession.RemotePortAdded event is raised. Your event handler should use this information to establish new socket connections to the new port. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceRemotePortAddedEventArgs")
    @js.native
    abstract class WiFiDirectServiceRemotePortAddedEventArgs ()
      extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceRemotePortAddedEventArgs
    
    /** Represents a Wi-Fi Direct Services (WFDS) session. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSession")
    @js.native
    abstract class WiFiDirectServiceSession ()
      extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSession
    
    /** Returned when a WiFiDirectService.SessionDeferred event is raised. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionDeferredEventArgs")
    @js.native
    abstract class WiFiDirectServiceSessionDeferredEventArgs ()
      extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionDeferredEventArgs
    
    /** Values used in the WiFiDirectServiceSession.ErrorStatus property. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus")
    @js.native
    object WiFiDirectServiceSessionErrorStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus with Double
          ] = js.native
      
      /* 1 */ val disassociated: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.disassociated with Double = js.native
      
      /* 2 */ val localClose: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.localClose with Double = js.native
      
      /* 5 */ val noResponseFromRemote: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.noResponseFromRemote with Double = js.native
      
      /* 0 */ val ok: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.ok with Double = js.native
      
      /* 3 */ val remoteClose: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.remoteClose with Double = js.native
      
      /* 4 */ val systemFailure: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.systemFailure with Double = js.native
    }
    
    /** Describes a Wi-Fi Direct Service session request. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequest")
    @js.native
    abstract class WiFiDirectServiceSessionRequest ()
      extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequest
    
    /** Returned when a WiFiDirectServiceAdvertiser.SessionRequested event is raised. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequestedEventArgs")
    @js.native
    abstract class WiFiDirectServiceSessionRequestedEventArgs ()
      extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequestedEventArgs
    
    /** Values used to describe the status of a Wi-Fi Direct Service Session. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus")
    @js.native
    object WiFiDirectServiceSessionStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus with Double
          ] = js.native
      
      /* 0 */ val closed: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.closed with Double = js.native
      
      /* 1 */ val initiated: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.initiated with Double = js.native
      
      /* 3 */ val open: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.open with Double = js.native
      
      /* 2 */ val requested: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.requested with Double = js.native
    }
    
    /** Values used to describe the service status. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus")
    @js.native
    object WiFiDirectServiceStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus with Double
          ] = js.native
      
      /* 0 */ val available: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus.available with Double = js.native
      
      /* 1 */ val busy: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus.busy with Double = js.native
      
      /* 2 */ val custom: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus.custom with Double = js.native
    }
  }
  
  /** Represent a Wi-Fi Direct advertisement and allows the app to control the listen state and custom information elements in the advertisement. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisement")
  @js.native
  abstract class WiFiDirectAdvertisement ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisement
  
  /** Specifies whether the Wi-Fi Direct device is listening and discoverable. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability")
  @js.native
  object WiFiDirectAdvertisementListenStateDiscoverability extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability with Double
      ] = js.native
    
    /* 2 */ val intensive: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability.intensive with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability.none with Double = js.native
    
    /* 1 */ val normal: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability.normal with Double = js.native
  }
  
  /** An object to publish Wi-Fi Direct advertisements. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisher")
  @js.native
  /** Creates a new WiFiDirectAdvertisementPublisher object. */
  class WiFiDirectAdvertisementPublisher ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisher
  
  /** Represents the possible states of the WiFiDirectAdvertisementPublisher . */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus")
  @js.native
  object WiFiDirectAdvertisementPublisherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus with Double
      ] = js.native
    
    /* 3 */ val aborted: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.aborted with Double = js.native
    
    /* 0 */ val created: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.created with Double = js.native
    
    /* 1 */ val started: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.started with Double = js.native
    
    /* 2 */ val stopped: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.stopped with Double = js.native
  }
  
  /** Provides data for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatusChangedEventArgs")
  @js.native
  abstract class WiFiDirectAdvertisementPublisherStatusChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatusChangedEventArgs
  
  /** Specifies a Wi-Fi Direct configuration method. Configuration is how a user tells one piece of Wi-Fi Direct equipment to connect to another piece of Wi-Fi Direct equipment. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod")
  @js.native
  object WiFiDirectConfigurationMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod with Double
      ] = js.native
    
    /* 1 */ val displayPin: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod.displayPin with Double = js.native
    
    /* 0 */ val providePin: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod.providePin with Double = js.native
    
    /* 2 */ val pushButton: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod.pushButton with Double = js.native
  }
  
  /** Class used to listen for incoming Wi-Fi Direct connection requests. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionListener")
  @js.native
  /** Creates a new WiFiDirectConnectionListener object. */
  class WiFiDirectConnectionListener ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionListener
  
  /** Used by an app to specify the connection parameters for a Wi-Fi Direct connect/pairing operation. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters")
  @js.native
  /** Creates a new WiFiDirectConnectionParameters object. */
  class WiFiDirectConnectionParameters ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters
  object WiFiDirectConnectionParameters {
    
    /**
      * Gets a list of the DevicePairingKinds supporting the given configuration method.
      * @param configurationMethod A value specifying a configuration method.
      * @return A value specifying a pairing kind, for use with the pairing functionality in the Windows.Devices.Enumeration API.
      */
    /* static member */
    @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters.getDevicePairingKinds")
    @js.native
    def getDevicePairingKinds(configurationMethod: WiFiDirectConfigurationMethod): DevicePairingKinds = js.native
  }
  
  /** A Wi-FI Direct connection request received by a WiFiDirectConnectionListener . */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest")
  @js.native
  abstract class WiFiDirectConnectionRequest ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest
  
  /** Provides data for a ConnectionRequested event on a WiFiDirectConnectionListener . */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionRequestedEventArgs")
  @js.native
  abstract class WiFiDirectConnectionRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionRequestedEventArgs
  
  /** Describes the connection status of a WiFiDirectDevice object. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus")
  @js.native
  object WiFiDirectConnectionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus with Double
      ] = js.native
    
    /* 1 */ val connected: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus.connected with Double = js.native
    
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus.disconnected with Double = js.native
  }
  
  /** Manages connections to associated Wi-Fi Direct devices. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice")
  @js.native
  abstract class WiFiDirectDevice ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice
  object WiFiDirectDevice {
    
    /**
      * Creates an instance of the WiFiDirectDevice class for the specified device interface id.
      * @param deviceId The DeviceInformation Id of a Wi-Fi Direct device.
      * @return An asynchronous operation to retrieve the WiFiDirectDevice that was created.
      */
    /* static member */
    @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice] = js.native
    /**
      * Creates an instance of the WiFiDirectDevice class for the specified device interface id with specific connection parameters.
      * @param deviceId The DeviceInformation Id of a Wi-Fi Direct device.
      * @param connectionParameters Connection parameters for a Wi-Fi Direct connect/pairing operation.
      * @return An asynchronous operation to retrieve the WiFiDirectDevice that was created.
      */
    /* static member */
    @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice.fromIdAsync")
    @js.native
    def fromIdAsync(
      deviceId: String,
      connectionParameters: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice] = js.native
    
    /**
      * Returns the class selection string that you can use to enumerate Wi-Fi Direct devices.
      * @return The class selection string that you can use to enumerate Wi-Fi Direct devices.
      */
    /* static member */
    @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
    /**
      * Returns the class selection string that you can use to enumerate Wi-Fi Direct devices for a specific Wi-Fi Direct device selector type.
      * @param type A specific Wi-Fi Direct device selector type.
      * @return The class selection string that you can use to enumerate Wi-Fi Direct devices.
      */
    /* static member */
    @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(`type`: WiFiDirectDeviceSelectorType): String = js.native
  }
  
  /** Specifies the device selector type for Wi-Fi Direct. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType")
  @js.native
  object WiFiDirectDeviceSelectorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType with Double
      ] = js.native
    
    /* 1 */ val associationEndpoint: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType.associationEndpoint with Double = js.native
    
    /* 0 */ val deviceInterface: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType.deviceInterface with Double = js.native
  }
  
  /** Specifies some common Wi-Fi Direct error cases. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectError")
  @js.native
  object WiFiDirectError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectError with Double] = js.native
    
    /* 1 */ val radioNotAvailable: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectError.radioNotAvailable with Double = js.native
    
    /* 2 */ val resourceInUse: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectError.resourceInUse with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectError.success with Double = js.native
  }
  
  /** Represents information elements in a Wi-Fi Direct packet. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement")
  @js.native
  /** Creates a new WiFiDirectInformationElement object. */
  class WiFiDirectInformationElement ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement
  object WiFiDirectInformationElement {
    
    /**
      * Create an array of information elements from a data buffer.
      * @param buffer The data buffer that contains a information element.
      * @return A array of information elements created from the buffer.
      */
    /* static member */
    @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement.createFromBuffer")
    @js.native
    def createFromBuffer(buffer: IBuffer): IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement] = js.native
    
    /**
      * Create an array of information elements from a DeviceInformation object.
      * @param deviceInformation The device information object that contains the information elements.
      * @return A array of information elements created from the device information object.
      */
    /* static member */
    @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement.createFromDeviceInformation")
    @js.native
    def createFromDeviceInformation(deviceInformation: DeviceInformation): IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement] = js.native
  }
  
  /** Settings governing "legacy" mode (non-Wi-Fi Direct connections to the access point being advertised.) */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectLegacySettings")
  @js.native
  abstract class WiFiDirectLegacySettings ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectLegacySettings
  
  /** Specifies a direct pairing procedure. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure")
  @js.native
  object WiFiDirectPairingProcedure extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure with Double
      ] = js.native
    
    /* 0 */ val groupOwnerNegotiation: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure.groupOwnerNegotiation with Double = js.native
    
    /* 1 */ val invitation: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure.invitation with Double = js.native
  }
}
