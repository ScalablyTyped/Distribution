package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#dom-rtcrtpcontributingsource
@js.native
trait RTCRtpContributingSource extends js.Object {
  
  //readonly timestamp: number;
  var source: Double = js.native
  
  //readonly audioLevel: number | null;
  val voiceActivityFlag: js.UndefOr[Boolean] = js.native
}
object RTCRtpContributingSource {
  
  @scala.inline
  def apply(source: Double): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
  
  @scala.inline
  implicit class RTCRtpContributingSourceOps[Self <: RTCRtpContributingSource] (val x: Self) extends AnyVal {
    
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
    def setSource(value: Double): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceActivityFlag(value: Boolean): Self = this.set("voiceActivityFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceActivityFlag: Self = this.set("voiceActivityFlag", js.undefined)
  }
}
