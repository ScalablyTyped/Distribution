package typings.winrtDashUwp.Windows.Devices.PointOfService

import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.statusupdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A cash drawer device in a retail scenario. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawer")
@js.native
abstract class CashDrawer () extends js.Object {
  /** The functionality of the cash drawer device as exposed by API. */
  var capabilities: CashDrawerCapabilities = js.native
  /** The identifier string of the cash drawer device. */
  var deviceId: String = js.native
  /** Gets the CashDrawerEventSource to allow the app to detect the open/close state of the drawer. The actual current state is reported by IsDrawerOpen. . */
  var drawerEventSource: CashDrawerEventSource = js.native
  /** Indicates whether the cash drawer is open. */
  var isDrawerOpen: Boolean = js.native
  /** Indicates there has been a change in the power availability status of the drawer. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: TypedEventHandler[CashDrawer, CashDrawerStatusUpdatedEventArgs] = js.native
  /** Get the current power and availability status of the cash drawer. */
  var status: CashDrawerStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(`type`: statusupdated, listener: TypedEventHandler[CashDrawer, CashDrawerStatusUpdatedEventArgs]): Unit = js.native
  /**
    * Gets the device's health state asynchronously.
    * @param level The specified health check level.
    * @return This value is intended to be reflected in the app interface immediately so the user of the app can interpret it. For example, it will return “OK” as the health string if the device state is good.
    */
  def checkHealthAsync(level: UnifiedPosHealthCheckLevel): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Attempts to get exclusive access on the cash drawer.
    * @return When the method completes, it returns a ClaimedCashDrawer .
    */
  def claimDrawerAsync(): IPromiseWithIAsyncOperation[ClaimedCashDrawer] = js.native
  /**
    * Retrieves the requested statistics from the cash drawer.
    * @param statisticsCategories The list of statistics to retrieve.
    * @return String representing the requested statistics.
    */
  def getStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncOperation[String] = js.native
  /** Indicates there has been a change in the power availability status of the drawer. */
  def onstatusupdated(ev: CashDrawerStatusUpdatedEventArgs with WinRTEvent[CashDrawer]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(`type`: statusupdated, listener: TypedEventHandler[CashDrawer, CashDrawerStatusUpdatedEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.PointOfService.CashDrawer")
@js.native
object CashDrawer extends js.Object {
  /**
    * Creates CashDrawer object from the DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific cash drawer, which can be retrieved from the DeviceId property.
    * @return The cash drawer specified by the unique device identifier. Returns a null object in the following cases:
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[CashDrawer] = js.native
  /**
    * Gets the default paired or locally-connected cash drawer.
    * @return The default locally-connected drawer. May return null if there is no drawer available.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[CashDrawer] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available cash drawers.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available cash drawers.
    */
  def getDeviceSelector(): String = js.native
}

