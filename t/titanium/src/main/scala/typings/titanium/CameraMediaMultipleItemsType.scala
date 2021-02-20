package typings.titanium

import typings.titanium.Titanium.UI.iOS.LivePhoto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A media object from photo gallery when <Titanium.Media.allowMultiple> is `true`.
  */
@js.native
trait CameraMediaMultipleItemsType extends SuccessResponse {
  
  /**
    * The list of selected images.
    */
  var images: js.UndefOr[js.Array[CameraMediaItemType]] = js.native
  
  /**
    * The list of selected live photo objects.
    */
  var livePhotos: js.UndefOr[js.Array[LivePhoto]] = js.native
  
  /**
    * The list of selected videos.
    */
  var videos: js.UndefOr[js.Array[CameraMediaItemType]] = js.native
}
object CameraMediaMultipleItemsType {
  
  @scala.inline
  def apply(): CameraMediaMultipleItemsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraMediaMultipleItemsType]
  }
  
  @scala.inline
  implicit class CameraMediaMultipleItemsTypeMutableBuilder[Self <: CameraMediaMultipleItemsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: js.Array[CameraMediaItemType]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: CameraMediaItemType*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setLivePhotos(value: js.Array[LivePhoto]): Self = StObject.set(x, "livePhotos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivePhotosUndefined: Self = StObject.set(x, "livePhotos", js.undefined)
    
    @scala.inline
    def setLivePhotosVarargs(value: LivePhoto*): Self = StObject.set(x, "livePhotos", js.Array(value :_*))
    
    @scala.inline
    def setVideos(value: js.Array[CameraMediaItemType]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosUndefined: Self = StObject.set(x, "videos", js.undefined)
    
    @scala.inline
    def setVideosVarargs(value: CameraMediaItemType*): Self = StObject.set(x, "videos", js.Array(value :_*))
  }
}
