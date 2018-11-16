package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a simple orientation sensor. */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
abstract class SimpleOrientationSensor () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** Occurs each time the simple orientation sensor reports a new sensor reading */
  @JSName("onorientationchanged")
  var onorientationchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.orientationchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Gets the default simple orientation sensor.
                   * @return The default simple orientation sensor.
                   */
  def getCurrentOrientation(): SimpleOrientation = js.native
  /** Occurs each time the simple orientation sensor reports a new sensor reading */
  def onorientationchanged(
    ev: SimpleOrientationSensorOrientationChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SimpleOrientationSensor]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.orientationchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs]
  ): scala.Unit = js.native
}

/** Represents a simple orientation sensor. */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
object SimpleOrientationSensor extends js.Object {
  /**
                   * Gets the default simple orientation sensor.
                   * @return The default simple orientation sensor or null if no simple orientation sensors are found.
                   */
  def getDefault(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientationSensor = js.native
}

