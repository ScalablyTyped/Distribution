package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the reading–changed event of the proximity sensor. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensorReadingChangedEventArgs")
@js.native
abstract class ProximitySensorReadingChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.ProximitySensorReadingChangedEventArgs {
  
  /** Gets or sets the most recent proximity sensor reading. */
  /* CompleteClass */
  var reading: typings.winrtUwp.Windows.Devices.Sensors.ProximitySensorReading = js.native
}
