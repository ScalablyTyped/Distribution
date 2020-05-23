package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides error information. */
trait UnifiedPosErrorData extends js.Object {
  /** Gets the vendor specific error information. */
  var extendedReason: Double
  /** Gets the error message. */
  var message: String
  /** Gets the cause of the error. */
  var reason: UnifiedPosErrorReason
  /** Gets the error severity. */
  var severity: UnifiedPosErrorSeverity
}

object UnifiedPosErrorData {
  @scala.inline
  def apply(
    extendedReason: Double,
    message: String,
    reason: UnifiedPosErrorReason,
    severity: UnifiedPosErrorSeverity
  ): UnifiedPosErrorData = {
    val __obj = js.Dynamic.literal(extendedReason = extendedReason.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedPosErrorData]
  }
}

