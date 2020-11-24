package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an inclinometer sensor. */
@js.native
trait Inclinometer extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the current inclinometer reading.
    * @return The current inclinometer reading.
    */
  def getCurrentReading(): InclinometerReading = js.native
  
  /** Gets the minimum report interval supported by the inclinometer. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the inclinometer reports a new sensor reading. */
  def onreadingchanged(ev: InclinometerReadingChangedEventArgs with WinRTEvent[Inclinometer]): Unit = js.native
  /** Occurs each time the inclinometer reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs] = js.native
  
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  
  /** Gets the sensor reading type. */
  var readingType: SensorReadingType = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets the current report interval for the inclinometer. */
  var reportInterval: Double = js.native
}
