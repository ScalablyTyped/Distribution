package typings.wav.mod

import typings.wav.wavStrings.BE
import typings.wav.wavStrings.LE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var audioFormat: Double = js.native
  var bitDepth: Double = js.native
  var blockAlign: Double = js.native
  var byteRate: Double = js.native
  var channels: Double = js.native
  var endianness: LE | BE = js.native
  var sampleRate: Double = js.native
  var signed: Boolean = js.native
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
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioFormat(value: Double): Self = this.set("audioFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitDepth(value: Double): Self = this.set("bitDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockAlign(value: Double): Self = this.set("blockAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setByteRate(value: Double): Self = this.set("byteRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannels(value: Double): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndianness(value: LE | BE): Self = this.set("endianness", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
  }
  
}

