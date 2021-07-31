package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about faces in the image. */
trait ImageWithFaces extends StObject {
  
  /** Information about what might have caused a failure, such as an image that is too large. Not returned when there is no error. */
  var error: js.UndefOr[ErrorInfo] = js.undefined
  
  /** Faces detected in the images. */
  var faces: js.Array[Face]
  
  /** Relative path of the image file if uploaded directly. Not returned when the image is passed by URL. */
  var image: js.UndefOr[String] = js.undefined
  
  /** Fully resolved URL of the image after redirects are followed. Not returned when the image is uploaded. */
  var resolved_url: js.UndefOr[String] = js.undefined
  
  /** Source of the image before any redirects. Not returned when the image is uploaded. */
  var source_url: js.UndefOr[String] = js.undefined
}
object ImageWithFaces {
  
  @scala.inline
  def apply(faces: js.Array[Face]): ImageWithFaces = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageWithFaces]
  }
  
  @scala.inline
  implicit class ImageWithFacesMutableBuilder[Self <: ImageWithFaces] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ErrorInfo): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFaces(value: js.Array[Face]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacesVarargs(value: Face*): Self = StObject.set(x, "faces", js.Array(value :_*))
    
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
