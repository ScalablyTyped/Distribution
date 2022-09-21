package typings.winrtUwp.global.Windows.Graphics

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayColorSpace
import typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayPixelEncoding
import typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typings.winrtUwp.Windows.Graphics.Display.DisplayPropertiesEventHandler
import typings.winrtUwp.Windows.Graphics.Display.ResolutionScale
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.winrtUwpStrings.colorprofilechanged
import typings.winrtUwp.winrtUwpStrings.displaycontentsinvalidated
import typings.winrtUwp.winrtUwpStrings.logicaldpichanged
import typings.winrtUwp.winrtUwpStrings.orientationchanged
import typings.winrtUwp.winrtUwpStrings.stereoenabledchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains components to determine aspects of a physical display. */
object Display {
  
  /** Gets info about a display and configures their settings to support the display of your content. */
  object Core {
    
    @JSGlobal("Windows.Graphics.Display.Core.HdmiDisplayColorSpace")
    @js.native
    object HdmiDisplayColorSpace extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayColorSpace & Double] = js.native
      
      /* 2 */ val bt2020: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayColorSpace.bt2020 & Double = js.native
      
      /* 3 */ val bt709: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayColorSpace.bt709 & Double = js.native
      
      /* 1 */ val rgbFull: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayColorSpace.rgbFull & Double = js.native
      
