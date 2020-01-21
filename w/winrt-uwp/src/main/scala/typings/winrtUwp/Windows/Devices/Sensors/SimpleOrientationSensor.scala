package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.orientationchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a simple orientation sensor. */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
abstract class SimpleOrientationSensor () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** Occurs each time the simple orientation sensor reports a new sensor reading */
  @JSName("onorientationchanged")
  var onorientationchanged_Original: TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchanged(
    `type`: orientationchanged,
    listener: TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs]
  ): Unit = js.native
  /**
    * Gets the default simple orientation sensor.
    * @return The default simple orientation sensor.
    */
  def getCurrentOrientation(): SimpleOrientation = js.native
  /** Occurs each time the simple orientation sensor reports a new sensor reading */
  def onorientationchanged(ev: SimpleOrientationSensorOrientationChangedEventArgs with WinRTEvent[SimpleOrientationSensor]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchanged(
    `type`: orientationchanged,
    listener: TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
object SimpleOrientationSensor extends js.Object {
  /**
    * Gets the default simple orientation sensor.
    * @return The default simple orientation sensor or null if no simple orientation sensors are found.
    */
  def getDefault(): SimpleOrientationSensor = js.native
}

