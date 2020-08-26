package typings.wordpressMediaUtils.uploadMediaMod

import typings.std.ArrayLike
import typings.std.File
import typings.std.Record
import typings.wordpressMediaUtils.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadMediaOptions extends js.Object {
  /**
    * Additional data to include in the request.
    */
  var additionalData: js.UndefOr[Record[String, _]] = js.native
  /**
    * Array with the types of media that can be uploaded, if unset all types are allowed.
    */
  var allowedTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of files.
    */
  var filesList: ArrayLike[File] = js.native
  /**
    * Maximum upload size in bytes allowed for the site.
    */
  var maxUploadFileSize: Double = js.native
  /**
    * Allowed mime types and file extensions.
    * @example
    * ```js
    * {
    *   'jpg|jpeg': 'image/jpeg',
    * }
    * ```
    */
  var wpAllowedMimeTypes: js.UndefOr[Record[String, String]] = js.native
  /**
    * Function called when an error happens.
    */
  def onError(error: Code): Unit = js.native
  /**
    * Function called each time a file or a temporary representation of the file is available.
    */
  def onFileChange(files: js.Array[MediaItem]): Unit = js.native
}

object UploadMediaOptions {
  @scala.inline
  def apply(
    filesList: ArrayLike[File],
    maxUploadFileSize: Double,
    onError: Code => Unit,
    onFileChange: js.Array[MediaItem] => Unit
  ): UploadMediaOptions = {
    val __obj = js.Dynamic.literal(filesList = filesList.asInstanceOf[js.Any], maxUploadFileSize = maxUploadFileSize.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onFileChange = js.Any.fromFunction1(onFileChange))
    __obj.asInstanceOf[UploadMediaOptions]
  }
  @scala.inline
  implicit class UploadMediaOptionsOps[Self <: UploadMediaOptions] (val x: Self) extends AnyVal {
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
    def setFilesList(value: ArrayLike[File]): Self = this.set("filesList", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxUploadFileSize(value: Double): Self = this.set("maxUploadFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnError(value: Code => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnFileChange(value: js.Array[MediaItem] => Unit): Self = this.set("onFileChange", js.Any.fromFunction1(value))
    @scala.inline
    def setAdditionalData(value: Record[String, _]): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalData: Self = this.set("additionalData", js.undefined)
    @scala.inline
    def setAllowedTypesVarargs(value: String*): Self = this.set("allowedTypes", js.Array(value :_*))
    @scala.inline
    def setAllowedTypes(value: js.Array[String]): Self = this.set("allowedTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedTypes: Self = this.set("allowedTypes", js.undefined)
    @scala.inline
    def setWpAllowedMimeTypes(value: Record[String, String]): Self = this.set("wpAllowedMimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWpAllowedMimeTypes: Self = this.set("wpAllowedMimeTypes", js.undefined)
  }
  
}

