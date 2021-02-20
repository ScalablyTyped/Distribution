package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `addWord` operation. */
object AddWordConstants {
  
  @js.native
  sealed trait PartOfSpeech extends StObject
  /** **Japanese only.** The part of speech for the word. The service uses the value to produce the correct intonation for the word. You can create only a single entry, with or without a single part of speech, for any word; you cannot create multiple entries with different parts of speech for the same word. For more information, see [Working with Japanese entries](https://cloud.ibm.com/docs/services/text-to-speech/custom-rules.html#jaNotes). */
  @JSImport("watson-developer-cloud/text-to-speech/v1-generated", "AddWordConstants.PartOfSpeech")
  @js.native
  object PartOfSpeech extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PartOfSpeech with String] = js.native
    
    @js.native
    sealed trait DOSI extends PartOfSpeech
    /* "Dosi" */ val DOSI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.DOSI with String = js.native
    
    @js.native
    sealed trait FUKU extends PartOfSpeech
    /* "Fuku" */ val FUKU: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.FUKU with String = js.native
    
    @js.native
    sealed trait GOBI extends PartOfSpeech
    /* "Gobi" */ val GOBI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.GOBI with String = js.native
    
    @js.native
    sealed trait HOKA extends PartOfSpeech
    /* "Hoka" */ val HOKA: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.HOKA with String = js.native
    
    @js.native
    sealed trait JODO extends PartOfSpeech
    /* "Jodo" */ val JODO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.JODO with String = js.native
    
    @js.native
    sealed trait JOSI extends PartOfSpeech
    /* "Josi" */ val JOSI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.JOSI with String = js.native
    
    @js.native
    sealed trait KATO extends PartOfSpeech
    /* "Kato" */ val KATO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.KATO with String = js.native
    
    @js.native
    sealed trait KEDO extends PartOfSpeech
    /* "Kedo" */ val KEDO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.KEDO with String = js.native
    
    @js.native
    sealed trait KEYO extends PartOfSpeech
    /* "Keyo" */ val KEYO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.KEYO with String = js.native
    
    @js.native
    sealed trait KIGO extends PartOfSpeech
    /* "Kigo" */ val KIGO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.KIGO with String = js.native
    
    @js.native
    sealed trait KOYU extends PartOfSpeech
    /* "Koyu" */ val KOYU: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.KOYU with String = js.native
    
    @js.native
    sealed trait MESI extends PartOfSpeech
    /* "Mesi" */ val MESI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.MESI with String = js.native
    
    @js.native
    sealed trait RETA extends PartOfSpeech
    /* "Reta" */ val RETA: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.RETA with String = js.native
    
    @js.native
    sealed trait STBI extends PartOfSpeech
    /* "Stbi" */ val STBI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.STBI with String = js.native
    
    @js.native
    sealed trait STTO extends PartOfSpeech
    /* "Stto" */ val STTO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.STTO with String = js.native
    
    @js.native
    sealed trait STZO extends PartOfSpeech
    /* "Stzo" */ val STZO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.STZO with String = js.native
    
    @js.native
    sealed trait SUJI extends PartOfSpeech
    /* "Suji" */ val SUJI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.SUJI with String = js.native
  }
}
