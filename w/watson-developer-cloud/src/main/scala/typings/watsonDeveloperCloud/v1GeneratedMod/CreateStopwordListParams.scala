package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createStopwordList` operation. */
trait CreateStopwordListParams extends StObject {
  
  /** The ID of the collection. */
  var collection_id: String
  
  /** The ID of the environment. */
  var environment_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The content of the stopword list to ingest. */
  var stopword_file: ReadableStream | FileObject | Buffer
  
  /** The filename for stopword_file. */
  var stopword_filename: String
}
object CreateStopwordListParams {
  
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    stopword_file: ReadableStream | FileObject | Buffer,
    stopword_filename: String
  ): CreateStopwordListParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], stopword_file = stopword_file.asInstanceOf[js.Any], stopword_filename = stopword_filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStopwordListParams]
  }
  
  @scala.inline
  implicit class CreateStopwordListParamsMutableBuilder[Self <: CreateStopwordListParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setStopword_file(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "stopword_file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopword_filename(value: String): Self = StObject.set(x, "stopword_filename", value.asInstanceOf[js.Any])
  }
}
