package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio file input node. */
@JSGlobal("Windows.Media.Audio.CreateAudioFileInputNodeResult")
@js.native
abstract class CreateAudioFileInputNodeResult () extends js.Object {
  /** Gets the audio file input node. */
  var fileInputNode: AudioFileInputNode = js.native
  /** Gets the status of audio file input node creation. */
  var status: AudioFileNodeCreationStatus = js.native
}

