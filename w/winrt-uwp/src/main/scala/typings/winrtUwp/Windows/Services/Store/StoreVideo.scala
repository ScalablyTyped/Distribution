package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video that is associated with a product listing in the Windows Store. */
@js.native
trait StoreVideo extends StObject {
  
  /** Gets the caption for the video. */
  var caption: String = js.native
  
  /** Gets the height of the video, in pixels. */
  var height: Double = js.native
  
  /** Gets the preview image that is displayed for the video. */
  var previewImage: StoreImage = js.native
  
  /** Gets the URI of the video. */
  var uri: Uri = js.native
  
  /** Gets the tag for the video. */
  var videoPurposeTag: String = js.native
  
  /** Gets the width of the video, in pixels. */
  var width: Double = js.native
}
object StoreVideo {
  
  @scala.inline
  def apply(
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
  implicit class StoreVideoMutableBuilder[Self <: StoreVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewImage(value: StoreImage): Self = StObject.set(x, "previewImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoPurposeTag(value: String): Self = StObject.set(x, "videoPurposeTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
