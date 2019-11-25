package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import typings.ibmDashCloudDashSdkDashCore.libHelperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File1ContentType
import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File2ContentType
import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `compareDocuments` operation. */
trait CompareDocumentsParams extends js.Object {
  /** The first document to compare. */
  var file_1: ReadableStream | FileObject | Buffer
  /** The content type of file_1. */
  var file_1_content_type: js.UndefOr[File1ContentType | String] = js.undefined
  /** A text label for the first document. */
  var file_1_label: js.UndefOr[String] = js.undefined
  /** The second document to compare. */
  var file_2: ReadableStream | FileObject | Buffer
  /** The content type of file_2. */
  var file_2_content_type: js.UndefOr[File2ContentType | String] = js.undefined
  /** A text label for the second document. */
  var file_2_label: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object CompareDocumentsParams {
  @scala.inline
  def apply(
    file_1: ReadableStream | FileObject | Buffer,
    file_2: ReadableStream | FileObject | Buffer,
    file_1_content_type: File1ContentType | String = null,
    file_1_label: String = null,
    file_2_content_type: File2ContentType | String = null,
    file_2_label: String = null,
    headers: js.Object = null,
    model: Model | String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CompareDocumentsParams = {
    val __obj = js.Dynamic.literal(file_1 = file_1.asInstanceOf[js.Any], file_2 = file_2.asInstanceOf[js.Any])
    if (file_1_content_type != null) __obj.updateDynamic("file_1_content_type")(file_1_content_type.asInstanceOf[js.Any])
    if (file_1_label != null) __obj.updateDynamic("file_1_label")(file_1_label.asInstanceOf[js.Any])
    if (file_2_content_type != null) __obj.updateDynamic("file_2_content_type")(file_2_content_type.asInstanceOf[js.Any])
    if (file_2_label != null) __obj.updateDynamic("file_2_label")(file_2_label.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareDocumentsParams]
  }
}

