package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to information about a decoder or encoder. */
@js.native
trait BitmapCodecInformation extends js.Object {
  /** The unique identifier of the decoder or encoder. Methods like BitmapDecoder::CreateAsync and BitmapEncoder::CreateAsync use the codec identifier to determine which codec to create. */
  var codecId: String = js.native
  /** A collection of all the file extensions supported by the decoder or encoder. */
  var fileExtensions: IVectorView[String] = js.native
  /** The friendly name of the decoder or encoder. */
  var friendlyName: String = js.native
  /** A collection of all the MIME/content types supported by the decoder or encoder. MIME type is synonymous with content type . */
  var mimeTypes: IVectorView[String] = js.native
}

object BitmapCodecInformation {
  @scala.inline
  def apply(
    codecId: String,
    fileExtensions: IVectorView[String],
    friendlyName: String,
    mimeTypes: IVectorView[String]
  ): BitmapCodecInformation = {
    val __obj = js.Dynamic.literal(codecId = codecId.asInstanceOf[js.Any], fileExtensions = fileExtensions.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapCodecInformation]
  }
  @scala.inline
  implicit class BitmapCodecInformationOps[Self <: BitmapCodecInformation] (val x: Self) extends AnyVal {
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
    def setCodecId(value: String): Self = this.set("codecId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileExtensions(value: IVectorView[String]): Self = this.set("fileExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeTypes(value: IVectorView[String]): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
  }
  
}

