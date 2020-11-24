package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `addWord` operation. */
@JSImport("watson-developer-cloud/text-to-speech/v1-generated", "AddWordConstants")
@js.native
object AddWordConstants extends js.Object {
  
  @js.native
  sealed trait PartOfSpeech extends js.Object
  /** **Japanese only.** The part of speech for the word. The service uses the value to produce the correct intonation for the word. You can create only a single entry, with or without a single part of speech, for any word; you cannot create multiple entries with different parts of speech for the same word. For more information, see [Working with Japanese entries](https://cloud.ibm.com/docs/services/text-to-speech/custom-rules.html#jaNotes). */
  @js.native
  object PartOfSpeech extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PartOfSpeech with String] = js.native
    
    @js.native
    sealed trait DOSI extends PartOfSpeech
    /* "Dosi" */ @js.native
    object DOSI extends TopLevel[DOSI with String]
    
    @js.native
    sealed trait FUKU extends PartOfSpeech
    /* "Fuku" */ @js.native
    object FUKU extends TopLevel[FUKU with String]
    
    @js.native
    sealed trait GOBI extends PartOfSpeech
    /* "Gobi" */ @js.native
    object GOBI extends TopLevel[GOBI with String]
    
    @js.native
    sealed trait HOKA extends PartOfSpeech
    /* "Hoka" */ @js.native
    object HOKA extends TopLevel[HOKA with String]
    
    @js.native
    sealed trait JODO extends PartOfSpeech
    /* "Jodo" */ @js.native
    object JODO extends TopLevel[JODO with String]
    
    @js.native
    sealed trait JOSI extends PartOfSpeech
    /* "Josi" */ @js.native
    object JOSI extends TopLevel[JOSI with String]
    
    @js.native
    sealed trait KATO extends PartOfSpeech
    /* "Kato" */ @js.native
    object KATO extends TopLevel[KATO with String]
    
    @js.native
    sealed trait KEDO extends PartOfSpeech
    /* "Kedo" */ @js.native
    object KEDO extends TopLevel[KEDO with String]
    
    @js.native
    sealed trait KEYO extends PartOfSpeech
    /* "Keyo" */ @js.native
    object KEYO extends TopLevel[KEYO with String]
    
    @js.native
    sealed trait KIGO extends PartOfSpeech
    /* "Kigo" */ @js.native
    object KIGO extends TopLevel[KIGO with String]
    
    @js.native
    sealed trait KOYU extends PartOfSpeech
    /* "Koyu" */ @js.native
    object KOYU extends TopLevel[KOYU with String]
    
    @js.native
    sealed trait MESI extends PartOfSpeech
    /* "Mesi" */ @js.native
    object MESI extends TopLevel[MESI with String]
    
    @js.native
    sealed trait RETA extends PartOfSpeech
    /* "Reta" */ @js.native
    object RETA extends TopLevel[RETA with String]
    
    @js.native
    sealed trait STBI extends PartOfSpeech
    /* "Stbi" */ @js.native
    object STBI extends TopLevel[STBI with String]
    
    @js.native
    sealed trait STTO extends PartOfSpeech
    /* "Stto" */ @js.native
    object STTO extends TopLevel[STTO with String]
    
    @js.native
    sealed trait STZO extends PartOfSpeech
    /* "Stzo" */ @js.native
    object STZO extends TopLevel[STZO with String]
    
    @js.native
    sealed trait SUJI extends PartOfSpeech
    /* "Suji" */ @js.native
    object SUJI extends TopLevel[SUJI with String]
  }
}
