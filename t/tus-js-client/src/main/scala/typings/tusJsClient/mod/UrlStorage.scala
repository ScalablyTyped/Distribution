package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlStorage extends js.Object {
  
  // Returns the URL storage key, which can be used for removing the upload.
  def addUpload(fingerprint: String, upload: PreviousUpload): js.Promise[String] = js.native
  
  def findAllUploads(): js.Promise[js.Array[PreviousUpload]] = js.native
  
  def findUploadsByFingerprint(fingerprint: String): js.Promise[js.Array[PreviousUpload]] = js.native
  
  def removeUpload(urlStorageKey: String): js.Promise[Unit] = js.native
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
  
  @scala.inline
  implicit class UrlStorageOps[Self <: UrlStorage] (val x: Self) extends AnyVal {
    
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
    def setAddUpload(value: (String, PreviousUpload) => js.Promise[String]): Self = this.set("addUpload", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindAllUploads(value: () => js.Promise[js.Array[PreviousUpload]]): Self = this.set("findAllUploads", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindUploadsByFingerprint(value: String => js.Promise[js.Array[PreviousUpload]]): Self = this.set("findUploadsByFingerprint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUpload(value: String => js.Promise[Unit]): Self = this.set("removeUpload", js.Any.fromFunction1(value))
  }
}
