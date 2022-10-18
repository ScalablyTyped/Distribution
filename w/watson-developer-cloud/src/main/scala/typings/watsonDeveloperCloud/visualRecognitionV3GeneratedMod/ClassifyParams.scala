package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typings.ibmCloudSdkCore.esLibHelperMod.FileObject
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `classify` operation. */
trait ClassifyParams extends StObject {
  
  /** The desired language of parts of the response. See the response for details. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.undefined
  
  /** Which classifiers to apply. Overrides the **owners** parameter. You can specify both custom and built-in classifier IDs. The built-in `default` classifier is used if both **classifier_ids** and **owners** parameters are empty. The following built-in classifier IDs require no training: - `default`: Returns classes from thousands of general tags. - `food`: Enhances specificity and accuracy for images of food items. - `explicit`: Evaluates whether the image might be pornographic. */
  var classifier_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** An image file (.gif, .jpg, .png, .tif) or .zip file with images. Maximum image size is 10 MB. Include no more than 20 images and limit the .zip file to 100 MB. Encode the image and .zip file names in UTF-8 if they contain non-ASCII characters. The service assumes UTF-8 encoding if it encounters non-ASCII characters. You can also include an image with the **url** parameter. */
  var images_file: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  
  /** The content type of images_file. */
  var images_file_content_type: js.UndefOr[String] = js.undefined
  
  /** The filename for images_file. */
  var images_filename: js.UndefOr[String] = js.undefined
  
  /** The categories of classifiers to apply. The **classifier_ids** parameter overrides **owners**, so make sure that **classifier_ids** is empty. - Use `IBM` to classify against the `default` general classifier. You get the same result if both **classifier_ids** and **owners** parameters are empty. - Use `me` to classify against all your custom classifiers. However, for better performance use **classifier_ids** to specify the specific custom classifiers to apply. - Use both `IBM` and `me` to analyze the image against both classifier categories. */
  var owners: js.UndefOr[js.Array[String]] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The minimum score a class must have to be displayed in the response. Set the threshold to `0.0` to return all identified classes. */
  var threshold: js.UndefOr[Double] = js.undefined
  
  /** The URL of an image (.gif, .jpg, .png, .tif) to analyze. The minimum recommended pixel density is 32X32 pixels, but the service tends to perform better with images that are at least 224 x 224 pixels. The maximum image size is 10 MB. You can also include images with the **images_file** parameter. */
  var url: js.UndefOr[String] = js.undefined
}
object ClassifyParams {
  
  inline def apply(): ClassifyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyParams]
  }
  
  extension [Self <: ClassifyParams](x: Self) {
    
    inline def setAccept_language(value: AcceptLanguage | String): Self = StObject.set(x, "accept_language", value.asInstanceOf[js.Any])
    
    inline def setAccept_languageUndefined: Self = StObject.set(x, "accept_language", js.undefined)
    
    inline def setClassifier_ids(value: js.Array[String]): Self = StObject.set(x, "classifier_ids", value.asInstanceOf[js.Any])
    
    inline def setClassifier_idsUndefined: Self = StObject.set(x, "classifier_ids", js.undefined)
    
    inline def setClassifier_idsVarargs(value: String*): Self = StObject.set(x, "classifier_ids", js.Array(value*))
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setImages_file(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "images_file", value.asInstanceOf[js.Any])
    
    inline def setImages_fileUndefined: Self = StObject.set(x, "images_file", js.undefined)
    
    inline def setImages_file_content_type(value: String): Self = StObject.set(x, "images_file_content_type", value.asInstanceOf[js.Any])
    
    inline def setImages_file_content_typeUndefined: Self = StObject.set(x, "images_file_content_type", js.undefined)
    
    inline def setImages_filename(value: String): Self = StObject.set(x, "images_filename", value.asInstanceOf[js.Any])
    
    inline def setImages_filenameUndefined: Self = StObject.set(x, "images_filename", js.undefined)
    
    inline def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    inline def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value*))
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
