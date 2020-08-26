package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the PosPrinter.StatusUpdated event that occurs when the status of a point-of-service printer changes. */
@js.native
trait PosPrinterStatusUpdatedEventArgs extends js.Object {
  /** Gets the new status of the point-of-service printer after the status of the printer changes. */
  var status: PosPrinterStatus = js.native
}

object PosPrinterStatusUpdatedEventArgs {
  @scala.inline
  def apply(status: PosPrinterStatus): PosPrinterStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosPrinterStatusUpdatedEventArgs]
  }
  @scala.inline
  implicit class PosPrinterStatusUpdatedEventArgsOps[Self <: PosPrinterStatusUpdatedEventArgs] (val x: Self) extends AnyVal {
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
    def setStatus(value: PosPrinterStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

