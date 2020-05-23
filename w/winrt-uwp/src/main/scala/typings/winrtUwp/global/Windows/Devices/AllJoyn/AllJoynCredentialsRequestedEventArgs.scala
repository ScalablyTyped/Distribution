package typings.winrtUwp.global.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a request for credentials in order to authenticate to a peer. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentialsRequestedEventArgs")
@js.native
abstract class AllJoynCredentialsRequestedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynCredentialsRequestedEventArgs {
  /** The number of times the credential request has been tried. */
  /* CompleteClass */
  override var attemptCount: Double = js.native
  /** The authentication credentials to be filled in by the app. */
  /* CompleteClass */
  override var credentials: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynCredentials = js.native
  /** The unique bus name of the remote app that provided the requested credentials. */
  /* CompleteClass */
  override var peerUniqueName: String = js.native
  /** A user name value used by mechanisms that accept a user name/password pair. */
  /* CompleteClass */
  override var requestedUserName: String = js.native
  /**
    * Allows JavaScript Windows Store apps to handle the verification of provided of credentials asynchronously.
    * @return The credential request deferral.
    */
  /* CompleteClass */
  override def getDeferral(): Deferral = js.native
}

