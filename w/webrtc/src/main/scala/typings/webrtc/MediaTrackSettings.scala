package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackSettings extends js.Object {
  //width: number;
  //height: number;
  //aspectRatio: number;
  //frameRate: number;
  //facingMode: string;
  //volume: number;
  //sampleRate: number;
  //sampleSize: number;
  //echoCancellation: boolean;
  var latency: js.UndefOr[Double] = js.native
}

object MediaTrackSettings {
  @scala.inline
  def apply(): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackSettings]
  }
  @scala.inline
  implicit class MediaTrackSettingsOps[Self <: MediaTrackSettings] (val x: Self) extends AnyVal {
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
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
  }
  
}

