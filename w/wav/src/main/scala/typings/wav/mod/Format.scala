package typings.wav.mod

import typings.wav.wavStrings.BE
import typings.wav.wavStrings.LE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var audioFormat: Double
  var bitDepth: Double
  var blockAlign: Double
  var byteRate: Double
  var channels: Double
  var endianness: LE | BE
  var sampleRate: Double
  var signed: Boolean
}

object Format {
  @scala.inline
  def apply(
    audioFormat: Double,
    bitDepth: Double,
    blockAlign: Double,
    byteRate: Double,
    channels: Double,
    endianness: LE | BE,
    sampleRate: Double,
    signed: Boolean
  ): Format = {
    val __obj = js.Dynamic.literal(audioFormat = audioFormat.asInstanceOf[js.Any], bitDepth = bitDepth.asInstanceOf[js.Any], blockAlign = blockAlign.asInstanceOf[js.Any], byteRate = byteRate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], endianness = endianness.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

