package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a collection of properties used to convey meaning for AllJoyn status codes. For possible status values, refer to the AllJoyn standard documentation. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus")
@js.native
abstract class AllJoynStatus () extends js.Object

/** Defines a collection of properties used to convey meaning for AllJoyn status codes. For possible status values, refer to the AllJoyn standard documentation. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus")
@js.native
object AllJoynStatus extends js.Object {
  /** Indicates that authentication could not be completed. */
  var authenticationFailed: scala.Double = js.native
  /** Authentication was rejected by the advertising app. */
  var authenticationRejectedByUser: scala.Double = js.native
  /** The connection to the session was refused. */
  var connectionRefused: scala.Double = js.native
  /** The operation has failed. */
  var fail: scala.Double = js.native
  /** Insufficient security provided for session connections. */
  var insufficientSecurity: scala.Double = js.native
  /** Function call argument 1 is invalid. */
  var invalidArgument1: scala.Double = js.native
  /** Function call argument 2 is invalid. */
  var invalidArgument2: scala.Double = js.native
  /** Function call argument 3 is invalid. */
  var invalidArgument3: scala.Double = js.native
  /** Function call argument 4 is invalid. */
  var invalidArgument4: scala.Double = js.native
  /** Function call argument 5 is invalid. */
  var invalidArgument5: scala.Double = js.native
  /** Function call argument 6 is invalid. */
  var invalidArgument6: scala.Double = js.native
  /** Function call argument 7 is invalid. */
  var invalidArgument7: scala.Double = js.native
  /** Function call argument 8 is invalid. */
  var invalidArgument8: scala.Double = js.native
  /** Operation successful. */
  var ok: scala.Double = js.native
  /** The operation timed out. */
  var operationTimedOut: scala.Double = js.native
  /** The Producer end of the session connection was closed. */
  var otherEndClosed: scala.Double = js.native
  /** The SSL connection has failed. */
  var sslConnectFailed: scala.Double = js.native
  /** The SSL verification failed. Review provided SSL credentials. */
  var sslIdentityVerificationFailed: scala.Double = js.native
}

