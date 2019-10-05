package typings.winrtDashUwp.Windows.Devices.Sensors

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an interface for a pedometer to measure the number of steps taken. */
@JSGlobal("Windows.Devices.Sensors.Pedometer")
@js.native
abstract class Pedometer () extends js.Object {
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

/* static members */
@JSGlobal("Windows.Devices.Sensors.Pedometer")
@js.native
object Pedometer extends js.Object {
  var getReadingsFromTriggerDetails: js.Any = js.native
  /**
    * Obtains the pedometer from its identifier.
    * @param deviceId The sensor identifier.
    * @return Returns the Pedometer object from its identifier.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[Pedometer] = js.native
  /**
    * Asynchronously obtains the default pedometer.
    * @return Asynchronously returns a Pedometer object that represents the default sensor.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[Pedometer] = js.native
  /**
    * Gets the device selector.
    * @return Returns the device selector, if it exists; otherwise null.
    */
  def getDeviceSelector(): String = js.native
   /* unmapped type */ /**
    * Asynchronously gets sensor readings from a specific time.
    * @param fromTime The time for which you want to retrieve the reading.
    * @return Asynchronously returns a list of PedometerReading objects that represent info about the sensor.
    */
  def getSystemHistoryAsync(fromTime: Date): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously gets pedometer readings from a specific time and duration.
    * @param fromTime The time for which you want to retrieve the reading.
    * @param duration The duration over which you want to retrieve data.
    * @return Asynchronously returns a list of PedometerReading objects that represent info about the sensor.
    */
  def getSystemHistoryAsync(fromTime: Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

