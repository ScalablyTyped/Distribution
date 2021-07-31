package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.releasedevicerequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent a point-of-service printer that has been claimed for use. */
@js.native
trait ClaimedPosPrinter extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_releasedevicerequested(
    `type`: releasedevicerequested,
    listener: TypedEventHandler[ClaimedPosPrinter, PosPrinterReleaseDeviceRequestedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets a numeric value that indicates the character set that the application wants to use for printing characters. */
  var characterSet: Double = js.native
  
  /** Disposes the claimed point-of-service printer object synchronously, releases the exclusive claim on the printer and disables it. */
  def close(): Unit = js.native
  
  /** Gets the identifier string of the claimed point-of-service printer. */
  var deviceId: String = js.native
  
  /**
    * Notifies the underlying hardware to turn off.
    * @return True if the attempt turn off the printer succeeded; otherwise false.
    */
  def disableAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Notifies the underlying hardware asynchronously to power on for use.
    * @return True if the attempt to turn on the printer succeeded; otherwise false.
    */
  def enableAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets or sets whether the driver or provider can map Unicode characters to characters that the point-of-service printer can print, or just sends the low byte of the Unicode character to the printer directly. */
  var isCharacterSetMappingEnabled: Boolean = js.native
  
  /** Gets whether the cover of the point-of-service printer is currently open. */
  var isCoverOpen: Boolean = js.native
  
  /** Gets whether the printer is powered on for use. */
  var isEnabled: Boolean = js.native
  
  /** Gets an object that represents the journal station for a claimed point-of-service printer. */
  var journal: ClaimedJournalPrinter = js.native
  
  /** Gets or sets the mapping mode of the point-of-service printer that the app wants to use. The mapping mode defines the unit of measure used for other printer properties, such as line height and line spacing. */
  var mapMode: PosPrinterMapMode = js.native
  
  /** Occurs when a point-of-service printer gets a request to release its exclusive claim. */
  def onreleasedevicerequested(ev: PosPrinterReleaseDeviceRequestedEventArgs & WinRTEvent[ClaimedPosPrinter]): Unit = js.native
  /** Occurs when a point-of-service printer gets a request to release its exclusive claim. */
  @JSName("onreleasedevicerequested")
  var onreleasedevicerequested_Original: TypedEventHandler[ClaimedPosPrinter, PosPrinterReleaseDeviceRequestedEventArgs] = js.native
  
  /** Gets an object that represents the receipt station for a claimed point-of-service printer. */
  var receipt: ClaimedReceiptPrinter = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_releasedevicerequested(
    `type`: releasedevicerequested,
    listener: TypedEventHandler[ClaimedPosPrinter, PosPrinterReleaseDeviceRequestedEventArgs]
  ): Unit = js.native
  
  /**
    * Resets the specified statistics to zero for all statistics for the point-of-service printer that can be reset.
    * @param statisticsCategories A list of the names of the statistics that you want to reset.
    * @return An operation that returns true if the reset succeeds, or otherwise returns false.
    */
  def resetStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Retains the claim on the point-of-service printer asynchronously, usually in response to the ReleaseDeviceRequested event.
    * @return True if the printer was successfully retained; otherwise, false.
    */
  def retainDeviceAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets an object that represents the slip station for a claimed point-of-service printer. */
  var slip: ClaimedSlipPrinter = js.native
  
  /**
    * Updates the specified statistics for the point-of-service printer.
    * @param statistics The statistics to update.
    * @return An operation that returns true if the update succeeds, or otherwise returns false.
    */
  def updateStatisticsAsync(statistics: IIterable[IKeyValuePair[js.Any, js.Any]]): IPromiseWithIAsyncOperation[Boolean] = js.native
}
