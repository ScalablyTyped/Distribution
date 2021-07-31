package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality
import typings.winrtUwp.Windows.Media.MediaProperties.MediaPixelFormat
import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes and other programming elements needed to create properties for media formats. */
object MediaProperties {
  
  /** Describes the format of an audio stream. */
  @JSGlobal("Windows.Media.MediaProperties.AudioEncodingProperties")
  @js.native
  /** Creates a new instance of the AudioEncodingProperties class. */
  class AudioEncodingProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties {
    
    /** Gets or sets the audio bit rate. */
    /* CompleteClass */
    var bitrate: Double = js.native
    
    /** Gets or sets the number of bits per audio sample. */
    /* CompleteClass */
    var bitsPerSample: Double = js.native
    
    /** Gets or sets the number of audio channels. */
    /* CompleteClass */
    var channelCount: Double = js.native
    
    /**
      * Gets the media format user data.
      * @return Receives the media format data.
      */
    /* CompleteClass */
    override def getFormatUserData(): js.Array[Double] = js.native
    
    /** Gets additional format properties for the audio stream. */
    /* CompleteClass */
    var properties: typings.winrtUwp.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /** Gets or sets audio sampling rate. */
    /* CompleteClass */
    var sampleRate: Double = js.native
    
    /**
      * Sets the media format user data.
      * @param value The media data to set.
      */
    /* CompleteClass */
    override def setFormatUserData(value: js.Array[Double]): Unit = js.native
    
    /** Gets or sets the subtype of the format. */
    /* CompleteClass */
    var subtype: String = js.native
    
    /** Gets the format type. */
    /* CompleteClass */
    var `type`: String = js.native
  }
  object AudioEncodingProperties {
    
    @JSGlobal("Windows.Media.MediaProperties.AudioEncodingProperties")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of AudioEncodingProperties for Advanced Audio Coding (AAC) audio.
      * @param sampleRate The audio sampling rate.
      * @param channelCount The number of audio channels.
      * @param bitrate The audio bit rate.
      * @return The audio encoding properties.
      */
    /* static member */
    @scala.inline
    def createAac(sampleRate: Double, channelCount: Double, bitrate: Double): typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("createAac")(sampleRate.asInstanceOf[js.Any], channelCount.asInstanceOf[js.Any], bitrate.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties]
    
    /**
      * Creates an instance of AudioEncodingProperties for Advanced Audio Coding (AAC) audio in Audio Data Transport Stream (ADTS) format.
      * @param sampleRate The audio sampling rate.
      * @param channelCount The number of audio channels.
      * @param bitrate The audio bit rate.
      * @return The audio encoding properties.
      */
    /* static member */
    @scala.inline
    def createAacAdts(sampleRate: Double, channelCount: Double, bitrate: Double): typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("createAacAdts")(sampleRate.asInstanceOf[js.Any], channelCount.asInstanceOf[js.Any], bitrate.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties]
    
    /**
      * Creates an instance of AudioEncodingProperties for MPEG Audio Layer-3 (MP3) audio.
      * @param sampleRate The audio sampling rate.
      * @param channelCount The number of audio channels.
      * @param bitrate The audio bit rate.
      * @return The audio encoding properties.
      */
    /* static member */
    @scala.inline
    def createMp3(sampleRate: Double, channelCount: Double, bitrate: Double): typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("createMp3")(sampleRate.asInstanceOf[js.Any], channelCount.asInstanceOf[js.Any], bitrate.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties]
    
    /**
      * Creates an instance of AudioEncodingProperties for Pulse Code Modulation (PCM) audio.
      * @param sampleRate The audio sampling rate.
      * @param channelCount The number of audio channels.
      * @param bitsPerSample The audio bit depth.
      * @return The audio encoding properties.
      */
    /* static member */
    @scala.inline
    def createPcm(sampleRate: Double, channelCount: Double, bitsPerSample: Double): typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("createPcm")(sampleRate.asInstanceOf[js.Any], channelCount.asInstanceOf[js.Any], bitsPerSample.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties]
    
