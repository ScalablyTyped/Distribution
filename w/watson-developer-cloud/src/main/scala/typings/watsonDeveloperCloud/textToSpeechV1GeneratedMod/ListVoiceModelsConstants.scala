package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def apply(value: String): js.UndefOr[Language & String] = js.native
    
    @js.native
    sealed trait DE_DE
      extends StObject
         with Language
    /* "de-DE" */ val DE_DE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.DE_DE & String = js.native
    
    @js.native
    sealed trait EN_GB
      extends StObject
         with Language
    /* "en-GB" */ val EN_GB: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.EN_GB & String = js.native
    
    @js.native
    sealed trait EN_US
      extends StObject
         with Language
    /* "en-US" */ val EN_US: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.EN_US & String = js.native
    
    @js.native
    sealed trait ES_ES
      extends StObject
         with Language
    /* "es-ES" */ val ES_ES: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.ES_ES & String = js.native
    
    @js.native
    sealed trait ES_LA
      extends StObject
         with Language
    /* "es-LA" */ val ES_LA: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.ES_LA & String = js.native
    
    @js.native
    sealed trait ES_US
      extends StObject
         with Language
    /* "es-US" */ val ES_US: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.ES_US & String = js.native
    
    @js.native
    sealed trait FR_FR
      extends StObject
         with Language
    /* "fr-FR" */ val FR_FR: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.FR_FR & String = js.native
    
    @js.native
    sealed trait IT_IT
      extends StObject
         with Language
    /* "it-IT" */ val IT_IT: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.IT_IT & String = js.native
    
    @js.native
    sealed trait JA_JP
      extends StObject
         with Language
    /* "ja-JP" */ val JA_JP: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.JA_JP & String = js.native
    
    @js.native
    sealed trait PT_BR
      extends StObject
         with Language
    /* "pt-BR" */ val PT_BR: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language.PT_BR & String = js.native
  }
}
