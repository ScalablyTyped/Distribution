package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Model extends StObject
/** The identifier of the model that is to be used for the recognition request. See [Languages and models](https://cloud.ibm.com/docs/services/speech-to-text/models.html). */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "CreateJobConstants.Model")
@js.native
object Model extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Model & String] = js.native
  
  @js.native
  sealed trait AR_AR_BROADBANDMODEL
    extends StObject
       with Model
  /* "ar-AR_BroadbandModel" */ val AR_AR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.AR_AR_BROADBANDMODEL & String = js.native
  
  @js.native
  sealed trait DE_DE_BROADBANDMODEL
    extends StObject
       with Model
  /* "de-DE_BroadbandModel" */ val DE_DE_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.DE_DE_BROADBANDMODEL & String = js.native
  
  @js.native
  sealed trait DE_DE_NARROWBANDMODEL
    extends StObject
       with Model
  /* "de-DE_NarrowbandModel" */ val DE_DE_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.DE_DE_NARROWBANDMODEL & String = js.native
  
  @js.native
  sealed trait EN_GB_BROADBANDMODEL
    extends StObject
       with Model
  /* "en-GB_BroadbandModel" */ val EN_GB_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.EN_GB_BROADBANDMODEL & String = js.native
  
  @js.native
  sealed trait EN_GB_NARROWBANDMODEL
    extends StObject
       with Model
  /* "en-GB_NarrowbandModel" */ val EN_GB_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.EN_GB_NARROWBANDMODEL & String = js.native
  
  @js.native
  sealed trait EN_US_BROADBANDMODEL
    extends StObject
       with Model
  /* "en-US_BroadbandModel" */ val EN_US_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.EN_US_BROADBANDMODEL & String = js.native
  
  @js.native
  sealed trait EN_US_NARROWBANDMODEL
    extends StObject
       with Model
  /* "en-US_NarrowbandModel" */ val EN_US_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.EN_US_NARROWBANDMODEL & String = js.native
  
  @js.native
  sealed trait EN_US_SHORTFORM_NARROWBANDMODEL
    extends StObject
       with Model
  /* "en-US_ShortForm_NarrowbandModel" */ val EN_US_SHORTFORM_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.EN_US_SHORTFORM_NARROWBANDMODEL & String = js.native
  
  @js.native
  sealed trait ES_ES_BROADBANDMODEL
    extends StObject
       with Model
  /* "es-ES_BroadbandModel" */ val ES_ES_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.ES_ES_BROADBANDMODEL & String = js.native
  
  @js.native
  sealed trait ES_ES_NARROWBANDMODEL
    extends StObject
       with Model
  /* "es-ES_NarrowbandModel" */ val ES_ES_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.ES_ES_NARROWBANDMODEL & String = js.native
  
  @js.native
  sealed trait FR_FR_BROADBANDMODEL
    extends StObject
       with Model
  /* "fr-FR_BroadbandModel" */ val FR_FR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.FR_FR_BROADBANDMODEL & String = js.native
  
  @js.native
  sealed trait FR_FR_NARROWBANDMODEL
    extends StObject
       with Model
  /* "fr-FR_NarrowbandModel" */ val FR_FR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.FR_FR_NARROWBANDMODEL & String = js.native
  
  @js.native
  sealed trait JA_JP_BROADBANDMODEL
    extends StObject
       with Model
  /* "ja-JP_BroadbandModel" */ val JA_JP_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.JA_JP_BROADBANDMODEL & String = js.native
  
  @js.native
  sealed trait JA_JP_NARROWBANDMODEL
    extends StObject
       with Model
  /* "ja-JP_NarrowbandModel" */ val JA_JP_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.JA_JP_NARROWBANDMODEL & String = js.native
  
  @js.native
  sealed trait KO_KR_BROADBANDMODEL
    extends StObject
       with Model
  /* "ko-KR_BroadbandModel" */ val KO_KR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.KO_KR_BROADBANDMODEL & String = js.native
  
  @js.native
  sealed trait KO_KR_NARROWBANDMODEL
    extends StObject
       with Model
  /* "ko-KR_NarrowbandModel" */ val KO_KR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.KO_KR_NARROWBANDMODEL & String = js.native
  
  @js.native
  sealed trait PT_BR_BROADBANDMODEL
    extends StObject
       with Model
  /* "pt-BR_BroadbandModel" */ val PT_BR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.PT_BR_BROADBANDMODEL & String = js.native
  
  @js.native
  sealed trait PT_BR_NARROWBANDMODEL
    extends StObject
       with Model
  /* "pt-BR_NarrowbandModel" */ val PT_BR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.PT_BR_NARROWBANDMODEL & String = js.native
  
  @js.native
  sealed trait ZH_CN_BROADBANDMODEL
    extends StObject
       with Model
  /* "zh-CN_BroadbandModel" */ val ZH_CN_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.ZH_CN_BROADBANDMODEL & String = js.native
  
  @js.native
  sealed trait ZH_CN_NARROWBANDMODEL
    extends StObject
       with Model
  /* "zh-CN_NarrowbandModel" */ val ZH_CN_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.Model.ZH_CN_NARROWBANDMODEL & String = js.native
}
