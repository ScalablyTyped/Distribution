package typings.watsonDeveloperCloud.compareComplyV1Mod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType
import typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType
import typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `compareDocuments` operation. */
trait CompareDocumentsParams extends StObject {
  
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
  
  inline def apply(file_1: ReadableStream | FileObject | Buffer, file_2: ReadableStream | FileObject | Buffer): CompareDocumentsParams = {
    val __obj = js.Dynamic.literal(file_1 = file_1.asInstanceOf[js.Any], file_2 = file_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareDocumentsParams]
  }
  
  extension [Self <: CompareDocumentsParams](x: Self) {
    
    inline def setFile_1(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "file_1", value.asInstanceOf[js.Any])
    
    inline def setFile_1_content_type(value: File1ContentType | String): Self = StObject.set(x, "file_1_content_type", value.asInstanceOf[js.Any])
    
    inline def setFile_1_content_typeUndefined: Self = StObject.set(x, "file_1_content_type", js.undefined)
    
    inline def setFile_1_label(value: String): Self = StObject.set(x, "file_1_label", value.asInstanceOf[js.Any])
    
    inline def setFile_1_labelUndefined: Self = StObject.set(x, "file_1_label", js.undefined)
    
    inline def setFile_2(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "file_2", value.asInstanceOf[js.Any])
    
    inline def setFile_2_content_type(value: File2ContentType | String): Self = StObject.set(x, "file_2_content_type", value.asInstanceOf[js.Any])
    
    inline def setFile_2_content_typeUndefined: Self = StObject.set(x, "file_2_content_type", js.undefined)
    
    inline def setFile_2_label(value: String): Self = StObject.set(x, "file_2_label", value.asInstanceOf[js.Any])
    
    inline def setFile_2_labelUndefined: Self = StObject.set(x, "file_2_label", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setModel(value: Model | String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
