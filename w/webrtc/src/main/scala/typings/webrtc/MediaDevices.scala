package typings.webrtc

import typings.std.MediaDeviceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaDevices extends js.Object {
  
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]] = js.native
  
  def getSupportedConstraints(): MediaTrackSupportedConstraints = js.native
  
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native
}
object MediaDevices {
  
  @scala.inline
  def apply(
    enumerateDevices: () => js.Promise[js.Array[MediaDeviceInfo]],
    getSupportedConstraints: () => MediaTrackSupportedConstraints,
    getUserMedia: MediaStreamConstraints => js.Promise[MediaStream]
  ): MediaDevices = {
    val __obj = js.Dynamic.literal(enumerateDevices = js.Any.fromFunction0(enumerateDevices), getSupportedConstraints = js.Any.fromFunction0(getSupportedConstraints), getUserMedia = js.Any.fromFunction1(getUserMedia))
    __obj.asInstanceOf[MediaDevices]
  }
  
  @scala.inline
  implicit class MediaDevicesOps[Self <: MediaDevices] (val x: Self) extends AnyVal {
    
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
    def setEnumerateDevices(value: () => js.Promise[js.Array[MediaDeviceInfo]]): Self = this.set("enumerateDevices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedConstraints(value: () => MediaTrackSupportedConstraints): Self = this.set("getSupportedConstraints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserMedia(value: MediaStreamConstraints => js.Promise[MediaStream]): Self = this.set("getUserMedia", js.Any.fromFunction1(value))
  }
}
