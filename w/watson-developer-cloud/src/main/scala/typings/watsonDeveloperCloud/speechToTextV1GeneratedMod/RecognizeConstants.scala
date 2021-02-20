package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `recognize` operation. */
object RecognizeConstants {
  
  @js.native
  sealed trait ContentType extends StObject
  /** The format (MIME type) of the audio. For more information about specifying an audio format, see **Audio formats (content types)** in the method description. */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "RecognizeConstants.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_OCTET_STREAM extends ContentType
    /* "application/octet-stream" */ val APPLICATION_OCTET_STREAM: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.APPLICATION_OCTET_STREAM with String = js.native
    
    @js.native
    sealed trait AUDIO_ALAW extends ContentType
    /* "audio/alaw" */ val AUDIO_ALAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_ALAW with String = js.native
    
    @js.native
    sealed trait AUDIO_BASIC extends ContentType
    /* "audio/basic" */ val AUDIO_BASIC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_BASIC with String = js.native
    
    @js.native
    sealed trait AUDIO_FLAC extends ContentType
    /* "audio/flac" */ val AUDIO_FLAC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_FLAC with String = js.native
    
    @js.native
    sealed trait AUDIO_G729 extends ContentType
    /* "audio/g729" */ val AUDIO_G729: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_G729 with String = js.native
    
    @js.native
    sealed trait AUDIO_L16 extends ContentType
    /* "audio/l16" */ val AUDIO_L16: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_L16 with String = js.native
    
    @js.native
    sealed trait AUDIO_MP3 extends ContentType
    /* "audio/mp3" */ val AUDIO_MP3: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_MP3 with String = js.native
    
    @js.native
    sealed trait AUDIO_MPEG extends ContentType
    /* "audio/mpeg" */ val AUDIO_MPEG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_MPEG with String = js.native
    
    @js.native
    sealed trait AUDIO_MULAW extends ContentType
    /* "audio/mulaw" */ val AUDIO_MULAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_MULAW with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG extends ContentType
    /* "audio/ogg" */ val AUDIO_OGG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_OGG with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_OPUS extends ContentType
    /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_OGG_CODECS_OPUS with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_VORBIS extends ContentType
    /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_OGG_CODECS_VORBIS with String = js.native
    
    @js.native
    sealed trait AUDIO_WAV extends ContentType
    /* "audio/wav" */ val AUDIO_WAV: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_WAV with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM extends ContentType
    /* "audio/webm" */ val AUDIO_WEBM: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_WEBM with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_OPUS extends ContentType
    /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_WEBM_CODECS_OPUS with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_VORBIS extends ContentType
    /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_WEBM_CODECS_VORBIS with String = js.native
  }
  
  @js.native
  sealed trait Model extends StObject
  /** The identifier of the model that is to be used for the recognition request. See [Languages and models](https://cloud.ibm.com/docs/services/speech-to-text/models.html). */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "RecognizeConstants.Model")
  @js.native
  object Model extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model with String] = js.native
    
    @js.native
    sealed trait AR_AR_BROADBANDMODEL extends Model
    /* "ar-AR_BroadbandModel" */ val AR_AR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.AR_AR_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait DE_DE_BROADBANDMODEL extends Model
    /* "de-DE_BroadbandModel" */ val DE_DE_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.DE_DE_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait DE_DE_NARROWBANDMODEL extends Model
    /* "de-DE_NarrowbandModel" */ val DE_DE_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.DE_DE_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait EN_GB_BROADBANDMODEL extends Model
    /* "en-GB_BroadbandModel" */ val EN_GB_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.EN_GB_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait EN_GB_NARROWBANDMODEL extends Model
    /* "en-GB_NarrowbandModel" */ val EN_GB_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.EN_GB_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait EN_US_BROADBANDMODEL extends Model
    /* "en-US_BroadbandModel" */ val EN_US_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.EN_US_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait EN_US_NARROWBANDMODEL extends Model
    /* "en-US_NarrowbandModel" */ val EN_US_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.EN_US_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait EN_US_SHORTFORM_NARROWBANDMODEL extends Model
    /* "en-US_ShortForm_NarrowbandModel" */ val EN_US_SHORTFORM_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.EN_US_SHORTFORM_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait ES_ES_BROADBANDMODEL extends Model
    /* "es-ES_BroadbandModel" */ val ES_ES_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.ES_ES_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait ES_ES_NARROWBANDMODEL extends Model
    /* "es-ES_NarrowbandModel" */ val ES_ES_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.ES_ES_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait FR_FR_BROADBANDMODEL extends Model
    /* "fr-FR_BroadbandModel" */ val FR_FR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.FR_FR_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait FR_FR_NARROWBANDMODEL extends Model
    /* "fr-FR_NarrowbandModel" */ val FR_FR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.FR_FR_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait JA_JP_BROADBANDMODEL extends Model
    /* "ja-JP_BroadbandModel" */ val JA_JP_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.JA_JP_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait JA_JP_NARROWBANDMODEL extends Model
    /* "ja-JP_NarrowbandModel" */ val JA_JP_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.JA_JP_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait KO_KR_BROADBANDMODEL extends Model
    /* "ko-KR_BroadbandModel" */ val KO_KR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.KO_KR_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait KO_KR_NARROWBANDMODEL extends Model
    /* "ko-KR_NarrowbandModel" */ val KO_KR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.KO_KR_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait PT_BR_BROADBANDMODEL extends Model
    /* "pt-BR_BroadbandModel" */ val PT_BR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.PT_BR_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait PT_BR_NARROWBANDMODEL extends Model
    /* "pt-BR_NarrowbandModel" */ val PT_BR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.PT_BR_NARROWBANDMODEL with String = js.native
    
    @js.native
    sealed trait ZH_CN_BROADBANDMODEL extends Model
    /* "zh-CN_BroadbandModel" */ val ZH_CN_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.ZH_CN_BROADBANDMODEL with String = js.native
    
    @js.native
    sealed trait ZH_CN_NARROWBANDMODEL extends Model
    /* "zh-CN_NarrowbandModel" */ val ZH_CN_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.ZH_CN_NARROWBANDMODEL with String = js.native
  }
}
