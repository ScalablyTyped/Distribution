package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContainedContentType with String] = js.native
  /* "audio/alaw" */ @js.native
  object AUDIO_ALAW extends TopLevel[AUDIO_ALAW with String]
  
  /* "audio/basic" */ @js.native
  object AUDIO_BASIC extends TopLevel[AUDIO_BASIC with String]
  
  /* "audio/flac" */ @js.native
  object AUDIO_FLAC extends TopLevel[AUDIO_FLAC with String]
  
  /* "audio/g729" */ @js.native
  object AUDIO_G729 extends TopLevel[AUDIO_G729 with String]
  
  /* "audio/l16" */ @js.native
  object AUDIO_L16 extends TopLevel[AUDIO_L16 with String]
  
  /* "audio/mp3" */ @js.native
  object AUDIO_MP3 extends TopLevel[AUDIO_MP3 with String]
  
  /* "audio/mpeg" */ @js.native
  object AUDIO_MPEG extends TopLevel[AUDIO_MPEG with String]
  
  /* "audio/mulaw" */ @js.native
  object AUDIO_MULAW extends TopLevel[AUDIO_MULAW with String]
  
  /* "audio/ogg" */ @js.native
  object AUDIO_OGG extends TopLevel[AUDIO_OGG with String]
  
  /* "audio/ogg;codecs=opus" */ @js.native
  object AUDIO_OGG_CODECS_OPUS extends TopLevel[AUDIO_OGG_CODECS_OPUS with String]
  
  /* "audio/ogg;codecs=vorbis" */ @js.native
  object AUDIO_OGG_CODECS_VORBIS extends TopLevel[AUDIO_OGG_CODECS_VORBIS with String]
  
  /* "audio/wav" */ @js.native
  object AUDIO_WAV extends TopLevel[AUDIO_WAV with String]
  
  /* "audio/webm" */ @js.native
  object AUDIO_WEBM extends TopLevel[AUDIO_WEBM with String]
  
  /* "audio/webm;codecs=opus" */ @js.native
  object AUDIO_WEBM_CODECS_OPUS extends TopLevel[AUDIO_WEBM_CODECS_OPUS with String]
  
  /* "audio/webm;codecs=vorbis" */ @js.native
  object AUDIO_WEBM_CODECS_VORBIS extends TopLevel[AUDIO_WEBM_CODECS_VORBIS with String]
  
}

