package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.ibmDashCloudDashSdkDashCore.libHelperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateDocumentConstants.FileContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateDocument` operation. */
trait UpdateDocumentParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The ID of the document. */
  var document_id: String
  /** The ID of the environment. */
  var environment_id: String
  /** The content of the document to ingest. The maximum supported file size when adding a file to a collection is 50 megabytes, the maximum supported file size when testing a confiruration is 1 megabyte. Files larger than the supported size are rejected. */
  var file: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  /** The content type of file. */
  var file_content_type: js.UndefOr[FileContentType | String] = js.undefined
  /** The filename for file. */
  var filename: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** If you're using the Data Crawler to upload your documents, you can test a document against the type of metadata that the Data Crawler might send. The maximum supported metadata file size is 1 MB. Metadata parts larger than 1 MB are rejected. Example:  ``` { "Creator": "Johnny Appleseed", "Subject": "Apples" } ```. */
  var metadata: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object UpdateDocumentParams {
  @scala.inline
  def apply(
    collection_id: String,
    document_id: String,
    environment_id: String,
    file: ReadableStream | FileObject | Buffer = null,
    file_content_type: FileContentType | String = null,
    filename: String = null,
    headers: js.Object = null,
    metadata: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateDocumentParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id, document_id = document_id, environment_id = environment_id)
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (file_content_type != null) __obj.updateDynamic("file_content_type")(file_content_type.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[UpdateDocumentParams]
  }
}

