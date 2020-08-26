package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a custom sensor and its related motion data. */
@JSGlobal("Windows.Devices.Sensors.Custom")
@js.native
object Custom extends js.Object {
  /** Represents a custom sensor. */
  @js.native
  abstract class CustomSensor ()
    extends typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensor
  
  /** Represents a property set of key/value pairs that contain the custom data sent from the sensor’s driver to the app. */
  @js.native
  abstract class CustomSensorReading ()
    extends typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensorReading
  
  /** Represents data for the reading–changed event of the custom sensor. */
  @js.native
  abstract class CustomSensorReadingChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensorReadingChangedEventArgs
  
  /* static members */
  @js.native
  object CustomSensor extends js.Object {
    /**
      * Asynchronously obtains the sensor from its identifier.
      * @param sensorId The sensor identifier.
      * @return Returns the CustomSensor object from its identifier.
      */
    def fromIdAsync(sensorId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensor] = js.native
    /**
      * Gets the device selector from the given interface identifier.
      * @param interfaceId The interface Guid that is associated with the custom sensor. This Guid is defined and registered by the sensor.
      * @return Returns the device selector, if it exists; otherwise, null.
      */
    def getDeviceSelector(interfaceId: String): String = js.native
  }
  
}

