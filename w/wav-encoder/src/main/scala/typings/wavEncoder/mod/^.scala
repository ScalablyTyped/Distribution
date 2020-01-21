package typings.wavEncoder.mod

import typings.std.ArrayBuffer
import typings.wavEncoder.AnonAudioData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wav-encoder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("encode")
  var encode_Original: AnonAudioData = js.native
  def encode(audioData: AudioData): js.Promise[ArrayBuffer] = js.native
  def encode(audioData: AudioData, opts: Options): js.Promise[ArrayBuffer] = js.native
}

