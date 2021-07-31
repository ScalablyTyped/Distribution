package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Results for all faces. */
trait DetectedFaces extends StObject {
  
  /** The images. */
  var images: js.Array[ImageWithFaces]
  
  /** Number of images processed for the API call. */
  var images_processed: Double
  
  /** Information about what might cause less than optimal output. For example, a request sent with a corrupt .zip file and a list of image URLs will still complete, but does not return the expected output. Not returned when there is no warning. */
  var warnings: js.UndefOr[js.Array[WarningInfo]] = js.undefined
}
object DetectedFaces {
  
  @scala.inline
  def apply(images: js.Array[ImageWithFaces], images_processed: Double): DetectedFaces = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], images_processed = images_processed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedFaces]
  }
  
  @scala.inline
  implicit class DetectedFacesMutableBuilder[Self <: DetectedFaces] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: js.Array[ImageWithFaces]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: ImageWithFaces*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setImages_processed(value: Double): Self = StObject.set(x, "images_processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Array[WarningInfo]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: WarningInfo*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
