package typings.watsonDeveloperCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textToSpeechV1Mod {
  
  @JSImport("watson-developer-cloud/text-to-speech/v1", JSImport.Namespace)
  @js.native
  class ^ protected () extends TextToSpeechV1 {
    def this(options: js.Any) = this()
  }
  
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
}
