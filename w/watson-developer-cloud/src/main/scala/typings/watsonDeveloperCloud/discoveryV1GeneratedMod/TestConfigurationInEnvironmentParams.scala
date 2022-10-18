package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import typings.ibmCloudSdkCore.esLibHelperMod.FileObject
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.watsonDeveloperCloud.discoveryV1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType
import typings.watsonDeveloperCloud.discoveryV1GeneratedMod.TestConfigurationInEnvironmentConstants.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `testConfigurationInEnvironment` operation. */
trait TestConfigurationInEnvironmentParams extends StObject {
  
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
  
  inline def apply(environment_id: String): TestConfigurationInEnvironmentParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConfigurationInEnvironmentParams]
  }
  
  extension [Self <: TestConfigurationInEnvironmentParams](x: Self) {
    
    inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setConfiguration_id(value: String): Self = StObject.set(x, "configuration_id", value.asInstanceOf[js.Any])
    
    inline def setConfiguration_idUndefined: Self = StObject.set(x, "configuration_id", js.undefined)
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setFile(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFile_content_type(value: FileContentType | String): Self = StObject.set(x, "file_content_type", value.asInstanceOf[js.Any])
    
    inline def setFile_content_typeUndefined: Self = StObject.set(x, "file_content_type", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setStep(value: Step | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
