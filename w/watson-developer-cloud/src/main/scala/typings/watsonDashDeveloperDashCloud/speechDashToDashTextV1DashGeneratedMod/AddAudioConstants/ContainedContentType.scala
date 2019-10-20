package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContainedContentType extends js.Object

/** **For an archive-type resource,** specify the format of the audio files that are contained in the archive file if they are of type `audio/alaw`, `audio/basic`, `audio/l16`, or `audio/mulaw`. Include the `rate`, `channels`, and `endianness` parameters where necessary. In this case, all audio files that are contained in the archive file must be of the indicated type. For all other audio formats, you can omit the header. In this case, the audio files can be of multiple types as long as they are not of the types listed in the previous paragraph. The parameter accepts all of the audio formats that are supported for use with speech recognition. For more information, see **Content types for audio-type resources** in the method description. **For an audio-type resource,** omit the header. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "AddAudioConstants.ContainedContentType")
@js.native
object ContainedContentType extends js.Object {
  @js.native
  sealed trait AUDIO_ALAW extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_BASIC extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_FLAC extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_G729 extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_L16 extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_MP3 extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_MPEG extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_MULAW extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_OGG extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_OPUS extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_VORBIS extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_WAV extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_WEBM extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_OPUS extends ContainedContentType
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_VORBIS extends ContainedContentType
  
  /* "audio/alaw" */ val AUDIO_ALAW: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_ALAW with String = js.native
  /* "audio/basic" */ val AUDIO_BASIC: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_BASIC with String = js.native
  /* "audio/flac" */ val AUDIO_FLAC: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_FLAC with String = js.native
  /* "audio/g729" */ val AUDIO_G729: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_G729 with String = js.native
  /* "audio/l16" */ val AUDIO_L16: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_L16 with String = js.native
  /* "audio/mp3" */ val AUDIO_MP3: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_MP3 with String = js.native
  /* "audio/mpeg" */ val AUDIO_MPEG: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_MPEG with String = js.native
  /* "audio/mulaw" */ val AUDIO_MULAW: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_MULAW with String = js.native
  /* "audio/ogg" */ val AUDIO_OGG: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_OGG with String = js.native
  /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_OGG_CODECS_OPUS with String = js.native
  /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_OGG_CODECS_VORBIS with String = js.native
  /* "audio/wav" */ val AUDIO_WAV: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WAV with String = js.native
  /* "audio/webm" */ val AUDIO_WEBM: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WEBM with String = js.native
  /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WEBM_CODECS_OPUS with String = js.native
  /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WEBM_CODECS_VORBIS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContainedContentType with String] = js.native
}

