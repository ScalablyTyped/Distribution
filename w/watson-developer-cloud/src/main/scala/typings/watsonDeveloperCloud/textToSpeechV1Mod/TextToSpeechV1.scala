package typings.watsonDeveloperCloud.textToSpeechV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextToSpeechV1
  extends typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.^ {
  /**
    * Repair the WAV header of an audio/wav file.
    *
    * @param {Buffer} wavFileData - Wave audio - will be edited in place and returned
    * @return {Buffer} wavFileData - the original Buffer, with a correct header
    */
  def repairWavHeader(wavFileData: js.Any): js.Any = js.native
  /**
    * Use the synthesize function with a readable stream over websockets
    *
    * @param {Object} params The parameters
    * @return {SynthesizeStream}
    */
  def synthesizeUsingWebSocket(params: js.Any): typings.watsonDeveloperCloud.synthesizeStreamMod.^ = js.native
}

