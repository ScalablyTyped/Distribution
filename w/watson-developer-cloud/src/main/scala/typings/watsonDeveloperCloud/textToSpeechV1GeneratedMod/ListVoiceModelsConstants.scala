package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listVoiceModels` operation. */
object ListVoiceModelsConstants {
  
  @js.native
  sealed trait Language extends StObject
  /** The language for which custom voice models that are owned by the requesting service credentials are to be returned. Omit the parameter to see all custom voice models that are owned by the requester. */
  @JSImport("watson-developer-cloud/text-to-speech/v1-generated", "ListVoiceModelsConstants.Language")
  @js.native
  object Language extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Language with String] = js.native
    
    @js.native
    sealed trait DE_DE extends Language
    /* "de-DE" */ val DE_DE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.DE_DE with String = js.native
    
    @js.native
    sealed trait EN_GB extends Language
    /* "en-GB" */ val EN_GB: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.EN_GB with String = js.native
    
    @js.native
    sealed trait EN_US extends Language
    /* "en-US" */ val EN_US: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.EN_US with String = js.native
    
    @js.native
    sealed trait ES_ES extends Language
    /* "es-ES" */ val ES_ES: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.ES_ES with String = js.native
    
    @js.native
    sealed trait ES_LA extends Language
    /* "es-LA" */ val ES_LA: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.ES_LA with String = js.native
    
    @js.native
    sealed trait ES_US extends Language
    /* "es-US" */ val ES_US: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.ES_US with String = js.native
    
    @js.native
    sealed trait FR_FR extends Language
    /* "fr-FR" */ val FR_FR: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.FR_FR with String = js.native
    
    @js.native
    sealed trait IT_IT extends Language
    /* "it-IT" */ val IT_IT: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.IT_IT with String = js.native
    
    @js.native
    sealed trait JA_JP extends Language
    /* "ja-JP" */ val JA_JP: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.JA_JP with String = js.native
    
    @js.native
    sealed trait PT_BR extends Language
    /* "pt-BR" */ val PT_BR: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.PT_BR with String = js.native
  }
}
