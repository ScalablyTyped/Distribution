package typings.winrtUwp.Windows.Graphics.Display

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets info about a display and configures their settings to support the display of your content. */
object Core {
  
  @js.native
  sealed trait HdmiDisplayColorSpace extends StObject
  @JSGlobal("Windows.Graphics.Display.Core.HdmiDisplayColorSpace")
  @js.native
  object HdmiDisplayColorSpace extends StObject {
    
    /** The ITU-R Recommendation BT.2020 is the recommended format for ultra-high-definition TV (UHDTV). */
    @js.native
    sealed trait bt2020
      extends StObject
         with HdmiDisplayColorSpace
    
    /** The ITU-R Recommendation BT.709 is the recommended format for high-definition TV (HDTV). */
    @js.native
    sealed trait bt709
      extends StObject
         with HdmiDisplayColorSpace
    
    /** Full RGB; levels are in the full range of 0-255. */
    @js.native
    sealed trait rgbFull
      extends StObject
         with HdmiDisplayColorSpace
    
    /** Limited RGB; levels are limited to 16-235. */
    @js.native
    sealed trait rgbLimited
      extends StObject
         with HdmiDisplayColorSpace
  }
  
  @js.native
  sealed trait HdmiDisplayHdrOption extends StObject
  @JSGlobal("Windows.Graphics.Display.Core.HdmiDisplayHdrOption")
  @js.native
  object HdmiDisplayHdrOption extends StObject {
    
    /** Specifies the low-latency profile for Dolby Vision. */
    @js.native
    sealed trait dolbyVisionLowLatency
      extends StObject
         with HdmiDisplayHdrOption
    
    /** Specifies an SMPTE ST 2084 electro-optical transfer function (EOTF). */
    @js.native
    sealed trait eotf2084
      extends StObject
         with HdmiDisplayHdrOption
    
    /** Specifies a standard dynamic range (SDR) electro-optical transfer function (EOTF). */
    @js.native
    sealed trait eotfSdr
      extends StObject
         with HdmiDisplayHdrOption
    
    /** Specifies no option. */
    @js.native
    sealed trait none
      extends StObject
         with HdmiDisplayHdrOption
  }
  
  @js.native
  sealed trait HdmiDisplayPixelEncoding extends StObject
  @JSGlobal("Windows.Graphics.Display.Core.HdmiDisplayPixelEncoding")
  @js.native
  object HdmiDisplayPixelEncoding extends StObject {
    
    /** Video signal is separated into the red, green, blue (RGB) components, with no color sub-sampling. */
    @js.native
    sealed trait rgb444
      extends StObject
         with HdmiDisplayPixelEncoding
    
    /** Chroma sub-sampling is done at 4:2:0. Only one chroma component is sampled on per line. This means that the two chroma components take turns to be sampled, so they are sampled on alternate lines at half the sample rate of the luma component. */
    @js.native
    sealed trait ycc420
      extends StObject
         with HdmiDisplayPixelEncoding
    
    /** Chroma sub-sampling is done at 4:2:2. The two chroma components are sampled at half the sample rate of the luma component. */
    @js.native
    sealed trait ycc422
      extends StObject
         with HdmiDisplayPixelEncoding
    
    /** Video signal is separated into the chroma (Cb and Cr) and luma (Y) components, with no chroma sub-sampling. */
    @js.native
    sealed trait ycc444
      extends StObject
         with HdmiDisplayPixelEncoding
  }
  
  trait HdmiDisplayHdr2086Metadata extends StObject {
    
    /** The X chromaticity coordinate of the blue value. */
    var bluePrimaryX: Double
    
    /** The Y chromaticity coordinate of the blue value. */
    var bluePrimaryY: Double
    
    /** The X chromaticity coordinate of the green value. */
    var greenPrimaryX: Double
    
    /** The Y chromaticity coordinate of the green value. */
    var greenPrimaryY: Double
    
    /** The maximum nit value (in units of 0.00001 nit) used anywhere in the content. */
    var maxContentLightLevel: Double
    
    /** The per-frame average of the maximum nit values (in units of 0.00001 nit). */
    var maxFrameAverageLightLevel: Double
    
    /** The maximum number of nits of the display used to master the content. Units are 0.0001 nit, so if the value is 1 nit, the value should be 10,000. */
    var maxMasteringLuminance: Double
    
    /** The minimum number of nits (in units of 0.00001 nit) of the display used to master the content. */
    var minMasteringLuminance: Double
    
    /** The X chromaticity coordinate of the red value. */
    var redPrimaryX: Double
    
    /** The Y chromaticity coordinate of the red value. */
    var redPrimaryY: Double
    
    /** The X chromaticity coordinate of the white point. */
    var whitePointX: Double
    
    /** The Y chromaticity coordinate of the white point. */
    var whitePointY: Double
  }
  object HdmiDisplayHdr2086Metadata {
    
