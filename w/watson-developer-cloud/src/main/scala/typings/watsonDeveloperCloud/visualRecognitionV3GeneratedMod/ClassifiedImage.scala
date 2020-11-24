package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Results for one image. */
@js.native
trait ClassifiedImage extends js.Object {
  
  /** The classifiers. */
  var classifiers: js.Array[ClassifierResult] = js.native
  
  /** Information about what might have caused a failure, such as an image that is too large. Not returned when there is no error. */
  var error: js.UndefOr[ErrorInfo] = js.native
  
  /** Relative path of the image file if uploaded directly. Not returned when the image is passed by URL. */
  var image: js.UndefOr[String] = js.native
  
  /** Fully resolved URL of the image after redirects are followed. Not returned when the image is uploaded. */
  var resolved_url: js.UndefOr[String] = js.native
  
  /** Source of the image before any redirects. Not returned when the image is uploaded. */
  var source_url: js.UndefOr[String] = js.native
}
object ClassifiedImage {
  
  @scala.inline
  def apply(classifiers: js.Array[ClassifierResult]): ClassifiedImage = {
    val __obj = js.Dynamic.literal(classifiers = classifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedImage]
  }
  
  @scala.inline
  implicit class ClassifiedImageOps[Self <: ClassifiedImage] (val x: Self) extends AnyVal {
    
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
    def setClassifiersVarargs(value: ClassifierResult*): Self = this.set("classifiers", js.Array(value :_*))
    
    @scala.inline
    def setClassifiers(value: js.Array[ClassifierResult]): Self = this.set("classifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorInfo): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setResolved_url(value: String): Self = this.set("resolved_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolved_url: Self = this.set("resolved_url", js.undefined)
    
    @scala.inline
    def setSource_url(value: String): Self = this.set("source_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_url: Self = this.set("source_url", js.undefined)
  }
}
