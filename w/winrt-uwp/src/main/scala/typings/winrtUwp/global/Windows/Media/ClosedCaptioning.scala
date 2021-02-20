package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor
import typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect
import typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity
import typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize
import typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for retrieving the closed caption formatting settings that the user can set through the system's closed captioning settings page. */
object ClosedCaptioning {
  
  /** Specifies the color of closed caption UI elements. */
  @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionColor")
  @js.native
  object ClosedCaptionColor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.default with Double = js.native
    
    /* 2 */ val black: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.black with Double = js.native
    
    /* 5 */ val blue: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.blue with Double = js.native
    
    /* 8 */ val cyan: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.cyan with Double = js.native
    
    /* 4 */ val green: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.green with Double = js.native
    
    /* 7 */ val magenta: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.magenta with Double = js.native
    
    /* 3 */ val red: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.red with Double = js.native
    
    /* 1 */ val white: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.white with Double = js.native
    
    /* 6 */ val yellow: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.yellow with Double = js.native
  }
  
  /** Specifies the edge effect of closed caption text. */
  @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect")
  @js.native
  object ClosedCaptionEdgeEffect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect with Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.default with Double = js.native
    
    /* 3 */ val depressed: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.depressed with Double = js.native
    
    /* 5 */ val dropShadow: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.dropShadow with Double = js.native
    
    /* 1 */ val none: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.none with Double = js.native
    
    /* 2 */ val raised: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.raised with Double = js.native
    
    /* 4 */ val uniform: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.uniform with Double = js.native
  }
  
  /** Specifies the opacity of closed caption text. */
  @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionOpacity")
  @js.native
  object ClosedCaptionOpacity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity.default with Double = js.native
    
    /* 1 */ val oneHundredPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity.oneHundredPercent with Double = js.native
    
    /* 2 */ val seventyFivePercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity.seventyFivePercent with Double = js.native
    
    /* 3 */ val twentyFivePercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity.twentyFivePercent with Double = js.native
    
    /* 4 */ val zeroPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity.zeroPercent with Double = js.native
  }
  
  /** Exposes properties for retrieving the closed caption formatting settings that the user can set through the system's closed captioning settings page. */
  @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties")
  @js.native
  abstract class ClosedCaptionProperties ()
    extends typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionProperties
  object ClosedCaptionProperties {
    
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the background color of lines of closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.backgroundColor")
    @js.native
    def backgroundColor: ClosedCaptionColor = js.native
    @scala.inline
    def backgroundColor_=(x: ClosedCaptionColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
    
    /** Gets the background opacity of lines of closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.backgroundOpacity")
    @js.native
    def backgroundOpacity: ClosedCaptionOpacity = js.native
    @scala.inline
    def backgroundOpacity_=(x: ClosedCaptionOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundOpacity")(x.asInstanceOf[js.Any])
    
    /** Gets the computed background color of lines of closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.computedBackgroundColor")
    @js.native
    def computedBackgroundColor: Color = js.native
    @scala.inline
    def computedBackgroundColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("computedBackgroundColor")(x.asInstanceOf[js.Any])
    
    /** Gets the computed font color for closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.computedFontColor")
    @js.native
    def computedFontColor: Color = js.native
    @scala.inline
    def computedFontColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("computedFontColor")(x.asInstanceOf[js.Any])
    
    /** Gets the computed region color for closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.computedRegionColor")
    @js.native
    def computedRegionColor: Color = js.native
    @scala.inline
    def computedRegionColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("computedRegionColor")(x.asInstanceOf[js.Any])
    
    /** Gets the font color for closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.fontColor")
    @js.native
    def fontColor: ClosedCaptionColor = js.native
    @scala.inline
    def fontColor_=(x: ClosedCaptionColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(x.asInstanceOf[js.Any])
    
    /** Gets the font effect for closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.fontEffect")
    @js.native
    def fontEffect: ClosedCaptionEdgeEffect = js.native
    @scala.inline
    def fontEffect_=(x: ClosedCaptionEdgeEffect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontEffect")(x.asInstanceOf[js.Any])
    
    /** Gets the font opacity for closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.fontOpacity")
    @js.native
    def fontOpacity: ClosedCaptionOpacity = js.native
    @scala.inline
    def fontOpacity_=(x: ClosedCaptionOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontOpacity")(x.asInstanceOf[js.Any])
    
    /** Gets the font size for closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.fontSize")
    @js.native
    def fontSize: ClosedCaptionSize = js.native
    @scala.inline
    def fontSize_=(x: ClosedCaptionSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(x.asInstanceOf[js.Any])
    
    /** Gets the font style for closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.fontStyle")
    @js.native
    def fontStyle: ClosedCaptionStyle = js.native
    @scala.inline
    def fontStyle_=(x: ClosedCaptionStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(x.asInstanceOf[js.Any])
    
    /** Gets the region color for closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.regionColor")
    @js.native
    def regionColor: ClosedCaptionColor = js.native
    @scala.inline
    def regionColor_=(x: ClosedCaptionColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regionColor")(x.asInstanceOf[js.Any])
    
    /** Gets the region opacity for closed caption text. */
    /* static member */
    @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties.regionOpacity")
    @js.native
    def regionOpacity: ClosedCaptionOpacity = js.native
    @scala.inline
    def regionOpacity_=(x: ClosedCaptionOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regionOpacity")(x.asInstanceOf[js.Any])
  }
  
  /** Specifies the size of closed caption text. */
  @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionSize")
  @js.native
  object ClosedCaptionSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.default with Double = js.native
    
    /* 1 */ val fiftyPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.fiftyPercent with Double = js.native
    
    /* 3 */ val oneHundredFiftyPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.oneHundredFiftyPercent with Double = js.native
    
    /* 2 */ val oneHundredPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.oneHundredPercent with Double = js.native
    
    /* 4 */ val twoHundredPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.twoHundredPercent with Double = js.native
  }
  
  /** Specifies the style of closed caption text. */
  @JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionStyle")
  @js.native
  object ClosedCaptionStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.default with Double = js.native
    
    /* 5 */ val casual: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.casual with Double = js.native
    
    /* 6 */ val cursive: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.cursive with Double = js.native
    
    /* 1 */ val monospacedWithSerifs: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.monospacedWithSerifs with Double = js.native
    
    /* 3 */ val monospacedWithoutSerifs: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.monospacedWithoutSerifs with Double = js.native
    
    /* 2 */ val proportionalWithSerifs: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.proportionalWithSerifs with Double = js.native
    
    /* 4 */ val proportionalWithoutSerifs: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.proportionalWithoutSerifs with Double = js.native
    
    /* 7 */ val smallCapitals: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.smallCapitals with Double = js.native
  }
}
