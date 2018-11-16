package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#dom-rtcrtpcontributingsource

trait RTCRtpContributingSource extends js.Object {
  //readonly timestamp: number;
  val source: scala.Double
  //readonly audioLevel: number | null;
  val voiceActivityFlag: scala.Boolean | scala.Null
}

