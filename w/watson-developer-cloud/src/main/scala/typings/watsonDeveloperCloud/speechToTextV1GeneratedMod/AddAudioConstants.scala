package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `addAudio` operation. */
object AddAudioConstants {
  
  @js.native
  sealed trait ContainedContentType extends StObject
  /** **For an archive-type resource,** specify the format of the audio files that are contained in the archive file if they are of type `audio/alaw`, `audio/basic`, `audio/l16`, or `audio/mulaw`. Include the `rate`, `channels`, and `endianness` parameters where necessary. In this case, all audio files that are contained in the archive file must be of the indicated type. For all other audio formats, you can omit the header. In this case, the audio files can be of multiple types as long as they are not of the types listed in the previous paragraph. The parameter accepts all of the audio formats that are supported for use with speech recognition. For more information, see **Content types for audio-type resources** in the method description. **For an audio-type resource,** omit the header. */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "AddAudioConstants.ContainedContentType")
  @js.native
  object ContainedContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContainedContentType with String] = js.native
    
    @js.native
    sealed trait AUDIO_ALAW extends ContainedContentType
    /* "audio/alaw" */ val AUDIO_ALAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_ALAW with String = js.native
    
    @js.native
    sealed trait AUDIO_BASIC extends ContainedContentType
    /* "audio/basic" */ val AUDIO_BASIC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_BASIC with String = js.native
    
    @js.native
    sealed trait AUDIO_FLAC extends ContainedContentType
    /* "audio/flac" */ val AUDIO_FLAC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_FLAC with String = js.native
    
    @js.native
    sealed trait AUDIO_G729 extends ContainedContentType
    /* "audio/g729" */ val AUDIO_G729: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_G729 with String = js.native
    
    @js.native
    sealed trait AUDIO_L16 extends ContainedContentType
    /* "audio/l16" */ val AUDIO_L16: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_L16 with String = js.native
    
    @js.native
    sealed trait AUDIO_MP3 extends ContainedContentType
    /* "audio/mp3" */ val AUDIO_MP3: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_MP3 with String = js.native
    
    @js.native
    sealed trait AUDIO_MPEG extends ContainedContentType
    /* "audio/mpeg" */ val AUDIO_MPEG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_MPEG with String = js.native
    
    @js.native
    sealed trait AUDIO_MULAW extends ContainedContentType
    /* "audio/mulaw" */ val AUDIO_MULAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_MULAW with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG extends ContainedContentType
    /* "audio/ogg" */ val AUDIO_OGG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_OGG with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_OPUS extends ContainedContentType
    /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_OGG_CODECS_OPUS with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_VORBIS extends ContainedContentType
    /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_OGG_CODECS_VORBIS with String = js.native
    
    @js.native
    sealed trait AUDIO_WAV extends ContainedContentType
    /* "audio/wav" */ val AUDIO_WAV: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WAV with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM extends ContainedContentType
    /* "audio/webm" */ val AUDIO_WEBM: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WEBM with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_OPUS extends ContainedContentType
    /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WEBM_CODECS_OPUS with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_VORBIS extends ContainedContentType
    /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WEBM_CODECS_VORBIS with String = js.native
  }
  
  @js.native
  sealed trait ContentType extends StObject
  /** For an audio-type resource, the format (MIME type) of the audio. For more information, see **Content types for audio-type resources** in the method description. For an archive-type resource, the media type of the archive file. For more information, see **Content types for archive-type resources** in the method description. */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "AddAudioConstants.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_GZIP extends ContentType
    /* "application/gzip" */ val APPLICATION_GZIP: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.APPLICATION_GZIP with String = js.native
    
    @js.native
    sealed trait APPLICATION_ZIP extends ContentType
    /* "application/zip" */ val APPLICATION_ZIP: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.APPLICATION_ZIP with String = js.native
    
    @js.native
    sealed trait AUDIO_ALAW extends ContentType
    /* "audio/alaw" */ val AUDIO_ALAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_ALAW with String = js.native
    
    @js.native
    sealed trait AUDIO_BASIC extends ContentType
    /* "audio/basic" */ val AUDIO_BASIC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_BASIC with String = js.native
    
    @js.native
    sealed trait AUDIO_FLAC extends ContentType
    /* "audio/flac" */ val AUDIO_FLAC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_FLAC with String = js.native
    
    @js.native
    sealed trait AUDIO_G729 extends ContentType
    /* "audio/g729" */ val AUDIO_G729: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_G729 with String = js.native
    
    @js.native
    sealed trait AUDIO_L16 extends ContentType
    /* "audio/l16" */ val AUDIO_L16: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_L16 with String = js.native
    
    @js.native
    sealed trait AUDIO_MP3 extends ContentType
    /* "audio/mp3" */ val AUDIO_MP3: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_MP3 with String = js.native
    
    @js.native
    sealed trait AUDIO_MPEG extends ContentType
    /* "audio/mpeg" */ val AUDIO_MPEG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_MPEG with String = js.native
    
    @js.native
    sealed trait AUDIO_MULAW extends ContentType
    /* "audio/mulaw" */ val AUDIO_MULAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_MULAW with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG extends ContentType
    /* "audio/ogg" */ val AUDIO_OGG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_OGG with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_OPUS extends ContentType
    /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_OGG_CODECS_OPUS with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_VORBIS extends ContentType
    /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_OGG_CODECS_VORBIS with String = js.native
    
    @js.native
    sealed trait AUDIO_WAV extends ContentType
    /* "audio/wav" */ val AUDIO_WAV: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_WAV with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM extends ContentType
    /* "audio/webm" */ val AUDIO_WEBM: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_WEBM with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_OPUS extends ContentType
    /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_WEBM_CODECS_OPUS with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_VORBIS extends ContentType
    /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_WEBM_CODECS_VORBIS with String = js.native
  }
}
