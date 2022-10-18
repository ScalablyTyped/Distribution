package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a custom sensor and its related motion data. */
object Custom {
  
  /** Represents a custom sensor. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.Custom.CustomSensor")
  @js.native
  open class CustomSensor ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensor
  object CustomSensor {
    
    @JSGlobal("Windows.Devices.Sensors.Custom.CustomSensor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Asynchronously obtains the sensor from its identifier.
      * @param sensorId The sensor identifier.
      * @return Returns the CustomSensor object from its identifier.
      */
    /* static member */
    inline def fromIdAsync(sensorId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensor] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(sensorId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensor]]
    
    /**
      * Gets the device selector from the given interface identifier.
      * @param interfaceId The interface Guid that is associated with the custom sensor. This Guid is defined and registered by the sensor.
      * @return Returns the device selector, if it exists; otherwise, null.
      */
    /* static member */
    inline def getDeviceSelector(interfaceId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(interfaceId.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /** Represents a property set of key/value pairs that contain the custom data sent from the sensor’s driver to the app. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.Custom.CustomSensorReading")
  @js.native
  open class CustomSensorReading ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensorReading {
    
    /** Gets the property set for the sensor. */
    /* CompleteClass */
    var properties: IMapView[String, Any] = js.native
    
    /** Gets the time at which the sensor reported the reading. */
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  /** Represents data for the reading–changed event of the custom sensor. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.Custom.CustomSensorReadingChangedEventArgs")
  @js.native
  open class CustomSensorReadingChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensorReadingChangedEventArgs {
    
    /** Gets the most recent sensor reading. */
    /* CompleteClass */
    var reading: typings.winrtUwp.Windows.Devices.Sensors.Custom.CustomSensorReading = js.native
  }
}
