package typings.titanium

import typings.titanium.Titanium.UI.iOS.LivePhoto
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
  implicit class CameraMediaMultipleItemsTypeOps[Self <: CameraMediaMultipleItemsType] (val x: Self) extends AnyVal {
    
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
    def setImagesVarargs(value: CameraMediaItemType*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[CameraMediaItemType]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
    @scala.inline
    def setLivePhotosVarargs(value: LivePhoto*): Self = this.set("livePhotos", js.Array(value :_*))
    
    @scala.inline
    def setLivePhotos(value: js.Array[LivePhoto]): Self = this.set("livePhotos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLivePhotos: Self = this.set("livePhotos", js.undefined)
    
    @scala.inline
    def setVideosVarargs(value: CameraMediaItemType*): Self = this.set("videos", js.Array(value :_*))
    
    @scala.inline
    def setVideos(value: js.Array[CameraMediaItemType]): Self = this.set("videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideos: Self = this.set("videos", js.undefined)
  }
}
