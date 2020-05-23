package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.datareceived
import typings.winrtUwp.winrtUwpStrings.erroroccurred
import typings.winrtUwp.winrtUwpStrings.imagepreviewreceived
import typings.winrtUwp.winrtUwpStrings.releasedevicerequested
import typings.winrtUwp.winrtUwpStrings.triggerpressed
import typings.winrtUwp.winrtUwpStrings.triggerreleased
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the claimed barcode scanner. */
@js.native
trait ClaimedBarcodeScanner extends js.Object {
  /** Gets the DeviceInformation.Id of the claimed barcode scanner. */
  var deviceId: String = js.native
  /** Gets or sets a Boolean value that indicates whether to provide the decoded data to the service object. */
  var isDecodeDataEnabled: Boolean = js.native
  /** Gets or sets a Boolean value that indicates whether the barcode scanner is disabled after receiving the data. */
  var isDisabledOnDataReceived: Boolean = js.native
  /** Indicates whether the barcode scanner can receive DataReceived events. */
  var isEnabled: Boolean = js.native
  /** Occurs when the device scans a barcode. */
  @JSName("ondatareceived")
  var ondatareceived_Original: TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerDataReceivedEventArgs] = js.native
  /** Occurs when there is a problem in reading a barcode. */
  @JSName("onerroroccurred")
  var onerroroccurred_Original: TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerErrorOccurredEventArgs] = js.native
  /** Occurs when the device receives the bitmap image of the scan. */
  @JSName("onimagepreviewreceived")
  var onimagepreviewreceived_Original: TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerImagePreviewReceivedEventArgs] = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  @JSName("onreleasedevicerequested")
  var onreleasedevicerequested_Original: EventHandler[_] = js.native
  /** Occurs when the barcode scanner trigger or button is pressed during a scanning operation. */
  @JSName("ontriggerpressed")
  var ontriggerpressed_Original: EventHandler[_] = js.native
  /** Occurs when the barcode scanner trigger or button is released during a scanning operation. */
  @JSName("ontriggerreleased")
  var ontriggerreleased_Original: EventHandler[_] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datareceived(
    `type`: datareceived,
    listener: TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerDataReceivedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_erroroccurred(
    `type`: erroroccurred,
    listener: TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerErrorOccurredEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_imagepreviewreceived(
    `type`: imagepreviewreceived,
    listener: TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerImagePreviewReceivedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_releasedevicerequested(`type`: releasedevicerequested, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_triggerpressed(`type`: triggerpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_triggerreleased(`type`: triggerreleased, listener: EventHandler[_]): Unit = js.native
  /** Releases exclusive claim to the barcode scanner. */
  def close(): Unit = js.native
  /**
    * Puts the barcode scanner into a state where it cannot receive DataReceived events.
    * @return No object or value is returned when this method completes.
    */
  def disableAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Gets the barcode scanner into a ready state for DataReceived events.
    * @return No object or value is returned when this method completes.
    */
  def enableAsync(): IPromiseWithIAsyncAction = js.native
  /** Occurs when the device scans a barcode. */
  def ondatareceived(ev: BarcodeScannerDataReceivedEventArgs with WinRTEvent[ClaimedBarcodeScanner]): Unit = js.native
  /** Occurs when there is a problem in reading a barcode. */
  def onerroroccurred(ev: BarcodeScannerErrorOccurredEventArgs with WinRTEvent[ClaimedBarcodeScanner]): Unit = js.native
  /** Occurs when the device receives the bitmap image of the scan. */
  def onimagepreviewreceived(ev: BarcodeScannerImagePreviewReceivedEventArgs with WinRTEvent[ClaimedBarcodeScanner]): Unit = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  def onreleasedevicerequested(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Occurs when the barcode scanner trigger or button is pressed during a scanning operation. */
  def ontriggerpressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Occurs when the barcode scanner trigger or button is released during a scanning operation. */
  def ontriggerreleased(ev: js.Any with WinRTEvent[_]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datareceived(
    `type`: datareceived,
    listener: TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerDataReceivedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_erroroccurred(
    `type`: erroroccurred,
    listener: TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerErrorOccurredEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_imagepreviewreceived(
    `type`: imagepreviewreceived,
    listener: TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerImagePreviewReceivedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_releasedevicerequested(`type`: releasedevicerequested, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_triggerpressed(`type`: triggerpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_triggerreleased(`type`: triggerreleased, listener: EventHandler[_]): Unit = js.native
  /**
    * Resets the specified statistics to zero for all statistics that can be reset.
    * @param statisticsCategories The list of names of the statistics to reset.
    * @return No object or value is returned by this method when it completes.
    */
  def resetStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncAction = js.native
  /** Retains exclusive claim to the barcode scanner. */
  def retainDevice(): Unit = js.native
  /**
    * Sets the active profile on the barcode scanner.
    * @param profile The name of the profile to set on the device.
    * @return No object or value is returned when the method completes.
    */
  def setActiveProfileAsync(profile: String): IPromiseWithIAsyncAction = js.native
  /**
    * Sets the barcode symbologies for the device to use.
    * @param symbologies The specific symbologies to use.
    * @return No object or value is returned when this method completes.
    */
  def setActiveSymbologiesAsync(symbologies: IIterable[Double]): IPromiseWithIAsyncAction = js.native
  /**
    * Used to signal the barcode scanner to start scanning. A session is active until StopSoftwareTriggerAsync is invoked, or until the scanner ends the session on its own.
    * @return No object or value is returned when this method completes.
    */
  def startSoftwareTriggerAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Used to stop a session that was started with StartSoftwareTriggerAsync . No error is raised if this is called when no session is active.
    * @return No object or value is returned when this method completes.
    */
  def stopSoftwareTriggerAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Updates the specified statistics.
    * @param statistics The list of key-value pairs of statistics to update.
    * @return No object or value is returned by this method when it completes.
    */
  def updateStatisticsAsync(statistics: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncAction = js.native
}

