package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapCodecInformation")
@js.native
class BitmapCodecInformation () extends IBitmapCodecInformation {
  /* CompleteClass */
  override var codecId: String = js.native
  /* CompleteClass */
  override var fileExtensions: IVectorView[String] = js.native
  /* CompleteClass */
  override var friendlyName: String = js.native
  /* CompleteClass */
  override var mimeTypes: IVectorView[String] = js.native
}

