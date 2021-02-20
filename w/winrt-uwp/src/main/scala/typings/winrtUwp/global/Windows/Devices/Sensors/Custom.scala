package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a custom sensor and its related motion data. */
object Custom {
  
  /** Represents a custom sensor. */
  @JSGlobal("Windows.Devices.Sensors.Custom.CustomSensor")
  @js.native
  abstract class CustomSensor ()
    extends typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensor
  object CustomSensor {
    
    /**
      * Asynchronously obtains the sensor from its identifier.
      * @param sensorId The sensor identifier.
      * @return Returns the CustomSensor object from its identifier.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sensors.Custom.CustomSensor.fromIdAsync")
    @js.native
    def fromIdAsync(sensorId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensor] = js.native
    
    /**
      * Gets the device selector from the given interface identifier.
      * @param interfaceId The interface Guid that is associated with the custom sensor. This Guid is defined and registered by the sensor.
      * @return Returns the device selector, if it exists; otherwise, null.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Sensors.Custom.CustomSensor.getDeviceSelector")
    @js.native
    def getDeviceSelector(interfaceId: String): String = js.native
  }
  
  /** Represents a property set of key/value pairs that contain the custom data sent from the sensor’s driver to the app. */
  @JSGlobal("Windows.Devices.Sensors.Custom.CustomSensorReading")
  @js.native
  abstract class CustomSensorReading ()
    extends typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensorReading
  
  /** Represents data for the reading–changed event of the custom sensor. */
  @JSGlobal("Windows.Devices.Sensors.Custom.CustomSensorReadingChangedEventArgs")
  @js.native
  abstract class CustomSensorReadingChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensorReadingChangedEventArgs
}
