package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def apply(value: String): js.UndefOr[ModelId with String] = js.native
    
    @js.native
    sealed trait AR_AR_BROADBANDMODEL extends ModelId
    /* "ar-AR_BroadbandModel" */ val AR_AR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.AR_AR_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait DE_DE_BROADBANDMODEL extends ModelId
    /* "de-DE_BroadbandModel" */ val DE_DE_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.DE_DE_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait DE_DE_NARROWBANDMODEL extends ModelId
    /* "de-DE_NarrowbandModel" */ val DE_DE_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.DE_DE_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait EN_GB_BROADBANDMODEL extends ModelId
    /* "en-GB_BroadbandModel" */ val EN_GB_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.EN_GB_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait EN_GB_NARROWBANDMODEL extends ModelId
    /* "en-GB_NarrowbandModel" */ val EN_GB_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.EN_GB_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait EN_US_BROADBANDMODEL extends ModelId
    /* "en-US_BroadbandModel" */ val EN_US_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.EN_US_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait EN_US_NARROWBANDMODEL extends ModelId
    /* "en-US_NarrowbandModel" */ val EN_US_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.EN_US_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait EN_US_SHORTFORM_NARROWBANDMODEL extends ModelId
    /* "en-US_ShortForm_NarrowbandModel" */ val EN_US_SHORTFORM_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.EN_US_SHORTFORM_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait ES_ES_BROADBANDMODEL extends ModelId
    /* "es-ES_BroadbandModel" */ val ES_ES_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.ES_ES_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait ES_ES_NARROWBANDMODEL extends ModelId
    /* "es-ES_NarrowbandModel" */ val ES_ES_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.ES_ES_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait FR_FR_BROADBANDMODEL extends ModelId
    /* "fr-FR_BroadbandModel" */ val FR_FR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.FR_FR_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait FR_FR_NARROWBANDMODEL extends ModelId
    /* "fr-FR_NarrowbandModel" */ val FR_FR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.FR_FR_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait JA_JP_BROADBANDMODEL extends ModelId
    /* "ja-JP_BroadbandModel" */ val JA_JP_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.JA_JP_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait JA_JP_NARROWBANDMODEL extends ModelId
    /* "ja-JP_NarrowbandModel" */ val JA_JP_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.JA_JP_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait KO_KR_BROADBANDMODEL extends ModelId
    /* "ko-KR_BroadbandModel" */ val KO_KR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.KO_KR_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait KO_KR_NARROWBANDMODEL extends ModelId
    /* "ko-KR_NarrowbandModel" */ val KO_KR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.KO_KR_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait PT_BR_BROADBANDMODEL extends ModelId
    /* "pt-BR_BroadbandModel" */ val PT_BR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.PT_BR_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait PT_BR_NARROWBANDMODEL extends ModelId
    /* "pt-BR_NarrowbandModel" */ val PT_BR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.PT_BR_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait ZH_CN_BROADBANDMODEL extends ModelId
    /* "zh-CN_BroadbandModel" */ val ZH_CN_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.ZH_CN_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait ZH_CN_NARROWBANDMODEL extends ModelId
    /* "zh-CN_NarrowbandModel" */ val ZH_CN_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId.ZH_CN_NARROWBANDMODEL with String = js.native
  }
}
