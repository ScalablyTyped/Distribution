package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  var deviceId: java.lang.String = js.native
  /** Gets the CashDrawerEventSource to allow the app to detect the open/close state of the drawer. The actual current state is reported by IsDrawerOpen. . */
  var drawerEventSource: CashDrawerEventSource = js.native
  /** Indicates whether the cash drawer is open. */
  var isDrawerOpen: scala.Boolean = js.native
  /** Indicates there has been a change in the power availability status of the drawer. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawer, CashDrawerStatusUpdatedEventArgs] = js.native
  /** Get the current power and availability status of the cash drawer. */
  var status: CashDrawerStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statusupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawer, CashDrawerStatusUpdatedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets the device's health state asynchronously.
    * @param level The specified health check level.
    * @return This value is intended to be reflected in the app interface immediately so the user of the app can interpret it. For example, it will return “OK” as the health string if the device state is good.
    */
  def checkHealthAsync(level: UnifiedPosHealthCheckLevel): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Attempts to get exclusive access on the cash drawer.
    * @return When the method completes, it returns a ClaimedCashDrawer .
    */
  def claimDrawerAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ClaimedCashDrawer] = js.native
  /**
    * Retrieves the requested statistics from the cash drawer.
    * @param statisticsCategories The list of statistics to retrieve.
    * @return String representing the requested statistics.
    */
  def getStatisticsAsync(
    statisticsCategories: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /** Indicates there has been a change in the power availability status of the drawer. */
  def onstatusupdated(ev: CashDrawerStatusUpdatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CashDrawer]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statusupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawer, CashDrawerStatusUpdatedEventArgs]
  ): scala.Unit = js.native
}

/** A cash drawer device in a retail scenario. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawer")
@js.native
object CashDrawer extends js.Object {
  /**
    * Creates CashDrawer object from the DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific cash drawer, which can be retrieved from the DeviceId property.
    * @return The cash drawer specified by the unique device identifier. Returns a null object in the following cases:
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.CashDrawer] = js.native
  /**
    * Gets the default paired or locally-connected cash drawer.
    * @return The default locally-connected drawer. May return null if there is no drawer available.
    */
  def getDefaultAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.CashDrawer] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available cash drawers.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available cash drawers.
    */
  def getDeviceSelector(): java.lang.String = js.native
}

