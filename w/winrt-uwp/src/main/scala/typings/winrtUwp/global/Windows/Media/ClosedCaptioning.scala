package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor
import typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect
import typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity
import typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize
import typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs for retrieving the closed caption formatting settings that the user can set through the system's closed captioning settings page. */
@JSGlobal("Windows.Media.ClosedCaptioning")
@js.native
object ClosedCaptioning extends js.Object {
  /** Exposes properties for retrieving the closed caption formatting settings that the user can set through the system's closed captioning settings page. */
  @js.native
  abstract class ClosedCaptionProperties ()
    extends typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionProperties
  
  /** Specifies the color of closed caption UI elements. */
  @js.native
  object ClosedCaptionColor extends js.Object {
    /* 2 */ val black: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.black with Double = js.native
    /* 5 */ val blue: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.blue with Double = js.native
    /* 8 */ val cyan: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.cyan with Double = js.native
    /* 0 */ val default: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.default with Double = js.native
    /* 4 */ val green: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.green with Double = js.native
    /* 7 */ val magenta: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.magenta with Double = js.native
    /* 3 */ val red: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.red with Double = js.native
    /* 1 */ val white: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.white with Double = js.native
    /* 6 */ val yellow: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.yellow with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor with Double] = js.native
  }
  
  /** Specifies the edge effect of closed caption text. */
  @js.native
  object ClosedCaptionEdgeEffect extends js.Object {
    /* 0 */ val default: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.default with Double = js.native
    /* 3 */ val depressed: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.depressed with Double = js.native
    /* 5 */ val dropShadow: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.dropShadow with Double = js.native
    /* 1 */ val none: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.none with Double = js.native
    /* 2 */ val raised: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.raised with Double = js.native
    /* 4 */ val uniform: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.uniform with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect with Double
      ] = js.native
  }
  
  /** Specifies the opacity of closed caption text. */
  @js.native
  object ClosedCaptionOpacity extends js.Object {
    /* 0 */ val default: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity.default with Double = js.native
    /* 1 */ val oneHundredPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity.oneHundredPercent with Double = js.native
    /* 2 */ val seventyFivePercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity.seventyFivePercent with Double = js.native
    /* 3 */ val twentyFivePercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity.twentyFivePercent with Double = js.native
    /* 4 */ val zeroPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity.zeroPercent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionOpacity with Double] = js.native
  }
  
  /* static members */
  @js.native
  object ClosedCaptionProperties extends js.Object {
    /** Gets the background color of lines of closed caption text. */
    var backgroundColor: ClosedCaptionColor = js.native
    /** Gets the background opacity of lines of closed caption text. */
    var backgroundOpacity: ClosedCaptionOpacity = js.native
    /** Gets the computed background color of lines of closed caption text. */
    var computedBackgroundColor: Color = js.native
    /** Gets the computed font color for closed caption text. */
    var computedFontColor: Color = js.native
    /** Gets the computed region color for closed caption text. */
    var computedRegionColor: Color = js.native
    /** Gets the font color for closed caption text. */
    var fontColor: ClosedCaptionColor = js.native
    /** Gets the font effect for closed caption text. */
    var fontEffect: ClosedCaptionEdgeEffect = js.native
    /** Gets the font opacity for closed caption text. */
    var fontOpacity: ClosedCaptionOpacity = js.native
    /** Gets the font size for closed caption text. */
    var fontSize: ClosedCaptionSize = js.native
    /** Gets the font style for closed caption text. */
    var fontStyle: ClosedCaptionStyle = js.native
    /** Gets the region color for closed caption text. */
    var regionColor: ClosedCaptionColor = js.native
    /** Gets the region opacity for closed caption text. */
    var regionOpacity: ClosedCaptionOpacity = js.native
  }
  
  /** Specifies the size of closed caption text. */
  @js.native
  object ClosedCaptionSize extends js.Object {
    /* 0 */ val default: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.default with Double = js.native
    /* 1 */ val fiftyPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.fiftyPercent with Double = js.native
    /* 3 */ val oneHundredFiftyPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.oneHundredFiftyPercent with Double = js.native
    /* 2 */ val oneHundredPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.oneHundredPercent with Double = js.native
    /* 4 */ val twoHundredPercent: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.twoHundredPercent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize with Double] = js.native
  }
  
  /** Specifies the style of closed caption text. */
  @js.native
  object ClosedCaptionStyle extends js.Object {
    /* 5 */ val casual: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.casual with Double = js.native
    /* 6 */ val cursive: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.cursive with Double = js.native
    /* 0 */ val default: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.default with Double = js.native
    /* 1 */ val monospacedWithSerifs: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.monospacedWithSerifs with Double = js.native
    /* 3 */ val monospacedWithoutSerifs: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.monospacedWithoutSerifs with Double = js.native
    /* 2 */ val proportionalWithSerifs: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.proportionalWithSerifs with Double = js.native
    /* 4 */ val proportionalWithoutSerifs: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.proportionalWithoutSerifs with Double = js.native
    /* 7 */ val smallCapitals: typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle.smallCapitals with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.ClosedCaptioning.ClosedCaptionStyle with Double] = js.native
  }
  
}

