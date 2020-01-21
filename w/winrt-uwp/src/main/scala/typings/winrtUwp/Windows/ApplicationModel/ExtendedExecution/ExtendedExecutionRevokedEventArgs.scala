package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler that is invoked when the system revokes background execution. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedEventArgs")
@js.native
abstract class ExtendedExecutionRevokedEventArgs () extends js.Object {
  /** Gets the reason background execution was revoked. */
  var reason: ExtendedExecutionRevokedReason = js.native
}

