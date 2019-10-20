package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `addWord` operation. */
@JSImport("watson-developer-cloud/text-to-speech/v1-generated", "AddWordConstants")
@js.native
object AddWordConstants extends js.Object {
  @js.native
  sealed trait PartOfSpeech extends js.Object
  
  /** **Japanese only.** The part of speech for the word. The service uses the value to produce the correct intonation for the word. You can create only a single entry, with or without a single part of speech, for any word; you cannot create multiple entries with different parts of speech for the same word. For more information, see [Working with Japanese entries](https://cloud.ibm.com/docs/services/text-to-speech/custom-rules.html#jaNotes). */
  @js.native
  object PartOfSpeech extends js.Object {
    @js.native
    sealed trait DOSI extends PartOfSpeech
    
    @js.native
    sealed trait FUKU extends PartOfSpeech
    
    @js.native
    sealed trait GOBI extends PartOfSpeech
    
    @js.native
    sealed trait HOKA extends PartOfSpeech
    
    @js.native
    sealed trait JODO extends PartOfSpeech
    
    @js.native
    sealed trait JOSI extends PartOfSpeech
    
    @js.native
    sealed trait KATO extends PartOfSpeech
    
    @js.native
    sealed trait KEDO extends PartOfSpeech
    
    @js.native
    sealed trait KEYO extends PartOfSpeech
    
    @js.native
    sealed trait KIGO extends PartOfSpeech
    
    @js.native
    sealed trait KOYU extends PartOfSpeech
    
    @js.native
    sealed trait MESI extends PartOfSpeech
    
    @js.native
    sealed trait RETA extends PartOfSpeech
    
    @js.native
    sealed trait STBI extends PartOfSpeech
    
    @js.native
    sealed trait STTO extends PartOfSpeech
    
    @js.native
    sealed trait STZO extends PartOfSpeech
    
    @js.native
    sealed trait SUJI extends PartOfSpeech
    
    /* "Dosi" */ val DOSI: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.DOSI with String = js.native
    /* "Fuku" */ val FUKU: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.FUKU with String = js.native
    /* "Gobi" */ val GOBI: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.GOBI with String = js.native
    /* "Hoka" */ val HOKA: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.HOKA with String = js.native
    /* "Jodo" */ val JODO: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.JODO with String = js.native
    /* "Josi" */ val JOSI: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.JOSI with String = js.native
    /* "Kato" */ val KATO: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.KATO with String = js.native
    /* "Kedo" */ val KEDO: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.KEDO with String = js.native
    /* "Keyo" */ val KEYO: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.KEYO with String = js.native
    /* "Kigo" */ val KIGO: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.KIGO with String = js.native
    /* "Koyu" */ val KOYU: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.KOYU with String = js.native
    /* "Mesi" */ val MESI: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.MESI with String = js.native
    /* "Reta" */ val RETA: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.RETA with String = js.native
    /* "Stbi" */ val STBI: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.STBI with String = js.native
    /* "Stto" */ val STTO: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.STTO with String = js.native
    /* "Stzo" */ val STZO: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.STZO with String = js.native
    /* "Suji" */ val SUJI: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.AddWordConstants.PartOfSpeech.SUJI with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PartOfSpeech with String] = js.native
  }
  
}

