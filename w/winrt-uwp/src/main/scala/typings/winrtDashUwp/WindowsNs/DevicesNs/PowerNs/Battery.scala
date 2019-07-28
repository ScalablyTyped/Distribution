package typings.winrtDashUwp.WindowsNs.DevicesNs.PowerNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.reportupdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a battery controller that is currently connected to the device. For more info, see Get battery information. */
@JSGlobal("Windows.Devices.Power.Battery")
@js.native
abstract class Battery () extends js.Object {
  /** Gets the identifier (ID) for an individual battery controller. */
  var deviceId: String = js.native
  /** Occurs when the charge, capacity, or status of a battery changes. */
  @JSName("onreportupdated")
  var onreportupdated_Original: TypedEventHandler[Battery, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reportupdated(`type`: reportupdated, listener: TypedEventHandler[Battery, _]): Unit = js.native
  /**
    * Gets a BatteryReport object that indicates the charge, capacity, and status of the battery or aggregate.
    * @return Indicates the charge, capacity, and status of the battery or aggregate.
    */
  def getReport(): BatteryReport = js.native
  /** Occurs when the charge, capacity, or status of a battery changes. */
  def onreportupdated(ev: js.Any with WinRTEvent[Battery]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reportupdated(`type`: reportupdated, listener: TypedEventHandler[Battery, _]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Power.Battery")
@js.native
object Battery extends js.Object {
  /** Gets a Battery object that represents all battery controllers connected to the device. */
  var aggregateBattery: Battery = js.native
  /**
    * Gets a Battery object that represents an individual battery controller connected to the device.
    * @param deviceId The device ID of the battery controller ( DeviceId ).
    * @return A Battery object that corresponds to the specified battery controller.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[Battery] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that can be used to find all battery controllers that are connected to the device.
    * @return An AQS string that can be used to find all battery controllers connected to the device.
    */
  def getDeviceSelector(): String = js.native
}

