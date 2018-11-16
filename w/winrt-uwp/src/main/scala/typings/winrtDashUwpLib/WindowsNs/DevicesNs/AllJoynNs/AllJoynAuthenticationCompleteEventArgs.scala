package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a successful or unsuccessful completion of an authentication operation. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAuthenticationCompleteEventArgs")
@js.native
abstract class AllJoynAuthenticationCompleteEventArgs () extends js.Object {
  /** The mechanism used during authentication. */
  var authenticationMechanism: AllJoynAuthenticationMechanism = js.native
  /** The unique bus name of the Consumer being authenticated. On the initiating side this will be the unique bus name of the remote app being authenticated. On the accepting side this will be the unique bus name for the remote app. */
  var peerUniqueName: java.lang.String = js.native
  /** Indicates if the remote app was authenticated. */
  var succeeded: scala.Boolean = js.native
}

