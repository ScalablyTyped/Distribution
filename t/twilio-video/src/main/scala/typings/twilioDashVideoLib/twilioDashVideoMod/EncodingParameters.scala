package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingParameters extends js.Object {
  var maxAudioBitrate: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var maxVideoBitrate: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object EncodingParameters {
  @scala.inline
  def apply(maxAudioBitrate: scala.Int | scala.Double = null, maxVideoBitrate: scala.Int | scala.Double = null): EncodingParameters = {
    val __obj = js.Dynamic.literal()
    if (maxAudioBitrate != null) __obj.updateDynamic("maxAudioBitrate")(maxAudioBitrate.asInstanceOf[js.Any])
    if (maxVideoBitrate != null) __obj.updateDynamic("maxVideoBitrate")(maxVideoBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingParameters]
  }
}

