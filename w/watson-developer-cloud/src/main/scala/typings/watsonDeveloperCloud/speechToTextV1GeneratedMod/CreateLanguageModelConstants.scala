package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createLanguageModel` operation. */
object CreateLanguageModelConstants {
  
  @js.native
  sealed trait BaseModelName extends StObject
  /** The name of the base language model that is to be customized by the new custom language model. The new custom model can be used only with the base model that it customizes. To determine whether a base model supports language model customization, use the **Get a model** method and check that the attribute `custom_language_model` is set to `true`. You can also refer to [Language support for customization](https://cloud.ibm.com/docs/services/speech-to-text/custom.html#languageSupport). */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "CreateLanguageModelConstants.BaseModelName")
  @js.native
  object BaseModelName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BaseModelName & String] = js.native
    
    @js.native
    sealed trait DE_DE_BROADBANDMODEL
      extends StObject
         with BaseModelName
    /* "de-DE_BroadbandModel" */ val DE_DE_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.DE_DE_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait DE_DE_NARROWBANDMODEL
      extends StObject
         with BaseModelName
    /* "de-DE_NarrowbandModel" */ val DE_DE_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.DE_DE_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_GB_BROADBANDMODEL
      extends StObject
         with BaseModelName
    /* "en-GB_BroadbandModel" */ val EN_GB_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.EN_GB_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_GB_NARROWBANDMODEL
      extends StObject
         with BaseModelName
    /* "en-GB_NarrowbandModel" */ val EN_GB_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.EN_GB_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_US_BROADBANDMODEL
      extends StObject
         with BaseModelName
    /* "en-US_BroadbandModel" */ val EN_US_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.EN_US_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_US_NARROWBANDMODEL
      extends StObject
         with BaseModelName
    /* "en-US_NarrowbandModel" */ val EN_US_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.EN_US_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_US_SHORTFORM_NARROWBANDMODEL
      extends StObject
         with BaseModelName
    /* "en-US_ShortForm_NarrowbandModel" */ val EN_US_SHORTFORM_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.EN_US_SHORTFORM_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait ES_ES_BROADBANDMODEL
      extends StObject
         with BaseModelName
    /* "es-ES_BroadbandModel" */ val ES_ES_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.ES_ES_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait ES_ES_NARROWBANDMODEL
      extends StObject
         with BaseModelName
    /* "es-ES_NarrowbandModel" */ val ES_ES_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.ES_ES_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait FR_FR_BROADBANDMODEL
      extends StObject
         with BaseModelName
    /* "fr-FR_BroadbandModel" */ val FR_FR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.FR_FR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait FR_FR_NARROWBANDMODEL
      extends StObject
         with BaseModelName
    /* "fr-FR_NarrowbandModel" */ val FR_FR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.FR_FR_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait JA_JP_BROADBANDMODEL
      extends StObject
         with BaseModelName
    /* "ja-JP_BroadbandModel" */ val JA_JP_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.JA_JP_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait JA_JP_NARROWBANDMODEL
      extends StObject
         with BaseModelName
    /* "ja-JP_NarrowbandModel" */ val JA_JP_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.JA_JP_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait KO_KR_BROADBANDMODEL
      extends StObject
         with BaseModelName
    /* "ko-KR_BroadbandModel" */ val KO_KR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.KO_KR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait KO_KR_NARROWBANDMODEL
      extends StObject
         with BaseModelName
    /* "ko-KR_NarrowbandModel" */ val KO_KR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.KO_KR_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait PT_BR_BROADBANDMODEL
      extends StObject
         with BaseModelName
    /* "pt-BR_BroadbandModel" */ val PT_BR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.PT_BR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait PT_BR_NARROWBANDMODEL
      extends StObject
         with BaseModelName
    /* "pt-BR_NarrowbandModel" */ val PT_BR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateLanguageModelConstants.BaseModelName.PT_BR_NARROWBANDMODEL & String = js.native
  }
}
