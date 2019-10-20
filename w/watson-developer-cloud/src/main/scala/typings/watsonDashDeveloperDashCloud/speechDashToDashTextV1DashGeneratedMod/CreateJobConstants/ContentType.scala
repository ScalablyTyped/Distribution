package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

/** The format (MIME type) of the audio. For more information about specifying an audio format, see **Audio formats (content types)** in the method description. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "CreateJobConstants.ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait APPLICATION_OCTET_STREAM extends ContentType
  
  @js.native
  sealed trait AUDIO_ALAW extends ContentType
  
  @js.native
  sealed trait AUDIO_BASIC extends ContentType
  
  @js.native
  sealed trait AUDIO_FLAC extends ContentType
  
  @js.native
  sealed trait AUDIO_G729 extends ContentType
  
  @js.native
  sealed trait AUDIO_L16 extends ContentType
  
  @js.native
  sealed trait AUDIO_MP3 extends ContentType
  
  @js.native
  sealed trait AUDIO_MPEG extends ContentType
  
  @js.native
  sealed trait AUDIO_MULAW extends ContentType
  
  @js.native
  sealed trait AUDIO_OGG extends ContentType
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_OPUS extends ContentType
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_VORBIS extends ContentType
  
  @js.native
  sealed trait AUDIO_WAV extends ContentType
  
  @js.native
  sealed trait AUDIO_WEBM extends ContentType
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_OPUS extends ContentType
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_VORBIS extends ContentType
  
  /* "application/octet-stream" */ val APPLICATION_OCTET_STREAM: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.APPLICATION_OCTET_STREAM with String = js.native
  /* "audio/alaw" */ val AUDIO_ALAW: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_ALAW with String = js.native
  /* "audio/basic" */ val AUDIO_BASIC: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_BASIC with String = js.native
  /* "audio/flac" */ val AUDIO_FLAC: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_FLAC with String = js.native
  /* "audio/g729" */ val AUDIO_G729: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_G729 with String = js.native
  /* "audio/l16" */ val AUDIO_L16: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_L16 with String = js.native
  /* "audio/mp3" */ val AUDIO_MP3: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_MP3 with String = js.native
  /* "audio/mpeg" */ val AUDIO_MPEG: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_MPEG with String = js.native
  /* "audio/mulaw" */ val AUDIO_MULAW: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_MULAW with String = js.native
  /* "audio/ogg" */ val AUDIO_OGG: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_OGG with String = js.native
  /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_OGG_CODECS_OPUS with String = js.native
  /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_OGG_CODECS_VORBIS with String = js.native
  /* "audio/wav" */ val AUDIO_WAV: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_WAV with String = js.native
  /* "audio/webm" */ val AUDIO_WEBM: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_WEBM with String = js.native
  /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_WEBM_CODECS_OPUS with String = js.native
  /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.CreateJobConstants.ContentType.AUDIO_WEBM_CODECS_VORBIS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
}

