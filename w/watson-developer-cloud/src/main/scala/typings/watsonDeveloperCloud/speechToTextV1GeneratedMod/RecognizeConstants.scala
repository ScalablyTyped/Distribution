package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def apply(value: String): js.UndefOr[ContentType & String] = js.native
    
    @js.native
    sealed trait APPLICATION_OCTET_STREAM
      extends StObject
         with ContentType
    /* "application/octet-stream" */ val APPLICATION_OCTET_STREAM: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.APPLICATION_OCTET_STREAM & String = js.native
    
    @js.native
    sealed trait AUDIO_ALAW
      extends StObject
         with ContentType
    /* "audio/alaw" */ val AUDIO_ALAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_ALAW & String = js.native
    
    @js.native
    sealed trait AUDIO_BASIC
      extends StObject
         with ContentType
    /* "audio/basic" */ val AUDIO_BASIC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_BASIC & String = js.native
    
    @js.native
    sealed trait AUDIO_FLAC
      extends StObject
         with ContentType
    /* "audio/flac" */ val AUDIO_FLAC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_FLAC & String = js.native
    
    @js.native
    sealed trait AUDIO_G729
      extends StObject
         with ContentType
    /* "audio/g729" */ val AUDIO_G729: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_G729 & String = js.native
    
    @js.native
    sealed trait AUDIO_L16
      extends StObject
         with ContentType
    /* "audio/l16" */ val AUDIO_L16: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_L16 & String = js.native
    
    @js.native
    sealed trait AUDIO_MP3
      extends StObject
         with ContentType
    /* "audio/mp3" */ val AUDIO_MP3: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_MP3 & String = js.native
    
    @js.native
    sealed trait AUDIO_MPEG
      extends StObject
         with ContentType
    /* "audio/mpeg" */ val AUDIO_MPEG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_MPEG & String = js.native
    
    @js.native
    sealed trait AUDIO_MULAW
      extends StObject
         with ContentType
    /* "audio/mulaw" */ val AUDIO_MULAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_MULAW & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG
      extends StObject
         with ContentType
    /* "audio/ogg" */ val AUDIO_OGG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_OGG & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_OPUS
      extends StObject
         with ContentType
    /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_OGG_CODECS_OPUS & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_VORBIS
      extends StObject
         with ContentType
    /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_OGG_CODECS_VORBIS & String = js.native
    
    @js.native
    sealed trait AUDIO_WAV
      extends StObject
         with ContentType
    /* "audio/wav" */ val AUDIO_WAV: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_WAV & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM
      extends StObject
         with ContentType
    /* "audio/webm" */ val AUDIO_WEBM: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_WEBM & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_OPUS
      extends StObject
         with ContentType
    /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_WEBM_CODECS_OPUS & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_VORBIS
      extends StObject
         with ContentType
    /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType.AUDIO_WEBM_CODECS_VORBIS & String = js.native
  }
  
  @js.native
  sealed trait Model extends StObject
  /** The identifier of the model that is to be used for the recognition request. See [Languages and models](https://cloud.ibm.com/docs/services/speech-to-text/models.html). */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "RecognizeConstants.Model")
  @js.native
  object Model extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model & String] = js.native
    
    @js.native
    sealed trait AR_AR_BROADBANDMODEL
      extends StObject
         with Model
    /* "ar-AR_BroadbandModel" */ val AR_AR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.AR_AR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait DE_DE_BROADBANDMODEL
      extends StObject
         with Model
    /* "de-DE_BroadbandModel" */ val DE_DE_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.DE_DE_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait DE_DE_NARROWBANDMODEL
      extends StObject
         with Model
    /* "de-DE_NarrowbandModel" */ val DE_DE_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.DE_DE_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_GB_BROADBANDMODEL
      extends StObject
         with Model
    /* "en-GB_BroadbandModel" */ val EN_GB_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.EN_GB_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_GB_NARROWBANDMODEL
      extends StObject
         with Model
    /* "en-GB_NarrowbandModel" */ val EN_GB_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.EN_GB_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_US_BROADBANDMODEL
      extends StObject
         with Model
    /* "en-US_BroadbandModel" */ val EN_US_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.EN_US_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_US_NARROWBANDMODEL
      extends StObject
         with Model
    /* "en-US_NarrowbandModel" */ val EN_US_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.EN_US_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait EN_US_SHORTFORM_NARROWBANDMODEL
      extends StObject
         with Model
    /* "en-US_ShortForm_NarrowbandModel" */ val EN_US_SHORTFORM_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.EN_US_SHORTFORM_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait ES_ES_BROADBANDMODEL
      extends StObject
         with Model
    /* "es-ES_BroadbandModel" */ val ES_ES_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.ES_ES_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait ES_ES_NARROWBANDMODEL
      extends StObject
         with Model
    /* "es-ES_NarrowbandModel" */ val ES_ES_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.ES_ES_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait FR_FR_BROADBANDMODEL
      extends StObject
         with Model
    /* "fr-FR_BroadbandModel" */ val FR_FR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.FR_FR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait FR_FR_NARROWBANDMODEL
      extends StObject
         with Model
    /* "fr-FR_NarrowbandModel" */ val FR_FR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.FR_FR_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait JA_JP_BROADBANDMODEL
      extends StObject
         with Model
    /* "ja-JP_BroadbandModel" */ val JA_JP_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.JA_JP_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait JA_JP_NARROWBANDMODEL
      extends StObject
         with Model
    /* "ja-JP_NarrowbandModel" */ val JA_JP_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.JA_JP_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait KO_KR_BROADBANDMODEL
      extends StObject
         with Model
    /* "ko-KR_BroadbandModel" */ val KO_KR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.KO_KR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait KO_KR_NARROWBANDMODEL
      extends StObject
         with Model
    /* "ko-KR_NarrowbandModel" */ val KO_KR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.KO_KR_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait PT_BR_BROADBANDMODEL
      extends StObject
         with Model
    /* "pt-BR_BroadbandModel" */ val PT_BR_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.PT_BR_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait PT_BR_NARROWBANDMODEL
      extends StObject
         with Model
    /* "pt-BR_NarrowbandModel" */ val PT_BR_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.PT_BR_NARROWBANDMODEL & String = js.native
    
    @js.native
    sealed trait ZH_CN_BROADBANDMODEL
      extends StObject
         with Model
    /* "zh-CN_BroadbandModel" */ val ZH_CN_BROADBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.ZH_CN_BROADBANDMODEL & String = js.native
    
    @js.native
    sealed trait ZH_CN_NARROWBANDMODEL
      extends StObject
         with Model
    /* "zh-CN_NarrowbandModel" */ val ZH_CN_NARROWBANDMODEL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model.ZH_CN_NARROWBANDMODEL & String = js.native
  }
}
