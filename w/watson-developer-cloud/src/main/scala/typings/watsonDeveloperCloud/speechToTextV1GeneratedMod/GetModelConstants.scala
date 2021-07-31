package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `getModel` operation. */
object GetModelConstants {
  
  @js.native
  sealed trait ModelId extends StObject
  /** The identifier of the model in the form of its name from the output of the **Get a model** method. */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "GetModelConstants.ModelId")
  @js.native
  object ModelId extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ModelId & String] = js.native
    
    @js.native
    sealed trait AR_AR_BROADBANDMODEL
      extends StObject
         with ModelId
    /* "ar-AR_BroadbandModel" */ val AR_AR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.AR_AR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait DE_DE_BROADBANDMODEL
      extends StObject
         with ModelId
    /* "de-DE_BroadbandModel" */ val DE_DE_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.DE_DE_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait DE_DE_NARROWBANDMODEL
      extends StObject
         with ModelId
    /* "de-DE_NarrowbandModel" */ val DE_DE_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.DE_DE_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_GB_BROADBANDMODEL
      extends StObject
         with ModelId
    /* "en-GB_BroadbandModel" */ val EN_GB_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.EN_GB_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_GB_NARROWBANDMODEL
      extends StObject
         with ModelId
    /* "en-GB_NarrowbandModel" */ val EN_GB_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.EN_GB_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_US_BROADBANDMODEL
      extends StObject
         with ModelId
    /* "en-US_BroadbandModel" */ val EN_US_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.EN_US_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_US_NARROWBANDMODEL
      extends StObject
         with ModelId
    /* "en-US_NarrowbandModel" */ val EN_US_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.EN_US_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_US_SHORTFORM_NARROWBANDMODEL
      extends StObject
         with ModelId
    /* "en-US_ShortForm_NarrowbandModel" */ val EN_US_SHORTFORM_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.EN_US_SHORTFORM_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait ES_ES_BROADBANDMODEL
      extends StObject
         with ModelId
    /* "es-ES_BroadbandModel" */ val ES_ES_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.ES_ES_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait ES_ES_NARROWBANDMODEL
      extends StObject
         with ModelId
    /* "es-ES_NarrowbandModel" */ val ES_ES_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.ES_ES_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait FR_FR_BROADBANDMODEL
      extends StObject
         with ModelId
    /* "fr-FR_BroadbandModel" */ val FR_FR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.FR_FR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait FR_FR_NARROWBANDMODEL
      extends StObject
         with ModelId
    /* "fr-FR_NarrowbandModel" */ val FR_FR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.FR_FR_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait JA_JP_BROADBANDMODEL
      extends StObject
         with ModelId
    /* "ja-JP_BroadbandModel" */ val JA_JP_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.JA_JP_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait JA_JP_NARROWBANDMODEL
      extends StObject
         with ModelId
    /* "ja-JP_NarrowbandModel" */ val JA_JP_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.JA_JP_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait KO_KR_BROADBANDMODEL
      extends StObject
         with ModelId
    /* "ko-KR_BroadbandModel" */ val KO_KR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.KO_KR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait KO_KR_NARROWBANDMODEL
      extends StObject
         with ModelId
    /* "ko-KR_NarrowbandModel" */ val KO_KR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.KO_KR_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait PT_BR_BROADBANDMODEL
      extends StObject
         with ModelId
    /* "pt-BR_BroadbandModel" */ val PT_BR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.PT_BR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait PT_BR_NARROWBANDMODEL
      extends StObject
         with ModelId
    /* "pt-BR_NarrowbandModel" */ val PT_BR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.PT_BR_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait ZH_CN_BROADBANDMODEL
      extends StObject
         with ModelId
    /* "zh-CN_BroadbandModel" */ val ZH_CN_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.ZH_CN_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait ZH_CN_NARROWBANDMODEL
      extends StObject
         with ModelId
    /* "zh-CN_NarrowbandModel" */ val ZH_CN_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.ZH_CN_NARROWBANDMODEL & String = js.native
  }
}
