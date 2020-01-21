package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType
import typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `testConfigurationInEnvironment` operation. */
trait TestConfigurationInEnvironmentParams extends js.Object {
  /** The configuration to use to process the document. If this part is provided, then the provided configuration is used to process the document. If the **configuration_id** is also provided (both are present at the same time), then request is rejected. The maximum supported configuration size is 1 MB. Configuration parts larger than 1 MB are rejected. See the `GET /configurations/{configuration_id}` operation for an example configuration. */
  var configuration: js.UndefOr[String] = js.undefined
  /** The ID of the configuration to use to process the document. If the **configuration** form part is also provided (both are present at the same time), then the request will be rejected. */
  var configuration_id: js.UndefOr[String] = js.undefined
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
  /** Specify to only run the input document through the given step instead of running the input document through the entire ingestion workflow. Valid values are `convert`, `enrich`, and `normalize`. */
  var step: js.UndefOr[Step | String] = js.undefined
}

object TestConfigurationInEnvironmentParams {
  @scala.inline
  def apply(
    environment_id: String,
    configuration: String = null,
    configuration_id: String = null,
    file: ReadableStream | FileObject | Buffer = null,
    file_content_type: FileContentType | String = null,
    filename: String = null,
    headers: js.Object = null,
    metadata: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    step: Step | String = null
  ): TestConfigurationInEnvironmentParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (configuration_id != null) __obj.updateDynamic("configuration_id")(configuration_id.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (file_content_type != null) __obj.updateDynamic("file_content_type")(file_content_type.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConfigurationInEnvironmentParams]
  }
}

