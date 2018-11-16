package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Service Advertiser. This class is used by code on a device that advertises Wi-Fi Direct Services, to advertise the service. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertiser")
@js.native
class WiFiDirectServiceAdvertiser protected () extends js.Object {
  /**
                       * Creates an instance of the WiFiDirectServiceAdvertiser class. To start advertising a Wi-Fi Direct Service, create an instance of this class, set its properties appropriately for your service, and then call its Start method.
                       * @param serviceName The name of the service to be advertised. Service names are UTF-8 strings no more than 255 characters long. It is recommended that names use reverse domain name notation, where the service owner's DNS name (such as "contoso.com") is reversed and used as the beginning of the service name (such as "com.contoso.serviceX"). This convention is intended to make it easy to choose unique service names. Service names that start with "org.wi-fi.wfds" are reserved for use by the Wi-Fi Alliance, and you may not use such names for your service.
                       */
  def this(serviceName: java.lang.String) = this()
  /** Gets a value that describes the current status of the advertisement. */
  var advertisementStatus: WiFiDirectServiceAdvertisementStatus = js.native
  /** Gets or sets the Auto Accept property for this service advertisement. */
  var autoAcceptSession: scala.Boolean = js.native
  /** Gets or sets a custom service status code. Only valid if the ServiceStatus property value is Custom. */
  var customServiceStatusCode: scala.Double = js.native
  /** Gets or sets the service-specific information that is passed to a session requester when establishing a session will not be completed immediately, as when, for example, the service is waiting for user input to complete the request. A requester should implement a 120 second timeout when its request is deferred. */
  var deferredSessionInfo: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Event raised when the AdvertisementStatus property value changes. */
  @JSName("onadvertisementstatuschanged")
  var onadvertisementstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceAdvertiser, _] = js.native
  /** Event raised when the service has automatically accepted a session request. Your event handler should establish socket connections for the endpoint pairs listed in the event arguments object. */
  @JSName("onautoacceptsessionconnected")
  var onautoacceptsessionconnected_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceAutoAcceptSessionConnectedEventArgs] = js.native
  /** Event raised when a Seeker has requested that a session be established with the service associated with this WiFiDirectServiceAdvertiser instance. To accept the request, call WiFiDirectServiceAdvertiser.ConnectAsync in your event handler. */
  @JSName("onsessionrequested")
  var onsessionrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceSessionRequestedEventArgs] = js.native
  /** Gets or sets a value indicating whether the service requires that it be the Wi-Fi Direct Peer to Peer (P2P) Group Owner. */
  var preferGroupOwnerMode: scala.Boolean = js.native
  /** Gets a list (that implements the IVector interface) of preferred session configuration methods. Your code uses IVector operations on the list to add or remove elements from the list. */
  var preferredConfigurationMethods: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[WiFiDirectServiceConfigurationMethod] = js.native
  /** Gets a specific error code when AdvertisementStatus is Aborted. */
  var serviceError: WiFiDirectServiceError = js.native
  /** Gets or sets the service information blob. The format and contents of the blob are determined by the individual service, and are intended to be used by Seekers during service discovery. */
  var serviceInfo: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the service name. */
  var serviceName: java.lang.String = js.native
  /** Gets a list of service name prefixes that should match this service when a seeker is using prefix searching. Your code uses IVector methods to add or remove elements from the list. */
  var serviceNamePrefixes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the service status. */
  var serviceStatus: WiFiDirectServiceStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_advertisementstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.advertisementstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceAdvertiser, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autoacceptsessionconnected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.autoacceptsessionconnected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceAutoAcceptSessionConnectedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sessionrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sessionrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceSessionRequestedEventArgs]
  ): scala.Unit = js.native
  /**
                       * Accepts a session request without requiring a PIN.
                       * @param deviceInfo Describes the device to be connected. Pass in the WiFiDirectServiceSessionRequestedEventArgs.DeviceInformation property value.
                       * @return An asynchronous connection operation. On successful completion, returns an object that describes the session that has been created.
                       */
  def connectAsync(deviceInfo: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[WiFiDirectServiceSession] = js.native
  /**
                       * Accepts a session request by connecting with the given PIN.
                       * @param deviceInfo Describes the device to be connected. Pass in the WiFiDirectServiceSessionRequestedEventArgs.DeviceInformation property value.
                       * @param pin The PIN to be used to configure the session.
                       * @return An asynchronous connection operation. On successful completion, returns an object that describes the session that has been created.
                       */
  def connectAsync(
    deviceInfo: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation,
    pin: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[WiFiDirectServiceSession] = js.native
  /** Event raised when the AdvertisementStatus property value changes. */
  def onadvertisementstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[WiFiDirectServiceAdvertiser]): scala.Unit = js.native
  /** Event raised when the service has automatically accepted a session request. Your event handler should establish socket connections for the endpoint pairs listed in the event arguments object. */
  def onautoacceptsessionconnected(
    ev: WiFiDirectServiceAutoAcceptSessionConnectedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[WiFiDirectServiceAdvertiser]
  ): scala.Unit = js.native
  /** Event raised when a Seeker has requested that a session be established with the service associated with this WiFiDirectServiceAdvertiser instance. To accept the request, call WiFiDirectServiceAdvertiser.ConnectAsync in your event handler. */
  def onsessionrequested(
    ev: WiFiDirectServiceSessionRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[WiFiDirectServiceAdvertiser]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_advertisementstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.advertisementstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceAdvertiser, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_autoacceptsessionconnected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.autoacceptsessionconnected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceAutoAcceptSessionConnectedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sessionrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sessionrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceSessionRequestedEventArgs]
  ): scala.Unit = js.native
  /** Starts advertising the service, using current property values to set the parameters of the advertisement. */
  def start(): scala.Unit = js.native
  /** Stops advertising the service. This does not affect existing sessions that are connected to the service. */
  def stop(): scala.Unit = js.native
}

