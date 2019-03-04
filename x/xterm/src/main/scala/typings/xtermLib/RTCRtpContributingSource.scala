package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpContributingSource extends js.Object {
  var audioLevel: js.UndefOr[scala.Double] = js.undefined
  var source: scala.Double
  var timestamp: scala.Double
}

object RTCRtpContributingSource {
  @scala.inline
  def apply(source: scala.Double, timestamp: scala.Double, audioLevel: scala.Int | scala.Double = null): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(source = source, timestamp = timestamp)
    if (audioLevel != null) __obj.updateDynamic("audioLevel")(audioLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
}

