package typings.watsonDeveloperCloud.compareComplyV1Mod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType
import typings.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `extractTables` operation. */
trait ExtractTablesParams extends StObject {
  
  /** The document on which to run table extraction. */
  var file: ReadableStream | FileObject | Buffer
  
  /** The content type of file. */
  var file_content_type: js.UndefOr[FileContentType | String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object ExtractTablesParams {
  
  inline def apply(file: ReadableStream | FileObject | Buffer): ExtractTablesParams = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractTablesParams]
  }
  
  extension [Self <: ExtractTablesParams](x: Self) {
    
    inline def setFile(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFile_content_type(value: FileContentType | String): Self = StObject.set(x, "file_content_type", value.asInstanceOf[js.Any])
    
    inline def setFile_content_typeUndefined: Self = StObject.set(x, "file_content_type", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setModel(value: Model | String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
