package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data from the ImagePreviewReceived event. */
@js.native
trait BarcodeScannerImagePreviewReceivedEventArgs extends js.Object {
  
  /** Gets the BitmapImage from the device representing a preview frame. */
  var preview: IRandomAccessStreamWithContentType = js.native
}
object BarcodeScannerImagePreviewReceivedEventArgs {
  
  @scala.inline
  def apply(preview: IRandomAccessStreamWithContentType): BarcodeScannerImagePreviewReceivedEventArgs = {
    val __obj = js.Dynamic.literal(preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerImagePreviewReceivedEventArgs]
  }
  
  @scala.inline
  implicit class BarcodeScannerImagePreviewReceivedEventArgsOps[Self <: BarcodeScannerImagePreviewReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPreview(value: IRandomAccessStreamWithContentType): Self = this.set("preview", value.asInstanceOf[js.Any])
  }
}
