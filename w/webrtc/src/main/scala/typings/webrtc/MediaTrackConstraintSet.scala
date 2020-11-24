package typings.webrtc

import typings.webrtc.W3C.ConstrainBoolean
import typings.webrtc.W3C.ConstrainDouble
import typings.webrtc.W3C.ConstrainLong
import typings.webrtc.W3C.ConstrainString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackConstraintSet extends js.Object {
  
  var aspectRatio: js.UndefOr[ConstrainDouble] = js.native
  
  var deviceId: js.UndefOr[ConstrainString] = js.native
  
  var echoCancellation: js.UndefOr[ConstrainBoolean] = js.native
  
  var facingMode: js.UndefOr[ConstrainString] = js.native
  
  var frameRate: js.UndefOr[ConstrainDouble] = js.native
  
  var groupId: js.UndefOr[ConstrainString] = js.native
  
  var height: js.UndefOr[ConstrainLong] = js.native
  
  var latency: js.UndefOr[ConstrainDouble] = js.native
  
  var sampleRate: js.UndefOr[ConstrainLong] = js.native
  
  var sampleSize: js.UndefOr[ConstrainLong] = js.native
  
  var volume: js.UndefOr[ConstrainDouble] = js.native
  
  var width: js.UndefOr[ConstrainLong] = js.native
}
object MediaTrackConstraintSet {
  
  @scala.inline
  def apply(): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
  
  @scala.inline
  implicit class MediaTrackConstraintSetOps[Self <: MediaTrackConstraintSet] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: ConstrainDouble): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setDeviceIdVarargs(value: String*): Self = this.set("deviceId", js.Array(value :_*))
    
    @scala.inline
    def setDeviceId(value: ConstrainString): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setEchoCancellation(value: ConstrainBoolean): Self = this.set("echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEchoCancellation: Self = this.set("echoCancellation", js.undefined)
    
    @scala.inline
    def setFacingModeVarargs(value: String*): Self = this.set("facingMode", js.Array(value :_*))
    
    @scala.inline
    def setFacingMode(value: ConstrainString): Self = this.set("facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacingMode: Self = this.set("facingMode", js.undefined)
    
    @scala.inline
    def setFrameRate(value: ConstrainDouble): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setGroupIdVarargs(value: String*): Self = this.set("groupId", js.Array(value :_*))
    
    @scala.inline
    def setGroupId(value: ConstrainString): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setHeight(value: ConstrainLong): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLatency(value: ConstrainDouble): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    
    @scala.inline
    def setSampleRate(value: ConstrainLong): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setSampleSize(value: ConstrainLong): Self = this.set("sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleSize: Self = this.set("sampleSize", js.undefined)
    
    @scala.inline
    def setVolume(value: ConstrainDouble): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    
    @scala.inline
    def setWidth(value: ConstrainLong): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
