package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio file output node. */
@JSGlobal("Windows.Media.Audio.CreateAudioFileOutputNodeResult")
@js.native
abstract class CreateAudioFileOutputNodeResult () extends js.Object {
  /** Gets the audio file output node. */
  var fileOutputNode: AudioFileOutputNode = js.native
  /** Gets the status of audio file output node creation. */
  var status: AudioFileNodeCreationStatus = js.native
}

