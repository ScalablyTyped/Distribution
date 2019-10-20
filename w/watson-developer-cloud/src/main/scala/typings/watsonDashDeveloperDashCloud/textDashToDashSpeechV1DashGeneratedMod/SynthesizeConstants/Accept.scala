package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Accept extends js.Object

/** The requested format (MIME type) of the audio. You can use the `Accept` header or the `accept` parameter to specify the audio format. For more information about specifying an audio format, see **Audio formats (accept types)** in the method description. Default: `audio/ogg;codecs=opus`. */
@JSImport("watson-developer-cloud/text-to-speech/v1-generated", "SynthesizeConstants.Accept")
@js.native
object Accept extends js.Object {
  @js.native
  sealed trait AUDIO_BASIC extends Accept
  
  @js.native
  sealed trait AUDIO_FLAC extends Accept
  
  @js.native
  sealed trait AUDIO_L16 extends Accept
  
  @js.native
  sealed trait AUDIO_MP3 extends Accept
  
  @js.native
  sealed trait AUDIO_MPEG extends Accept
  
  @js.native
  sealed trait AUDIO_MULAW extends Accept
  
  @js.native
  sealed trait AUDIO_OGG extends Accept
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_OPUS extends Accept
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_VORBIS extends Accept
  
  @js.native
  sealed trait AUDIO_WAV extends Accept
  
  @js.native
  sealed trait AUDIO_WEBM extends Accept
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_OPUS extends Accept
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_VORBIS extends Accept
  
  /* "audio/basic" */ val AUDIO_BASIC: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_BASIC with String = js.native
  /* "audio/flac" */ val AUDIO_FLAC: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_FLAC with String = js.native
  /* "audio/l16" */ val AUDIO_L16: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_L16 with String = js.native
  /* "audio/mp3" */ val AUDIO_MP3: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_MP3 with String = js.native
  /* "audio/mpeg" */ val AUDIO_MPEG: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_MPEG with String = js.native
  /* "audio/mulaw" */ val AUDIO_MULAW: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_MULAW with String = js.native
  /* "audio/ogg" */ val AUDIO_OGG: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_OGG with String = js.native
  /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_OGG_CODECS_OPUS with String = js.native
  /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_OGG_CODECS_VORBIS with String = js.native
  /* "audio/wav" */ val AUDIO_WAV: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_WAV with String = js.native
  /* "audio/webm" */ val AUDIO_WEBM: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_WEBM with String = js.native
  /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_WEBM_CODECS_OPUS with String = js.native
  /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants.Accept.AUDIO_WEBM_CODECS_VORBIS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Accept with String] = js.native
}

