package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a request for credentials in order to authenticate to a peer. */
@js.native
trait AllJoynCredentialsRequestedEventArgs extends js.Object {
  /** The number of times the credential request has been tried. */
  var attemptCount: Double = js.native
  /** The authentication credentials to be filled in by the app. */
  var credentials: AllJoynCredentials = js.native
  /** The unique bus name of the remote app that provided the requested credentials. */
  var peerUniqueName: String = js.native
  /** A user name value used by mechanisms that accept a user name/password pair. */
  var requestedUserName: String = js.native
  /**
    * Allows JavaScript Windows Store apps to handle the verification of provided of credentials asynchronously.
    * @return The credential request deferral.
    */
  def getDeferral(): Deferral = js.native
}

object AllJoynCredentialsRequestedEventArgs {
  @scala.inline
  def apply(
    attemptCount: Double,
    credentials: AllJoynCredentials,
    getDeferral: () => Deferral,
    peerUniqueName: String,
    requestedUserName: String
  ): AllJoynCredentialsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(attemptCount = attemptCount.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), peerUniqueName = peerUniqueName.asInstanceOf[js.Any], requestedUserName = requestedUserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynCredentialsRequestedEventArgs]
  }
  @scala.inline
  implicit class AllJoynCredentialsRequestedEventArgsOps[Self <: AllJoynCredentialsRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttemptCount(value: Double): Self = this.set("attemptCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentials(value: AllJoynCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setPeerUniqueName(value: String): Self = this.set("peerUniqueName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedUserName(value: String): Self = this.set("requestedUserName", value.asInstanceOf[js.Any])
  }
  
}

