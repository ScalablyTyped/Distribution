package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an orientation sensor. */
@js.native
trait OrientationSensor extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[OrientationSensor, OrientationSensorReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the current sensor reading.
    * @return The current sensor reading.
    */
  def getCurrentReading(): OrientationSensorReading = js.native
  
  /** Gets the minimum report interval supported by the sensor. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the orientation sensor reports a new sensor reading. */
  def onreadingchanged(ev: OrientationSensorReadingChangedEventArgs & WinRTEvent[OrientationSensor]): Unit = js.native
  /** Occurs each time the orientation sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[OrientationSensor, OrientationSensorReadingChangedEventArgs] = js.native
  
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  
  /** Gets the sensor reading type. */
  var readingType: SensorReadingType = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[OrientationSensor, OrientationSensorReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets the report interval supported by the sensor. */
  var reportInterval: Double = js.native
}
