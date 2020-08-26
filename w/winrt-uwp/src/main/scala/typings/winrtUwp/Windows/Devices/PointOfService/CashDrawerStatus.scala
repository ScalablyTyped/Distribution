package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the current power and availability status of the cash drawer. */
@js.native
trait CashDrawerStatus extends js.Object {
  /** ExtendedStatus provides a way for a Point of Service driver or provider to send custom notifications to the app. */
  var extendedStatus: Double = js.native
  /** Gets the status kind for the cash drawer status. */
  var statusKind: CashDrawerStatusKind = js.native
}

object CashDrawerStatus {
  @scala.inline
  def apply(extendedStatus: Double, statusKind: CashDrawerStatusKind): CashDrawerStatus = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], statusKind = statusKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerStatus]
  }
  @scala.inline
  implicit class CashDrawerStatusOps[Self <: CashDrawerStatus] (val x: Self) extends AnyVal {
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
    def setExtendedStatus(value: Double): Self = this.set("extendedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusKind(value: CashDrawerStatusKind): Self = this.set("statusKind", value.asInstanceOf[js.Any])
  }
  
}

