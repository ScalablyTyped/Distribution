package typings.voiceActivityDetection.mod

import typings.std.AudioContext
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("voice-activity-detection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(audioContext: AudioContext, stream: MediaStream): Unit = js.native
  def apply(audioContext: AudioContext, stream: MediaStream, options: VoiceActivityDetectionOptions): Unit = js.native
}

