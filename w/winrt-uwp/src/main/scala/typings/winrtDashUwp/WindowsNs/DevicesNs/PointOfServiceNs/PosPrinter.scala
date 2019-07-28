package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.statusupdated
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
  var deviceId: String = js.native
  /** Occurs when the status of the power or availability of the point-of-service printer changes. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: TypedEventHandler[PosPrinter, PosPrinterStatusUpdatedEventArgs] = js.native
  /** Gets the current status of the power and availability of the point-of-service printer. */
  var status: PosPrinterStatus = js.native
  /** Gets the list of character sets that the point-of-service printer supports. */
  var supportedCharacterSets: IVectorView[Double] = js.native
  /** Gets the fonts and typefaces that the point-of-service printer supports. */
  var supportedTypeFaces: IVectorView[String] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(`type`: statusupdated, listener: TypedEventHandler[PosPrinter, PosPrinterStatusUpdatedEventArgs]): Unit = js.native
  /**
    * Gets the health state of the point-of-service printer asynchronously.
    * @param level The type of health check that you want to perform for the point-of-service printer. Only level POSInternal(1) should be used, as any other UnifiedPosHealthCheckLevel levels will result in an error.
    * @return An asynchronous operation that returns the health state of the point-of-service printer. You should display this value in the app interface immediately so the user of the app can interpret the value. For example, the operation returns “OK” as the health state if the state of the point-of-service printer is good.
    */
  def checkHealthAsync(level: UnifiedPosHealthCheckLevel): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Claims the point-of-service printer for use, and gets an instance of the ClaimedPosPrinter class for the point-of-service printer.
    * @return The claimed point-of-service printer.
    */
  def claimPrinterAsync(): IPromiseWithIAsyncOperation[ClaimedPosPrinter] = js.native
  /**
    * Gets the specified statistics from the point-of-service printer.
    * @param statisticsCategories The list of statistics to retrieve.
    * @return The requested statistics.
    */
  def getStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncOperation[String] = js.native
  /** Occurs when the status of the power or availability of the point-of-service printer changes. */
  def onstatusupdated(ev: PosPrinterStatusUpdatedEventArgs with WinRTEvent[PosPrinter]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(`type`: statusupdated, listener: TypedEventHandler[PosPrinter, PosPrinterStatusUpdatedEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.PointOfService.PosPrinter")
@js.native
object PosPrinter extends js.Object {
  /**
    * Creates a PosPrinter object for point-of-service printer with the specified DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific point-of-service printer.
    * @return The point-of-service printer that the unique device identifier identifies. Returns a null object in the following cases:
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[PosPrinter] = js.native
  /**
    * Gets the default paired or locally-connected printer.
    * @return The default locally-connected printer.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[PosPrinter] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available point-of-service printers.
    * @return An Advanced Query Syntax (AQS) string that you can use to list the available point-of-service printers.
    */
  def getDeviceSelector(): String = js.native
}

