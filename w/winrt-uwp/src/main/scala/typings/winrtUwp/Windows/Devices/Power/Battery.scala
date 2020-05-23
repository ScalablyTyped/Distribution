package typings.winrtUwp.Windows.Devices.Power

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.reportupdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a battery controller that is currently connected to the device. For more info, see Get battery information. */
@js.native
trait Battery extends js.Object {
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

