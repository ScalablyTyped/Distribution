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
@js.native
trait TestConfigurationInEnvironmentParams extends js.Object {
  /** The configuration to use to process the document. If this part is provided, then the provided configuration is used to process the document. If the **configuration_id** is also provided (both are present at the same time), then request is rejected. The maximum supported configuration size is 1 MB. Configuration parts larger than 1 MB are rejected. See the `GET /configurations/{configuration_id}` operation for an example configuration. */
  var configuration: js.UndefOr[String] = js.native
  /** The ID of the configuration to use to process the document. If the **configuration** form part is also provided (both are present at the same time), then the request will be rejected. */
  var configuration_id: js.UndefOr[String] = js.native
  /** The ID of the environment. */
  var environment_id: String = js.native
  /** The content of the document to ingest. The maximum supported file size when adding a file to a collection is 50 megabytes, the maximum supported file size when testing a confiruration is 1 megabyte. Files larger than the supported size are rejected. */
  var file: js.UndefOr[ReadableStream | FileObject | Buffer] = js.native
  /** The content type of file. */
  var file_content_type: js.UndefOr[FileContentType | String] = js.native
  /** The filename for file. */
  var filename: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** If you're using the Data Crawler to upload your documents, you can test a document against the type of metadata that the Data Crawler might send. The maximum supported metadata file size is 1 MB. Metadata parts larger than 1 MB are rejected. Example:  ``` { "Creator": "Johnny Appleseed", "Subject": "Apples" } ```. */
  var metadata: js.UndefOr[String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Specify to only run the input document through the given step instead of running the input document through the entire ingestion workflow. Valid values are `convert`, `enrich`, and `normalize`. */
  var step: js.UndefOr[Step | String] = js.native
}

object TestConfigurationInEnvironmentParams {
  @scala.inline
  def apply(environment_id: String): TestConfigurationInEnvironmentParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConfigurationInEnvironmentParams]
  }
  @scala.inline
  implicit class TestConfigurationInEnvironmentParamsOps[Self <: TestConfigurationInEnvironmentParams] (val x: Self) extends AnyVal {
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
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfiguration(value: String): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setConfiguration_id(value: String): Self = this.set("configuration_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration_id: Self = this.set("configuration_id", js.undefined)
    @scala.inline
    def setFile(value: ReadableStream | FileObject | Buffer): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFile_content_type(value: FileContentType | String): Self = this.set("file_content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_content_type: Self = this.set("file_content_type", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setStep(value: Step | String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

