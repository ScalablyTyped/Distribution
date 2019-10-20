package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `createVoiceModel` operation. */
@JSImport("watson-developer-cloud/text-to-speech/v1-generated", "CreateVoiceModelConstants")
@js.native
object CreateVoiceModelConstants extends js.Object {
  @js.native
  sealed trait Language extends js.Object
  
  /** The language of the new custom voice model. Omit the parameter to use the the default language, `en-US`. */
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
    
    /* "de-DE" */ val DE_DE: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.DE_DE with String = js.native
    /* "en-GB" */ val EN_GB: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.EN_GB with String = js.native
    /* "en-US" */ val EN_US: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.EN_US with String = js.native
    /* "es-ES" */ val ES_ES: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.ES_ES with String = js.native
    /* "es-LA" */ val ES_LA: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.ES_LA with String = js.native
    /* "es-US" */ val ES_US: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.ES_US with String = js.native
    /* "fr-FR" */ val FR_FR: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.FR_FR with String = js.native
    /* "it-IT" */ val IT_IT: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.IT_IT with String = js.native
    /* "ja-JP" */ val JA_JP: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.JA_JP with String = js.native
    /* "pt-BR" */ val PT_BR: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.PT_BR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Language with String] = js.native
  }
  
}

