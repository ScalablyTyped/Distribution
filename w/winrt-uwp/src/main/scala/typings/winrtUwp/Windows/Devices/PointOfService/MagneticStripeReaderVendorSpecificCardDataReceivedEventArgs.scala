package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the recently swiped vendor card. */
@js.native
trait MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs extends js.Object {
  
  /** Gets data for the recently swiped vendor card. */
  var report: MagneticStripeReaderReport = js.native
}
object MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs {
  
  @scala.inline
  def apply(report: MagneticStripeReaderReport): MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs]
  }
  
  @scala.inline
  implicit class MagneticStripeReaderVendorSpecificCardDataReceivedEventArgsOps[Self <: MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReport(value: MagneticStripeReaderReport): Self = this.set("report", value.asInstanceOf[js.Any])
  }
}
