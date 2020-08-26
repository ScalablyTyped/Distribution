package typings.watsonDeveloperCloud.compareComplyV1Mod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType
import typings.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `convertToHtml` operation. */
@js.native
trait ConvertToHtmlParams extends js.Object {
  /** The document to convert. */
  var file: ReadableStream | FileObject | Buffer = js.native
  /** The content type of file. */
  var file_content_type: js.UndefOr[FileContentType | String] = js.native
  /** The filename for file. */
  var filename: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object ConvertToHtmlParams {
  @scala.inline
  def apply(file: ReadableStream | FileObject | Buffer, filename: String): ConvertToHtmlParams = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertToHtmlParams]
  }
  @scala.inline
  implicit class ConvertToHtmlParamsOps[Self <: ConvertToHtmlParams] (val x: Self) extends AnyVal {
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
    def setFile(value: ReadableStream | FileObject | Buffer): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile_content_type(value: FileContentType | String): Self = this.set("file_content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_content_type: Self = this.set("file_content_type", js.undefined)
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

