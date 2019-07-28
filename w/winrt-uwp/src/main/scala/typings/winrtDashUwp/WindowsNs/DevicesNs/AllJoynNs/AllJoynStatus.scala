package typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a collection of properties used to convey meaning for AllJoyn status codes. For possible status values, refer to the AllJoyn standard documentation. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus")
@js.native
abstract class AllJoynStatus () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus")
@js.native
object AllJoynStatus extends js.Object {
  /** Indicates that authentication could not be completed. */
  var authenticationFailed: Double = js.native
  /** Authentication was rejected by the advertising app. */
  var authenticationRejectedByUser: Double = js.native
  /** The connection to the session was refused. */
  var connectionRefused: Double = js.native
  /** The operation has failed. */
  var fail: Double = js.native
  /** Insufficient security provided for session connections. */
  var insufficientSecurity: Double = js.native
  /** Function call argument 1 is invalid. */
  var invalidArgument1: Double = js.native
  /** Function call argument 2 is invalid. */
  var invalidArgument2: Double = js.native
  /** Function call argument 3 is invalid. */
  var invalidArgument3: Double = js.native
  /** Function call argument 4 is invalid. */
  var invalidArgument4: Double = js.native
  /** Function call argument 5 is invalid. */
  var invalidArgument5: Double = js.native
  /** Function call argument 6 is invalid. */
  var invalidArgument6: Double = js.native
  /** Function call argument 7 is invalid. */
  var invalidArgument7: Double = js.native
  /** Function call argument 8 is invalid. */
  var invalidArgument8: Double = js.native
  /** Operation successful. */
  var ok: Double = js.native
  /** The operation timed out. */
  var operationTimedOut: Double = js.native
  /** The Producer end of the session connection was closed. */
  var otherEndClosed: Double = js.native
  /** The SSL connection has failed. */
  var sslConnectFailed: Double = js.native
  /** The SSL verification failed. Review provided SSL credentials. */
  var sslIdentityVerificationFailed: Double = js.native
}

