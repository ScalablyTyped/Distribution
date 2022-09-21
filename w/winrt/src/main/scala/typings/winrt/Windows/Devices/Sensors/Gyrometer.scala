package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gyrometer
  extends StObject
     with IGyrometer
object Gyrometer {
  
  inline def apply(
    getCurrentReading: () => GyrometerReading,
    minimumReportInterval: Double,
    onreadingchanged: Any,
    reportInterval: Double
  ): Gyrometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gyrometer]
  }
}
