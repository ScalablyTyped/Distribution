package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connection to the underlying communication pipeline (transport agnostic) that AllJoyn uses to communicate with other endpoints regardless of the transport. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachment")
@js.native
/** Generates an AllJoynBusAttachment object using the default named pipe connection specification. */
class AllJoynBusAttachment () extends js.Object {
  /**
    * Generates an AllJoynBusAttachment object using the provided connection specification.
    * @param connectionSpecification Specification used to initiate and maintain connections to a router node (bus). Windows 10 supports the 'npipe:' transport, formatted according to the D-Bus Specification.
    */
  def this(connectionSpecification: java.lang.String) = this()
  /** This property returns an AllJoynAboutData object containing the descriptive data that the platform may advertise on behalf of the app. */
  var aboutData: AllJoynAboutData = js.native
  /** A list of AllJoynAuthenticationMechanism objects representing the acceptable authentication mechanisms. Default values include Rsa and None. */
  var authenticationMechanisms: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[AllJoynAuthenticationMechanism] = js.native
  /** The connection specification used to establish and maintain the bus attachment. If a specification was not provided, this property will retrieve a default named pipe specification. */
  var connectionSpecification: java.lang.String = js.native
  /** Occurs when verification of supplied credentials is complete. */
  @JSName("onauthenticationcomplete")
  var onauthenticationcomplete_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynAuthenticationCompleteEventArgs] = js.native
  /** Occurs when credentials are requested for authentication. */
  @JSName("oncredentialsrequested")
  var oncredentialsrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsRequestedEventArgs] = js.native
  /** Occurs when credentials have been provided by a remote Consumer for verification. */
  @JSName("oncredentialsverificationrequested")
  var oncredentialsverificationrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsVerificationRequestedEventArgs] = js.native
  /** Occurs when the state of the bus attachment changes. The AllJoynBusAttachmentState enumeration defines the possible state values. */
  @JSName("onstatechanged")
  var onstatechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynBusAttachmentStateChangedEventArgs] = js.native
  /** The current state of the bus attachment. State changes are surfaced via StateChanged events. Possible values are defined by the AllJoynBusAttachmentState enumeration. */
  var state: AllJoynBusAttachmentState = js.native
  /** The unique bus name associated with the remote app. This unique bus name is used to represent it on the bus via the bus attachment. */
  var uniqueName: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_authenticationcomplete(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.authenticationcomplete,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynAuthenticationCompleteEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_credentialsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.credentialsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_credentialsverificationrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.credentialsverificationrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsVerificationRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynBusAttachmentStateChangedEventArgs]
  ): scala.Unit = js.native
  /** Initiates the connection. */
  def connect(): scala.Unit = js.native
  /** Initiates a disconnect operation from the router node (bus). */
  def disconnect(): scala.Unit = js.native
  /** Occurs when verification of supplied credentials is complete. */
  def onauthenticationcomplete(
    ev: AllJoynAuthenticationCompleteEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AllJoynBusAttachment]
  ): scala.Unit = js.native
  /** Occurs when credentials are requested for authentication. */
  def oncredentialsrequested(
    ev: AllJoynCredentialsRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AllJoynBusAttachment]
  ): scala.Unit = js.native
  /** Occurs when credentials have been provided by a remote Consumer for verification. */
  def oncredentialsverificationrequested(
    ev: AllJoynCredentialsVerificationRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AllJoynBusAttachment]
  ): scala.Unit = js.native
  /** Occurs when the state of the bus attachment changes. The AllJoynBusAttachmentState enumeration defines the possible state values. */
  def onstatechanged(
    ev: AllJoynBusAttachmentStateChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AllJoynBusAttachment]
  ): scala.Unit = js.native
  /**
    * Pings the specified connection asynchronously.
    * @param uniqueName The unique name associated with the connection.
    * @return An AllJoyn status code.
    */
  def pingAsync(uniqueName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double] = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_authenticationcomplete(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.authenticationcomplete,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynAuthenticationCompleteEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_credentialsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.credentialsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_credentialsverificationrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.credentialsverificationrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsVerificationRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AllJoynBusAttachment, AllJoynBusAttachmentStateChangedEventArgs]
  ): scala.Unit = js.native
}

