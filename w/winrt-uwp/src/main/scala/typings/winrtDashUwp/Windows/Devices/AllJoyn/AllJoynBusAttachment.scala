package typings.winrtDashUwp.Windows.Devices.AllJoyn

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.authenticationcomplete
import typings.winrtDashUwp.winrtDashUwpStrings.credentialsrequested
import typings.winrtDashUwp.winrtDashUwpStrings.credentialsverificationrequested
import typings.winrtDashUwp.winrtDashUwpStrings.statechanged
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
  def this(connectionSpecification: String) = this()
  /** This property returns an AllJoynAboutData object containing the descriptive data that the platform may advertise on behalf of the app. */
  var aboutData: AllJoynAboutData = js.native
  /** A list of AllJoynAuthenticationMechanism objects representing the acceptable authentication mechanisms. Default values include Rsa and None. */
  var authenticationMechanisms: IVector[AllJoynAuthenticationMechanism] = js.native
  /** The connection specification used to establish and maintain the bus attachment. If a specification was not provided, this property will retrieve a default named pipe specification. */
  var connectionSpecification: String = js.native
  /** Occurs when verification of supplied credentials is complete. */
  @JSName("onauthenticationcomplete")
  var onauthenticationcomplete_Original: TypedEventHandler[AllJoynBusAttachment, AllJoynAuthenticationCompleteEventArgs] = js.native
  /** Occurs when credentials are requested for authentication. */
  @JSName("oncredentialsrequested")
  var oncredentialsrequested_Original: TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsRequestedEventArgs] = js.native
  /** Occurs when credentials have been provided by a remote Consumer for verification. */
  @JSName("oncredentialsverificationrequested")
  var oncredentialsverificationrequested_Original: TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsVerificationRequestedEventArgs] = js.native
  /** Occurs when the state of the bus attachment changes. The AllJoynBusAttachmentState enumeration defines the possible state values. */
  @JSName("onstatechanged")
  var onstatechanged_Original: TypedEventHandler[AllJoynBusAttachment, AllJoynBusAttachmentStateChangedEventArgs] = js.native
  /** The current state of the bus attachment. State changes are surfaced via StateChanged events. Possible values are defined by the AllJoynBusAttachmentState enumeration. */
  var state: AllJoynBusAttachmentState = js.native
  /** The unique bus name associated with the remote app. This unique bus name is used to represent it on the bus via the bus attachment. */
  var uniqueName: String = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_authenticationcomplete(
    `type`: authenticationcomplete,
    listener: TypedEventHandler[AllJoynBusAttachment, AllJoynAuthenticationCompleteEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_credentialsrequested(
    `type`: credentialsrequested,
    listener: TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_credentialsverificationrequested(
    `type`: credentialsverificationrequested,
    listener: TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsVerificationRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(
    `type`: statechanged,
    listener: TypedEventHandler[AllJoynBusAttachment, AllJoynBusAttachmentStateChangedEventArgs]
  ): Unit = js.native
  /** Initiates the connection. */
  def connect(): Unit = js.native
  /** Initiates a disconnect operation from the router node (bus). */
  def disconnect(): Unit = js.native
  /** Occurs when verification of supplied credentials is complete. */
  def onauthenticationcomplete(ev: AllJoynAuthenticationCompleteEventArgs with WinRTEvent[AllJoynBusAttachment]): Unit = js.native
  /** Occurs when credentials are requested for authentication. */
  def oncredentialsrequested(ev: AllJoynCredentialsRequestedEventArgs with WinRTEvent[AllJoynBusAttachment]): Unit = js.native
  /** Occurs when credentials have been provided by a remote Consumer for verification. */
  def oncredentialsverificationrequested(ev: AllJoynCredentialsVerificationRequestedEventArgs with WinRTEvent[AllJoynBusAttachment]): Unit = js.native
  /** Occurs when the state of the bus attachment changes. The AllJoynBusAttachmentState enumeration defines the possible state values. */
  def onstatechanged(ev: AllJoynBusAttachmentStateChangedEventArgs with WinRTEvent[AllJoynBusAttachment]): Unit = js.native
  /**
    * Pings the specified connection asynchronously.
    * @param uniqueName The unique name associated with the connection.
    * @return An AllJoyn status code.
    */
  def pingAsync(uniqueName: String): IPromiseWithIAsyncOperation[Double] = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_authenticationcomplete(
    `type`: authenticationcomplete,
    listener: TypedEventHandler[AllJoynBusAttachment, AllJoynAuthenticationCompleteEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_credentialsrequested(
    `type`: credentialsrequested,
    listener: TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_credentialsverificationrequested(
    `type`: credentialsverificationrequested,
    listener: TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsVerificationRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(
    `type`: statechanged,
    listener: TypedEventHandler[AllJoynBusAttachment, AllJoynBusAttachmentStateChangedEventArgs]
  ): Unit = js.native
}

