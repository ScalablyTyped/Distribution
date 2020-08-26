package typings.webrtc

import typings.webrtc.W3C.DoubleRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackCapabilities extends js.Object {
  //width: number | W3C.LongRange;
  //height: number | W3C.LongRange;
  //aspectRatio: number | W3C.DoubleRange;
  //frameRate: number | W3C.DoubleRange;
  //facingMode: string;
  //volume: number | W3C.DoubleRange;
  //sampleRate: number | W3C.LongRange;
  //sampleSize: number | W3C.LongRange;
  //echoCancellation: boolean[];
  var latency: js.UndefOr[DoubleRange] = js.native
}

object MediaTrackCapabilities {
  @scala.inline
  def apply(): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
  @scala.inline
  implicit class MediaTrackCapabilitiesOps[Self <: MediaTrackCapabilities] (val x: Self) extends AnyVal {
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
    def setLatency(value: DoubleRange): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
  }
  
}

