package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typings.ibmCloudSdkCore.esLibHelperMod.FileObject
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateClassifier` operation. */
trait UpdateClassifierParams extends StObject {
  
  /** The ID of the classifier. */
  var classifier_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** A .zip file of images that do not depict the visual subject of any of the classes of the new classifier. Must contain a minimum of 10 images. Encode special characters in the file name in UTF-8. */
  var negative_examples: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  
  /** The filename for negative_examples. */
  var negative_examples_filename: js.UndefOr[String] = js.undefined
  
  /** A dictionary that contains the value for each classname. The value is a .zip file of images that depict the visual subject of a class in the classifier. The positive examples create or update classes in the classifier. You can include more than one positive example file in a call. Specify the parameter name by appending `_positive_examples` to the class name. For example, `goldenretriever_positive_examples` creates the class `goldenretriever`. Include at least 10 images in .jpg or .png format. The minimum recommended image resolution is 32X32 pixels. The maximum number of images is 10,000 images or 100 MB per .zip file. Encode special characters in the file name in UTF-8. */
  var positive_examples: js.UndefOr[Map[String, ReadableStream | FileObject | Buffer]] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object UpdateClassifierParams {
  
  inline def apply(classifier_id: String): UpdateClassifierParams = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClassifierParams]
  }
  
  extension [Self <: UpdateClassifierParams](x: Self) {
    
    inline def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setNegative_examples(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "negative_examples", value.asInstanceOf[js.Any])
    
    inline def setNegative_examplesUndefined: Self = StObject.set(x, "negative_examples", js.undefined)
    
    inline def setNegative_examples_filename(value: String): Self = StObject.set(x, "negative_examples_filename", value.asInstanceOf[js.Any])
    
    inline def setNegative_examples_filenameUndefined: Self = StObject.set(x, "negative_examples_filename", js.undefined)
    
    inline def setPositive_examples(value: Map[String, ReadableStream | FileObject | Buffer]): Self = StObject.set(x, "positive_examples", value.asInstanceOf[js.Any])
    
    inline def setPositive_examplesUndefined: Self = StObject.set(x, "positive_examples", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
