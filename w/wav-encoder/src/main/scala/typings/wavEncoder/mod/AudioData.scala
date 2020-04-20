package typings.wavEncoder.mod

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioData extends js.Object {
  var channelData: js.Array[Float32Array]
  var sampleRate: Double
}

object AudioData {
  @scala.inline
  def apply(channelData: js.Array[Float32Array], sampleRate: Double): AudioData = {
    val __obj = js.Dynamic.literal(channelData = channelData.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioData]
  }
}