    /**
      * Creates an instance of AudioEncodingProperties for Windows Media Audio (WMA).
      * @param sampleRate The audio sampling rate.
      * @param channelCount The number of audio channels.
      * @param bitrate The audio bit rate.
      * @return The audio encoding properties.
      */
    /* static member */
    @scala.inline
    def createWma(sampleRate: Double, channelCount: Double, bitrate: Double): typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("createWma")(sampleRate.asInstanceOf[js.Any], channelCount.asInstanceOf[js.Any], bitrate.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties]
  }
  
  /** Describes the level of quality of the audio encoding. The higher the quality, the better the audio fidelity, and the larger the resulting file. */
  @JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
  @js.native
  object AudioEncodingQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality & Double] = js.native
    
    /* 0 */ val auto: typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality.auto & Double = js.native
    
    /* 1 */ val high: typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality.high & Double = js.native
    
    /* 3 */ val low: typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality.low & Double = js.native
    
    /* 2 */ val medium: typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality.medium & Double = js.native
  }
  
  /** Describes a media container format. */
  @JSGlobal("Windows.Media.MediaProperties.ContainerEncodingProperties")
  @js.native
  /** Creates a new instance of the ContainerEncodingProperties class. */
  class ContainerEncodingProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Media.MediaProperties.ContainerEncodingProperties {
    
    /** Gets additional format properties for the media container. */
    /* CompleteClass */
    var properties: typings.winrtUwp.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /** Gets or sets the subtype of the media container. */
    /* CompleteClass */
    var subtype: String = js.native
    
    /** Gets the format type. */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /** Provides properties for getting H.265 profile ids. */
  @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds")
  @js.native
  abstract class H264ProfileIds ()
    extends StObject
       with typings.winrtUwp.Windows.Media.MediaProperties.H264ProfileIds
  object H264ProfileIds {
    
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the H.264 baseline profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds.baseline")
    @js.native
    def baseline: Double = js.native
    @scala.inline
    def baseline_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseline")(x.asInstanceOf[js.Any])
    
    /** Gets the H.264 constrained baseline profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds.constrainedBaseline")
    @js.native
    def constrainedBaseline: Double = js.native
    @scala.inline
    def constrainedBaseline_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constrainedBaseline")(x.asInstanceOf[js.Any])
    
    /** Gets the H.264 extended profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds.extended")
    @js.native
    def extended: Double = js.native
    @scala.inline
    def extended_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extended")(x.asInstanceOf[js.Any])
    
    /** Gets the H.264 high profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds.high")
    @js.native
    def high: Double = js.native
    
    /** Gets the H.264 high 10 profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds.high10")
    @js.native
    def high10: Double = js.native
    @scala.inline
    def high10_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("high10")(x.asInstanceOf[js.Any])
    
    /** Gets the H.264 high 4:2:2 profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds.high422")
    @js.native
    def high422: Double = js.native
    @scala.inline
    def high422_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("high422")(x.asInstanceOf[js.Any])
    
    /** Gets the H.264 high 4:4:4 profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds.high444")
    @js.native
    def high444: Double = js.native
    @scala.inline
    def high444_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("high444")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def high_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("high")(x.asInstanceOf[js.Any])
    
    /** Gets the H.264 main profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds.main")
    @js.native
    def main: Double = js.native
    @scala.inline
    def main_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("main")(x.asInstanceOf[js.Any])
    
    /** Gets the H.264 multiview profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds.multiviewHigh")
    @js.native
    def multiviewHigh: Double = js.native
    @scala.inline
    def multiviewHigh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiviewHigh")(x.asInstanceOf[js.Any])
    
    /** Gets the H.264 stereo high profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.H264ProfileIds.stereoHigh")
    @js.native
    def stereoHigh: Double = js.native
    @scala.inline
    def stereoHigh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stereoHigh")(x.asInstanceOf[js.Any])
  }
  
  /** Describes the format of an image stream. */
  @JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
  @js.native
  /** Creates a new instance of the ImageEncodingProperties class. */
  class ImageEncodingProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties {
    
    /** Gets or sets the image height. */
    /* CompleteClass */
    var height: Double = js.native
    
    /** Gets additional format properties for the image stream. */
    /* CompleteClass */
    var properties: typings.winrtUwp.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /** Gets or sets the subtype of the format. */
    /* CompleteClass */
    var subtype: String = js.native
    
    /** Gets the format type. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** Gets or sets the image width. */
    /* CompleteClass */
    var width: Double = js.native
  }
  object ImageEncodingProperties {
    
    @JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of ImageEncodingProperties for a BMP image.
      * @return The image encoding properties.
      */
    /* static member */
    @scala.inline
    def createBmp(): typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createBmp")().asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties]
    
    /**
      * Creates an instance of ImageEncodingProperties for a JPEG image.
      * @return The properties for the image stream.
      */
    /* static member */
    @scala.inline
    def createJpeg(): typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createJpeg")().asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties]
    
    /**
      * Creates an instance of ImageEncodingProperties for a JPEG XR image.
      * @return The properties for the image stream.
      */
    /* static member */
    @scala.inline
    def createJpegXR(): typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createJpegXR")().asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties]
    
    /**
      * Creates an instance of ImageEncodingProperties for a PNG image.
      * @return The properties for the image stream.
      */
    /* static member */
    @scala.inline
    def createPng(): typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createPng")().asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties]
    
    /**
      * Creates an instance of ImageEncodingProperties for an uncompressed image.
      * @param format The media pixel format.
      * @return The image encoding properties.
      */
    /* static member */
    @scala.inline
    def createUncompressed(format: MediaPixelFormat): typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createUncompressed")(format.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties]
  }
  
  /** Describes the encoding profile for an audio or video file. The encoding profile includes descriptions of the audio and video encoding formats, and a description of the media container. */
  @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
  @js.native
  /** Creates a new instance of the MediaEncodingProfile class. */
  class MediaEncodingProfile ()
    extends StObject
       with typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile {
    
    /** Gets or sets the encoding properties for the audio stream. */
    /* CompleteClass */
    var audio: typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = js.native
    
    /** Gets or sets the properties of the media container. */
    /* CompleteClass */
    var container: typings.winrtUwp.Windows.Media.MediaProperties.ContainerEncodingProperties = js.native
    
    /** Gets or sets the encoding properties for the video stream. */
    /* CompleteClass */
    var video: typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties = js.native
  }
  object MediaEncodingProfile {
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of MediaEncodingProfile for AVI.
      * @param quality The video quality.
      * @return The media encoding profile.
      */
    /* static member */
    @scala.inline
    def createAvi(quality: VideoEncodingQuality): typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createAvi")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    /**
      * Creates an encoding profile from an existing media file.
      * @param file The media file from which to create the profile.
      * @return An object that is used to control the asynchronous operation.
      */
    /* static member */
    @scala.inline
    def createFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile]]
    
    /**
      * Creates an encoding profile from a stream that contains media data.
      * @param stream The media stream from which to create the profile.
      * @return An object that is used to control the asynchronous operation.
      */
    /* static member */
    @scala.inline
    def createFromStreamAsync(stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromStreamAsync")(stream.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile]]
    
    /**
      * Creates an encoding profile for AAC audio.
      * @param quality Specifies whether to create a profile with a low bit rate, medium bit rate, or high bit rate.
      * @return Returns a media encoding profile.
      */
    /* static member */
    @scala.inline
    def createM4a(quality: AudioEncodingQuality): typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createM4a")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    /**
      * Creates an encoding profile for MP3 (MPEG-1 layer 3) audio.
      * @param quality Specifies whether to create a profile with a low bit rate, medium bit rate, or high bit rate.
      * @return Returns a media encoding profile.
      */
    /* static member */
    @scala.inline
    def createMp3(quality: AudioEncodingQuality): typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createMp3")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    /**
      * Creates an encoding profile for H.264 video.
      * @param quality Specifies the video resolution of the profile.
      * @return Returns a media encoding profile.
      */
    /* static member */
    @scala.inline
    def createMp4(quality: VideoEncodingQuality): typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createMp4")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    /**
      * Creates an instance of MediaEncodingProfile for WAV
      * @param quality The audio encoding quality.
      * @return The media encoding profile.
      */
    /* static member */
    @scala.inline
    def createWav(quality: AudioEncodingQuality): typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createWav")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    /**
      * Creates an encoding profile for Windows Media Audio (WMA).
      * @param quality Specifies whether to create a profile with a low bit rate, medium bit rate, or high bit rate.
      * @return Returns a media encoding profile.
      */
    /* static member */
    @scala.inline
    def createWma(quality: AudioEncodingQuality): typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createWma")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    /**
      * Creates an encoding profile for Windows Media Video (WMV).
      * @param quality Specifies the video resolution of the profile.
      * @return Returns a media encoding profile.
      */
    /* static member */
    @scala.inline
    def createWmv(quality: VideoEncodingQuality): typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createWmv")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile]
  }
  
  /** Provides properties for getting the standard names for media subtypes. */
  @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes")
  @js.native
  abstract class MediaEncodingSubtypes ()
    extends StObject
       with typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingSubtypes
  object MediaEncodingSubtypes {
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the name for Advanced Audio Coding (AAC). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.aac")
    @js.native
    def aac: String = js.native
    
    /** Gets the name for Advanced Audio Coding (AAC) audio in Audio Data Transport Stream (ADTS) format. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.aacAdts")
    @js.native
    def aacAdts: String = js.native
    @scala.inline
    def aacAdts_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aacAdts")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def aac_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aac")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Dolby Digital audio (AC-3). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.ac3")
    @js.native
    def ac3: String = js.native
    @scala.inline
    def ac3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ac3")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Adaptive Multi-Rate (AmrNb). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.amrNb")
    @js.native
    def amrNb: String = js.native
    @scala.inline
    def amrNb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amrNb")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Adaptive Multi-Rate Wideband. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.amrWb")
    @js.native
    def amrWb: String = js.native
    @scala.inline
    def amrWb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amrWb")(x.asInstanceOf[js.Any])
    
    /** Gets the name for RGB 32 with alpha channel. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.argb32")
    @js.native
    def argb32: String = js.native
    @scala.inline
    def argb32_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("argb32")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Advanced Systems Format (ASF). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.asf")
    @js.native
    def asf: String = js.native
    @scala.inline
    def asf_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asf")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Audio Video Interleave (AVI). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.avi")
    @js.native
    def avi: String = js.native
    @scala.inline
    def avi_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("avi")(x.asInstanceOf[js.Any])
    
    /** Gets the name for BGRA8. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.bgra8")
    @js.native
    def bgra8: String = js.native
    @scala.inline
    def bgra8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bgra8")(x.asInstanceOf[js.Any])
    
    /** Gets the name for BMP file format. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.bmp")
    @js.native
    def bmp: String = js.native
    @scala.inline
    def bmp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmp")(x.asInstanceOf[js.Any])
    
    /** Gets the name Dolby Digital Plus (E-AC-3). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.eac3")
    @js.native
    def eac3: String = js.native
    @scala.inline
    def eac3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eac3")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Uncompressed IEEE floating-point audio. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.float")
    @js.native
    def float: String = js.native
    @scala.inline
    def float_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Graphics Interchange Format (GIF). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.gif")
    @js.native
    def gif: String = js.native
    @scala.inline
    def gif_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gif")(x.asInstanceOf[js.Any])
    
    /** Gets the name for H.263. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.h263")
    @js.native
    def h263: String = js.native
    @scala.inline
    def h263_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h263")(x.asInstanceOf[js.Any])
    
    /** The name for H.264. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.h264")
    @js.native
    def h264: String = js.native
    
    /** Get the name for H.264Es. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.h264Es")
    @js.native
    def h264Es: String = js.native
    @scala.inline
    def h264Es_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h264Es")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def h264_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h264")(x.asInstanceOf[js.Any])
    
    /** Gets the name for High Efficiency Video Coding (HEVC). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.hevc")
    @js.native
    def hevc: String = js.native
    
    /** Gets the name for HEVCES. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.hevcEs")
    @js.native
    def hevcEs: String = js.native
    @scala.inline
    def hevcEs_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hevcEs")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hevc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hevc")(x.asInstanceOf[js.Any])
    
    /** Gets the name for IYUV. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.iyuv")
    @js.native
    def iyuv: String = js.native
    @scala.inline
    def iyuv_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iyuv")(x.asInstanceOf[js.Any])
    
    /** Gets the name for JPEG. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.jpeg")
    @js.native
    def jpeg: String = js.native
    
    /** Gets the name for JPEG-XR. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.jpegXr")
    @js.native
    def jpegXr: String = js.native
    @scala.inline
    def jpegXr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXr")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def jpeg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpeg")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Motion JPEG (MJPG). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.mjpg")
    @js.native
    def mjpg: String = js.native
    @scala.inline
    def mjpg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mjpg")(x.asInstanceOf[js.Any])
    
    /** Gete the name for MPEG Audio Layer-3 (MP3). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.mp3")
    @js.native
    def mp3: String = js.native
    @scala.inline
    def mp3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mp3")(x.asInstanceOf[js.Any])
    
    /** Gets the name for MPEG. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.mpeg")
    @js.native
    def mpeg: String = js.native
    
    /** Gets the name for MPEG-1. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.mpeg1")
    @js.native
    def mpeg1: String = js.native
    @scala.inline
    def mpeg1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mpeg1")(x.asInstanceOf[js.Any])
    
    /** Gets the name for MPEG-2. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.mpeg2")
    @js.native
    def mpeg2: String = js.native
    @scala.inline
    def mpeg2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mpeg2")(x.asInstanceOf[js.Any])
    
    /** Gets the name for MPEG-4. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.mpeg4")
    @js.native
    def mpeg4: String = js.native
    @scala.inline
    def mpeg4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mpeg4")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def mpeg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mpeg")(x.asInstanceOf[js.Any])
    
    /** Gets the name for NV12. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.nv12")
    @js.native
    def nv12: String = js.native
    @scala.inline
    def nv12_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nv12")(x.asInstanceOf[js.Any])
    
    /** Gets the name for PCM. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.pcm")
    @js.native
    def pcm: String = js.native
    @scala.inline
    def pcm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pcm")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Portable Network Graphics (PNG). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.png")
    @js.native
    def png: String = js.native
    @scala.inline
    def png_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("png")(x.asInstanceOf[js.Any])
    
    /** Gets the name RGB 24. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.rgb24")
    @js.native
    def rgb24: String = js.native
    @scala.inline
    def rgb24_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rgb24")(x.asInstanceOf[js.Any])
    
    /** Gets the name for RGB 32. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.rgb32")
    @js.native
    def rgb32: String = js.native
    @scala.inline
    def rgb32_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rgb32")(x.asInstanceOf[js.Any])
    
    /** Gets the name for TIFF. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.tiff")
    @js.native
    def tiff: String = js.native
    @scala.inline
    def tiff_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiff")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Waveform Audio File (WAVE). */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.wave")
    @js.native
    def wave: String = js.native
    @scala.inline
    def wave_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wave")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Windows Media Audio 8. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.wma8")
    @js.native
    def wma8: String = js.native
    @scala.inline
    def wma8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wma8")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Windows Media Audio 8. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.wma9")
    @js.native
    def wma9: String = js.native
    @scala.inline
    def wma9_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wma9")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Windows Media Video 9. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.wmv3")
    @js.native
    def wmv3: String = js.native
    @scala.inline
    def wmv3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wmv3")(x.asInstanceOf[js.Any])
    
    /** Gets the name for Windows Media Video 9 Advanced Profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.wvc1")
    @js.native
    def wvc1: String = js.native
    @scala.inline
    def wvc1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wvc1")(x.asInstanceOf[js.Any])
    
    /** Gets the name for YUY2. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.yuy2")
    @js.native
    def yuy2: String = js.native
    @scala.inline
    def yuy2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yuy2")(x.asInstanceOf[js.Any])
    
    /** Gets the name for YV12. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingSubtypes.yv12")
    @js.native
    def yv12: String = js.native
    @scala.inline
    def yv12_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yv12")(x.asInstanceOf[js.Any])
  }
  
  /** Defines the direction in of a mirror transform. */
  @JSGlobal("Windows.Media.MediaProperties.MediaMirroringOptions")
  @js.native
  object MediaMirroringOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.MediaProperties.MediaMirroringOptions & Double] = js.native
    
    /* 1 */ val horizontal: typings.winrtUwp.Windows.Media.MediaProperties.MediaMirroringOptions.horizontal & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Media.MediaProperties.MediaMirroringOptions.none & Double = js.native
    
    /* 2 */ val vertical: typings.winrtUwp.Windows.Media.MediaProperties.MediaMirroringOptions.vertical & Double = js.native
  }
  
  /** Defines values for media pixel formats. */
  @JSGlobal("Windows.Media.MediaProperties.MediaPixelFormat")
  @js.native
  object MediaPixelFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.MediaProperties.MediaPixelFormat & Double] = js.native
    
    /* 1 */ val bgra8: typings.winrtUwp.Windows.Media.MediaProperties.MediaPixelFormat.bgra8 & Double = js.native
    
    /* 0 */ val nv12: typings.winrtUwp.Windows.Media.MediaProperties.MediaPixelFormat.nv12 & Double = js.native
  }
  
  /** Represents a set of media properties. */
  @JSGlobal("Windows.Media.MediaProperties.MediaPropertySet")
  @js.native
  /** Creates an instance for MediaPropertySet . */
  class MediaPropertySet ()
    extends StObject
       with typings.winrtUwp.Windows.Media.MediaProperties.MediaPropertySet
  
  /** Represents ratios used in media operations. */
  @JSGlobal("Windows.Media.MediaProperties.MediaRatio")
  @js.native
  abstract class MediaRatio ()
    extends StObject
       with typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio {
    
    /** The denominator of the MediaRatio. */
    /* CompleteClass */
    var denominator: Double = js.native
    
    /** The numerator of the MediaRatio. */
    /* CompleteClass */
    var numerator: Double = js.native
  }
  
  /** Defines the direction and angle of a media rotation transform. */
  @JSGlobal("Windows.Media.MediaProperties.MediaRotation")
  @js.native
  object MediaRotation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.MediaProperties.MediaRotation & Double] = js.native
    
    /* 2 */ val clockwise180Degrees: typings.winrtUwp.Windows.Media.MediaProperties.MediaRotation.clockwise180Degrees & Double = js.native
    
    /* 3 */ val clockwise270Degrees: typings.winrtUwp.Windows.Media.MediaProperties.MediaRotation.clockwise270Degrees & Double = js.native
    
    /* 1 */ val clockwise90Degrees: typings.winrtUwp.Windows.Media.MediaProperties.MediaRotation.clockwise90Degrees & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Media.MediaProperties.MediaRotation.none & Double = js.native
  }
  
  /** Defines values for media formats for thumbnails. */
  @JSGlobal("Windows.Media.MediaProperties.MediaThumbnailFormat")
  @js.native
  object MediaThumbnailFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat & Double] = js.native
    
    /* 1 */ val bgra8: typings.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat.bgra8 & Double = js.native
    
    /* 0 */ val bmp: typings.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat.bmp & Double = js.native
  }
  
  /** Provides properties for getting MPEG-2 profile ids. */
  @JSGlobal("Windows.Media.MediaProperties.Mpeg2ProfileIds")
  @js.native
  abstract class Mpeg2ProfileIds ()
    extends StObject
       with typings.winrtUwp.Windows.Media.MediaProperties.Mpeg2ProfileIds
  object Mpeg2ProfileIds {
    
    @JSGlobal("Windows.Media.MediaProperties.Mpeg2ProfileIds")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the MPEG-2 high profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.Mpeg2ProfileIds.high")
    @js.native
    def high: Double = js.native
    @scala.inline
    def high_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("high")(x.asInstanceOf[js.Any])
    
    /** Gets the MPEG-2 main profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.Mpeg2ProfileIds.main")
    @js.native
    def main: Double = js.native
    @scala.inline
    def main_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("main")(x.asInstanceOf[js.Any])
    
    /** Gets the MPEG-2 signal to noise ratio scalable profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.Mpeg2ProfileIds.signalNoiseRatioScalable")
    @js.native
    def signalNoiseRatioScalable: Double = js.native
    @scala.inline
    def signalNoiseRatioScalable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signalNoiseRatioScalable")(x.asInstanceOf[js.Any])
    
    /** Gets the MPEG-2 simple profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.Mpeg2ProfileIds.simple")
    @js.native
    def simple: Double = js.native
    @scala.inline
    def simple_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("simple")(x.asInstanceOf[js.Any])
    
    /** Gets the MPEG-2 spatially scalable profile. */
    /* static member */
    @JSGlobal("Windows.Media.MediaProperties.Mpeg2ProfileIds.spatiallyScalable")
    @js.native
    def spatiallyScalable: Double = js.native
    @scala.inline
    def spatiallyScalable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spatiallyScalable")(x.asInstanceOf[js.Any])
  }
  
  /** Describes the format of a video stream. */
  @JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
  @js.native
  /** Creates a new instance of the VideoEncodingProperties class. */
  class VideoEncodingProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties {
    
    /** Gets or sets the video bit rate. */
    /* CompleteClass */
    var bitrate: Double = js.native
    
    /** Gets or sets the video frame rate. */
    /* CompleteClass */
    var frameRate: typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio = js.native
    
    /**
      * Gets the media format user data.
      * @return Receives the media format data.
      */
    /* CompleteClass */
    override def getFormatUserData(): js.Array[Double] = js.native
    
    /** Gets or sets the video image height. */
    /* CompleteClass */
    var height: Double = js.native
    
    /** Gets or sets the pixel aspect ratio. */
    /* CompleteClass */
    var pixelAspectRatio: typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio = js.native
    
    /** Gets or sets the media format profile. */
    /* CompleteClass */
    var profileId: Double = js.native
    
    /** Gets additional format properties for the video stream. */
    /* CompleteClass */
    var properties: typings.winrtUwp.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /**
      * Sets the media format user data.
      * @param value The media data to set.
      */
    /* CompleteClass */
    override def setFormatUserData(value: js.Array[Double]): Unit = js.native
    
    /** Gets or sets the subtype of the format. */
    /* CompleteClass */
    var subtype: String = js.native
    
    /** Gets the format type. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** Gets or sets the video image width. */
    /* CompleteClass */
    var width: Double = js.native
  }
  object VideoEncodingProperties {
    
    @JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of VideoEncodingProperties for a H.263 video.
      * @return The video encoding properties.
      */
    /* static member */
    @scala.inline
    def createH264(): typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createH264")().asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties]
    
    /**
      * Creates an instance of VideoEncodingProperties for a MPEG-2 video.
      * @return The video encoding properties.
      */
    /* static member */
    @scala.inline
    def createMpeg2(): typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createMpeg2")().asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties]
    
    /**
      * Creates an instance of VideoEncodingProperties for a uncompressed video.
      * @param subtype The media subtype of the format.
      * @param width The video image width.
      * @param height The video image height.
      * @return The video encoding properties.
      */
    /* static member */
    @scala.inline
    def createUncompressed(subtype: String, width: Double, height: Double): typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("createUncompressed")(subtype.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties]
  }
  
  /** Determines the video encoding format. */
  @JSGlobal("Windows.Media.MediaProperties.VideoEncodingQuality")
  @js.native
  object VideoEncodingQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality & Double] = js.native
    
    /* 0 */ val auto: typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality.auto & Double = js.native
    
    /* 1 */ val hd1080p: typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality.hd1080p & Double = js.native
    
    /* 2 */ val hd720p: typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality.hd720p & Double = js.native
    
    /* 4 */ val ntsc: typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality.ntsc & Double = js.native
    
    /* 5 */ val pal: typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality.pal & Double = js.native
    
    /* 7 */ val qvga: typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality.qvga & Double = js.native
    
    /* 6 */ val vga: typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality.vga & Double = js.native
    
    /* 3 */ val wvga: typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality.wvga & Double = js.native
  }
}
