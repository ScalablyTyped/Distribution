package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data from the ImagePreviewReceived event. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerImagePreviewReceivedEventArgs")
@js.native
abstract class BarcodeScannerImagePreviewReceivedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerImagePreviewReceivedEventArgs {
  /** Gets the BitmapImage from the device representing a preview frame. */
  /* CompleteClass */
  override var preview: IRandomAccessStreamWithContentType = js.native
}

