package typings.winrtUwp.global.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for implementing your own Wi-Fi Direct Services. */
@JSGlobal("Windows.Devices.WiFiDirect.Services")
@js.native
object Services extends js.Object {
  /** Represents a Wi-Fi Direct service. This class is used by code on a device that seeks to use a Wi-Fi Direct Service, to establish a Wi-Fi Direct Service session with the service provider. */
  @js.native
  abstract class WiFiDirectService ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectService
  
  /** Represents a Service Advertiser. This class is used by code on a device that advertises Wi-Fi Direct Services, to advertise the service. */
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
  @js.native
  abstract class WiFiDirectServiceAutoAcceptSessionConnectedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAutoAcceptSessionConnectedEventArgs
  
  /** Contains provisioning information about a Wi-Fi Direct Service. */
  @js.native
  abstract class WiFiDirectServiceProvisioningInfo ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceProvisioningInfo
  
  /** Returned when a WiFiDirectServiceSession.RemotePortAdded event is raised. Your event handler should use this information to establish new socket connections to the new port. */
  @js.native
  abstract class WiFiDirectServiceRemotePortAddedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceRemotePortAddedEventArgs
  
  /** Represents a Wi-Fi Direct Services (WFDS) session. */
  @js.native
  abstract class WiFiDirectServiceSession ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSession
  
  /** Returned when a WiFiDirectService.SessionDeferred event is raised. */
  @js.native
  abstract class WiFiDirectServiceSessionDeferredEventArgs ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionDeferredEventArgs
  
  /** Describes a Wi-Fi Direct Service session request. */
  @js.native
  abstract class WiFiDirectServiceSessionRequest ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequest
  
  /** Returned when a WiFiDirectServiceAdvertiser.SessionRequested event is raised. */
  @js.native
  abstract class WiFiDirectServiceSessionRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequestedEventArgs
  
  /* static members */
  @js.native
  object WiFiDirectService extends js.Object {
    /**
      * Static method that retrieves a WiFiDirectService instance for a Wi-Fi Direct Service offered by the device with a given device ID.
      * @param deviceId Device ID of the device that advertises the desired Wi-Fi Direct Service.
      * @return An asynchronous retrieval operation. On successful completion, returns an instance of WiFiDirectService specific to the desired service instance, advertised by the indicated device.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectService] = js.native
    /**
      * Gets an Advanced Query Syntax (AQS) string to be used to find Wi-Fi Direct Service advertisers for a particular service.
      * @param serviceName The service name to be found.
      * @return The AQS string for the requested advertiser query.
      */
    def getSelector(serviceName: String): String = js.native
    /**
      * Gets an Advanced Query Syntax (AQS) string to be used to find Wi-Fi Direct Service advertisers for a particular service, where a given byte sequence appears in the advertiser's service information blob.
      * @param serviceName The service name to be found.
      * @param serviceInfoFilter A byte sequence that must be found in the advertiser's service information blob.
      * @return The AQS string for the requested advertiser query.
      */
    def getSelector(serviceName: String, serviceInfoFilter: IBuffer): String = js.native
  }
  
  /** Values used for WiFiDirectServiceAdvertiser.AdvertisementStatus . */
  @js.native
  object WiFiDirectServiceAdvertisementStatus extends js.Object {
    /* 3 */ val aborted: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.aborted with Double = js.native
    /* 0 */ val created: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.created with Double = js.native
    /* 1 */ val started: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.started with Double = js.native
    /* 2 */ val stopped: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.stopped with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus with Double
      ] = js.native
  }
  
  /** Values describing how service configuration is performed when a session is being established. Typically, either no input is required, or one device in the session displays a PIN and the other device requires that the PIN be entered. */
  @js.native
  object WiFiDirectServiceConfigurationMethod extends js.Object {
    /* 0 */ val default: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.default with Double = js.native
    /* 1 */ val pinDisplay: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.pinDisplay with Double = js.native
    /* 2 */ val pinEntry: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.pinEntry with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod with Double
      ] = js.native
  }
  
  /** Values used for the WiFiDirectServiceAdvertiser.ServiceError property. */
  @js.native
  object WiFiDirectServiceError extends js.Object {
    /* 4 */ val noHardware: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.noHardware with Double = js.native
    /* 1 */ val radioNotAvailable: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.radioNotAvailable with Double = js.native
    /* 2 */ val resourceInUse: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.resourceInUse with Double = js.native
    /* 0 */ val success: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.success with Double = js.native
    /* 3 */ val unsupportedHardware: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.unsupportedHardware with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError with Double
      ] = js.native
  }
  
  /** Values that specify the IP protocol of the new port when a WiFiDirectServiceSession.RemotePortAdded event is raised. */
  @js.native
  object WiFiDirectServiceIPProtocol extends js.Object {
    /* 0 */ val tcp: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol.tcp with Double = js.native
    /* 1 */ val udp: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol.udp with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol with Double
      ] = js.native
  }
  
  /** Values used in the WiFiDirectServiceSession.ErrorStatus property. */
  @js.native
  object WiFiDirectServiceSessionErrorStatus extends js.Object {
    /* 1 */ val disassociated: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.disassociated with Double = js.native
    /* 2 */ val localClose: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.localClose with Double = js.native
    /* 5 */ val noResponseFromRemote: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.noResponseFromRemote with Double = js.native
    /* 0 */ val ok: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.ok with Double = js.native
    /* 3 */ val remoteClose: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.remoteClose with Double = js.native
    /* 4 */ val systemFailure: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus.systemFailure with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus with Double
      ] = js.native
  }
  
  /** Values used to describe the status of a Wi-Fi Direct Service Session. */
  @js.native
  object WiFiDirectServiceSessionStatus extends js.Object {
    /* 0 */ val closed: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.closed with Double = js.native
    /* 1 */ val initiated: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.initiated with Double = js.native
    /* 3 */ val open: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.open with Double = js.native
    /* 2 */ val requested: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.requested with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus with Double
      ] = js.native
  }
  
  /** Values used to describe the service status. */
  @js.native
  object WiFiDirectServiceStatus extends js.Object {
    /* 0 */ val available: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus.available with Double = js.native
    /* 1 */ val busy: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus.busy with Double = js.native
    /* 2 */ val custom: typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus.custom with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus with Double
      ] = js.native
  }
  
}

