package typings
package webrtcLib

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
  var latency: scala.Double | webrtcLib.W3CNs.DoubleRange
}

object MediaTrackCapabilities {
  @scala.inline
  def apply(latency: scala.Double | webrtcLib.W3CNs.DoubleRange): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
}

