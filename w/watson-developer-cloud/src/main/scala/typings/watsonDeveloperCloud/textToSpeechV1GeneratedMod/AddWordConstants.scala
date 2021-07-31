package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def apply(value: String): js.UndefOr[PartOfSpeech & String] = js.native
    
    @js.native
    sealed trait DOSI
      extends StObject
         with PartOfSpeech
    /* "Dosi" */ val DOSI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.DOSI & String = js.native
    
    @js.native
    sealed trait FUKU
      extends StObject
         with PartOfSpeech
    /* "Fuku" */ val FUKU: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.FUKU & String = js.native
    
    @js.native
    sealed trait GOBI
      extends StObject
         with PartOfSpeech
    /* "Gobi" */ val GOBI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.GOBI & String = js.native
    
    @js.native
    sealed trait HOKA
      extends StObject
         with PartOfSpeech
    /* "Hoka" */ val HOKA: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.HOKA & String = js.native
    
    @js.native
    sealed trait JODO
      extends StObject
         with PartOfSpeech
    /* "Jodo" */ val JODO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.JODO & String = js.native
    
    @js.native
    sealed trait JOSI
      extends StObject
         with PartOfSpeech
    /* "Josi" */ val JOSI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.JOSI & String = js.native
    
    @js.native
    sealed trait KATO
      extends StObject
         with PartOfSpeech
    /* "Kato" */ val KATO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.KATO & String = js.native
    
    @js.native
    sealed trait KEDO
      extends StObject
         with PartOfSpeech
    /* "Kedo" */ val KEDO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.KEDO & String = js.native
    
    @js.native
    sealed trait KEYO
      extends StObject
         with PartOfSpeech
    /* "Keyo" */ val KEYO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.KEYO & String = js.native
    
    @js.native
    sealed trait KIGO
      extends StObject
         with PartOfSpeech
    /* "Kigo" */ val KIGO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.KIGO & String = js.native
    
    @js.native
    sealed trait KOYU
      extends StObject
         with PartOfSpeech
    /* "Koyu" */ val KOYU: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.KOYU & String = js.native
    
    @js.native
    sealed trait MESI
      extends StObject
         with PartOfSpeech
    /* "Mesi" */ val MESI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.MESI & String = js.native
    
    @js.native
    sealed trait RETA
      extends StObject
         with PartOfSpeech
    /* "Reta" */ val RETA: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.RETA & String = js.native
    
    @js.native
    sealed trait STBI
      extends StObject
         with PartOfSpeech
    /* "Stbi" */ val STBI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.STBI & String = js.native
    
    @js.native
    sealed trait STTO
      extends StObject
         with PartOfSpeech
    /* "Stto" */ val STTO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.STTO & String = js.native
    
    @js.native
    sealed trait STZO
      extends StObject
         with PartOfSpeech
    /* "Stzo" */ val STZO: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.STZO & String = js.native
    
    @js.native
    sealed trait SUJI
      extends StObject
         with PartOfSpeech
    /* "Suji" */ val SUJI: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.AddWordConstants.PartOfSpeech.SUJI & String = js.native
  }
}
