package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def apply(value: String): js.UndefOr[ContainedContentType & String] = js.native
    
    @js.native
    sealed trait AUDIO_ALAW
      extends StObject
         with ContainedContentType
    /* "audio/alaw" */ val AUDIO_ALAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_ALAW & String = js.native
    
    @js.native
    sealed trait AUDIO_BASIC
      extends StObject
         with ContainedContentType
    /* "audio/basic" */ val AUDIO_BASIC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_BASIC & String = js.native
    
    @js.native
    sealed trait AUDIO_FLAC
      extends StObject
         with ContainedContentType
    /* "audio/flac" */ val AUDIO_FLAC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_FLAC & String = js.native
    
    @js.native
    sealed trait AUDIO_G729
      extends StObject
         with ContainedContentType
    /* "audio/g729" */ val AUDIO_G729: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_G729 & String = js.native
    
    @js.native
    sealed trait AUDIO_L16
      extends StObject
         with ContainedContentType
    /* "audio/l16" */ val AUDIO_L16: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_L16 & String = js.native
    
    @js.native
    sealed trait AUDIO_MP3
      extends StObject
         with ContainedContentType
    /* "audio/mp3" */ val AUDIO_MP3: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_MP3 & String = js.native
    
    @js.native
    sealed trait AUDIO_MPEG
      extends StObject
         with ContainedContentType
    /* "audio/mpeg" */ val AUDIO_MPEG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_MPEG & String = js.native
    
    @js.native
    sealed trait AUDIO_MULAW
      extends StObject
         with ContainedContentType
    /* "audio/mulaw" */ val AUDIO_MULAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_MULAW & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG
      extends StObject
         with ContainedContentType
    /* "audio/ogg" */ val AUDIO_OGG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_OGG & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_OPUS
      extends StObject
         with ContainedContentType
    /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_OGG_CODECS_OPUS & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_VORBIS
      extends StObject
         with ContainedContentType
    /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_OGG_CODECS_VORBIS & String = js.native
    
    @js.native
    sealed trait AUDIO_WAV
      extends StObject
         with ContainedContentType
    /* "audio/wav" */ val AUDIO_WAV: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WAV & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM
      extends StObject
         with ContainedContentType
    /* "audio/webm" */ val AUDIO_WEBM: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WEBM & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_OPUS
      extends StObject
         with ContainedContentType
    /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WEBM_CODECS_OPUS & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_VORBIS
      extends StObject
         with ContainedContentType
    /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType.AUDIO_WEBM_CODECS_VORBIS & String = js.native
  }
  
  @js.native
  sealed trait ContentType extends StObject
  /** For an audio-type resource, the format (MIME type) of the audio. For more information, see **Content types for audio-type resources** in the method description. For an archive-type resource, the media type of the archive file. For more information, see **Content types for archive-type resources** in the method description. */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "AddAudioConstants.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentType & String] = js.native
    
    @js.native
    sealed trait APPLICATION_GZIP
      extends StObject
         with ContentType
    /* "application/gzip" */ val APPLICATION_GZIP: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.APPLICATION_GZIP & String = js.native
    
    @js.native
    sealed trait APPLICATION_ZIP
      extends StObject
         with ContentType
    /* "application/zip" */ val APPLICATION_ZIP: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.APPLICATION_ZIP & String = js.native
    
    @js.native
    sealed trait AUDIO_ALAW
      extends StObject
         with ContentType
    /* "audio/alaw" */ val AUDIO_ALAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_ALAW & String = js.native
    
    @js.native
    sealed trait AUDIO_BASIC
      extends StObject
         with ContentType
    /* "audio/basic" */ val AUDIO_BASIC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_BASIC & String = js.native
    
    @js.native
    sealed trait AUDIO_FLAC
      extends StObject
         with ContentType
    /* "audio/flac" */ val AUDIO_FLAC: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_FLAC & String = js.native
    
    @js.native
    sealed trait AUDIO_G729
      extends StObject
         with ContentType
    /* "audio/g729" */ val AUDIO_G729: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_G729 & String = js.native
    
    @js.native
    sealed trait AUDIO_L16
      extends StObject
         with ContentType
    /* "audio/l16" */ val AUDIO_L16: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_L16 & String = js.native
    
    @js.native
    sealed trait AUDIO_MP3
      extends StObject
         with ContentType
    /* "audio/mp3" */ val AUDIO_MP3: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_MP3 & String = js.native
    
    @js.native
    sealed trait AUDIO_MPEG
      extends StObject
         with ContentType
    /* "audio/mpeg" */ val AUDIO_MPEG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_MPEG & String = js.native
    
    @js.native
    sealed trait AUDIO_MULAW
      extends StObject
         with ContentType
    /* "audio/mulaw" */ val AUDIO_MULAW: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_MULAW & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG
      extends StObject
         with ContentType
    /* "audio/ogg" */ val AUDIO_OGG: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_OGG & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_OPUS
      extends StObject
         with ContentType
    /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_OGG_CODECS_OPUS & String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_VORBIS
      extends StObject
         with ContentType
    /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_OGG_CODECS_VORBIS & String = js.native
    
    @js.native
    sealed trait AUDIO_WAV
      extends StObject
         with ContentType
    /* "audio/wav" */ val AUDIO_WAV: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_WAV & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM
      extends StObject
         with ContentType
    /* "audio/webm" */ val AUDIO_WEBM: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_WEBM & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_OPUS
      extends StObject
         with ContentType
    /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_WEBM_CODECS_OPUS & String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_VORBIS
      extends StObject
         with ContentType
    /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType.AUDIO_WEBM_CODECS_VORBIS & String = js.native
  }
}
