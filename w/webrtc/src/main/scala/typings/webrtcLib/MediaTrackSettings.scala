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
  var latency: scala.Double
}

object MediaTrackSettings {
  @scala.inline
  def apply(latency: scala.Double): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latency")(latency)
    __obj.asInstanceOf[MediaTrackSettings]
  }
}

