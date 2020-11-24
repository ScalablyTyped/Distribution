package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Accept extends js.Object
/** The requested format (MIME type) of the audio. You can use the `Accept` header or the `accept` parameter to specify the audio format. For more information about specifying an audio format, see **Audio formats (accept types)** in the method description. Default: `audio/ogg;codecs=opus`. */
@JSImport("watson-developer-cloud/text-to-speech/v1-generated", "SynthesizeConstants.Accept")
@js.native
object Accept extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Accept with String] = js.native
  
  @js.native
  sealed trait AUDIO_BASIC extends Accept
  /* "audio/basic" */ @js.native
  object AUDIO_BASIC extends TopLevel[AUDIO_BASIC with String]
  
  @js.native
  sealed trait AUDIO_FLAC extends Accept
  /* "audio/flac" */ @js.native
  object AUDIO_FLAC extends TopLevel[AUDIO_FLAC with String]
  
  @js.native
  sealed trait AUDIO_L16 extends Accept
  /* "audio/l16" */ @js.native
  object AUDIO_L16 extends TopLevel[AUDIO_L16 with String]
  
  @js.native
  sealed trait AUDIO_MP3 extends Accept
  /* "audio/mp3" */ @js.native
  object AUDIO_MP3 extends TopLevel[AUDIO_MP3 with String]
  
  @js.native
  sealed trait AUDIO_MPEG extends Accept
  /* "audio/mpeg" */ @js.native
  object AUDIO_MPEG extends TopLevel[AUDIO_MPEG with String]
  
  @js.native
  sealed trait AUDIO_MULAW extends Accept
  /* "audio/mulaw" */ @js.native
  object AUDIO_MULAW extends TopLevel[AUDIO_MULAW with String]
  
  @js.native
  sealed trait AUDIO_OGG extends Accept
  /* "audio/ogg" */ @js.native
  object AUDIO_OGG extends TopLevel[AUDIO_OGG with String]
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_OPUS extends Accept
  /* "audio/ogg;codecs=opus" */ @js.native
  object AUDIO_OGG_CODECS_OPUS extends TopLevel[AUDIO_OGG_CODECS_OPUS with String]
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_VORBIS extends Accept
  /* "audio/ogg;codecs=vorbis" */ @js.native
  object AUDIO_OGG_CODECS_VORBIS extends TopLevel[AUDIO_OGG_CODECS_VORBIS with String]
  
  @js.native
  sealed trait AUDIO_WAV extends Accept
  /* "audio/wav" */ @js.native
  object AUDIO_WAV extends TopLevel[AUDIO_WAV with String]
  
  @js.native
  sealed trait AUDIO_WEBM extends Accept
  /* "audio/webm" */ @js.native
  object AUDIO_WEBM extends TopLevel[AUDIO_WEBM with String]
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_OPUS extends Accept
  /* "audio/webm;codecs=opus" */ @js.native
  object AUDIO_WEBM_CODECS_OPUS extends TopLevel[AUDIO_WEBM_CODECS_OPUS with String]
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_VORBIS extends Accept
  /* "audio/webm;codecs=vorbis" */ @js.native
  object AUDIO_WEBM_CODECS_VORBIS extends TopLevel[AUDIO_WEBM_CODECS_VORBIS with String]
}
