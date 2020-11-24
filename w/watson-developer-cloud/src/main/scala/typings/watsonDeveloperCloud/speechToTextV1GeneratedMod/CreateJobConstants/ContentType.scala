package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentType extends js.Object
/** The format (MIME type) of the audio. For more information about specifying an audio format, see **Audio formats (content types)** in the method description. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "CreateJobConstants.ContentType")
@js.native
object ContentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
  
  @js.native
  sealed trait APPLICATION_OCTET_STREAM extends ContentType
  /* "application/octet-stream" */ @js.native
  object APPLICATION_OCTET_STREAM extends TopLevel[APPLICATION_OCTET_STREAM with String]
  
  @js.native
  sealed trait AUDIO_ALAW extends ContentType
  /* "audio/alaw" */ @js.native
  object AUDIO_ALAW extends TopLevel[AUDIO_ALAW with String]
  
  @js.native
  sealed trait AUDIO_BASIC extends ContentType
  /* "audio/basic" */ @js.native
  object AUDIO_BASIC extends TopLevel[AUDIO_BASIC with String]
  
  @js.native
  sealed trait AUDIO_FLAC extends ContentType
  /* "audio/flac" */ @js.native
  object AUDIO_FLAC extends TopLevel[AUDIO_FLAC with String]
  
  @js.native
  sealed trait AUDIO_G729 extends ContentType
  /* "audio/g729" */ @js.native
  object AUDIO_G729 extends TopLevel[AUDIO_G729 with String]
  
  @js.native
  sealed trait AUDIO_L16 extends ContentType
  /* "audio/l16" */ @js.native
  object AUDIO_L16 extends TopLevel[AUDIO_L16 with String]
  
  @js.native
  sealed trait AUDIO_MP3 extends ContentType
  /* "audio/mp3" */ @js.native
  object AUDIO_MP3 extends TopLevel[AUDIO_MP3 with String]
  
  @js.native
  sealed trait AUDIO_MPEG extends ContentType
  /* "audio/mpeg" */ @js.native
  object AUDIO_MPEG extends TopLevel[AUDIO_MPEG with String]
  
  @js.native
  sealed trait AUDIO_MULAW extends ContentType
  /* "audio/mulaw" */ @js.native
  object AUDIO_MULAW extends TopLevel[AUDIO_MULAW with String]
  
  @js.native
  sealed trait AUDIO_OGG extends ContentType
  /* "audio/ogg" */ @js.native
  object AUDIO_OGG extends TopLevel[AUDIO_OGG with String]
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_OPUS extends ContentType
  /* "audio/ogg;codecs=opus" */ @js.native
  object AUDIO_OGG_CODECS_OPUS extends TopLevel[AUDIO_OGG_CODECS_OPUS with String]
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_VORBIS extends ContentType
  /* "audio/ogg;codecs=vorbis" */ @js.native
  object AUDIO_OGG_CODECS_VORBIS extends TopLevel[AUDIO_OGG_CODECS_VORBIS with String]
  
  @js.native
  sealed trait AUDIO_WAV extends ContentType
  /* "audio/wav" */ @js.native
  object AUDIO_WAV extends TopLevel[AUDIO_WAV with String]
  
  @js.native
  sealed trait AUDIO_WEBM extends ContentType
  /* "audio/webm" */ @js.native
  object AUDIO_WEBM extends TopLevel[AUDIO_WEBM with String]
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_OPUS extends ContentType
  /* "audio/webm;codecs=opus" */ @js.native
  object AUDIO_WEBM_CODECS_OPUS extends TopLevel[AUDIO_WEBM_CODECS_OPUS with String]
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_VORBIS extends ContentType
  /* "audio/webm;codecs=vorbis" */ @js.native
  object AUDIO_WEBM_CODECS_VORBIS extends TopLevel[AUDIO_WEBM_CODECS_VORBIS with String]
}
