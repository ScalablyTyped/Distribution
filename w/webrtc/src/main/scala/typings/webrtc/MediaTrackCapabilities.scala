package typings.webrtc

import typings.webrtc.W3C.DoubleRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var latency: js.UndefOr[DoubleRange] = js.undefined
}

object MediaTrackCapabilities {
  @scala.inline
  def apply(latency: DoubleRange = null): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal()
    if (latency != null) __obj.updateDynamic("latency")(latency)
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
}

