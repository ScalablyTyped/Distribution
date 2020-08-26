package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides error information. */
@js.native
trait UnifiedPosErrorData extends js.Object {
  /** Gets the vendor specific error information. */
  var extendedReason: Double = js.native
  /** Gets the error message. */
  var message: String = js.native
  /** Gets the cause of the error. */
  var reason: UnifiedPosErrorReason = js.native
  /** Gets the error severity. */
  var severity: UnifiedPosErrorSeverity = js.native
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
  @scala.inline
  implicit class UnifiedPosErrorDataOps[Self <: UnifiedPosErrorData] (val x: Self) extends AnyVal {
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
    def setExtendedReason(value: Double): Self = this.set("extendedReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: UnifiedPosErrorReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: UnifiedPosErrorSeverity): Self = this.set("severity", value.asInstanceOf[js.Any])
  }
  
}

