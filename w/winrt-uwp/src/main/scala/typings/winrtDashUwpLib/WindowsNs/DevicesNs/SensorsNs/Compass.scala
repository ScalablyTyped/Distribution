package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a compass sensor. */
@JSGlobal("Windows.Devices.Sensors.Compass")
@js.native
abstract class Compass () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** Gets the minimum report interval supported by the compass. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the compass reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Compass, CompassReadingChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  /** Gets or sets the current report interval for the compass. */
  var reportInterval: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Compass, CompassReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets the current compass reading.
    * @return The current compass reading.
    */
  def getCurrentReading(): CompassReading = js.native
  /** Occurs each time the compass reports a new sensor reading. */
  def onreadingchanged(ev: CompassReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Compass]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Compass, CompassReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Compass")
@js.native
object Compass extends js.Object {
  /**
    * Returns the default compass.
    * @return The default compass or null if no integrated compasses are found.
    */
  def getDefault(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.Compass = js.native
}

