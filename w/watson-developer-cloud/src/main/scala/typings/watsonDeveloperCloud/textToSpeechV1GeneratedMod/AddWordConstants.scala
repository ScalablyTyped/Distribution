package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PartOfSpeech with String] = js.native
    /* "Dosi" */ @js.native
    object DOSI extends TopLevel[DOSI with String]
    
    /* "Fuku" */ @js.native
    object FUKU extends TopLevel[FUKU with String]
    
    /* "Gobi" */ @js.native
    object GOBI extends TopLevel[GOBI with String]
    
    /* "Hoka" */ @js.native
    object HOKA extends TopLevel[HOKA with String]
    
    /* "Jodo" */ @js.native
    object JODO extends TopLevel[JODO with String]
    
    /* "Josi" */ @js.native
    object JOSI extends TopLevel[JOSI with String]
    
    /* "Kato" */ @js.native
    object KATO extends TopLevel[KATO with String]
    
    /* "Kedo" */ @js.native
    object KEDO extends TopLevel[KEDO with String]
    
    /* "Keyo" */ @js.native
    object KEYO extends TopLevel[KEYO with String]
    
    /* "Kigo" */ @js.native
    object KIGO extends TopLevel[KIGO with String]
    
    /* "Koyu" */ @js.native
    object KOYU extends TopLevel[KOYU with String]
    
    /* "Mesi" */ @js.native
    object MESI extends TopLevel[MESI with String]
    
    /* "Reta" */ @js.native
    object RETA extends TopLevel[RETA with String]
    
    /* "Stbi" */ @js.native
    object STBI extends TopLevel[STBI with String]
    
    /* "Stto" */ @js.native
    object STTO extends TopLevel[STTO with String]
    
    /* "Stzo" */ @js.native
    object STZO extends TopLevel[STZO with String]
    
    /* "Suji" */ @js.native
    object SUJI extends TopLevel[SUJI with String]
    
  }
  
}