    inline def apply(
      bluePrimaryX: Double,
      bluePrimaryY: Double,
      greenPrimaryX: Double,
      greenPrimaryY: Double,
      maxContentLightLevel: Double,
      maxFrameAverageLightLevel: Double,
      maxMasteringLuminance: Double,
      minMasteringLuminance: Double,
      redPrimaryX: Double,
      redPrimaryY: Double,
      whitePointX: Double,
      whitePointY: Double
    ): HdmiDisplayHdr2086Metadata = {
      val __obj = js.Dynamic.literal(bluePrimaryX = bluePrimaryX.asInstanceOf[js.Any], bluePrimaryY = bluePrimaryY.asInstanceOf[js.Any], greenPrimaryX = greenPrimaryX.asInstanceOf[js.Any], greenPrimaryY = greenPrimaryY.asInstanceOf[js.Any], maxContentLightLevel = maxContentLightLevel.asInstanceOf[js.Any], maxFrameAverageLightLevel = maxFrameAverageLightLevel.asInstanceOf[js.Any], maxMasteringLuminance = maxMasteringLuminance.asInstanceOf[js.Any], minMasteringLuminance = minMasteringLuminance.asInstanceOf[js.Any], redPrimaryX = redPrimaryX.asInstanceOf[js.Any], redPrimaryY = redPrimaryY.asInstanceOf[js.Any], whitePointX = whitePointX.asInstanceOf[js.Any], whitePointY = whitePointY.asInstanceOf[js.Any])
      __obj.asInstanceOf[HdmiDisplayHdr2086Metadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HdmiDisplayHdr2086Metadata] (val x: Self) extends AnyVal {
      
      inline def setBluePrimaryX(value: Double): Self = StObject.set(x, "bluePrimaryX", value.asInstanceOf[js.Any])
      
      inline def setBluePrimaryY(value: Double): Self = StObject.set(x, "bluePrimaryY", value.asInstanceOf[js.Any])
      
      inline def setGreenPrimaryX(value: Double): Self = StObject.set(x, "greenPrimaryX", value.asInstanceOf[js.Any])
      
      inline def setGreenPrimaryY(value: Double): Self = StObject.set(x, "greenPrimaryY", value.asInstanceOf[js.Any])
      
      inline def setMaxContentLightLevel(value: Double): Self = StObject.set(x, "maxContentLightLevel", value.asInstanceOf[js.Any])
      
      inline def setMaxFrameAverageLightLevel(value: Double): Self = StObject.set(x, "maxFrameAverageLightLevel", value.asInstanceOf[js.Any])
      
      inline def setMaxMasteringLuminance(value: Double): Self = StObject.set(x, "maxMasteringLuminance", value.asInstanceOf[js.Any])
      
      inline def setMinMasteringLuminance(value: Double): Self = StObject.set(x, "minMasteringLuminance", value.asInstanceOf[js.Any])
      
      inline def setRedPrimaryX(value: Double): Self = StObject.set(x, "redPrimaryX", value.asInstanceOf[js.Any])
      
      inline def setRedPrimaryY(value: Double): Self = StObject.set(x, "redPrimaryY", value.asInstanceOf[js.Any])
      
      inline def setWhitePointX(value: Double): Self = StObject.set(x, "whitePointX", value.asInstanceOf[js.Any])
      
      inline def setWhitePointY(value: Double): Self = StObject.set(x, "whitePointY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HdmiDisplayInformation extends StObject {
    
    /** Gets the HdmiDisplayMode object, which provides info about the current display mode of a connected device, like a TV. */
    def getCurrentDisplayMode(): HdmiDisplayMode = js.native
    
    /** Gets the display modes that are supported by your current display. This is determined in combination by your device type, specifications, and settings. */
    def getSupportedDisplayModes(): js.Array[HdmiDisplayMode] = js.native
    
    /** Sends request to set only the display mode for the display. */
    def requestSetCurrentDisplayModeAsync(hdmiDisplayMode: HdmiDisplayMode): js.Promise[Boolean] = js.native
    /** Sends request to set only the display mode and HDR option for the display. */
    def requestSetCurrentDisplayModeAsync(hdmiDisplayMode: HdmiDisplayMode, hdrOption: HdmiDisplayHdrOption): js.Promise[Boolean] = js.native
    /** Sends request to set the display according to the input parameters. */
    def requestSetCurrentDisplayModeAsync(
      hdmiDisplayMode: HdmiDisplayMode,
      hdrOption: HdmiDisplayHdrOption,
      hdrMetadata: HdmiDisplayHdr2086Metadata
    ): js.Promise[Boolean] = js.native
    
    /** Sets the display to the back to default settings. */
    def setDefaultDisplayModeAsync(): js.Promise[Boolean] = js.native
  }
  
  trait HdmiDisplayMode extends StObject {
    
    /** Gets the number of bits per pixel. It specifies the number of bits used in a pixel. */
    var bitsPerPixel: Double
    
    /** Gets the color space. */
    var colorSpace: HdmiDisplayColorSpace
    
    /** Indicates whether 10 bit display metadata is supported on the device. */
    var is2086MetadataSupported: Boolean
    
    /** Indicates whether the low-latency profile for Dolby Vision is supported on the device. */
    var isDolbyVisionLowLatencySupported: Boolean
    
    /** Checks to see whether the current display mode is equal to a specific display mode. */
    def isEqual(hdmiDisplayMode: HdmiDisplayMode): Boolean
    
    /** Gets the value that indicates whether standard dynamic range (SDR) luminance levels are supported by the device. */
    var isSdrLuminanceSupported: Boolean
    
    /** Gets the value that indicates whether the SMPTE (Society of Motion Picture and Television Engineers) ST 2084 electo-optical transfer function (EOTF) is supported. */
    var isSmpte2084Supported: Boolean
    
    /** Gets the type of pixel encoding the device uses for rendering display content. */
    var pixelEncoding: HdmiDisplayPixelEncoding
    
    /** Gets the device's refresh rate, in Hertz (Hz). */
    var refreshRate: Double
    
    /** Gets the device's resolution height in raw pixels. */
    var resolutionHeightInRawPixels: Double
    
    /** Gets the device's resolution width in raw pixels. */
    var resolutionWidthInRawPixels: Double
    
    /** Gets the value that indicates whether stereoscorpic 3D is enabled on the device. */
    var stereoEnabled: Boolean
  }
  object HdmiDisplayMode {
    
    inline def apply(
      bitsPerPixel: Double,
      colorSpace: HdmiDisplayColorSpace,
      is2086MetadataSupported: Boolean,
      isDolbyVisionLowLatencySupported: Boolean,
      isEqual: HdmiDisplayMode => Boolean,
      isSdrLuminanceSupported: Boolean,
      isSmpte2084Supported: Boolean,
      pixelEncoding: HdmiDisplayPixelEncoding,
      refreshRate: Double,
      resolutionHeightInRawPixels: Double,
      resolutionWidthInRawPixels: Double,
      stereoEnabled: Boolean
    ): HdmiDisplayMode = {
      val __obj = js.Dynamic.literal(bitsPerPixel = bitsPerPixel.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], is2086MetadataSupported = is2086MetadataSupported.asInstanceOf[js.Any], isDolbyVisionLowLatencySupported = isDolbyVisionLowLatencySupported.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), isSdrLuminanceSupported = isSdrLuminanceSupported.asInstanceOf[js.Any], isSmpte2084Supported = isSmpte2084Supported.asInstanceOf[js.Any], pixelEncoding = pixelEncoding.asInstanceOf[js.Any], refreshRate = refreshRate.asInstanceOf[js.Any], resolutionHeightInRawPixels = resolutionHeightInRawPixels.asInstanceOf[js.Any], resolutionWidthInRawPixels = resolutionWidthInRawPixels.asInstanceOf[js.Any], stereoEnabled = stereoEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[HdmiDisplayMode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HdmiDisplayMode] (val x: Self) extends AnyVal {
      
      inline def setBitsPerPixel(value: Double): Self = StObject.set(x, "bitsPerPixel", value.asInstanceOf[js.Any])
      
      inline def setColorSpace(value: HdmiDisplayColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
      
      inline def setIs2086MetadataSupported(value: Boolean): Self = StObject.set(x, "is2086MetadataSupported", value.asInstanceOf[js.Any])
      
      inline def setIsDolbyVisionLowLatencySupported(value: Boolean): Self = StObject.set(x, "isDolbyVisionLowLatencySupported", value.asInstanceOf[js.Any])
      
      inline def setIsEqual(value: HdmiDisplayMode => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
      
      inline def setIsSdrLuminanceSupported(value: Boolean): Self = StObject.set(x, "isSdrLuminanceSupported", value.asInstanceOf[js.Any])
      
      inline def setIsSmpte2084Supported(value: Boolean): Self = StObject.set(x, "isSmpte2084Supported", value.asInstanceOf[js.Any])
      
      inline def setPixelEncoding(value: HdmiDisplayPixelEncoding): Self = StObject.set(x, "pixelEncoding", value.asInstanceOf[js.Any])
      
      inline def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
      
      inline def setResolutionHeightInRawPixels(value: Double): Self = StObject.set(x, "resolutionHeightInRawPixels", value.asInstanceOf[js.Any])
      
      inline def setResolutionWidthInRawPixels(value: Double): Self = StObject.set(x, "resolutionWidthInRawPixels", value.asInstanceOf[js.Any])
      
      inline def setStereoEnabled(value: Boolean): Self = StObject.set(x, "stereoEnabled", value.asInstanceOf[js.Any])
    }
  }
}
