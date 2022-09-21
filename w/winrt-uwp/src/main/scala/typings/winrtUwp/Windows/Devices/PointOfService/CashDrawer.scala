package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.statusupdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A cash drawer device in a retail scenario. */
@js.native
trait CashDrawer extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(`type`: statusupdated, listener: TypedEventHandler[CashDrawer, CashDrawerStatusUpdatedEventArgs]): Unit = js.native
  
  /** The functionality of the cash drawer device as exposed by API. */
  var capabilities: CashDrawerCapabilities = js.native
  
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
  
  /** The identifier string of the cash drawer device. */
  var deviceId: String = js.native
  
  /** Gets the CashDrawerEventSource to allow the app to detect the open/close state of the drawer. The actual current state is reported by IsDrawerOpen. . */
  var drawerEventSource: CashDrawerEventSource = js.native
  
  /**
    * Retrieves the requested statistics from the cash drawer.
    * @param statisticsCategories The list of statistics to retrieve.
    * @return String representing the requested statistics.
    */
  def getStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncOperation[String] = js.native
  
  /** Indicates whether the cash drawer is open. */
  var isDrawerOpen: Boolean = js.native
  
  /** Indicates there has been a change in the power availability status of the drawer. */
  def onstatusupdated(ev: CashDrawerStatusUpdatedEventArgs & WinRTEvent[CashDrawer]): Unit = js.native
  /** Indicates there has been a change in the power availability status of the drawer. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: TypedEventHandler[CashDrawer, CashDrawerStatusUpdatedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(`type`: statusupdated, listener: TypedEventHandler[CashDrawer, CashDrawerStatusUpdatedEventArgs]): Unit = js.native
  
  /** Get the current power and availability status of the cash drawer. */
  var status: CashDrawerStatus = js.native
}
