package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an interface for a pedometer to measure the number of steps taken. */
@js.native
trait Pedometer extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  var getCurrentReadings: js.Any = js.native
   /* unmapped type */ /** The smallest report interval that is supported by this pedometer. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the pedometer reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Pedometer, PedometerReadingChangedEventArgs] = js.native
  /** Gets the power that the sensor consumes. */
  var powerInMilliwatts: Double = js.native
  /** Gets or sets the current report interval for the pedometer. */
  var reportInterval: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Pedometer, PedometerReadingChangedEventArgs]): Unit = js.native
  /** Occurs each time the pedometer reports a new value. */
  def onreadingchanged(ev: PedometerReadingChangedEventArgs with WinRTEvent[Pedometer]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Pedometer, PedometerReadingChangedEventArgs]): Unit = js.native
}

