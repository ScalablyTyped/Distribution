package typings.uifabricStyling

import typings.std.Partial
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
import typings.uifabricStyling.uifabricStylingNumbers.`1024`
import typings.uifabricStyling.uifabricStylingNumbers.`1366`
import typings.uifabricStyling.uifabricStylingNumbers.`1920`
import typings.uifabricStyling.uifabricStylingNumbers.`320`
import typings.uifabricStyling.uifabricStylingNumbers.`480`
import typings.uifabricStyling.uifabricStylingNumbers.`640`
import typings.uifabricStyling.uifabricStylingNumbers.`768`
import typings.uifabricStyling.uifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon activeRightparenthesis`
import typings.uifabricStyling.uifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon black-on-whiteRightparenthesis`
import typings.uifabricStyling.uifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon white-on-blackRightparenthesis`
import typings.uifabricStyling.uifabricStylingStrings.absolute
import typings.uifabricStyling.uifabricStylingStrings.accent
import typings.uifabricStyling.uifabricStylingStrings.black
import typings.uifabricStyling.uifabricStylingStrings.blackTranslucent40
import typings.uifabricStyling.uifabricStylingStrings.blue
import typings.uifabricStyling.uifabricStylingStrings.blueDark
import typings.uifabricStyling.uifabricStylingStrings.blueLight
import typings.uifabricStyling.uifabricStylingStrings.blueMid
import typings.uifabricStyling.uifabricStylingStrings.border
import typings.uifabricStyling.uifabricStylingStrings.borderBottom
import typings.uifabricStyling.uifabricStylingStrings.green
import typings.uifabricStyling.uifabricStylingStrings.greenDark
import typings.uifabricStyling.uifabricStylingStrings.greenLight
import typings.uifabricStyling.uifabricStylingStrings.horizontal
import typings.uifabricStyling.uifabricStylingStrings.magenta
import typings.uifabricStyling.uifabricStylingStrings.magentaDark
import typings.uifabricStyling.uifabricStylingStrings.magentaLight
import typings.uifabricStyling.uifabricStylingStrings.neutralDark
import typings.uifabricStyling.uifabricStylingStrings.neutralLight
import typings.uifabricStyling.uifabricStylingStrings.neutralLighter
import typings.uifabricStyling.uifabricStylingStrings.neutralLighterAlt
import typings.uifabricStyling.uifabricStylingStrings.neutralPrimary
import typings.uifabricStyling.uifabricStylingStrings.neutralPrimaryAlt
import typings.uifabricStyling.uifabricStylingStrings.neutralQuaternary
import typings.uifabricStyling.uifabricStylingStrings.neutralQuaternaryAlt
import typings.uifabricStyling.uifabricStylingStrings.neutralSecondary
import typings.uifabricStyling.uifabricStylingStrings.neutralSecondaryAlt
import typings.uifabricStyling.uifabricStylingStrings.neutralTertiary
import typings.uifabricStyling.uifabricStylingStrings.neutralTertiaryAlt
import typings.uifabricStyling.uifabricStylingStrings.orange
import typings.uifabricStyling.uifabricStylingStrings.orangeLight
import typings.uifabricStyling.uifabricStylingStrings.orangeLighter
import typings.uifabricStyling.uifabricStylingStrings.purple
import typings.uifabricStyling.uifabricStylingStrings.purpleDark
import typings.uifabricStyling.uifabricStylingStrings.purpleLight
import typings.uifabricStyling.uifabricStylingStrings.red
import typings.uifabricStyling.uifabricStylingStrings.redDark
import typings.uifabricStyling.uifabricStylingStrings.relative
import typings.uifabricStyling.uifabricStylingStrings.teal
import typings.uifabricStyling.uifabricStylingStrings.tealDark
import typings.uifabricStyling.uifabricStylingStrings.tealLight
import typings.uifabricStyling.uifabricStylingStrings.theme
import typings.uifabricStyling.uifabricStylingStrings.themeDark
import typings.uifabricStyling.uifabricStylingStrings.themeDarkAlt
import typings.uifabricStyling.uifabricStylingStrings.themeDarker
import typings.uifabricStyling.uifabricStylingStrings.themeLight
import typings.uifabricStyling.uifabricStylingStrings.themeLighter
import typings.uifabricStyling.uifabricStylingStrings.themeLighterAlt
import typings.uifabricStyling.uifabricStylingStrings.themePrimary
import typings.uifabricStyling.uifabricStylingStrings.themeSecondary
import typings.uifabricStyling.uifabricStylingStrings.themeTertiary
import typings.uifabricStyling.uifabricStylingStrings.vertical
import typings.uifabricStyling.uifabricStylingStrings.white
import typings.uifabricStyling.uifabricStylingStrings.whiteTranslucent40
import typings.uifabricStyling.uifabricStylingStrings.yellow
import typings.uifabricStyling.uifabricStylingStrings.yellowDark
import typings.uifabricStyling.uifabricStylingStrings.yellowLight
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
  val HighContrastSelector: `@media screen and Leftparenthesis-ms-high-contrastColon activeRightparenthesis` = js.native
  val HighContrastSelectorBlack: `@media screen and Leftparenthesis-ms-high-contrastColon white-on-blackRightparenthesis` = js.native
  val HighContrastSelectorWhite: `@media screen and Leftparenthesis-ms-high-contrastColon black-on-whiteRightparenthesis` = js.native
  val ScreenWidthMaxLarge: Double = js.native
  val ScreenWidthMaxMedium: Double = js.native
  val ScreenWidthMaxSmall: Double = js.native
  val ScreenWidthMaxXLarge: Double = js.native
  val ScreenWidthMaxXXLarge: Double = js.native
  val ScreenWidthMinLarge: `640` = js.native
  val ScreenWidthMinMedium: `480` = js.native
  val ScreenWidthMinSmall: `320` = js.native
  val ScreenWidthMinUhfMobile: `768` = js.native
  val ScreenWidthMinXLarge: `1024` = js.native
  val ScreenWidthMinXXLarge: `1366` = js.native
  val ScreenWidthMinXXXLarge: `1920` = js.native
  val ThemeSettingName: theme = js.native
  val hiddenContentStyle: IRawStyle = js.native
  val noWrap: IRawStyle = js.native
  val normalize: IRawStyle = js.native
  def createFontStyles(): IFontStyles = js.native
  def createFontStyles(localeCode: String): IFontStyles = js.native
  def createTheme(theme: IPartialTheme): ITheme = js.native
  def createTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def focusClear(): IRawStyle = js.native
  def getFadedOverflowStyle(theme: ITheme): IRawStyle = js.native
  def getFadedOverflowStyle(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight
  ): IRawStyle = js.native
  def getFadedOverflowStyle(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: horizontal
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: horizontal,
    width: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: horizontal,
    width: String,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: horizontal,
    width: String,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: horizontal,
    width: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: horizontal,
    width: Double,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: horizontal,
    width: Double,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: horizontal
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: horizontal,
    width: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: horizontal,
    width: String,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: horizontal,
    width: String,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: horizontal,
    width: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: horizontal,
    width: Double,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: horizontal,
    width: Double,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: vertical
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: vertical,
    width: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: vertical,
    width: String,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: vertical,
    width: String,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: vertical,
    width: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: vertical,
    width: Double,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: vertical,
    width: Double,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: vertical
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: vertical,
    width: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: vertical,
    width: String,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: vertical,
    width: String,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: vertical,
    width: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: vertical,
    width: Double,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 89 */ js.Any,
    direction: vertical,
    width: Double,
    height: Double
  ): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double, color: String): IRawStyle = js.native
  def getFocusStyle(theme: ITheme): IRawStyle = js.native
  def getFocusStyle(theme: ITheme, options: IGetFocusStylesOptions): IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_absolute(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[absolute],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_relative(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[relative],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme): Partial[GlobalClassNames[T]] = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): Partial[GlobalClassNames[T]] = js.native
  def getInputFocusStyle(borderColor: String, borderRadius: String): IRawStyle = js.native
  def getInputFocusStyle(borderColor: String, borderRadius: Double): IRawStyle = js.native
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

