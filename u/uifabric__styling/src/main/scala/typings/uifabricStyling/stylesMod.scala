package typings.uifabricStyling

import typings.uifabricMergeStyles.irawstylebaseMod.IFontWeight
import typings.uifabricMergeStyles.istyleMod.IRawStyle
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricStyling.getGlobalClassNamesMod.GlobalClassNames
import typings.uifabricStyling.ianimationstylesMod.IAnimationStyles
import typings.uifabricStyling.ianimationstylesMod.IAnimationVariables
import typings.uifabricStyling.ieffectsMod.IEffects
import typings.uifabricStyling.ifontstylesMod.IFontStyles
import typings.uifabricStyling.igetfocusstylesMod.IGetFocusStylesOptions
import typings.uifabricStyling.ipaletteMod.IPalette
import typings.uifabricStyling.ithemeMod.IPartialTheme
import typings.uifabricStyling.ithemeMod.ISchemeNames
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricStyling.uifabricStylingStrings.absolute
import typings.uifabricStyling.uifabricStylingStrings.border
import typings.uifabricStyling.uifabricStylingStrings.borderBottom
import typings.uifabricStyling.uifabricStylingStrings.horizontal
import typings.uifabricStyling.uifabricStylingStrings.relative
import typings.uifabricStyling.uifabricStylingStrings.vertical
import typings.uifabricUtilities.customizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  val AnimationStyles: IAnimationStyles = js.native
  val AnimationVariables: IAnimationVariables = js.native
  val DefaultEffects: IEffects = js.native
  val DefaultFontStyles: IFontStyles = js.native
  val DefaultPalette: IPalette = js.native
  val EdgeChromiumHighContrastSelector: /* "@media screen and (forced-colors: active)" */ String = js.native
  val HighContrastSelector: /* "@media screen and (-ms-high-contrast: active)" */ String = js.native
  val HighContrastSelectorBlack: /* "@media screen and (-ms-high-contrast: white-on-black)" */ String = js.native
  val HighContrastSelectorWhite: /* "@media screen and (-ms-high-contrast: black-on-white)" */ String = js.native
  val ScreenWidthMaxLarge: Double = js.native
  val ScreenWidthMaxMedium: Double = js.native
  val ScreenWidthMaxSmall: Double = js.native
  val ScreenWidthMaxXLarge: Double = js.native
  val ScreenWidthMaxXXLarge: Double = js.native
  val ScreenWidthMinLarge: /* 640 */ Double = js.native
  val ScreenWidthMinMedium: /* 480 */ Double = js.native
  val ScreenWidthMinSmall: /* 320 */ Double = js.native
  val ScreenWidthMinUhfMobile: /* 768 */ Double = js.native
  val ScreenWidthMinXLarge: /* 1024 */ Double = js.native
  val ScreenWidthMinXXLarge: /* 1366 */ Double = js.native
  val ScreenWidthMinXXXLarge: /* 1920 */ Double = js.native
  val ThemeSettingName: /* "theme" */ String = js.native
  val hiddenContentStyle: IRawStyle = js.native
  val noWrap: IRawStyle = js.native
  val normalize: IRawStyle = js.native
  def createFontStyles(): IFontStyles = js.native
  def createFontStyles(localeCode: String): IFontStyles = js.native
  def createTheme(theme: IPartialTheme): ITheme = js.native
  def createTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def focusClear(): IRawStyle = js.native
  def getEdgeChromiumNoHighContrastAdjustSelector(): typings.uifabricStyling.anon.EdgeChromiumHighContrastSelector = js.native
  def getFadedOverflowStyle(
    theme: ITheme,
    color: js.UndefOr[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154 */ js.Any
    ],
    direction: js.UndefOr[horizontal | vertical],
    width: js.UndefOr[String | Double],
    height: js.UndefOr[String | Double]
  ): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], color: String): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: js.UndefOr[scala.Nothing], width: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: js.UndefOr[scala.Nothing], width: Double, color: String): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: js.UndefOr[scala.Nothing], color: String): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double, color: String): IRawStyle = js.native
  def getFocusStyle(theme: ITheme): IRawStyle = js.native
  def getFocusStyle(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[relative | absolute],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  def getFocusStyle(theme: ITheme, options: IGetFocusStylesOptions): IRawStyle = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme): GlobalClassNames[T] = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): GlobalClassNames[T] = js.native
  def getInputFocusStyle(borderColor: String, borderRadius: String): IRawStyle = js.native
  def getInputFocusStyle(
    borderColor: String,
    borderRadius: String,
    borderType: js.UndefOr[scala.Nothing],
    borderPosition: Double
  ): IRawStyle = js.native
  def getInputFocusStyle(borderColor: String, borderRadius: Double): IRawStyle = js.native
  def getInputFocusStyle(
    borderColor: String,
    borderRadius: Double,
    borderType: js.UndefOr[scala.Nothing],
    borderPosition: Double
  ): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: String, borderType: border): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: String, borderType: border, borderPosition: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: Double, borderType: border): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: Double, borderType: border, borderPosition: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: String, borderType: borderBottom): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: String, borderType: borderBottom, borderPosition: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: Double, borderType: borderBottom): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: Double, borderType: borderBottom, borderPosition: Double): IRawStyle = js.native
  def getPlaceholderStyles(styles: IStyle): IStyle = js.native
  def getScreenSelector(min: Double, max: Double): String = js.native
  def getTheme(): ITheme = js.native
  def getTheme(depComments: Boolean): ITheme = js.native
  def getThemedContext(context: ICustomizerContext): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: js.UndefOr[scala.Nothing], theme: ITheme): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames, theme: ITheme): ICustomizerContext = js.native
  def loadTheme(theme: IPartialTheme): ITheme = js.native
  def loadTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def registerDefaultFontFaces(baseUrl: String): Unit = js.native
  def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  @js.native
  object FontSizes extends js.Object {
    val icon: String = js.native
    val large: String = js.native
    val medium: String = js.native
    val mediumPlus: String = js.native
    val mega: String = js.native
    val mini: String = js.native
    val small: String = js.native
    val smallPlus: String = js.native
    val superLarge: String = js.native
    val xLarge: String = js.native
    val xLargePlus: String = js.native
    val xSmall: String = js.native
    val xxLarge: String = js.native
    val xxLargePlus: String = js.native
  }
  
  @js.native
  object FontWeights extends js.Object {
    val bold: IFontWeight = js.native
    val light: IFontWeight = js.native
    val regular: IFontWeight = js.native
    val semibold: IFontWeight = js.native
    val semilight: IFontWeight = js.native
  }
  
  @js.native
  object IconFontSizes extends js.Object {
    val large: String = js.native
    val medium: String = js.native
    val small: String = js.native
    val xSmall: String = js.native
  }
  
  @js.native
  object PulsingBeaconAnimationStyles extends js.Object {
    var continuousPulseAnimationDouble: js.Function5[
        /* beaconColorOne */ String, 
        /* beaconColorTwo */ String, 
        /* innerDimension */ String, 
        /* outerDimension */ String, 
        /* borderWidth */ String, 
        String
      ] = js.native
    var continuousPulseAnimationSingle: js.Function5[
        /* beaconColorOne */ String, 
        /* beaconColorTwo */ String, 
        /* innerDimension */ String, 
        /* outerDimension */ String, 
        /* borderWidth */ String, 
        String
      ] = js.native
    var createDefaultAnimation: js.Function2[/* animationName */ String, /* delayLength */ js.UndefOr[String], IRawStyle] = js.native
  }
  
  @js.native
  object ZIndexes extends js.Object {
    val Coachmark: Double = js.native
    val FocusStyle: Double = js.native
    val KeytipLayer: Double = js.native
    val Layer: Double = js.native
    val Nav: Double = js.native
    /**
      * @deprecated ScrollablePane
      */
    val ScrollablePane: Double = js.native
  }
  
}

