package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a custom sensor and its related motion data. */
object Custom {
  
  /** Represents a custom sensor. */
  @js.native
  trait CustomSensor extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readingchanged(
      `type`: readingchanged,
      listener: TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs]
    ): Unit = js.native
    
    /** Gets the device identifier of the sensor. */
    var deviceId: String = js.native
    
    /**
      * Gets the current sensor reading.
      * @return The current sensor reading.
      */
    def getCurrentReading(): CustomSensorReading = js.native
    
    /** Gets the minimum report interval that is supported by the sensor. */
    var minimumReportInterval: Double = js.native
    
    /** Occurs each time the sensor reports a new sensor reading. */
    def onreadingchanged(ev: CustomSensorReadingChangedEventArgs & WinRTEvent[CustomSensor]): Unit = js.native
    /** Occurs each time the sensor reports a new sensor reading. */
    @JSName("onreadingchanged")
    var onreadingchanged_Original: TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readingchanged(
      `type`: readingchanged,
      listener: TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs]
    ): Unit = js.native
    
    /** Gets or sets the current report interval for the sensor. */
    var reportInterval: Double = js.native
  }
  
  /** Represents a property set of key/value pairs that contain the custom data sent from the sensor’s driver to the app. */
  trait CustomSensorReading extends StObject {
    
    /** Gets the property set for the sensor. */
    var properties: IMapView[String, js.Any]
    
    /** Gets the time at which the sensor reported the reading. */
    var timestamp: Date
  }
  object CustomSensorReading {
    
    inline def apply(properties: IMapView[String, js.Any], timestamp: Date): CustomSensorReading = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSensorReading]
    }
    
    extension [Self <: CustomSensorReading](x: Self) {
      
      inline def setProperties(value: IMapView[String, js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents data for the reading–changed event of the custom sensor. */
  trait CustomSensorReadingChangedEventArgs extends StObject {
    
    /** Gets the most recent sensor reading. */
    var reading: CustomSensorReading
  }
  object CustomSensorReadingChangedEventArgs {
    
    inline def apply(reading: CustomSensorReading): CustomSensorReadingChangedEventArgs = {
      val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSensorReadingChangedEventArgs]
    }
    
    extension [Self <: CustomSensorReadingChangedEventArgs](x: Self) {
      
      inline def setReading(value: CustomSensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
    }
  }
}
