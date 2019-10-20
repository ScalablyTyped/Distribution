package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language
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
    
    /* "de-DE" */ val DE_DE: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language.DE_DE with String = js.native
    /* "en-GB" */ val EN_GB: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language.EN_GB with String = js.native
    /* "en-US" */ val EN_US: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language.EN_US with String = js.native
    /* "es-ES" */ val ES_ES: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language.ES_ES with String = js.native
    /* "es-LA" */ val ES_LA: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language.ES_LA with String = js.native
    /* "es-US" */ val ES_US: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language.ES_US with String = js.native
    /* "fr-FR" */ val FR_FR: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language.FR_FR with String = js.native
    /* "it-IT" */ val IT_IT: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language.IT_IT with String = js.native
    /* "ja-JP" */ val JA_JP: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language.JA_JP with String = js.native
    /* "pt-BR" */ val PT_BR: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.ListVoiceModelsConstants.Language.PT_BR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Language with String] = js.native
  }
  
}

