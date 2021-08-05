package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createClassifier` operation. */
trait CreateClassifierParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Metadata in JSON format. The metadata identifies the language of the data, and an optional name to identify the classifier. Specify the language with the 2-letter primary language code as assigned in ISO standard 639. Supported languages are English (`en`), Arabic (`ar`), French (`fr`), German, (`de`), Italian (`it`), Japanese (`ja`), Korean (`ko`), Brazilian Portuguese (`pt`), and Spanish (`es`). */
  var metadata: ReadableStream | FileObject | Buffer
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Training data in CSV format. Each text value must have at least one class. The data can include up to 3,000 classes and 20,000 records. For details, see [Data preparation](https://cloud.ibm.com/docs/services/natural-language-classifier/using-your-data.html). */
  var training_data: ReadableStream | FileObject | Buffer
}
object CreateClassifierParams {
  
  inline def apply(
    metadata: ReadableStream | FileObject | Buffer,
    training_data: ReadableStream | FileObject | Buffer
  ): CreateClassifierParams = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], training_data = training_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassifierParams]
  }
  
  extension [Self <: CreateClassifierParams](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMetadata(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setTraining_data(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "training_data", value.asInstanceOf[js.Any])
  }
}
