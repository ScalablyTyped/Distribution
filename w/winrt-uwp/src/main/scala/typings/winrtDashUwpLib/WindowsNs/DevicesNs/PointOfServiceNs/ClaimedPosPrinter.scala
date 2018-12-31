package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent a point-of-service printer that has been claimed for use. */
@JSGlobal("Windows.Devices.PointOfService.ClaimedPosPrinter")
@js.native
abstract class ClaimedPosPrinter () extends js.Object {
  /** Gets or sets a numeric value that indicates the character set that the application wants to use for printing characters. */
  var characterSet: scala.Double = js.native
  /** Gets the identifier string of the claimed point-of-service printer. */
  var deviceId: java.lang.String = js.native
  /** Gets or sets whether the driver or provider can map Unicode characters to characters that the point-of-service printer can print, or just sends the low byte of the Unicode character to the printer directly. */
  var isCharacterSetMappingEnabled: scala.Boolean = js.native
  /** Gets whether the cover of the point-of-service printer is currently open. */
  var isCoverOpen: scala.Boolean = js.native
  /** Gets whether the printer is powered on for use. */
  var isEnabled: scala.Boolean = js.native
  /** Gets an object that represents the journal station for a claimed point-of-service printer. */
  var journal: ClaimedJournalPrinter = js.native
  /** Gets or sets the mapping mode of the point-of-service printer that the app wants to use. The mapping mode defines the unit of measure used for other printer properties, such as line height and line spacing. */
  var mapMode: PosPrinterMapMode = js.native
  /** Occurs when a point-of-service printer gets a request to release its exclusive claim. */
  @JSName("onreleasedevicerequested")
  var onreleasedevicerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedPosPrinter, PosPrinterReleaseDeviceRequestedEventArgs] = js.native
  /** Gets an object that represents the receipt station for a claimed point-of-service printer. */
  var receipt: ClaimedReceiptPrinter = js.native
  /** Gets an object that represents the slip station for a claimed point-of-service printer. */
  var slip: ClaimedSlipPrinter = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_releasedevicerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.releasedevicerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedPosPrinter, PosPrinterReleaseDeviceRequestedEventArgs]
  ): scala.Unit = js.native
  /** Disposes the claimed point-of-service printer object synchronously, releases the exclusive claim on the printer and disables it. */
  def close(): scala.Unit = js.native
  /**
    * Notifies the underlying hardware to turn off.
    * @return True if the attempt turn off the printer succeeded; otherwise false.
    */
  def disableAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Notifies the underlying hardware asynchronously to power on for use.
    * @return True if the attempt to turn on the printer succeeded; otherwise false.
    */
  def enableAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /** Occurs when a point-of-service printer gets a request to release its exclusive claim. */
  def onreleasedevicerequested(
    ev: PosPrinterReleaseDeviceRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ClaimedPosPrinter]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_releasedevicerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.releasedevicerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedPosPrinter, PosPrinterReleaseDeviceRequestedEventArgs]
  ): scala.Unit = js.native
  /**
    * Resets the specified statistics to zero for all statistics for the point-of-service printer that can be reset.
    * @param statisticsCategories A list of the names of the statistics that you want to reset.
    * @return An operation that returns true if the reset succeeds, or otherwise returns false.
    */
  def resetStatisticsAsync(
    statisticsCategories: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Retains the claim on the point-of-service printer asynchronously, usually in response to the ReleaseDeviceRequested event.
    * @return True if the printer was successfully retained; otherwise, false.
    */
  def retainDeviceAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Updates the specified statistics for the point-of-service printer.
    * @param statistics The statistics to update.
    * @return An operation that returns true if the update succeeds, or otherwise returns false.
    */
  def updateStatisticsAsync(
    statistics: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

