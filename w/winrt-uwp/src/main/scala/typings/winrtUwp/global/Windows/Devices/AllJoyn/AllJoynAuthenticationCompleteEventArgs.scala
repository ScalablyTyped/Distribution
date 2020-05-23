package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a successful or unsuccessful completion of an authentication operation. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAuthenticationCompleteEventArgs")
@js.native
abstract class AllJoynAuthenticationCompleteEventArgs ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationCompleteEventArgs {
  /** The mechanism used during authentication. */
  /* CompleteClass */
  override var authenticationMechanism: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism = js.native
  /** The unique bus name of the Consumer being authenticated. On the initiating side this will be the unique bus name of the remote app being authenticated. On the accepting side this will be the unique bus name for the remote app. */
  /* CompleteClass */
  override var peerUniqueName: String = js.native
  /** Indicates if the remote app was authenticated. */
  /* CompleteClass */
  override var succeeded: Boolean = js.native
}

