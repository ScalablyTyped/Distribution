package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the compass reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.CompassReadingChangedEventArgs")
@js.native
abstract class CompassReadingChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.CompassReadingChangedEventArgs {
  
  /** Gets the current compass reading. */
  /* CompleteClass */
  var reading: typings.winrtUwp.Windows.Devices.Sensors.CompassReading = js.native
}
