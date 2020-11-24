package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.UI.iOS.LivePhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A media object from the camera or photo gallery.
  */
@js.native
trait CameraMediaItemType extends SuccessResponse {
  
  /**
    * Simple object defining the user's selected crop rectangle, or `null` if the user has not edited the photo. `width`/`height` values are assumed to be in pixels.
    */
  var cropRect: js.UndefOr[Dimension] = js.native
  
  /**
    * The live photo object, as a <Titanium.UI.iOS.LivePhoto> and
    * `undefined` if no live photo is selected.
    */
  var livePhoto: js.UndefOr[LivePhoto] = js.native
  
  /**
    * The media object, as a [Blob](Titanium.Blob).
    */
  var media: js.UndefOr[Blob] = js.native
  
  /**
    * The type of media, either `MEDIA_TYPE_PHOTO`, `MEDIA_TYPE_LIVEPHOTO` or `MEDIA_TYPE_VIDEO` defined in <Titanium.Media>.
    */
  var mediaType: js.UndefOr[String] = js.native
  
  /**
    * Simple object defining the preview image size. This will be undefined when custom camera overlay is not used. Values are assumed to be in pixels.
    */
  var previewRect: js.UndefOr[Size] = js.native
}
object CameraMediaItemType {
  
  @scala.inline
  def apply(): CameraMediaItemType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraMediaItemType]
  }
  
  @scala.inline
  implicit class CameraMediaItemTypeOps[Self <: CameraMediaItemType] (val x: Self) extends AnyVal {
    
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
    def setCropRect(value: Dimension): Self = this.set("cropRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropRect: Self = this.set("cropRect", js.undefined)
    
    @scala.inline
    def setLivePhoto(value: LivePhoto): Self = this.set("livePhoto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLivePhoto: Self = this.set("livePhoto", js.undefined)
    
    @scala.inline
    def setMedia(value: Blob): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    
    @scala.inline
    def setPreviewRect(value: Size): Self = this.set("previewRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewRect: Self = this.set("previewRect", js.undefined)
  }
}
