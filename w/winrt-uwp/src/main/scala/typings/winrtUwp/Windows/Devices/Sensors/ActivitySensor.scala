package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an activity sensor that provides the activity and status of a sensor. */
@js.native
trait ActivitySensor extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Asynchronously gets the current sensor reading.
    * @return Asynchronously returns a ActivitySensorReading object that represents info about the sensor.
    */
  def getCurrentReadingAsync(): IPromiseWithIAsyncOperation[ActivitySensorReading] = js.native
  
  /** Gets the minimum report interval supported by the sensor. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the sensor reports a new sensor reading. */
  def onreadingchanged(ev: ActivitySensorReadingChangedEventArgs & WinRTEvent[ActivitySensor]): Unit = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs] = js.native
  
  /** Gets the power in milliwatts that the sensor consumes. */
  var powerInMilliwatts: Double = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets the list of activity types that the sensor pledges to perform. */
  var subscribedActivities: IVector[ActivityType] = js.native
  
  /** Gets the list of activity types that the sensor supports. */
  var supportedActivities: IVectorView[ActivityType] = js.native
}
