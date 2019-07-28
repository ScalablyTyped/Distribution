package typings.winrt.WindowsNs.GraphicsNs.ImagingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
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
    val __obj = js.Dynamic.literal(codecId = codecId, fileExtensions = fileExtensions, friendlyName = friendlyName, mimeTypes = mimeTypes)
  
    __obj.asInstanceOf[IBitmapCodecInformation]
  }
}

