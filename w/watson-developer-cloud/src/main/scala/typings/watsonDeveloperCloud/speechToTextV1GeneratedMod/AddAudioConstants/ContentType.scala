package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

/** For an audio-type resource, the format (MIME type) of the audio. For more information, see **Content types for audio-type resources** in the method description. For an archive-type resource, the media type of the archive file. For more information, see **Content types for archive-type resources** in the method description. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "AddAudioConstants.ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait APPLICATION_GZIP extends ContentType
  
  @js.native
  sealed trait APPLICATION_ZIP extends ContentType
  
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
  /* "application/gzip" */ @js.native
  object APPLICATION_GZIP extends TopLevel[APPLICATION_GZIP with String]
  
  /* "application/zip" */ @js.native
  object APPLICATION_ZIP extends TopLevel[APPLICATION_ZIP with String]
  
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

