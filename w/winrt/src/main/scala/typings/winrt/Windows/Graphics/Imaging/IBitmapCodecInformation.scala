package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapCodecInformation extends js.Object {
  var codecId: String
  var fileExtensions: IVectorView[String]
  var friendlyName: String
  var mimeTypes: IVectorView[String]
}

object IBitmapCodecInformation {
  @scala.inline
  def apply(
    codecId: String,
    fileExtensions: IVectorView[String],
    friendlyName: String,
    mimeTypes: IVectorView[String]
  ): IBitmapCodecInformation = {
    val __obj = js.Dynamic.literal(codecId = codecId.asInstanceOf[js.Any], fileExtensions = fileExtensions.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapCodecInformation]
  }
}

