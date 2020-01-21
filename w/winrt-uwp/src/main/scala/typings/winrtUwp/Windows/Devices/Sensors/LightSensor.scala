package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ambient-light sensor. */
@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
abstract class LightSensor () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** Gets the minimum report interval supported by the sensor. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the ambient-light sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[LightSensor, LightSensorReadingChangedEventArgs] = js.native
  /** Gets or sets the current report interval for the ambient light sensor. */
  var reportInterval: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[LightSensor, LightSensorReadingChangedEventArgs]
  ): Unit = js.native
  /**
    * Gets the current ambient-light sensor reading.
    * @return The current ambient-light sensor reading.
    */
  def getCurrentReading(): LightSensorReading = js.native
  /** Occurs each time the ambient-light sensor reports a new sensor reading. */
  def onreadingchanged(ev: LightSensorReadingChangedEventArgs with WinRTEvent[LightSensor]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[LightSensor, LightSensorReadingChangedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
object LightSensor extends js.Object {
  /**
    * Returns the default ambient-light sensor.
    * @return The default ambient-light sensor or null if no integrated light sensors are found.
    */
  def getDefault(): LightSensor = js.native
}

