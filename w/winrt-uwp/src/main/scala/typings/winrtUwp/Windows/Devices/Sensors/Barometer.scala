package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an interface for a barometric sensor to measure atmospheric pressure. */
@JSGlobal("Windows.Devices.Sensors.Barometer")
@js.native
abstract class Barometer () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** The smallest report interval that is supported by this barometer sensor. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the barometer sensor reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Barometer, BarometerReadingChangedEventArgs] = js.native
  /** Gets or sets the current report interval for the barometer. */
  var reportInterval: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Barometer, BarometerReadingChangedEventArgs]): Unit = js.native
  /**
    * Gets the current reading for the barometer.
    * @return The current atmospheric pressure according to this sensor.
    */
  def getCurrentReading(): BarometerReading = js.native
  /** Occurs each time the barometer sensor reports a new value. */
  def onreadingchanged(ev: BarometerReadingChangedEventArgs with WinRTEvent[Barometer]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Barometer, BarometerReadingChangedEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Barometer")
@js.native
object Barometer extends js.Object {
  /**
    * Returns the default barometer sensor.
    * @return The default barometer.
    */
  def getDefault(): Barometer = js.native
}

