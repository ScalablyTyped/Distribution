package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an inclinometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
abstract class Inclinometer () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** Gets the minimum report interval supported by the inclinometer. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the inclinometer reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  /** Gets the sensor reading type. */
  var readingType: SensorReadingType = js.native
  /** Gets or sets the current report interval for the inclinometer. */
  var reportInterval: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs]
  ): Unit = js.native
  /**
    * Gets the current inclinometer reading.
    * @return The current inclinometer reading.
    */
  def getCurrentReading(): InclinometerReading = js.native
  /** Occurs each time the inclinometer reports a new sensor reading. */
  def onreadingchanged(ev: InclinometerReadingChangedEventArgs with WinRTEvent[Inclinometer]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
object Inclinometer extends js.Object {
  /**
    * Returns the default inclinometer.
    * @return The default inclinometer or null if no inclinometers are found.
    */
  def getDefault(): Inclinometer = js.native
  /**
    * Returns the default inclinometer.
    * @return The default inclinometer or null if no inclinometers are found.
    */
  def getDefaultForRelativeReadings(): Inclinometer = js.native
}

