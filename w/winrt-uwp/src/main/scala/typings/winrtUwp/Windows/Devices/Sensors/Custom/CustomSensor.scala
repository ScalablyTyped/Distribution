package typings.winrtUwp.Windows.Devices.Sensors.Custom

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a custom sensor. */
@js.native
trait CustomSensor extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets the device identifier of the sensor. */
  var deviceId: String = js.native
  
  /**
    * Gets the current sensor reading.
    * @return The current sensor reading.
    */
  def getCurrentReading(): CustomSensorReading = js.native
  
  /** Gets the minimum report interval that is supported by the sensor. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the sensor reports a new sensor reading. */
  def onreadingchanged(ev: CustomSensorReadingChangedEventArgs with WinRTEvent[CustomSensor]): Unit = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets the current report interval for the sensor. */
  var reportInterval: Double = js.native
}
