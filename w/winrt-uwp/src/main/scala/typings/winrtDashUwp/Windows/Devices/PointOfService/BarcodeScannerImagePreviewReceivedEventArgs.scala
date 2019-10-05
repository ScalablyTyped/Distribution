package typings.winrtDashUwp.Windows.Devices.PointOfService

import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data from the ImagePreviewReceived event. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerImagePreviewReceivedEventArgs")
@js.native
abstract class BarcodeScannerImagePreviewReceivedEventArgs () extends js.Object {
  /** Gets the BitmapImage from the device representing a preview frame. */
  var preview: IRandomAccessStreamWithContentType = js.native
}

