package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompassReadingChangedEventArgs
  extends StObject
     with ICompassReadingChangedEventArgs
object CompassReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: CompassReading): CompassReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassReadingChangedEventArgs]
  }
}
