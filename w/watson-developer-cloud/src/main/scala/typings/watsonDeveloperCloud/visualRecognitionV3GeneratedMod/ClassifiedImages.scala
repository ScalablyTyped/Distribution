package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Results for all images. */
@js.native
trait ClassifiedImages extends StObject {
  
  /** Number of custom classes identified in the images. */
  var custom_classes: js.UndefOr[Double] = js.native
  
  /** Classified images. */
  var images: js.Array[ClassifiedImage] = js.native
  
  /** Number of images processed for the API call. */
  var images_processed: js.UndefOr[Double] = js.native
  
  /** Information about what might cause less than optimal output. For example, a request sent with a corrupt .zip file and a list of image URLs will still complete, but does not return the expected output. Not returned when there is no warning. */
  var warnings: js.UndefOr[js.Array[WarningInfo]] = js.native
}
object ClassifiedImages {
  
  @scala.inline
  def apply(images: js.Array[ClassifiedImage]): ClassifiedImages = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedImages]
  }
  
  @scala.inline
  implicit class ClassifiedImagesMutableBuilder[Self <: ClassifiedImages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom_classes(value: Double): Self = StObject.set(x, "custom_classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_classesUndefined: Self = StObject.set(x, "custom_classes", js.undefined)
    
    @scala.inline
    def setImages(value: js.Array[ClassifiedImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: ClassifiedImage*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setImages_processed(value: Double): Self = StObject.set(x, "images_processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages_processedUndefined: Self = StObject.set(x, "images_processed", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[WarningInfo]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: WarningInfo*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
