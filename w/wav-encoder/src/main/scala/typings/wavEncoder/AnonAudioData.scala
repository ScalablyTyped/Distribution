package typings.wavEncoder

import typings.std.ArrayBuffer
import typings.wavEncoder.mod.AudioData
import typings.wavEncoder.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAudioData extends js.Object {
  def apply(audioData: AudioData): js.Promise[ArrayBuffer] = js.native
  def apply(audioData: AudioData, opts: Options): js.Promise[ArrayBuffer] = js.native
  def sync(audioData: AudioData): ArrayBuffer = js.native
  def sync(audioData: AudioData, opts: Options): ArrayBuffer = js.native
}