      /* 0 */ val rgbLimited: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayColorSpace.rgbLimited & Double = js.native
    }
    
    @JSGlobal("Windows.Graphics.Display.Core.HdmiDisplayHdrOption")
    @js.native
    object HdmiDisplayHdrOption extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayHdrOption & Double] = js.native
      
      /* 3 */ val dolbyVisionLowLatency: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayHdrOption.dolbyVisionLowLatency & Double = js.native
      
      /* 2 */ val eotf2084: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayHdrOption.eotf2084 & Double = js.native
      
      /* 1 */ val eotfSdr: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayHdrOption.eotfSdr & Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayHdrOption.none & Double = js.native
    }
    
    @JSGlobal("Windows.Graphics.Display.Core.HdmiDisplayInformation")
    @js.native
    abstract class HdmiDisplayInformation ()
      extends StObject
         with typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayInformation
    object HdmiDisplayInformation {
      
      @JSGlobal("Windows.Graphics.Display.Core.HdmiDisplayInformation")
      @js.native
      val ^ : js.Any = js.native
      
      /** Gets the HdmiDisplayInformation object which is the display info of a video content that is currently sent to a display, like a TV or monitor. */
      /* static member */
      inline def getForCurrentView(): typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayInformation]
    }
    
    @JSGlobal("Windows.Graphics.Display.Core.HdmiDisplayMode")
    @js.native
    abstract class HdmiDisplayMode ()
      extends StObject
         with typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayMode {
      
      /** Gets the number of bits per pixel. It specifies the number of bits used in a pixel. */
      /* CompleteClass */
      var bitsPerPixel: Double = js.native
      
      /** Gets the color space. */
      /* CompleteClass */
      var colorSpace: HdmiDisplayColorSpace = js.native
      
      /** Indicates whether 10 bit display metadata is supported on the device. */
      /* CompleteClass */
      var is2086MetadataSupported: Boolean = js.native
      
      /** Indicates whether the low-latency profile for Dolby Vision is supported on the device. */
      /* CompleteClass */
      var isDolbyVisionLowLatencySupported: Boolean = js.native
      
      /** Checks to see whether the current display mode is equal to a specific display mode. */
      /* CompleteClass */
      override def isEqual(hdmiDisplayMode: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayMode): Boolean = js.native
      
      /** Gets the value that indicates whether standard dynamic range (SDR) luminance levels are supported by the device. */
      /* CompleteClass */
      var isSdrLuminanceSupported: Boolean = js.native
      
      /** Gets the value that indicates whether the SMPTE (Society of Motion Picture and Television Engineers) ST 2084 electo-optical transfer function (EOTF) is supported. */
      /* CompleteClass */
      var isSmpte2084Supported: Boolean = js.native
      
      /** Gets the type of pixel encoding the device uses for rendering display content. */
      /* CompleteClass */
      var pixelEncoding: HdmiDisplayPixelEncoding = js.native
      
      /** Gets the device's refresh rate, in Hertz (Hz). */
      /* CompleteClass */
      var refreshRate: Double = js.native
      
      /** Gets the device's resolution height in raw pixels. */
      /* CompleteClass */
      var resolutionHeightInRawPixels: Double = js.native
      
      /** Gets the device's resolution width in raw pixels. */
      /* CompleteClass */
      var resolutionWidthInRawPixels: Double = js.native
      
      /** Gets the value that indicates whether stereoscorpic 3D is enabled on the device. */
      /* CompleteClass */
      var stereoEnabled: Boolean = js.native
    }
    
    @JSGlobal("Windows.Graphics.Display.Core.HdmiDisplayPixelEncoding")
    @js.native
    object HdmiDisplayPixelEncoding extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayPixelEncoding & Double] = js.native
      
      /* 0 */ val rgb444: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayPixelEncoding.rgb444 & Double = js.native
      
      /* 3 */ val ycc420: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayPixelEncoding.ycc420 & Double = js.native
      
      /* 2 */ val ycc422: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayPixelEncoding.ycc422 & Double = js.native
      
      /* 1 */ val ycc444: typings.winrtUwp.Windows.Graphics.Display.Core.HdmiDisplayPixelEncoding.ycc444 & Double = js.native
    }
  }
  
  /** Monitors and controls physical display information. The class provides events to allow clients to monitor for changes in the display. */
  @JSGlobal("Windows.Graphics.Display.DisplayInformation")
  @js.native
  abstract class DisplayInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Display.DisplayInformation
  object DisplayInformation {
    
    @JSGlobal("Windows.Graphics.Display.DisplayInformation")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_displaycontentsinvalidated(
      `type`: displaycontentsinvalidated,
      listener: TypedEventHandler[typings.winrtUwp.Windows.Graphics.Display.DisplayInformation, Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Gets and sets the preferred orientation of the app. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayInformation.autoRotationPreferences")
    @js.native
    def autoRotationPreferences: DisplayOrientations = js.native
    inline def autoRotationPreferences_=(x: DisplayOrientations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoRotationPreferences")(x.asInstanceOf[js.Any])
    
    /**
      * Gets the current physical display information.
      * @return A DisplayInformation object that contains the current physical display information.
      */
    /* static member */
    inline def getForCurrentView(): typings.winrtUwp.Windows.Graphics.Display.DisplayInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.Graphics.Display.DisplayInformation]
    
    /** Occurs when the display requires redrawing. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayInformation.ondisplaycontentsinvalidated")
    @js.native
    def ondisplaycontentsinvalidated: TypedEventHandler[typings.winrtUwp.Windows.Graphics.Display.DisplayInformation, Any] = js.native
    inline def ondisplaycontentsinvalidated_=(x: TypedEventHandler[typings.winrtUwp.Windows.Graphics.Display.DisplayInformation, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondisplaycontentsinvalidated")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_displaycontentsinvalidated(
      `type`: displaycontentsinvalidated,
      listener: TypedEventHandler[typings.winrtUwp.Windows.Graphics.Display.DisplayInformation, Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /** Describes the orientation of a rectangular monitor. */
  @JSGlobal("Windows.Graphics.Display.DisplayOrientations")
  @js.native
  object DisplayOrientations extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations & Double] = js.native
    
    /* 1 */ val landscape: typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations.landscape & Double = js.native
    
    /* 3 */ val landscapeFlipped: typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations.landscapeFlipped & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations.none & Double = js.native
    
    /* 2 */ val portrait: typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations.portrait & Double = js.native
    
    /* 4 */ val portraitFlipped: typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations.portraitFlipped & Double = js.native
  }
  
  /** Provides various properties that are related to the physical display. */
  @JSGlobal("Windows.Graphics.Display.DisplayProperties")
  @js.native
  abstract class DisplayProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Display.DisplayProperties
  object DisplayProperties {
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_colorprofilechanged(`type`: colorprofilechanged, listener: DisplayPropertiesEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_displaycontentsinvalidated(`type`: displaycontentsinvalidated, listener: DisplayPropertiesEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_logicaldpichanged(`type`: logicaldpichanged, listener: DisplayPropertiesEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_orientationchanged(`type`: orientationchanged, listener: DisplayPropertiesEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_stereoenabledchanged(`type`: stereoenabledchanged, listener: DisplayPropertiesEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Gets and sets the preferred orientation of the app. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.autoRotationPreferences")
    @js.native
    def autoRotationPreferences: DisplayOrientations = js.native
    inline def autoRotationPreferences_=(x: DisplayOrientations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoRotationPreferences")(x.asInstanceOf[js.Any])
    
    /** Gets the current orientation of a rectangular monitor. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.currentOrientation")
    @js.native
    def currentOrientation: DisplayOrientations = js.native
    inline def currentOrientation_=(x: DisplayOrientations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentOrientation")(x.asInstanceOf[js.Any])
    
    /**
      * Asynchronously gets the default International Color Consortium (ICC) color profile that is associated with the physical display.
      * @return Object that manages the asynchronous retrieval of the color profile.
      */
    /* static member */
    inline def getColorProfileAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorProfileAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IRandomAccessStream]]
    
    /** Gets the pixels per logical inch of the current environment. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.logicalDpi")
    @js.native
    def logicalDpi: Double = js.native
    inline def logicalDpi_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalDpi")(x.asInstanceOf[js.Any])
    
    /** Gets the native orientation of the display monitor, which is typically the orientation where the buttons on the device match the orientation of the monitor. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.nativeOrientation")
    @js.native
    def nativeOrientation: DisplayOrientations = js.native
    inline def nativeOrientation_=(x: DisplayOrientations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeOrientation")(x.asInstanceOf[js.Any])
    
    /** Occurs when the physical display's color profile changes. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.oncolorprofilechanged")
    @js.native
    def oncolorprofilechanged: DisplayPropertiesEventHandler = js.native
    inline def oncolorprofilechanged_=(x: DisplayPropertiesEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oncolorprofilechanged")(x.asInstanceOf[js.Any])
    
    /** Occurs when the display requires redrawing. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.ondisplaycontentsinvalidated")
    @js.native
    def ondisplaycontentsinvalidated: DisplayPropertiesEventHandler = js.native
    inline def ondisplaycontentsinvalidated_=(x: DisplayPropertiesEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondisplaycontentsinvalidated")(x.asInstanceOf[js.Any])
    
    /** Occurs when the LogicalDpi property changes because the pixels per inch (PPI) of the display changes. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.onlogicaldpichanged")
    @js.native
    def onlogicaldpichanged: DisplayPropertiesEventHandler = js.native
    inline def onlogicaldpichanged_=(x: DisplayPropertiesEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlogicaldpichanged")(x.asInstanceOf[js.Any])
    
    /** Occurs when either the CurrentOrientation or NativeOrientation property changes because of a mode change or a monitor change. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.onorientationchanged")
    @js.native
    def onorientationchanged: DisplayPropertiesEventHandler = js.native
    inline def onorientationchanged_=(x: DisplayPropertiesEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onorientationchanged")(x.asInstanceOf[js.Any])
    
    /** Occurs when the StereoEnabled property changes because support for stereoscopic 3D changes. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.onstereoenabledchanged")
    @js.native
    def onstereoenabledchanged: DisplayPropertiesEventHandler = js.native
    inline def onstereoenabledchanged_=(x: DisplayPropertiesEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onstereoenabledchanged")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_colorprofilechanged(`type`: colorprofilechanged, listener: DisplayPropertiesEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_displaycontentsinvalidated(`type`: displaycontentsinvalidated, listener: DisplayPropertiesEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_logicaldpichanged(`type`: logicaldpichanged, listener: DisplayPropertiesEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_orientationchanged(`type`: orientationchanged, listener: DisplayPropertiesEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_stereoenabledchanged(`type`: stereoenabledchanged, listener: DisplayPropertiesEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Gets the scale factor of the immersive environment. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.resolutionScale")
    @js.native
    def resolutionScale: ResolutionScale = js.native
    inline def resolutionScale_=(x: ResolutionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolutionScale")(x.asInstanceOf[js.Any])
    
    /** Gets a value that indicates whether the device supports stereoscopic 3D. */
    /* static member */
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.stereoEnabled")
    @js.native
    def stereoEnabled: Boolean = js.native
    inline def stereoEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stereoEnabled")(x.asInstanceOf[js.Any])
  }
  
  /** Describes the scale factor of the immersive environment. The scale factor is determined by the operating system in response to high pixel density screens. */
  @JSGlobal("Windows.Graphics.Display.ResolutionScale")
  @js.native
  object ResolutionScale extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Display.ResolutionScale & Double] = js.native
    
    /* 0 */ val invalid: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.invalid & Double = js.native
    
    /* 1 */ val scale100Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale100Percent & Double = js.native
    
    /* 2 */ val scale120Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale120Percent & Double = js.native
    
    /* 3 */ val scale125Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale125Percent & Double = js.native
    
    /* 4 */ val scale140Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale140Percent & Double = js.native
    
    /* 5 */ val scale150Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale150Percent & Double = js.native
    
    /* 6 */ val scale160Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale160Percent & Double = js.native
    
    /* 7 */ val scale175Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale175Percent & Double = js.native
    
    /* 8 */ val scale180Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale180Percent & Double = js.native
    
    /* 9 */ val scale200Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale200Percent & Double = js.native
    
    /* 10 */ val scale225Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale225Percent & Double = js.native
    
    /* 11 */ val scale250Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale250Percent & Double = js.native
    
    /* 12 */ val scale300Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale300Percent & Double = js.native
    
    /* 13 */ val scale350Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale350Percent & Double = js.native
    
    /* 14 */ val scale400Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale400Percent & Double = js.native
    
    /* 15 */ val scale450Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale450Percent & Double = js.native
    
    /* 16 */ val scale500Percent: typings.winrtUwp.Windows.Graphics.Display.ResolutionScale.scale500Percent & Double = js.native
  }
}
