package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.servicekindsupportedchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for accessing the Rich Communication Services (RCS) transport. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsTransport")
@js.native
abstract class RcsTransport () extends js.Object {
  /** Gets a configuration object that describes the transport settings. */
  var configuration: RcsTransportConfiguration = js.native
  /** Gets a name-value pair for extensibility of service provider configuration values. */
  var extendedProperties: IMapView[String, _] = js.native
  /** Gets a Boolean value indicating if the transport is active. */
  var isActive: Boolean = js.native
  /** Occurs when the service capabilities change. */
  @JSName("onservicekindsupportedchanged")
  var onservicekindsupportedchanged_Original: TypedEventHandler[RcsTransport, RcsServiceKindSupportedChangedEventArgs] = js.native
  /** Gets the friendly name of the transport. */
  var transportFriendlyName: String = js.native
  /** Gets the ID for the transport that is unique on the device. */
  var transportId: String = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_servicekindsupportedchanged(
    `type`: servicekindsupportedchanged,
    listener: TypedEventHandler[RcsTransport, RcsServiceKindSupportedChangedEventArgs]
  ): Unit = js.native
  /**
    * Gets a Boolean value indicating if the specified service kind is supported, such as chat, group chat, file transfer, and so on.
    * @param serviceKind The service kind to verify.
    * @return TRUE if the RcsServiceKind specified in the serviceKind parameter is supported.
    */
  def isServiceKindSupported(serviceKind: RcsServiceKind): Boolean = js.native
  /**
    * Gets a Boolean value indicating if the specified service kind supports store and forward functionality.
    * @param serviceKind The service kind to check for store and forward functionality.
    * @return A Boolean value indicating if the serviceKind supports store and forward.
    */
  def isStoreAndForwardEnabled(serviceKind: RcsServiceKind): Boolean = js.native
  /** Occurs when the service capabilities change. */
  def onservicekindsupportedchanged(ev: RcsServiceKindSupportedChangedEventArgs with WinRTEvent[RcsTransport]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_servicekindsupportedchanged(
    `type`: servicekindsupportedchanged,
    listener: TypedEventHandler[RcsTransport, RcsServiceKindSupportedChangedEventArgs]
  ): Unit = js.native
}

