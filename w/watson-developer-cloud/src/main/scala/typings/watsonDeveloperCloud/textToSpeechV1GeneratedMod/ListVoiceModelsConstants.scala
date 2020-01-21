package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listVoiceModels` operation. */
@JSImport("watson-developer-cloud/text-to-speech/v1-generated", "ListVoiceModelsConstants")
@js.native
object ListVoiceModelsConstants extends js.Object {
  @js.native
  sealed trait Language extends js.Object
  
  /** The language for which custom voice models that are owned by the requesting service credentials are to be returned. Omit the parameter to see all custom voice models that are owned by the requester. */
  @js.native
  object Language extends js.Object {
    @js.native
    sealed trait DE_DE extends Language
    
    @js.native
    sealed trait EN_GB extends Language
    
    @js.native
    sealed trait EN_US extends Language
    
    @js.native
    sealed trait ES_ES extends Language
    
    @js.native
    sealed trait ES_LA extends Language
    
    @js.native
    sealed trait ES_US extends Language
    
    @js.native
    sealed trait FR_FR extends Language
    
    @js.native
    sealed trait IT_IT extends Language
    
    @js.native
    sealed trait JA_JP extends Language
    
    @js.native
    sealed trait PT_BR extends Language
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Language with String] = js.native
    /* "de-DE" */ @js.native
    object DE_DE extends TopLevel[DE_DE with String]
    
    /* "en-GB" */ @js.native
    object EN_GB extends TopLevel[EN_GB with String]
    
    /* "en-US" */ @js.native
    object EN_US extends TopLevel[EN_US with String]
    
    /* "es-ES" */ @js.native
    object ES_ES extends TopLevel[ES_ES with String]
    
    /* "es-LA" */ @js.native
    object ES_LA extends TopLevel[ES_LA with String]
    
    /* "es-US" */ @js.native
    object ES_US extends TopLevel[ES_US with String]
    
    /* "fr-FR" */ @js.native
    object FR_FR extends TopLevel[FR_FR with String]
    
    /* "it-IT" */ @js.native
    object IT_IT extends TopLevel[IT_IT with String]
    
    /* "ja-JP" */ @js.native
    object JA_JP extends TopLevel[JA_JP with String]
    
    /* "pt-BR" */ @js.native
    object PT_BR extends TopLevel[PT_BR with String]
    
  }
  
}

