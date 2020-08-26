package typings.watsonDeveloperCloud.compareComplyV1Mod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType
import typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType
import typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `compareDocuments` operation. */
@js.native
trait CompareDocumentsParams extends js.Object {
  /** The first document to compare. */
  var file_1: ReadableStream | FileObject | Buffer = js.native
  /** The content type of file_1. */
  var file_1_content_type: js.UndefOr[File1ContentType | String] = js.native
  /** A text label for the first document. */
  var file_1_label: js.UndefOr[String] = js.native
  /** The second document to compare. */
  var file_2: ReadableStream | FileObject | Buffer = js.native
  /** The content type of file_2. */
  var file_2_content_type: js.UndefOr[File2ContentType | String] = js.native
  /** A text label for the second document. */
  var file_2_label: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object CompareDocumentsParams {
  @scala.inline
  def apply(file_1: ReadableStream | FileObject | Buffer, file_2: ReadableStream | FileObject | Buffer): CompareDocumentsParams = {
    val __obj = js.Dynamic.literal(file_1 = file_1.asInstanceOf[js.Any], file_2 = file_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareDocumentsParams]
  }
  @scala.inline
  implicit class CompareDocumentsParamsOps[Self <: CompareDocumentsParams] (val x: Self) extends AnyVal {
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
    def setFile_1(value: ReadableStream | FileObject | Buffer): Self = this.set("file_1", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile_2(value: ReadableStream | FileObject | Buffer): Self = this.set("file_2", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile_1_content_type(value: File1ContentType | String): Self = this.set("file_1_content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_1_content_type: Self = this.set("file_1_content_type", js.undefined)
    @scala.inline
    def setFile_1_label(value: String): Self = this.set("file_1_label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_1_label: Self = this.set("file_1_label", js.undefined)
    @scala.inline
    def setFile_2_content_type(value: File2ContentType | String): Self = this.set("file_2_content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_2_content_type: Self = this.set("file_2_content_type", js.undefined)
    @scala.inline
    def setFile_2_label(value: String): Self = this.set("file_2_label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_2_label: Self = this.set("file_2_label", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setModel(value: Model | String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

