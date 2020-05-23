package typings.wordpressMediaUtils.uploadMediaMod

import typings.std.ArrayLike
import typings.std.File
import typings.std.Record
import typings.wordpressMediaUtils.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadMediaOptions extends js.Object {
  /**
    * Additional data to include in the request.
    */
  var additionalData: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * Array with the types of media that can be uploaded, if unset all types are allowed.
    */
  var allowedTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of files.
    */
  var filesList: ArrayLike[File]
  /**
    * Maximum upload size in bytes allowed for the site.
    */
  var maxUploadFileSize: Double
  /**
    * Allowed mime types and file extensions.
    * @example
    * ```js
    * {
    *   'jpg|jpeg': 'image/jpeg',
    * }
    * ```
    */
  var wpAllowedMimeTypes: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Function called when an error happens.
    */
  def onError(error: Code): Unit
  /**
    * Function called each time a file or a temporary representation of the file is available.
    */
  def onFileChange(files: js.Array[MediaItem]): Unit
}

object UploadMediaOptions {
  @scala.inline
  def apply(
    filesList: ArrayLike[File],
    maxUploadFileSize: Double,
    onError: Code => Unit,
    onFileChange: js.Array[MediaItem] => Unit,
    additionalData: Record[String, _] = null,
    allowedTypes: js.Array[String] = null,
    wpAllowedMimeTypes: Record[String, String] = null
  ): UploadMediaOptions = {
    val __obj = js.Dynamic.literal(filesList = filesList.asInstanceOf[js.Any], maxUploadFileSize = maxUploadFileSize.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onFileChange = js.Any.fromFunction1(onFileChange))
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData.asInstanceOf[js.Any])
    if (allowedTypes != null) __obj.updateDynamic("allowedTypes")(allowedTypes.asInstanceOf[js.Any])
    if (wpAllowedMimeTypes != null) __obj.updateDynamic("wpAllowedMimeTypes")(wpAllowedMimeTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadMediaOptions]
  }
}

