package typings
package winrtLib.WindowsNs.MediaNs.TranscodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPrepareTranscodeResult extends js.Object {
  var canTranscode: scala.Boolean
  var failureReason: TranscodeFailureReason
  def transcodeAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[scala.Double]
}

