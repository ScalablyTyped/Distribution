package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an image that is associated with a product listing in the Windows Store. */
trait StoreImage extends StObject {
  
  /** Gets the caption for the image. */
  var caption: String
  
  /** Gets the height of the image, in pixels. */
  var height: Double
  
  /** Gets the tag for the image. */
  var imagePurposeTag: String
  
  /** Gets the URI of the image. */
  var uri: Uri
  
  /** Gets the width of the image, in pixels. */
  var width: Double
}
object StoreImage {
  
  inline def apply(caption: String, height: Double, imagePurposeTag: String, uri: Uri, width: Double): StoreImage = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imagePurposeTag = imagePurposeTag.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreImage] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImagePurposeTag(value: String): Self = StObject.set(x, "imagePurposeTag", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
