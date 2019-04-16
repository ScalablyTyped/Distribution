package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var latency: js.UndefOr[scala.Double] = js.undefined
}

object MediaTrackSettings {
  @scala.inline
  def apply(latency: scala.Int | scala.Double = null): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSettings]
  }
}

