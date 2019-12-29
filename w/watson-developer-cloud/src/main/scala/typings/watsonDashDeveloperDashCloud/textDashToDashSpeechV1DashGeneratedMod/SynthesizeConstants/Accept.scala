package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.SynthesizeConstants

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Accept with String] = js.native
  /* "audio/basic" */ @js.native
  object AUDIO_BASIC extends TopLevel[AUDIO_BASIC with String]
  
  /* "audio/flac" */ @js.native
  object AUDIO_FLAC extends TopLevel[AUDIO_FLAC with String]
  
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

