package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds
import typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod
import typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol
import typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability
import typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus
import typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod
import typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType
import typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectError
import typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.EndpointPair
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes that support connecting to associated Wi-Fi Direct devices and associated endpoints for PCs, tablets, and phones. */
object WiFiDirect {
  
  /** Provides support for implementing your own Wi-Fi Direct Services. */
  object Services {
    
    /** Represents a Wi-Fi Direct service. This class is used by code on a device that seeks to use a Wi-Fi Direct Service, to establish a Wi-Fi Direct Service session with the service provider. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectService")
    @js.native
    abstract class WiFiDirectService ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectService
    object WiFiDirectService {
      
      @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectService")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Static method that retrieves a WiFiDirectService instance for a Wi-Fi Direct Service offered by the device with a given device ID.
        * @param deviceId Device ID of the device that advertises the desired Wi-Fi Direct Service.
        * @return An asynchronous retrieval operation. On successful completion, returns an instance of WiFiDirectService specific to the desired service instance, advertised by the indicated device.
        */
      /* static member */
      @scala.inline
      def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectService] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectService]]
      
      /**
        * Gets an Advanced Query Syntax (AQS) string to be used to find Wi-Fi Direct Service advertisers for a particular service.
        * @param serviceName The service name to be found.
        * @return The AQS string for the requested advertiser query.
        */
      /* static member */
      @scala.inline
      def getSelector(serviceName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(serviceName.asInstanceOf[js.Any]).asInstanceOf[String]
      /**
        * Gets an Advanced Query Syntax (AQS) string to be used to find Wi-Fi Direct Service advertisers for a particular service, where a given byte sequence appears in the advertiser's service information blob.
        * @param serviceName The service name to be found.
        * @param serviceInfoFilter A byte sequence that must be found in the advertiser's service information blob.
        * @return The AQS string for the requested advertiser query.
        */
      /* static member */
      @scala.inline
      def getSelector(serviceName: String, serviceInfoFilter: IBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(serviceName.asInstanceOf[js.Any], serviceInfoFilter.asInstanceOf[js.Any])).asInstanceOf[String]
    }
    
    /** Values used for WiFiDirectServiceAdvertiser.AdvertisementStatus . */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus")
    @js.native
    object WiFiDirectServiceAdvertisementStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus & Double
          ] = js.native
      
      /* 3 */ val aborted: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.aborted & Double = js.native
      
      /* 0 */ val created: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.created & Double = js.native
      
      /* 1 */ val started: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.started & Double = js.native
      
      /* 2 */ val stopped: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.stopped & Double = js.native
    }
    
    /** Represents a Service Advertiser. This class is used by code on a device that advertises Wi-Fi Direct Services, to advertise the service. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertiser")
    @js.native
    class WiFiDirectServiceAdvertiser protected ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertiser {
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
      extends StObject
         with typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAutoAcceptSessionConnectedEventArgs {
      
      /** Gets the WiFiDirectServiceSession that was created when the connection was automatically accepted. */
      /* CompleteClass */
      var session: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSession = js.native
      
      /** Gets the session information buffer that corresponds to this automatically accepted connection. */
      /* CompleteClass */
      var sessionInfo: IBuffer = js.native
    }
    
    /** Values describing how service configuration is performed when a session is being established. Typically, either no input is required, or one device in the session displays a PIN and the other device requires that the PIN be entered. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod")
    @js.native
    object WiFiDirectServiceConfigurationMethod extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod & Double
          ] = js.native
      
      /* 0 */ val default: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.default & Double = js.native
      
      /* 1 */ val pinDisplay: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.pinDisplay & Double = js.native
      
      /* 2 */ val pinEntry: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.pinEntry & Double = js.native
    }
    
    /** Values used for the WiFiDirectServiceAdvertiser.ServiceError property. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError")
    @js.native
    object WiFiDirectServiceError extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError & Double
          ] = js.native
      
      /* 4 */ val noHardware: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.noHardware & Double = js.native
      
      /* 1 */ val radioNotAvailable: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.radioNotAvailable & Double = js.native
      
      /* 2 */ val resourceInUse: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.resourceInUse & Double = js.native
      
      /* 0 */ val success: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.success & Double = js.native
      
      /* 3 */ val unsupportedHardware: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.unsupportedHardware & Double = js.native
    }
    
    /** Values that specify the IP protocol of the new port when a WiFiDirectServiceSession.RemotePortAdded event is raised. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol")
    @js.native
    object WiFiDirectServiceIPProtocol extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol & Double
          ] = js.native
      
      /* 0 */ val tcp: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol.tcp & Double = js.native
      
      /* 1 */ val udp: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol.udp & Double = js.native
    }
    
    /** Contains provisioning information about a Wi-Fi Direct Service. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceProvisioningInfo")
    @js.native
    abstract class WiFiDirectServiceProvisioningInfo ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceProvisioningInfo {
      
      /** Gets a value indicating whether Wi-Fi Direct Point to Point (P2P) group formation is needed. */
      /* CompleteClass */
      var isGroupFormationNeeded: Boolean = js.native
      
      /** Gets a value describing the configuration method in use. */
      /* CompleteClass */
      var selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod = js.native
    }
    
    /** Returned when a WiFiDirectServiceSession.RemotePortAdded event is raised. Your event handler should use this information to establish new socket connections to the new port. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceRemotePortAddedEventArgs")
    @js.native
    abstract class WiFiDirectServiceRemotePortAddedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceRemotePortAddedEventArgs {
      
      /** Gets the endpoint pairs associated with the new remote port. */
      /* CompleteClass */
      var endpointPairs: IVectorView[EndpointPair] = js.native
      
      /** Gets the protocol used to communicate with the new remote port. */
      /* CompleteClass */
      var protocol: WiFiDirectServiceIPProtocol = js.native
    }
    
    /** Represents a Wi-Fi Direct Services (WFDS) session. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSession")
    @js.native
    abstract class WiFiDirectServiceSession ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSession
    
    /** Returned when a WiFiDirectService.SessionDeferred event is raised. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionDeferredEventArgs")
    @js.native
    abstract class WiFiDirectServiceSessionDeferredEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionDeferredEventArgs {
      
      /** Gets the service-defined session information returned by the service when it sends a deferral in response to a connection request. Note that a deferral does not indicate that the connection is refused. Rather, it indicates that the server is performing a time-consuming operation such as requesting user input. A seeker should implement a 120-second timeout after getting a deferral before giving up on the request. */
      /* CompleteClass */
      var deferredSessionInfo: IBuffer = js.native
    }
    
    /** Values used in the WiFiDirectServiceSession.ErrorStatus property. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus")
    @js.native
    object WiFiDirectServiceSessionErrorStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus & Double
          ] = js.native
      
      /* 1 */ val disassociated: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.disassociated & Double = js.native
      
      /* 2 */ val localClose: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.localClose & Double = js.native
      
      /* 5 */ val noResponseFromRemote: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.noResponseFromRemote & Double = js.native
      
      /* 0 */ val ok: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.ok & Double = js.native
      
      /* 3 */ val remoteClose: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.remoteClose & Double = js.native
      
      /* 4 */ val systemFailure: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.systemFailure & Double = js.native
    }
    
    /** Describes a Wi-Fi Direct Service session request. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequest")
    @js.native
    abstract class WiFiDirectServiceSessionRequest ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequest {
      
      /** Closes the session request. Your server code calls this method to reject a session request. */
      /* CompleteClass */
      override def close(): Unit = js.native
      
      /** Gets device information for the requesting device. */
      /* CompleteClass */
      var deviceInformation: DeviceInformation = js.native
      
      /** Gets information about how provisioning should be performed if the session is established. */
      /* CompleteClass */
      var provisioningInfo: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceProvisioningInfo = js.native
      
      /** Gets the session information blob associated with this request. */
      /* CompleteClass */
      var sessionInfo: IBuffer = js.native
    }
    
    /** Returned when a WiFiDirectServiceAdvertiser.SessionRequested event is raised. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequestedEventArgs")
    @js.native
    abstract class WiFiDirectServiceSessionRequestedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequestedEventArgs {
      
      /**
        * Gets information about the session request that raised a WiFiDirectServiceAdvertiser.SessionRequested event.
        * @return Information about a new session request.
        */
      /* CompleteClass */
      override def getSessionRequest(): typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequest = js.native
    }
    
    /** Values used to describe the status of a Wi-Fi Direct Service Session. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus")
    @js.native
    object WiFiDirectServiceSessionStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus & Double
          ] = js.native
      
      /* 0 */ val closed: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.closed & Double = js.native
      
      /* 1 */ val initiated: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.initiated & Double = js.native
      
      /* 3 */ val open: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.open & Double = js.native
      
      /* 2 */ val requested: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.requested & Double = js.native
    }
    
    /** Values used to describe the service status. */
    @JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus")
    @js.native
    object WiFiDirectServiceStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus & Double
          ] = js.native
      
      /* 0 */ val available: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus.available & Double = js.native
      
      /* 1 */ val busy: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus.busy & Double = js.native
      
      /* 2 */ val custom: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus.custom & Double = js.native
    }
  }
  
  /** Represent a Wi-Fi Direct advertisement and allows the app to control the listen state and custom information elements in the advertisement. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisement")
  @js.native
  abstract class WiFiDirectAdvertisement ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisement {
    
    /** Information elements to advertise in the Wi-Fi Direct advertisement. */
    /* CompleteClass */
    var informationElements: IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement] = js.native
    
    /** Whether autonomous group owner will be enabled. */
    /* CompleteClass */
    var isAutonomousGroupOwnerEnabled: Boolean = js.native
    
    /** Gets the settings object for "legacy" (non-Wi-Fi Direct) connections. */
    /* CompleteClass */
    var legacySettings: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectLegacySettings = js.native
    
    /** Gets or sets the listen state and whether the Wi-Fi Direct device is discoverable. */
    /* CompleteClass */
    var listenStateDiscoverability: WiFiDirectAdvertisementListenStateDiscoverability = js.native
    
    /** Gets a device's supported configuration methods. */
    /* CompleteClass */
    var supportedConfigurationMethods: IVector[WiFiDirectConfigurationMethod] = js.native
  }
  
  /** Specifies whether the Wi-Fi Direct device is listening and discoverable. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability")
  @js.native
  object WiFiDirectAdvertisementListenStateDiscoverability extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability & Double
      ] = js.native
    
    /* 2 */ val intensive: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability.intensive & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability.none & Double = js.native
    
    /* 1 */ val normal: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability.normal & Double = js.native
  }
  
  /** An object to publish Wi-Fi Direct advertisements. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisher")
  @js.native
  /** Creates a new WiFiDirectAdvertisementPublisher object. */
  class WiFiDirectAdvertisementPublisher ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisher
  
  /** Represents the possible states of the WiFiDirectAdvertisementPublisher . */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus")
  @js.native
  object WiFiDirectAdvertisementPublisherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus & Double
      ] = js.native
    
    /* 3 */ val aborted: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.aborted & Double = js.native
    
    /* 0 */ val created: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.created & Double = js.native
    
    /* 1 */ val started: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.started & Double = js.native
    
    /* 2 */ val stopped: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.stopped & Double = js.native
  }
  
  /** Provides data for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatusChangedEventArgs")
  @js.native
  abstract class WiFiDirectAdvertisementPublisherStatusChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatusChangedEventArgs {
    
    /** Gets the error status for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
    /* CompleteClass */
    var error: WiFiDirectError = js.native
    
    /** Gets the new status of the WiFiDirectAdvertisementPublisher . */
    /* CompleteClass */
    var status: WiFiDirectAdvertisementPublisherStatus = js.native
  }
  
  /** Specifies a Wi-Fi Direct configuration method. Configuration is how a user tells one piece of Wi-Fi Direct equipment to connect to another piece of Wi-Fi Direct equipment. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod")
  @js.native
  object WiFiDirectConfigurationMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod & Double
      ] = js.native
    
    /* 1 */ val displayPin: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod.displayPin & Double = js.native
    
    /* 0 */ val providePin: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod.providePin & Double = js.native
    
    /* 2 */ val pushButton: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod.pushButton & Double = js.native
  }
  
  /** Class used to listen for incoming Wi-Fi Direct connection requests. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionListener")
  @js.native
  /** Creates a new WiFiDirectConnectionListener object. */
  class WiFiDirectConnectionListener ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionListener
  
  /** Used by an app to specify the connection parameters for a Wi-Fi Direct connect/pairing operation. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters")
  @js.native
  /** Creates a new WiFiDirectConnectionParameters object. */
  class WiFiDirectConnectionParameters ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters {
    
    /** The group owner intent value used for group owner negotiation in a Wi-Fi Direct connect/pairing operation. */
    /* CompleteClass */
    var groupOwnerIntent: Double = js.native
    
    /** Gets a list of supported configuration methods, in order of preference. */
    /* CompleteClass */
    var preferenceOrderedConfigurationMethods: IVector[WiFiDirectConfigurationMethod] = js.native
    
    /** Gets or sets a value specifying a device's preferred pairing procedure. */
    /* CompleteClass */
    var preferredPairingProcedure: WiFiDirectPairingProcedure = js.native
  }
  object WiFiDirectConnectionParameters {
    
    @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a list of the DevicePairingKinds supporting the given configuration method.
      * @param configurationMethod A value specifying a configuration method.
      * @return A value specifying a pairing kind, for use with the pairing functionality in the Windows.Devices.Enumeration API.
      */
    /* static member */
    @scala.inline
    def getDevicePairingKinds(configurationMethod: WiFiDirectConfigurationMethod): DevicePairingKinds = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevicePairingKinds")(configurationMethod.asInstanceOf[js.Any]).asInstanceOf[DevicePairingKinds]
  }
  
  /** A Wi-FI Direct connection request received by a WiFiDirectConnectionListener . */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest")
  @js.native
  abstract class WiFiDirectConnectionRequest ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest {
    
    /** Closes the WiFiDirectConnectionRequest object. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets device information for the endpoint making the Wi-Fi Direct connection request. */
    /* CompleteClass */
    var deviceInformation: DeviceInformation = js.native
  }
  
  /** Provides data for a ConnectionRequested event on a WiFiDirectConnectionListener . */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionRequestedEventArgs")
  @js.native
  abstract class WiFiDirectConnectionRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionRequestedEventArgs {
    
    /**
      * Retrieves the WiFiDirectConnectionRequest received on a ConnectionRequested event by a WiFiDirectConnectionListener .
      * @return The Wi-FI Direct connection request.
      */
    /* CompleteClass */
    override def getConnectionRequest(): typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest = js.native
  }
  
  /** Describes the connection status of a WiFiDirectDevice object. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus")
  @js.native
  object WiFiDirectConnectionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus & Double] = js.native
    
    /* 1 */ val connected: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus.connected & Double = js.native
    
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus.disconnected & Double = js.native
  }
  
  /** Manages connections to associated Wi-Fi Direct devices. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice")
  @js.native
  abstract class WiFiDirectDevice ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice
  object WiFiDirectDevice {
    
    @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of the WiFiDirectDevice class for the specified device interface id.
      * @param deviceId The DeviceInformation Id of a Wi-Fi Direct device.
      * @return An asynchronous operation to retrieve the WiFiDirectDevice that was created.
      */
    /* static member */
    @scala.inline
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice]]
    /**
      * Creates an instance of the WiFiDirectDevice class for the specified device interface id with specific connection parameters.
      * @param deviceId The DeviceInformation Id of a Wi-Fi Direct device.
      * @param connectionParameters Connection parameters for a Wi-Fi Direct connect/pairing operation.
      * @return An asynchronous operation to retrieve the WiFiDirectDevice that was created.
      */
    /* static member */
    @scala.inline
    def fromIdAsync(
      deviceId: String,
      connectionParameters: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any], connectionParameters.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice]]
    
    /**
      * Returns the class selection string that you can use to enumerate Wi-Fi Direct devices.
      * @return The class selection string that you can use to enumerate Wi-Fi Direct devices.
      */
    /* static member */
    @scala.inline
    def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
    /**
      * Returns the class selection string that you can use to enumerate Wi-Fi Direct devices for a specific Wi-Fi Direct device selector type.
      * @param type A specific Wi-Fi Direct device selector type.
      * @return The class selection string that you can use to enumerate Wi-Fi Direct devices.
      */
    /* static member */
    @scala.inline
    def getDeviceSelector(`type`: WiFiDirectDeviceSelectorType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /** Specifies the device selector type for Wi-Fi Direct. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType")
  @js.native
  object WiFiDirectDeviceSelectorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType & Double
      ] = js.native
    
    /* 1 */ val associationEndpoint: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType.associationEndpoint & Double = js.native
    
    /* 0 */ val deviceInterface: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType.deviceInterface & Double = js.native
  }
  
  /** Specifies some common Wi-Fi Direct error cases. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectError")
  @js.native
  object WiFiDirectError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectError & Double] = js.native
    
    /* 1 */ val radioNotAvailable: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectError.radioNotAvailable & Double = js.native
    
    /* 2 */ val resourceInUse: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectError.resourceInUse & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectError.success & Double = js.native
  }
  
  /** Represents information elements in a Wi-Fi Direct packet. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement")
  @js.native
  /** Creates a new WiFiDirectInformationElement object. */
  class WiFiDirectInformationElement ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement {
    
    /** A three-byte organization identifier used to indicate the organization which defined a vendor extension information element (IE). */
    /* CompleteClass */
    var oui: IBuffer = js.native
    
    /** A one byte type value used in a vendor extension information element (IE) to distinguish between different IE formats defined by the same organization. */
    /* CompleteClass */
    var ouiType: Double = js.native
    
    /** The value of the information element. */
    /* CompleteClass */
    var value: IBuffer = js.native
  }
  object WiFiDirectInformationElement {
    
    @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an array of information elements from a data buffer.
      * @param buffer The data buffer that contains a information element.
      * @return A array of information elements created from the buffer.
      */
    /* static member */
    @scala.inline
    def createFromBuffer(buffer: IBuffer): IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement]]
    
    /**
      * Create an array of information elements from a DeviceInformation object.
      * @param deviceInformation The device information object that contains the information elements.
      * @return A array of information elements created from the device information object.
      */
    /* static member */
    @scala.inline
    def createFromDeviceInformation(deviceInformation: DeviceInformation): IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromDeviceInformation")(deviceInformation.asInstanceOf[js.Any]).asInstanceOf[IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement]]
  }
  
  /** Settings governing "legacy" mode (non-Wi-Fi Direct connections to the access point being advertised.) */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectLegacySettings")
  @js.native
  abstract class WiFiDirectLegacySettings ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectLegacySettings {
    
    /** Gets or sets a value specifying whether "legacy mode" is enabled. When enabled, this mode causes this device to act as a normal Wi-Fi access point, and is intended to support devices which do not support connection via Wi-Fi Direct. */
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /** Gets or sets the pass phrase used by non-Wi-Fi Direct clients to connect to this access point in "legacy mode". */
    /* CompleteClass */
    var passphrase: PasswordCredential = js.native
    
    /** Gets or sets the Service Set Identifier (SSID, or "access point ID"). */
    /* CompleteClass */
    var ssid: String = js.native
  }
  
  /** Specifies a direct pairing procedure. */
  @JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure")
  @js.native
  object WiFiDirectPairingProcedure extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure & Double] = js.native
    
    /* 0 */ val groupOwnerNegotiation: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure.groupOwnerNegotiation & Double = js.native
    
    /* 1 */ val invitation: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure.invitation & Double = js.native
  }
}
