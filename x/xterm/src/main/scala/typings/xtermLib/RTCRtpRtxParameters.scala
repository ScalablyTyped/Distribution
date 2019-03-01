package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpRtxParameters extends js.Object {
  var ssrc: js.UndefOr[scala.Double] = js.undefined
}

object RTCRtpRtxParameters {
  @scala.inline
  def apply(ssrc: scala.Int | scala.Double = null): RTCRtpRtxParameters = {
    val __obj = js.Dynamic.literal()
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpRtxParameters]
  }
}

