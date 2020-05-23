package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data from the ImagePreviewReceived event. */
trait BarcodeScannerImagePreviewReceivedEventArgs extends js.Object {
  /** Gets the BitmapImage from the device representing a preview frame. */
  var preview: IRandomAccessStreamWithContentType
}

object BarcodeScannerImagePreviewReceivedEventArgs {
  @scala.inline
  def apply(preview: IRandomAccessStreamWithContentType): BarcodeScannerImagePreviewReceivedEventArgs = {
    val __obj = js.Dynamic.literal(preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerImagePreviewReceivedEventArgs]
  }
}

