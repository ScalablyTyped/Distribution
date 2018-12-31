package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an interface for a barometric sensor to measure atmospheric pressure. */
@JSGlobal("Windows.Devices.Sensors.Barometer")
@js.native
abstract class Barometer () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** The smallest report interval that is supported by this barometer sensor. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the barometer sensor reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Barometer, BarometerReadingChangedEventArgs] = js.native
  /** Gets or sets the current report interval for the barometer. */
  var reportInterval: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Barometer, BarometerReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets the current reading for the barometer.
    * @return The current atmospheric pressure according to this sensor.
    */
  def getCurrentReading(): BarometerReading = js.native
  /** Occurs each time the barometer sensor reports a new value. */
  def onreadingchanged(ev: BarometerReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Barometer]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Barometer, BarometerReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/** Provides an interface for a barometric sensor to measure atmospheric pressure. */
@JSGlobal("Windows.Devices.Sensors.Barometer")
@js.native
object Barometer extends js.Object {
  /**
    * Returns the default barometer sensor.
    * @return The default barometer.
    */
  def getDefault(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.Barometer = js.native
}

