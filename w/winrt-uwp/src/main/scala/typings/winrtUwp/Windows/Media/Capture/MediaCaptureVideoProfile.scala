package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video profile that indicates a configuration supported by the video capture device. */
@js.native
trait MediaCaptureVideoProfile extends js.Object {
  
  /**
    * Gets the list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    * @return The list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    */
  def getConcurrency(): IVectorView[MediaCaptureVideoProfile] = js.native
  
  /** Gets the unique identifier of the video profile. */
  var id: String = js.native
  
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for photo capture. */
  var supportedPhotoMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video preview. */
  var supportedPreviewMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video recording. */
  var supportedRecordMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  
  /** Gets the device ID of the video device associated with the video profile. */
  var videoDeviceId: String = js.native
}
object MediaCaptureVideoProfile {
  
  @scala.inline
  def apply(
    getConcurrency: () => IVectorView[MediaCaptureVideoProfile],
    id: String,
    supportedPhotoMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    supportedPreviewMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    supportedRecordMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    videoDeviceId: String
  ): MediaCaptureVideoProfile = {
    val __obj = js.Dynamic.literal(getConcurrency = js.Any.fromFunction0(getConcurrency), id = id.asInstanceOf[js.Any], supportedPhotoMediaDescription = supportedPhotoMediaDescription.asInstanceOf[js.Any], supportedPreviewMediaDescription = supportedPreviewMediaDescription.asInstanceOf[js.Any], supportedRecordMediaDescription = supportedRecordMediaDescription.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureVideoProfile]
  }
  
  @scala.inline
  implicit class MediaCaptureVideoProfileOps[Self <: MediaCaptureVideoProfile] (val x: Self) extends AnyVal {
    
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
    def setGetConcurrency(value: () => IVectorView[MediaCaptureVideoProfile]): Self = this.set("getConcurrency", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPhotoMediaDescription(value: IVectorView[MediaCaptureVideoProfileMediaDescription]): Self = this.set("supportedPhotoMediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPreviewMediaDescription(value: IVectorView[MediaCaptureVideoProfileMediaDescription]): Self = this.set("supportedPreviewMediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedRecordMediaDescription(value: IVectorView[MediaCaptureVideoProfileMediaDescription]): Self = this.set("supportedRecordMediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDeviceId(value: String): Self = this.set("videoDeviceId", value.asInstanceOf[js.Any])
  }
}
