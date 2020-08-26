package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the status of a point-of-service printer, such as the power state of the printer. */
@js.native
trait PosPrinterStatus extends js.Object {
  /** Gets extended information about the power state of the point-of-service printer that the original equipment manufacturer (OEM) defines. Value is only valid if the PosPrinterStatus.StatusKind property is PosPrinterStatusKind.Extended. */
  var extendedStatus: Double = js.native
  /** Gets the power state of a point-of-service printer. */
  var statusKind: PosPrinterStatusKind = js.native
}

object PosPrinterStatus {
  @scala.inline
  def apply(extendedStatus: Double, statusKind: PosPrinterStatusKind): PosPrinterStatus = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], statusKind = statusKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosPrinterStatus]
  }
  @scala.inline
  implicit class PosPrinterStatusOps[Self <: PosPrinterStatus] (val x: Self) extends AnyVal {
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
    def setStatusKind(value: PosPrinterStatusKind): Self = this.set("statusKind", value.asInstanceOf[js.Any])
  }
  
}

