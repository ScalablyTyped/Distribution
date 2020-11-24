package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Results for all images. */
@js.native
trait ClassifiedImages extends js.Object {
  
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
  implicit class ClassifiedImagesOps[Self <: ClassifiedImages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImagesVarargs(value: ClassifiedImage*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[ClassifiedImage]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_classes(value: Double): Self = this.set("custom_classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_classes: Self = this.set("custom_classes", js.undefined)
    
    @scala.inline
    def setImages_processed(value: Double): Self = this.set("images_processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages_processed: Self = this.set("images_processed", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: WarningInfo*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[WarningInfo]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
