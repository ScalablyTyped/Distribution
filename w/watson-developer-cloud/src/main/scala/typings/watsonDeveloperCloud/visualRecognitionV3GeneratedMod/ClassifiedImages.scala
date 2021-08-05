package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Results for all images. */
trait ClassifiedImages extends StObject {
  
  /** Number of custom classes identified in the images. */
  var custom_classes: js.UndefOr[Double] = js.undefined
  
  /** Classified images. */
  var images: js.Array[ClassifiedImage]
  
  /** Number of images processed for the API call. */
  var images_processed: js.UndefOr[Double] = js.undefined
  
  /** Information about what might cause less than optimal output. For example, a request sent with a corrupt .zip file and a list of image URLs will still complete, but does not return the expected output. Not returned when there is no warning. */
  var warnings: js.UndefOr[js.Array[WarningInfo]] = js.undefined
}
object ClassifiedImages {
  
  inline def apply(images: js.Array[ClassifiedImage]): ClassifiedImages = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedImages]
  }
  
  extension [Self <: ClassifiedImages](x: Self) {
    
    inline def setCustom_classes(value: Double): Self = StObject.set(x, "custom_classes", value.asInstanceOf[js.Any])
    
    inline def setCustom_classesUndefined: Self = StObject.set(x, "custom_classes", js.undefined)
    
    inline def setImages(value: js.Array[ClassifiedImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ClassifiedImage*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    inline def setImages_processed(value: Double): Self = StObject.set(x, "images_processed", value.asInstanceOf[js.Any])
    
    inline def setImages_processedUndefined: Self = StObject.set(x, "images_processed", js.undefined)
    
    inline def setWarnings(value: js.Array[WarningInfo]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: WarningInfo*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
