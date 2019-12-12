package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.DE_DE_BROADBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.DE_DE_NARROWBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.EN_GB_BROADBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.EN_GB_NARROWBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.EN_US_BROADBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.EN_US_NARROWBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.EN_US_SHORTFORM_NARROWBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.ES_ES_BROADBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.ES_ES_NARROWBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.FR_FR_BROADBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.FR_FR_NARROWBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.JA_JP_BROADBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.JA_JP_NARROWBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.KO_KR_BROADBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.KO_KR_NARROWBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.PT_BR_BROADBANDMODEL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateLanguageModelConstants.BaseModelName.PT_BR_NARROWBANDMODEL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `createLanguageModel` operation. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "CreateLanguageModelConstants")
@js.native
object CreateLanguageModelConstants extends js.Object {
  @js.native
  sealed trait BaseModelName extends js.Object
  
  /** The name of the base language model that is to be customized by the new custom language model. The new custom model can be used only with the base model that it customizes. To determine whether a base model supports language model customization, use the **Get a model** method and check that the attribute `custom_language_model` is set to `true`. You can also refer to [Language support for customization](https://cloud.ibm.com/docs/services/speech-to-text/custom.html#languageSupport). */
  @js.native
  object BaseModelName extends js.Object {
    @js.native
    sealed trait DE_DE_BROADBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait DE_DE_NARROWBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait EN_GB_BROADBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait EN_GB_NARROWBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait EN_US_BROADBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait EN_US_NARROWBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait EN_US_SHORTFORM_NARROWBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait ES_ES_BROADBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait ES_ES_NARROWBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait FR_FR_BROADBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait FR_FR_NARROWBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait JA_JP_BROADBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait JA_JP_NARROWBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait KO_KR_BROADBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait KO_KR_NARROWBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait PT_BR_BROADBANDMODEL extends BaseModelName
    
    @js.native
    sealed trait PT_BR_NARROWBANDMODEL extends BaseModelName
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BaseModelName with String] = js.native
    /* "de-DE_BroadbandModel" */ @js.native
    object DE_DE_BROADBANDMODEL extends TopLevel[DE_DE_BROADBANDMODEL with String]
    
    /* "de-DE_NarrowbandModel" */ @js.native
    object DE_DE_NARROWBANDMODEL extends TopLevel[DE_DE_NARROWBANDMODEL with String]
    
    /* "en-GB_BroadbandModel" */ @js.native
    object EN_GB_BROADBANDMODEL extends TopLevel[EN_GB_BROADBANDMODEL with String]
    
    /* "en-GB_NarrowbandModel" */ @js.native
    object EN_GB_NARROWBANDMODEL extends TopLevel[EN_GB_NARROWBANDMODEL with String]
    
    /* "en-US_BroadbandModel" */ @js.native
    object EN_US_BROADBANDMODEL extends TopLevel[EN_US_BROADBANDMODEL with String]
    
    /* "en-US_NarrowbandModel" */ @js.native
    object EN_US_NARROWBANDMODEL extends TopLevel[EN_US_NARROWBANDMODEL with String]
    
    /* "en-US_ShortForm_NarrowbandModel" */ @js.native
    object EN_US_SHORTFORM_NARROWBANDMODEL extends TopLevel[EN_US_SHORTFORM_NARROWBANDMODEL with String]
    
    /* "es-ES_BroadbandModel" */ @js.native
    object ES_ES_BROADBANDMODEL extends TopLevel[ES_ES_BROADBANDMODEL with String]
    
    /* "es-ES_NarrowbandModel" */ @js.native
    object ES_ES_NARROWBANDMODEL extends TopLevel[ES_ES_NARROWBANDMODEL with String]
    
    /* "fr-FR_BroadbandModel" */ @js.native
    object FR_FR_BROADBANDMODEL extends TopLevel[FR_FR_BROADBANDMODEL with String]
    
    /* "fr-FR_NarrowbandModel" */ @js.native
    object FR_FR_NARROWBANDMODEL extends TopLevel[FR_FR_NARROWBANDMODEL with String]
    
    /* "ja-JP_BroadbandModel" */ @js.native
    object JA_JP_BROADBANDMODEL extends TopLevel[JA_JP_BROADBANDMODEL with String]
    
    /* "ja-JP_NarrowbandModel" */ @js.native
    object JA_JP_NARROWBANDMODEL extends TopLevel[JA_JP_NARROWBANDMODEL with String]
    
    /* "ko-KR_BroadbandModel" */ @js.native
    object KO_KR_BROADBANDMODEL extends TopLevel[KO_KR_BROADBANDMODEL with String]
    
    /* "ko-KR_NarrowbandModel" */ @js.native
    object KO_KR_NARROWBANDMODEL extends TopLevel[KO_KR_NARROWBANDMODEL with String]
    
    /* "pt-BR_BroadbandModel" */ @js.native
    object PT_BR_BROADBANDMODEL extends TopLevel[PT_BR_BROADBANDMODEL with String]
    
    /* "pt-BR_NarrowbandModel" */ @js.native
    object PT_BR_NARROWBANDMODEL extends TopLevel[PT_BR_NARROWBANDMODEL with String]
    
  }
  
}

