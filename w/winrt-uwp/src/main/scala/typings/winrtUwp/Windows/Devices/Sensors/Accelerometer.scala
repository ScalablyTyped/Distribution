package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import typings.winrtUwp.winrtUwpStrings.shaken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an accelerometer sensor. */
@js.native
trait Accelerometer extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** Gets the maximum number of events that can be batched by the sensor. */
  var maxBatchSize: Double = js.native
  /** Gets the minimum report interval supported by the accelerometer. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the accelerometer reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Accelerometer, AccelerometerReadingChangedEventArgs] = js.native
  /** Occurs when the accelerometer detects that the PC has been shaken. */
  @JSName("onshaken")
  var onshaken_Original: TypedEventHandler[Accelerometer, AccelerometerShakenEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  /** Gets or sets the current report interval for the accelerometer. */
  var reportInterval: Double = js.native
  /** Gets or sets the delay between batches of sensor information. */
  var reportLatency: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Accelerometer, AccelerometerReadingChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shaken(`type`: shaken, listener: TypedEventHandler[Accelerometer, AccelerometerShakenEventArgs]): Unit = js.native
  /**
    * Gets the current accelerometer reading.
    * @return This method has no parameters.
    */
  def getCurrentReading(): AccelerometerReading = js.native
  /** Occurs each time the accelerometer reports a new sensor reading. */
  def onreadingchanged(ev: AccelerometerReadingChangedEventArgs with WinRTEvent[Accelerometer]): Unit = js.native
  /** Occurs when the accelerometer detects that the PC has been shaken. */
  def onshaken(ev: AccelerometerShakenEventArgs with WinRTEvent[Accelerometer]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Accelerometer, AccelerometerReadingChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shaken(`type`: shaken, listener: TypedEventHandler[Accelerometer, AccelerometerShakenEventArgs]): Unit = js.native
}

