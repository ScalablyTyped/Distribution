package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.authenticationcomplete
import typings.winrtUwp.winrtUwpStrings.credentialsrequested
import typings.winrtUwp.winrtUwpStrings.credentialsverificationrequested
import typings.winrtUwp.winrtUwpStrings.statechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a connection to the underlying communication pipeline (transport agnostic) that AllJoyn uses to communicate with other endpoints regardless of the transport. */
@js.native
trait AllJoynBusAttachment extends StObject {
  
  /** This property returns an AllJoynAboutData object containing the descriptive data that the platform may advertise on behalf of the app. */
  var aboutData: AllJoynAboutData = js.native
  
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
  
  /** A list of AllJoynAuthenticationMechanism objects representing the acceptable authentication mechanisms. Default values include Rsa and None. */
  var authenticationMechanisms: IVector[AllJoynAuthenticationMechanism] = js.native
  
  /** Initiates the connection. */
  def connect(): Unit = js.native
  
  /** The connection specification used to establish and maintain the bus attachment. If a specification was not provided, this property will retrieve a default named pipe specification. */
  var connectionSpecification: String = js.native
  
  /** Initiates a disconnect operation from the router node (bus). */
  def disconnect(): Unit = js.native
  
  /** Occurs when verification of supplied credentials is complete. */
  def onauthenticationcomplete(ev: AllJoynAuthenticationCompleteEventArgs with WinRTEvent[AllJoynBusAttachment]): Unit = js.native
  /** Occurs when verification of supplied credentials is complete. */
  @JSName("onauthenticationcomplete")
  var onauthenticationcomplete_Original: TypedEventHandler[AllJoynBusAttachment, AllJoynAuthenticationCompleteEventArgs] = js.native
  
  /** Occurs when credentials are requested for authentication. */
  def oncredentialsrequested(ev: AllJoynCredentialsRequestedEventArgs with WinRTEvent[AllJoynBusAttachment]): Unit = js.native
  /** Occurs when credentials are requested for authentication. */
  @JSName("oncredentialsrequested")
  var oncredentialsrequested_Original: TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsRequestedEventArgs] = js.native
  
  /** Occurs when credentials have been provided by a remote Consumer for verification. */
  def oncredentialsverificationrequested(ev: AllJoynCredentialsVerificationRequestedEventArgs with WinRTEvent[AllJoynBusAttachment]): Unit = js.native
  /** Occurs when credentials have been provided by a remote Consumer for verification. */
  @JSName("oncredentialsverificationrequested")
  var oncredentialsverificationrequested_Original: TypedEventHandler[AllJoynBusAttachment, AllJoynCredentialsVerificationRequestedEventArgs] = js.native
  
  /** Occurs when the state of the bus attachment changes. The AllJoynBusAttachmentState enumeration defines the possible state values. */
  def onstatechanged(ev: AllJoynBusAttachmentStateChangedEventArgs with WinRTEvent[AllJoynBusAttachment]): Unit = js.native
  /** Occurs when the state of the bus attachment changes. The AllJoynBusAttachmentState enumeration defines the possible state values. */
  @JSName("onstatechanged")
  var onstatechanged_Original: TypedEventHandler[AllJoynBusAttachment, AllJoynBusAttachmentStateChangedEventArgs] = js.native
  
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
  
  /** The current state of the bus attachment. State changes are surfaced via StateChanged events. Possible values are defined by the AllJoynBusAttachmentState enumeration. */
  var state: AllJoynBusAttachmentState = js.native
  
  /** The unique bus name associated with the remote app. This unique bus name is used to represent it on the bus via the bus attachment. */
  var uniqueName: String = js.native
}
