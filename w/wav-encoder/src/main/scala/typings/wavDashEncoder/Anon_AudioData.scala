package typings.wavDashEncoder

import typings.std.ArrayBuffer
import typings.wavDashEncoder.wavDashEncoderMod.AudioData
import typings.wavDashEncoder.wavDashEncoderMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AudioData extends js.Object {
  def apply(audioData: AudioData): js.Promise[ArrayBuffer] = js.native
  def apply(audioData: AudioData, opts: Options): js.Promise[ArrayBuffer] = js.native
  def sync(audioData: AudioData): ArrayBuffer = js.native
  def sync(audioData: AudioData, opts: Options): ArrayBuffer = js.native
}

