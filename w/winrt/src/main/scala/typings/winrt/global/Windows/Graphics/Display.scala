package typings.winrt.global.Windows.Graphics

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Graphics.Display.DisplayOrientations
import typings.winrt.Windows.Graphics.Display.ResolutionScale
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  @JSGlobal("Windows.Graphics.Display.DisplayOrientations")
  @js.native
  object DisplayOrientations extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Display.DisplayOrientations with Double] = js.native
    
    /* 1 */ val landscape: typings.winrt.Windows.Graphics.Display.DisplayOrientations.landscape with Double = js.native
    
    /* 3 */ val landscapeFlipped: typings.winrt.Windows.Graphics.Display.DisplayOrientations.landscapeFlipped with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Graphics.Display.DisplayOrientations.none with Double = js.native
    
    /* 2 */ val portrait: typings.winrt.Windows.Graphics.Display.DisplayOrientations.portrait with Double = js.native
    
    /* 4 */ val portraitFlipped: typings.winrt.Windows.Graphics.Display.DisplayOrientations.portraitFlipped with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Display.DisplayProperties")
  @js.native
  class DisplayProperties ()
    extends typings.winrt.Windows.Graphics.Display.DisplayProperties
  /* static members */
  object DisplayProperties {
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.autoRotationPreferences")
    @js.native
    def autoRotationPreferences: DisplayOrientations = js.native
    @scala.inline
    def autoRotationPreferences_=(x: DisplayOrientations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoRotationPreferences")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.currentOrientation")
    @js.native
    def currentOrientation: DisplayOrientations = js.native
    @scala.inline
    def currentOrientation_=(x: DisplayOrientations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentOrientation")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.getColorProfileAsync")
    @js.native
    def getColorProfileAsync(): IAsyncOperation[IRandomAccessStream] = js.native
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.logicalDpi")
    @js.native
    def logicalDpi: Double = js.native
    @scala.inline
    def logicalDpi_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalDpi")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.nativeOrientation")
    @js.native
    def nativeOrientation: DisplayOrientations = js.native
    @scala.inline
    def nativeOrientation_=(x: DisplayOrientations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeOrientation")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.oncolorprofilechanged")
    @js.native
    def oncolorprofilechanged: js.Any = js.native
    @scala.inline
    def oncolorprofilechanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oncolorprofilechanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.ondisplaycontentsinvalidated")
    @js.native
    def ondisplaycontentsinvalidated: js.Any = js.native
    @scala.inline
    def ondisplaycontentsinvalidated_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondisplaycontentsinvalidated")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.onlogicaldpichanged")
    @js.native
    def onlogicaldpichanged: js.Any = js.native
    @scala.inline
    def onlogicaldpichanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlogicaldpichanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.onorientationchanged")
    @js.native
    def onorientationchanged: js.Any = js.native
    @scala.inline
    def onorientationchanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onorientationchanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.onstereoenabledchanged")
    @js.native
    def onstereoenabledchanged: js.Any = js.native
    @scala.inline
    def onstereoenabledchanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onstereoenabledchanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.resolutionScale")
    @js.native
    def resolutionScale: ResolutionScale = js.native
    @scala.inline
    def resolutionScale_=(x: ResolutionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolutionScale")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.stereoEnabled")
    @js.native
    def stereoEnabled: Boolean = js.native
    @scala.inline
    def stereoEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stereoEnabled")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Display.ResolutionScale")
  @js.native
  object ResolutionScale extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Display.ResolutionScale with Double] = js.native
    
    /* 0 */ val invalid: typings.winrt.Windows.Graphics.Display.ResolutionScale.invalid with Double = js.native
    
    /* 1 */ val scale100Percent: typings.winrt.Windows.Graphics.Display.ResolutionScale.scale100Percent with Double = js.native
    
    /* 2 */ val scale140Percent: typings.winrt.Windows.Graphics.Display.ResolutionScale.scale140Percent with Double = js.native
    
    /* 3 */ val scale180Percent: typings.winrt.Windows.Graphics.Display.ResolutionScale.scale180Percent with Double = js.native
  }
}
