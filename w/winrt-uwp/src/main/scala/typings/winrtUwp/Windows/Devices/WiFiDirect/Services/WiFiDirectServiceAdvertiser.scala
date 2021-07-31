package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.advertisementstatuschanged
import typings.winrtUwp.winrtUwpStrings.autoacceptsessionconnected
import typings.winrtUwp.winrtUwpStrings.sessionrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Service Advertiser. This class is used by code on a device that advertises Wi-Fi Direct Services, to advertise the service. */
@js.native
trait WiFiDirectServiceAdvertiser extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_advertisementstatuschanged(
    `type`: advertisementstatuschanged,
    listener: TypedEventHandler[WiFiDirectServiceAdvertiser, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autoacceptsessionconnected(
    `type`: autoacceptsessionconnected,
    listener: TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceAutoAcceptSessionConnectedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sessionrequested(
    `type`: sessionrequested,
    listener: TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceSessionRequestedEventArgs]
  ): Unit = js.native
  
  /** Gets a value that describes the current status of the advertisement. */
  var advertisementStatus: WiFiDirectServiceAdvertisementStatus = js.native
  
  /** Gets or sets the Auto Accept property for this service advertisement. */
  var autoAcceptSession: Boolean = js.native
  
  /**
    * Accepts a session request without requiring a PIN.
    * @param deviceInfo Describes the device to be connected. Pass in the WiFiDirectServiceSessionRequestedEventArgs.DeviceInformation property value.
    * @return An asynchronous connection operation. On successful completion, returns an object that describes the session that has been created.
    */
  def connectAsync(deviceInfo: DeviceInformation): IPromiseWithIAsyncOperation[WiFiDirectServiceSession] = js.native
  /**
    * Accepts a session request by connecting with the given PIN.
    * @param deviceInfo Describes the device to be connected. Pass in the WiFiDirectServiceSessionRequestedEventArgs.DeviceInformation property value.
    * @param pin The PIN to be used to configure the session.
    * @return An asynchronous connection operation. On successful completion, returns an object that describes the session that has been created.
    */
  def connectAsync(deviceInfo: DeviceInformation, pin: String): IPromiseWithIAsyncOperation[WiFiDirectServiceSession] = js.native
  
  /** Gets or sets a custom service status code. Only valid if the ServiceStatus property value is Custom. */
  var customServiceStatusCode: Double = js.native
  
  /** Gets or sets the service-specific information that is passed to a session requester when establishing a session will not be completed immediately, as when, for example, the service is waiting for user input to complete the request. A requester should implement a 120 second timeout when its request is deferred. */
  var deferredSessionInfo: IBuffer = js.native
  
  /** Event raised when the AdvertisementStatus property value changes. */
  def onadvertisementstatuschanged(ev: js.Any & WinRTEvent[WiFiDirectServiceAdvertiser]): Unit = js.native
  /** Event raised when the AdvertisementStatus property value changes. */
  @JSName("onadvertisementstatuschanged")
  var onadvertisementstatuschanged_Original: TypedEventHandler[WiFiDirectServiceAdvertiser, js.Any] = js.native
  
  /** Event raised when the service has automatically accepted a session request. Your event handler should establish socket connections for the endpoint pairs listed in the event arguments object. */
  def onautoacceptsessionconnected(ev: WiFiDirectServiceAutoAcceptSessionConnectedEventArgs & WinRTEvent[WiFiDirectServiceAdvertiser]): Unit = js.native
  /** Event raised when the service has automatically accepted a session request. Your event handler should establish socket connections for the endpoint pairs listed in the event arguments object. */
  @JSName("onautoacceptsessionconnected")
  var onautoacceptsessionconnected_Original: TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceAutoAcceptSessionConnectedEventArgs] = js.native
  
  /** Event raised when a Seeker has requested that a session be established with the service associated with this WiFiDirectServiceAdvertiser instance. To accept the request, call WiFiDirectServiceAdvertiser.ConnectAsync in your event handler. */
  def onsessionrequested(ev: WiFiDirectServiceSessionRequestedEventArgs & WinRTEvent[WiFiDirectServiceAdvertiser]): Unit = js.native
  /** Event raised when a Seeker has requested that a session be established with the service associated with this WiFiDirectServiceAdvertiser instance. To accept the request, call WiFiDirectServiceAdvertiser.ConnectAsync in your event handler. */
  @JSName("onsessionrequested")
  var onsessionrequested_Original: TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceSessionRequestedEventArgs] = js.native
  
  /** Gets or sets a value indicating whether the service requires that it be the Wi-Fi Direct Peer to Peer (P2P) Group Owner. */
  var preferGroupOwnerMode: Boolean = js.native
  
  /** Gets a list (that implements the IVector interface) of preferred session configuration methods. Your code uses IVector operations on the list to add or remove elements from the list. */
  var preferredConfigurationMethods: IVector[WiFiDirectServiceConfigurationMethod] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_advertisementstatuschanged(
    `type`: advertisementstatuschanged,
    listener: TypedEventHandler[WiFiDirectServiceAdvertiser, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_autoacceptsessionconnected(
    `type`: autoacceptsessionconnected,
    listener: TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceAutoAcceptSessionConnectedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sessionrequested(
    `type`: sessionrequested,
    listener: TypedEventHandler[WiFiDirectServiceAdvertiser, WiFiDirectServiceSessionRequestedEventArgs]
  ): Unit = js.native
  
  /** Gets a specific error code when AdvertisementStatus is Aborted. */
  var serviceError: WiFiDirectServiceError = js.native
  
  /** Gets or sets the service information blob. The format and contents of the blob are determined by the individual service, and are intended to be used by Seekers during service discovery. */
  var serviceInfo: IBuffer = js.native
  
  /** Gets the service name. */
  var serviceName: String = js.native
  
  /** Gets a list of service name prefixes that should match this service when a seeker is using prefix searching. Your code uses IVector methods to add or remove elements from the list. */
  var serviceNamePrefixes: IVector[String] = js.native
  
  /** Gets or sets the service status. */
  var serviceStatus: WiFiDirectServiceStatus = js.native
  
  /** Starts advertising the service, using current property values to set the parameters of the advertisement. */
  def start(): Unit = js.native
  
  /** Stops advertising the service. This does not affect existing sessions that are connected to the service. */
  def stop(): Unit = js.native
}
