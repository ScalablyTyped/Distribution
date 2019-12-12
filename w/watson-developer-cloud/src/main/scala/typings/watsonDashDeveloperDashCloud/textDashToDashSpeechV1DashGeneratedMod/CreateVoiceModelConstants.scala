package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.DE_DE
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.EN_GB
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.EN_US
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.ES_ES
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.ES_LA
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.ES_US
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.FR_FR
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.IT_IT
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.JA_JP
import typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.CreateVoiceModelConstants.Language.PT_BR
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

