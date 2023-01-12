package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video that is associated with a product listing in the Windows Store. */
trait StoreVideo extends StObject {
  
  /** Gets the caption for the video. */
  var caption: String
  
  /** Gets the height of the video, in pixels. */
  var height: Double
  
  /** Gets the preview image that is displayed for the video. */
  var previewImage: StoreImage
  
  /** Gets the URI of the video. */
  var uri: Uri
  
  /** Gets the tag for the video. */
  var videoPurposeTag: String
  
  /** Gets the width of the video, in pixels. */
  var width: Double
}
object StoreVideo {
  
  inline def apply(
    caption: String,
    height: Double,
    previewImage: StoreImage,
    uri: Uri,
    videoPurposeTag: String,
    width: Double
  ): StoreVideo = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], previewImage = previewImage.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], videoPurposeTag = videoPurposeTag.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreVideo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreVideo] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPreviewImage(value: StoreImage): Self = StObject.set(x, "previewImage", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setVideoPurposeTag(value: String): Self = StObject.set(x, "videoPurposeTag", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
