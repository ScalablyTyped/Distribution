package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinter")
@js.native
abstract class PosPrinter () extends js.Object {
  /** Gets the capabilities of the point-of-service printer. */
  var capabilities: PosPrinterCapabilities = js.native
  /** Gets the identifier of the point-of-service printer. */
  var deviceId: java.lang.String = js.native
  /** Occurs when the status of the power or availability of the point-of-service printer changes. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PosPrinter, PosPrinterStatusUpdatedEventArgs] = js.native
  /** Gets the current status of the power and availability of the point-of-service printer. */
  var status: PosPrinterStatus = js.native
  /** Gets the list of character sets that the point-of-service printer supports. */
  var supportedCharacterSets: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double] = js.native
  /** Gets the fonts and typefaces that the point-of-service printer supports. */
  var supportedTypeFaces: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statusupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PosPrinter, PosPrinterStatusUpdatedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Gets the health state of the point-of-service printer asynchronously.
                   * @param level The type of health check that you want to perform for the point-of-service printer. Only level POSInternal(1) should be used, as any other UnifiedPosHealthCheckLevel levels will result in an error.
                   * @return An asynchronous operation that returns the health state of the point-of-service printer. You should display this value in the app interface immediately so the user of the app can interpret the value. For example, the operation returns “OK” as the health state if the state of the point-of-service printer is good.
                   */
  def checkHealthAsync(level: UnifiedPosHealthCheckLevel): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                   * Claims the point-of-service printer for use, and gets an instance of the ClaimedPosPrinter class for the point-of-service printer.
                   * @return The claimed point-of-service printer.
                   */
  def claimPrinterAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ClaimedPosPrinter] = js.native
  /**
                   * Gets the specified statistics from the point-of-service printer.
                   * @param statisticsCategories The list of statistics to retrieve.
                   * @return The requested statistics.
                   */
  def getStatisticsAsync(
    statisticsCategories: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /** Occurs when the status of the power or availability of the point-of-service printer changes. */
  def onstatusupdated(ev: PosPrinterStatusUpdatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PosPrinter]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statusupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PosPrinter, PosPrinterStatusUpdatedEventArgs]
  ): scala.Unit = js.native
}

/** Represents a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinter")
@js.native
object PosPrinter extends js.Object {
  /**
                   * Creates a PosPrinter object for point-of-service printer with the specified DeviceInformation.Id .
                   * @param deviceId The DeviceInformation.Id that identifies a specific point-of-service printer.
                   * @return The point-of-service printer that the unique device identifier identifies. Returns a null object in the following cases:
                   */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinter] = js.native
  /**
                   * Gets the default paired or locally-connected printer.
                   * @return The default locally-connected printer.
                   */
  def getDefaultAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinter] = js.native
  /**
                   * Gets an Advanced Query Syntax (AQS) string that you can use to list the available point-of-service printers.
                   * @return An Advanced Query Syntax (AQS) string that you can use to list the available point-of-service printers.
                   */
  def getDeviceSelector(): java.lang.String = js.native
}

