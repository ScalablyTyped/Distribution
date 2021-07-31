package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Results for one image. */
trait ClassifiedImage extends StObject {
  
  /** The classifiers. */
  var classifiers: js.Array[ClassifierResult]
  
  /** Information about what might have caused a failure, such as an image that is too large. Not returned when there is no error. */
  var error: js.UndefOr[ErrorInfo] = js.undefined
  
  /** Relative path of the image file if uploaded directly. Not returned when the image is passed by URL. */
  var image: js.UndefOr[String] = js.undefined
  
  /** Fully resolved URL of the image after redirects are followed. Not returned when the image is uploaded. */
  var resolved_url: js.UndefOr[String] = js.undefined
  
  /** Source of the image before any redirects. Not returned when the image is uploaded. */
  var source_url: js.UndefOr[String] = js.undefined
}
object ClassifiedImage {
  
  @scala.inline
  def apply(classifiers: js.Array[ClassifierResult]): ClassifiedImage = {
    val __obj = js.Dynamic.literal(classifiers = classifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedImage]
  }
  
  @scala.inline
  implicit class ClassifiedImageMutableBuilder[Self <: ClassifiedImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifiers(value: js.Array[ClassifierResult]): Self = StObject.set(x, "classifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifiersVarargs(value: ClassifierResult*): Self = StObject.set(x, "classifiers", js.Array(value :_*))
    
    @scala.inline
    def setError(value: ErrorInfo): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setResolved_url(value: String): Self = StObject.set(x, "resolved_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolved_urlUndefined: Self = StObject.set(x, "resolved_url", js.undefined)
    
    @scala.inline
    def setSource_url(value: String): Self = StObject.set(x, "source_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_urlUndefined: Self = StObject.set(x, "source_url", js.undefined)
  }
}
