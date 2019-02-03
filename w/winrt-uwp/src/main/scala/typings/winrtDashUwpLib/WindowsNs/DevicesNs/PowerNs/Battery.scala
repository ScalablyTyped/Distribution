package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PowerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a battery controller that is currently connected to the device. For more info, see Get battery information. */
@JSGlobal("Windows.Devices.Power.Battery")
@js.native
abstract class Battery () extends js.Object {
  /** Gets the identifier (ID) for an individual battery controller. */
  var deviceId: java.lang.String = js.native
  /** Occurs when the charge, capacity, or status of a battery changes. */
  @JSName("onreportupdated")
  var onreportupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Battery, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reportupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.reportupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Battery, _]
  ): scala.Unit = js.native
  /**
    * Gets a BatteryReport object that indicates the charge, capacity, and status of the battery or aggregate.
    * @return Indicates the charge, capacity, and status of the battery or aggregate.
    */
  def getReport(): BatteryReport = js.native
  /** Occurs when the charge, capacity, or status of a battery changes. */
  def onreportupdated(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[Battery]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reportupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.reportupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Battery, _]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Power.Battery")
@js.native
object Battery extends js.Object {
  /** Gets a Battery object that represents all battery controllers connected to the device. */
  var aggregateBattery: winrtDashUwpLib.WindowsNs.DevicesNs.PowerNs.Battery = js.native
  /**
    * Gets a Battery object that represents an individual battery controller connected to the device.
    * @param deviceId The device ID of the battery controller ( DeviceId ).
    * @return A Battery object that corresponds to the specified battery controller.
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PowerNs.Battery] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that can be used to find all battery controllers that are connected to the device.
    * @return An AQS string that can be used to find all battery controllers connected to the device.
    */
  def getDeviceSelector(): java.lang.String = js.native
}

