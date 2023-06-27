package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoManager extends StObject {
  
  /**
    * This method retrieves the plugin's version information
    *
    * @returns value of plugin's version
    *
    * @throws None N/A
    *
    * @since 6.0
    *
    * @version 1.0
    *
    */
  def getVersion(): String
  
  /**
    * This method check whether the audio codec is supported or not
    *
    * @param audiocodec audio codec type to check
    * - "MPEG" The audio codec type for MPEG
    * - "MPEG-H" The audio codec type for MPEG-H
    * - "AC3" The audio codec type for AC3
    * - "E-AC3" The audio codec type for E-AC3
    * - "AC4" The audio codec type for AC4
    * - "TrueHD" The audio codec type for TrueHD
    * - "Vorbis" The audio codec type for Vorbis
    * - "G2Cook" The audio codec type for G2Cook
    * - "AAC" The audio codec type for AAC
    * - "HE-AAC" The audio codec type for HE-AAC
    * - "WMA" The audio codec type for WMA
    * - "ADPCM" The audio codec type for ADPCM
    * - "OPUS" The audio codec type for OPUS
    * - "PCM" tHE audio codec type for PCM
    *
    * @returns value to indicate whether the audio codec is supported or not
    * - true: supported
    * - false: unsupported
    *
    * @throws WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @since 6.0
    *
    * @version 1.0
    *
    */
  def isSupportedAudioCodec(audiocodec: String): Boolean
  
  /**
    * This method check whether the video codec is supported or not
    *
    * @param videocodec video codec type to check
    * - "MPEG1" The video codec type for MPEG1
    * - "MPEG2" The video codec type for MPEG2
    * - "MPEG4" The video codec type for MPEG4
    * - "H263" The video codec type for H263
    * - "H264" The video codec type for H264
    * - "HEVC" The video codec type for HEVC
    * - "VP8" The video codec type for VP8
    * - "VP9" The video codec type for VP9
    * - "RV" The video codec type for RV
    * - "WMV" The video codec type for WMV
    * - "AVS" The video codec type for AVS
    * - "AVS_PLUS" The video codec type for AVS_PLUS
    * - "MJPEG" The video codec type for MJPEG
    * - "JPEG" The video codec type for JPEG
    * - "H264_MVC" The video codec type for H264
    * - "HEIC" The video codec type for HEIC
    * - "AVS2" The video codec type for AVS2
    * - "HEVC_VR360" The video codec type for HEVC_VR360
    * - "H264_VR360" The video codec type for H264_VR360
    * - "VP9_VR360" The video codec type for VP9_VR360
    * - "HEVC_SHVC" The video codec type for HEVC_SHVC
    * - "AV1" The video codec type for AV1
    * - "AV1_VR360" The video codec type for AV1_VR360
    *
    * @returns value to indicate whether the video codec is supported or not
    * true: supported
    * false: unsupported
    *
    * @throws WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @since 6.0
    *
    * @version 1.0
    *
    */
  def isSupportedVideoCodec(videocodec: String): Boolean
}
object SystemInfoManager {
  
  inline def apply(
    getVersion: () => String,
    isSupportedAudioCodec: String => Boolean,
    isSupportedVideoCodec: String => Boolean
  ): SystemInfoManager = {
    val __obj = js.Dynamic.literal(getVersion = js.Any.fromFunction0(getVersion), isSupportedAudioCodec = js.Any.fromFunction1(isSupportedAudioCodec), isSupportedVideoCodec = js.Any.fromFunction1(isSupportedVideoCodec))
    __obj.asInstanceOf[SystemInfoManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoManager] (val x: Self) extends AnyVal {
    
    inline def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
    
    inline def setIsSupportedAudioCodec(value: String => Boolean): Self = StObject.set(x, "isSupportedAudioCodec", js.Any.fromFunction1(value))
    
    inline def setIsSupportedVideoCodec(value: String => Boolean): Self = StObject.set(x, "isSupportedVideoCodec", js.Any.fromFunction1(value))
  }
}
