package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the recently swiped vendor card. */
trait MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs extends StObject {
  
  /** Gets data for the recently swiped vendor card. */
  var report: MagneticStripeReaderReport
}
object MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs {
  
  inline def apply(report: MagneticStripeReaderReport): MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReport(value: MagneticStripeReaderReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
  }
}
