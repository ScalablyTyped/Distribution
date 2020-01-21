package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides error information. */
@JSGlobal("Windows.Devices.PointOfService.UnifiedPosErrorData")
@js.native
abstract class UnifiedPosErrorData () extends js.Object {
  /** Gets the vendor specific error information. */
  var extendedReason: Double = js.native
  /** Gets the error message. */
  var message: String = js.native
  /** Gets the cause of the error. */
  var reason: UnifiedPosErrorReason = js.native
  /** Gets the error severity. */
  var severity: UnifiedPosErrorSeverity = js.native
}

