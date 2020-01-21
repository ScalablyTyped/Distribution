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
trait ConvertToHtmlParams extends js.Object {
  /** The document to convert. */
  var file: ReadableStream | FileObject | Buffer
  /** The content type of file. */
  var file_content_type: js.UndefOr[FileContentType | String] = js.undefined
  /** The filename for file. */
  var filename: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ConvertToHtmlParams {
  @scala.inline
  def apply(
    file: ReadableStream | FileObject | Buffer,
    filename: String,
    file_content_type: FileContentType | String = null,
    headers: js.Object = null,
    model: Model | String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ConvertToHtmlParams = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    if (file_content_type != null) __obj.updateDynamic("file_content_type")(file_content_type.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertToHtmlParams]
  }
}

