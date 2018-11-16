package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the claimed barcode scanner. */
@JSGlobal("Windows.Devices.PointOfService.ClaimedBarcodeScanner")
@js.native
abstract class ClaimedBarcodeScanner () extends js.Object {
  /** Gets the DeviceInformation.Id of the claimed barcode scanner. */
  var deviceId: java.lang.String = js.native
  /** Gets or sets a Boolean value that indicates whether to provide the decoded data to the service object. */
  var isDecodeDataEnabled: scala.Boolean = js.native
  /** Gets or sets a Boolean value that indicates whether the barcode scanner is disabled after receiving the data. */
  var isDisabledOnDataReceived: scala.Boolean = js.native
  /** Indicates whether the barcode scanner can receive DataReceived events. */
  var isEnabled: scala.Boolean = js.native
  /** Occurs when the device scans a barcode. */
  @JSName("ondatareceived")
  var ondatareceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerDataReceivedEventArgs] = js.native
  /** Occurs when there is a problem in reading a barcode. */
  @JSName("onerroroccurred")
  var onerroroccurred_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerErrorOccurredEventArgs] = js.native
  /** Occurs when the device receives the bitmap image of the scan. */
  @JSName("onimagepreviewreceived")
  var onimagepreviewreceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerImagePreviewReceivedEventArgs] = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  @JSName("onreleasedevicerequested")
  var onreleasedevicerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Occurs when the barcode scanner trigger or button is pressed during a scanning operation. */
  @JSName("ontriggerpressed")
  var ontriggerpressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Occurs when the barcode scanner trigger or button is released during a scanning operation. */
  @JSName("ontriggerreleased")
  var ontriggerreleased_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.datareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerDataReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_erroroccurred(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.erroroccurred,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerErrorOccurredEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_imagepreviewreceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.imagepreviewreceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerImagePreviewReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_releasedevicerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.releasedevicerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_triggerpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.triggerpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_triggerreleased(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.triggerreleased,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /** Releases exclusive claim to the barcode scanner. */
  def close(): scala.Unit = js.native
  /**
                   * Puts the barcode scanner into a state where it cannot receive DataReceived events.
                   * @return No object or value is returned when this method completes.
                   */
  def disableAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Gets the barcode scanner into a ready state for DataReceived events.
                   * @return No object or value is returned when this method completes.
                   */
  def enableAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when the device scans a barcode. */
  def ondatareceived(
    ev: BarcodeScannerDataReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ClaimedBarcodeScanner]
  ): scala.Unit = js.native
  /** Occurs when there is a problem in reading a barcode. */
  def onerroroccurred(
    ev: BarcodeScannerErrorOccurredEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ClaimedBarcodeScanner]
  ): scala.Unit = js.native
  /** Occurs when the device receives the bitmap image of the scan. */
  def onimagepreviewreceived(
    ev: BarcodeScannerImagePreviewReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ClaimedBarcodeScanner]
  ): scala.Unit = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  def onreleasedevicerequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when the barcode scanner trigger or button is pressed during a scanning operation. */
  def ontriggerpressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when the barcode scanner trigger or button is released during a scanning operation. */
  def ontriggerreleased(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.datareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerDataReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_erroroccurred(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.erroroccurred,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerErrorOccurredEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_imagepreviewreceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.imagepreviewreceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedBarcodeScanner, BarcodeScannerImagePreviewReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_releasedevicerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.releasedevicerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_triggerpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.triggerpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_triggerreleased(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.triggerreleased,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
                   * Resets the specified statistics to zero for all statistics that can be reset.
                   * @param statisticsCategories The list of names of the statistics to reset.
                   * @return No object or value is returned by this method when it completes.
                   */
  def resetStatisticsAsync(
    statisticsCategories: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Retains exclusive claim to the barcode scanner. */
  def retainDevice(): scala.Unit = js.native
  /**
                   * Sets the active profile on the barcode scanner.
                   * @param profile The name of the profile to set on the device.
                   * @return No object or value is returned when the method completes.
                   */
  def setActiveProfileAsync(profile: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Sets the barcode symbologies for the device to use.
                   * @param symbologies The specific symbologies to use.
                   * @return No object or value is returned when this method completes.
                   */
  def setActiveSymbologiesAsync(symbologies: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[scala.Double]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Used to signal the barcode scanner to start scanning. A session is active until StopSoftwareTriggerAsync is invoked, or until the scanner ends the session on its own.
                   * @return No object or value is returned when this method completes.
                   */
  def startSoftwareTriggerAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Used to stop a session that was started with StartSoftwareTriggerAsync . No error is raised if this is called when no session is active.
                   * @return No object or value is returned when this method completes.
                   */
  def stopSoftwareTriggerAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Updates the specified statistics.
                   * @param statistics The list of key-value pairs of statistics to update.
                   * @return No object or value is returned by this method when it completes.
                   */
  def updateStatisticsAsync(
    statistics: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

