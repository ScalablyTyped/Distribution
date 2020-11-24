package typings.uifabricStyling

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.fluentuiTheme.ianimationstylesMod.IAnimationStyles
import typings.fluentuiTheme.ianimationstylesMod.IAnimationVariables
import typings.fluentuiTheme.ieffectsMod.IEffects
import typings.fluentuiTheme.ifontstylesMod.IFontStyles
import typings.fluentuiTheme.ipaletteMod.IPalette
import typings.fluentuiTheme.ischemeMod.ISchemeNames
import typings.fluentuiTheme.ithemeMod.IPartialTheme
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.fluentuiTheme.themeMod.PartialTheme
import typings.fluentuiTheme.themeMod.Theme
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.ikeyframesMod.IKeyframes
import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import typings.uifabricMergeStyles.irawstylebaseMod.IFontFace
import typings.uifabricMergeStyles.irawstylebaseMod.IFontWeight
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istyleMod.IStyleBaseArray
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricMergeStyles.istylesetMod.IConcatenatedStyleSet
import typings.uifabricMergeStyles.istylesetMod.IProcessedStyleSet
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import typings.uifabricMergeStyles.objectOnlyMod.ObjectOnly
import typings.uifabricMergeStyles.stylesheetMod.IStyleSheetConfig
import typings.uifabricStyling.anon.PartialIIconOptions
import typings.uifabricStyling.colorClassNamesMod.IColorClassNames
import typings.uifabricStyling.getGlobalClassNamesMod.GlobalClassNames
import typings.uifabricStyling.iconsMod.IIconRecord
import typings.uifabricStyling.iconsMod.IIconSubset
import typings.uifabricStyling.igetfocusstylesMod.IGetFocusStylesOptions
import typings.uifabricStyling.uifabricStylingBooleans.`false`
import typings.uifabricStyling.uifabricStylingNumbers.`0`
import typings.uifabricStyling.uifabricStylingNumbers.`1`
import typings.uifabricStyling.uifabricStylingNumbers.`2`
import typings.uifabricStyling.uifabricStylingStrings.absolute
import typings.uifabricStyling.uifabricStylingStrings.border
import typings.uifabricStyling.uifabricStylingStrings.borderBottom
import typings.uifabricStyling.uifabricStylingStrings.horizontal
import typings.uifabricStyling.uifabricStylingStrings.relative
import typings.uifabricStyling.uifabricStylingStrings.vertical
import typings.uifabricUtilities.customizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/styling", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val AnimationStyles: IAnimationStyles = js.native
  
  val AnimationVariables: IAnimationVariables = js.native
  
  val ColorClassNames: IColorClassNames = js.native
  
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
  
  def buildClassMap[T /* <: js.Object */](styles: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? string}
    */ typings.uifabricStyling.uifabricStylingStrings.buildClassMap with TopLevel[js.Any] = js.native
  
  def concatStyleSets[TStyleSet](): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = js.native
  def concatStyleSets[TStyleSet](styleSet: TStyleSet): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = js.native
  def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  
  def concatStyleSetsWithProps[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styleProps: TStyleProps, allStyles: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): DeepPartial[TStyleSet] = js.native
  
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false(styleSets: (js.UndefOr[IStyleSet[StringDictionary[_]] | `false` | Null])*): IConcatenatedStyleSet[_] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet](styleSet: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: js.UndefOr[scala.Nothing], styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null]
  ): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3]] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3] with ObjectOnly[TStyleSet4]
  ] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4, TStyleSet5](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null],
    styleSet5: js.UndefOr[TStyleSet5 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3] with ObjectOnly[TStyleSet4] with ObjectOnly[TStyleSet5]
  ] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4, TStyleSet5, TStyleSet6](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null],
    styleSet5: js.UndefOr[TStyleSet5 | `false` | Null],
    styleSet6: js.UndefOr[TStyleSet6 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3] with ObjectOnly[TStyleSet4] with ObjectOnly[TStyleSet5] with ObjectOnly[TStyleSet6]
  ] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  
  def createFontStyles(): IFontStyles = js.native
  def createFontStyles(localeCode: String): IFontStyles = js.native
  
  def createTheme(): Theme = js.native
  def createTheme(theme: js.UndefOr[scala.Nothing], depComments: Boolean): Theme = js.native
  def createTheme(theme: PartialTheme): Theme = js.native
  def createTheme(theme: PartialTheme, depComments: Boolean): Theme = js.native
  
  def focusClear(): IRawStyle = js.native
  
  def fontFace(font: IFontFace): Unit = js.native
  
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
  
  def getIcon(): js.UndefOr[IIconRecord] = js.native
  def getIcon(name: String): js.UndefOr[IIconRecord] = js.native
  
  def getIconClassName(name: String): String = js.native
  
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
  
  val hiddenContentStyle: IRawStyle = js.native
  
  def keyframes(timeline: IKeyframes): String = js.native
  
  def loadTheme(theme: IPartialTheme): ITheme = js.native
  def loadTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  
  def mergeStyleSets[TStyleSet](): IProcessedStyleSet[ObjectOnly[TStyleSet]] = js.native
  def mergeStyleSets[TStyleSet](styleSet: TStyleSet): IProcessedStyleSet[ObjectOnly[TStyleSet]] = js.native
  def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false(styleSets: (js.UndefOr[IStyleSet[StringDictionary[_]] | `false` | Null])*): IProcessedStyleSet[_] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet](styleSet: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet]] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: js.UndefOr[scala.Nothing], styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null]
  ): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3]] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null]
  ): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3] with ObjectOnly[TStyleSet4]
  ] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  
  @JSName("mergeStyles")
  def mergeStyles_false(args: (js.UndefOr[IStyle | IStyleBaseArray | `false` | Null])*): String = js.native
  
  val noWrap: IRawStyle = js.native
  
  val normalize: IRawStyle = js.native
  
  def registerDefaultFontFaces(baseUrl: String): Unit = js.native
  
  def registerIconAlias(iconName: String, mappedToName: String): Unit = js.native
  
  def registerIcons(iconSubset: IIconSubset): Unit = js.native
  def registerIcons(iconSubset: IIconSubset, options: PartialIIconOptions): Unit = js.native
  
  def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  
  def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  
  def setIconOptions(options: PartialIIconOptions): Unit = js.native
  
  def unregisterIcons(iconNames: js.Array[String]): Unit = js.native
  
  @js.native
  object AnimationClassNames extends js.Object {
    
    var fadeIn100: js.UndefOr[String] = js.native
    
    var fadeIn200: js.UndefOr[String] = js.native
    
    var fadeIn400: js.UndefOr[String] = js.native
    
    var fadeIn500: js.UndefOr[String] = js.native
    
    var fadeOut100: js.UndefOr[String] = js.native
    
    var fadeOut200: js.UndefOr[String] = js.native
    
    var fadeOut400: js.UndefOr[String] = js.native
    
    var fadeOut500: js.UndefOr[String] = js.native
    
    var rotate90deg: js.UndefOr[String] = js.native
    
    var rotateN90deg: js.UndefOr[String] = js.native
    
    var scaleDownIn100: js.UndefOr[String] = js.native
    
    var scaleDownOut98: js.UndefOr[String] = js.native
    
    var scaleUpIn100: js.UndefOr[String] = js.native
    
    var scaleUpOut103: js.UndefOr[String] = js.native
    
    var slideDownIn10: js.UndefOr[String] = js.native
    
    var slideDownIn20: js.UndefOr[String] = js.native
    
    var slideDownOut10: js.UndefOr[String] = js.native
    
    var slideDownOut20: js.UndefOr[String] = js.native
    
    var slideLeftIn10: js.UndefOr[String] = js.native
    
    var slideLeftIn20: js.UndefOr[String] = js.native
    
    var slideLeftIn40: js.UndefOr[String] = js.native
    
    var slideLeftIn400: js.UndefOr[String] = js.native
    
    var slideLeftOut10: js.UndefOr[String] = js.native
    
    var slideLeftOut20: js.UndefOr[String] = js.native
    
    var slideLeftOut40: js.UndefOr[String] = js.native
    
    var slideLeftOut400: js.UndefOr[String] = js.native
    
    var slideRightIn10: js.UndefOr[String] = js.native
    
    var slideRightIn20: js.UndefOr[String] = js.native
    
    var slideRightIn40: js.UndefOr[String] = js.native
    
    var slideRightIn400: js.UndefOr[String] = js.native
    
    var slideRightOut10: js.UndefOr[String] = js.native
    
    var slideRightOut20: js.UndefOr[String] = js.native
    
    var slideRightOut40: js.UndefOr[String] = js.native
    
    var slideRightOut400: js.UndefOr[String] = js.native
    
    var slideUpIn10: js.UndefOr[String] = js.native
    
    var slideUpIn20: js.UndefOr[String] = js.native
    
    var slideUpOut10: js.UndefOr[String] = js.native
    
    var slideUpOut20: js.UndefOr[String] = js.native
  }
  
  @js.native
  object FontClassNames extends js.Object {
    
    var large: js.UndefOr[String] = js.native
    
    var medium: js.UndefOr[String] = js.native
    
    var mediumPlus: js.UndefOr[String] = js.native
    
    var mega: js.UndefOr[String] = js.native
    
    var small: js.UndefOr[String] = js.native
    
    var smallPlus: js.UndefOr[String] = js.native
    
    var superLarge: js.UndefOr[String] = js.native
    
    var tiny: js.UndefOr[String] = js.native
    
    var xLarge: js.UndefOr[String] = js.native
    
    var xLargePlus: js.UndefOr[String] = js.native
    
    var xSmall: js.UndefOr[String] = js.native
    
    var xxLarge: js.UndefOr[String] = js.native
    
    var xxLargePlus: js.UndefOr[String] = js.native
  }
  
  @js.native
  object FontSizes extends js.Object {
    
    val icon: String = js.native
    
    val large: String = js.native
    
    val medium: String = js.native
    
    val mediumPlus: String = js.native
    
    val mega: String = js.native
    
    val mini: String = js.native
    
    val size10: /* "10px" */ String = js.native
    
    val size12: /* "12px" */ String = js.native
    
    val size14: /* "14px" */ String = js.native
    
    val size16: /* "16px" */ String = js.native
    
    val size18: /* "18px" */ String = js.native
    
    val size20: /* "20px" */ String = js.native
    
    val size24: /* "24px" */ String = js.native
    
    val size28: /* "28px" */ String = js.native
    
    val size32: /* "32px" */ String = js.native
    
    val size42: /* "42px" */ String = js.native
    
    val size68: /* "68px" */ String = js.native
    
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
  object InjectionMode extends js.Object {
    
    /**
      * Appends rules using appendChild.
      */
    var appendChild: `2` = js.native
    
    /**
      * Inserts rules using the insertRule api.
      */
    var insertNode: `1` = js.native
    
    /**
      * Avoids style injection, use getRules() to read the styles.
      */
    var none: `0` = js.native
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
  class Stylesheet ()
    extends typings.uifabricStyling.mergeStylesMod.Stylesheet {
    def this(config: IStyleSheetConfig) = this()
  }
  /* static members */
  @js.native
  object Stylesheet extends js.Object {
    
    /**
      * Gets the singleton instance.
      */
    def getInstance(): typings.uifabricMergeStyles.stylesheetMod.Stylesheet = js.native
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
