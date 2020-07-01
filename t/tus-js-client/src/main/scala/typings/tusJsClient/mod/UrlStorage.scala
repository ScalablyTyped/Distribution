package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlStorage extends js.Object {
  // Returns the URL storage key, which can be used for removing the upload.
  def addUpload(fingerprint: String, upload: PreviousUpload): js.Promise[String]
  def findAllUploads(): js.Promise[js.Array[PreviousUpload]]
  def findUploadsByFingerprint(fingerprint: String): js.Promise[js.Array[PreviousUpload]]
  def removeUpload(urlStorageKey: String): js.Promise[Unit]
}

object UrlStorage {
  @scala.inline
  def apply(
    addUpload: (String, PreviousUpload) => js.Promise[String],
    findAllUploads: () => js.Promise[js.Array[PreviousUpload]],
    findUploadsByFingerprint: String => js.Promise[js.Array[PreviousUpload]],
    removeUpload: String => js.Promise[Unit]
  ): UrlStorage = {
    val __obj = js.Dynamic.literal(addUpload = js.Any.fromFunction2(addUpload), findAllUploads = js.Any.fromFunction0(findAllUploads), findUploadsByFingerprint = js.Any.fromFunction1(findUploadsByFingerprint), removeUpload = js.Any.fromFunction1(removeUpload))
    __obj.asInstanceOf[UrlStorage]
  }
}

