package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a bar code assigned to a wallet item. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletBarcode")
@js.native
class WalletBarcode protected () extends js.Object {
  /**
                   * Initializes a new instance of the WalletBarcode class.
                   * @param streamToBarcodeImage A stream representing the bar code image.
                   */
  def this(streamToBarcodeImage: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference) = this()
  /**
                   * Initializes a new instance of the WalletBarcode class.
                   * @param symbology The symbology type for this barcode. Use one of the supported symbologies, such as Upca. Don't set to Invalid or Custom.
                   * @param value The message ( Value ) that the barcode represents.
                   */
  def this(symbology: WalletBarcodeSymbology, value: java.lang.String) = this()
  /** Gets the symbology used by the bar code. */
  var symbology: WalletBarcodeSymbology = js.native
  /** Gets a string representation of the barcode (its message). */
  var value: java.lang.String = js.native
  /**
                   * Creates and returns a bitmap image stream for the barcode (or returns the custom image used during instantiation).
                   * @return An asynchronous operation. If you use Asynchronous programming, the result type on successful completion is an IRandomAccessStreamReference instance. This can be assigned as the source for an image (with some additional code).
                   */
  def getImageAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference] = js.native
}

