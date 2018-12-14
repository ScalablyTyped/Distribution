package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#dom-rtcrtpcontributingsource

trait RTCRtpContributingSource extends js.Object {
  //readonly timestamp: number;
  var source: scala.Double
  //readonly audioLevel: number | null;
  val voiceActivityFlag: js.UndefOr[scala.Boolean] = js.undefined
}

