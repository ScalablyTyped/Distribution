package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

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
  var extendedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /** Gets a Boolean value indicating if the transport is active. */
  var isActive: scala.Boolean = js.native
  /** Occurs when the service capabilities change. */
  @JSName("onservicekindsupportedchanged")
  var onservicekindsupportedchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[RcsTransport, RcsServiceKindSupportedChangedEventArgs] = js.native
  /** Gets the friendly name of the transport. */
  var transportFriendlyName: java.lang.String = js.native
  /** Gets the ID for the transport that is unique on the device. */
  var transportId: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_servicekindsupportedchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.servicekindsupportedchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[RcsTransport, RcsServiceKindSupportedChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Gets a Boolean value indicating if the specified service kind is supported, such as chat, group chat, file transfer, and so on.
                   * @param serviceKind The service kind to verify.
                   * @return TRUE if the RcsServiceKind specified in the serviceKind parameter is supported.
                   */
  def isServiceKindSupported(serviceKind: RcsServiceKind): scala.Boolean = js.native
  /**
                   * Gets a Boolean value indicating if the specified service kind supports store and forward functionality.
                   * @param serviceKind The service kind to check for store and forward functionality.
                   * @return A Boolean value indicating if the serviceKind supports store and forward.
                   */
  def isStoreAndForwardEnabled(serviceKind: RcsServiceKind): scala.Boolean = js.native
  /** Occurs when the service capabilities change. */
  def onservicekindsupportedchanged(
    ev: RcsServiceKindSupportedChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[RcsTransport]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_servicekindsupportedchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.servicekindsupportedchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[RcsTransport, RcsServiceKindSupportedChangedEventArgs]
  ): scala.Unit = js.native
}

