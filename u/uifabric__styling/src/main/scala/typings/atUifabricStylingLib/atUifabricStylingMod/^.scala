package typings
package atUifabricStylingLib.atUifabricStylingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AnimationStyles: atUifabricStylingLib.libInterfacesIAnimationStylesMod.IAnimationStyles = js.native
  val AnimationVariables: atUifabricStylingLib.libInterfacesIAnimationStylesMod.IAnimationVariables = js.native
  val ColorClassNames: atUifabricStylingLib.libClassNamesColorClassNamesMod.IColorClassNames = js.native
  val DefaultFontStyles: atUifabricStylingLib.libInterfacesIFontStylesMod.IFontStyles = js.native
  val DefaultPalette: atUifabricStylingLib.libInterfacesIPaletteMod.IPalette = js.native
  val HighContrastSelector: atUifabricStylingLib.atUifabricStylingLibStrings.`@media screen and (-ms-high-contrast: active)` = js.native
  val HighContrastSelectorBlack: atUifabricStylingLib.atUifabricStylingLibStrings.`@media screen and (-ms-high-contrast: white-on-black)` = js.native
  val HighContrastSelectorWhite: atUifabricStylingLib.atUifabricStylingLibStrings.`@media screen and (-ms-high-contrast: black-on-white)` = js.native
  val ScreenWidthMaxLarge: scala.Double = js.native
  val ScreenWidthMaxMedium: scala.Double = js.native
  val ScreenWidthMaxSmall: scala.Double = js.native
  val ScreenWidthMaxXLarge: scala.Double = js.native
  val ScreenWidthMaxXXLarge: scala.Double = js.native
  val ScreenWidthMinLarge: atUifabricStylingLib.atUifabricStylingLibNumbers.`640` = js.native
  val ScreenWidthMinMedium: atUifabricStylingLib.atUifabricStylingLibNumbers.`480` = js.native
  val ScreenWidthMinSmall: atUifabricStylingLib.atUifabricStylingLibNumbers.`320` = js.native
  val ScreenWidthMinUhfMobile: atUifabricStylingLib.atUifabricStylingLibNumbers.`768` = js.native
  val ScreenWidthMinXLarge: atUifabricStylingLib.atUifabricStylingLibNumbers.`1024` = js.native
  val ScreenWidthMinXXLarge: atUifabricStylingLib.atUifabricStylingLibNumbers.`1366` = js.native
  val ScreenWidthMinXXXLarge: atUifabricStylingLib.atUifabricStylingLibNumbers.`1920` = js.native
  val ThemeSettingName: atUifabricStylingLib.atUifabricStylingLibStrings.theme = js.native
  val hiddenContentStyle: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  val noWrap: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  val normalize: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def buildClassMap[T](styles: T): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof T ]:? string}
    */ atUifabricStylingLib.atUifabricStylingLibStrings.buildClassMap with js.Any = js.native
  def concatStyleSets[TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet] = js.native
  def concatStyleSets[TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](styleSet: TStyleSet): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet] = js.native
  def concatStyleSets[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def concatStyleSets[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def concatStyleSets[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: scala.Null, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def concatStyleSets[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  def concatStyleSets[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false(
    styleSets: (js.UndefOr[
      atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[_] | atUifabricStylingLib.atUifabricStylingLibNumbers.`false` | scala.Null
    ])*
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[_] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](styleSet: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](
    styleSet1: js.UndefOr[scala.Nothing],
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: scala.Null, styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet3 | TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet3 | TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet3 | TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet3 | TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet4 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet5: TStyleSet5 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */, TStyleSet6 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet6] */](
    styleSet1: js.UndefOr[
      TStyleSet1 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false` | scala.Null
    ],
    styleSet2: js.UndefOr[
      TStyleSet2 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false` | scala.Null
    ],
    styleSet3: js.UndefOr[
      TStyleSet3 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false` | scala.Null
    ],
    styleSet4: js.UndefOr[
      TStyleSet4 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false` | scala.Null
    ],
    styleSet5: js.UndefOr[
      TStyleSet5 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false` | scala.Null
    ],
    styleSet6: js.UndefOr[
      TStyleSet6 | atUifabricStylingLib.atUifabricStylingLibNumbers.`false` | scala.Null
    ]
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[
    TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5 with TStyleSet6
  ] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSetTStyleSet5IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */, TStyleSet5 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet5] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  def createFontStyles(): atUifabricStylingLib.libInterfacesIFontStylesMod.IFontStyles = js.native
  def createFontStyles(localeCode: java.lang.String): atUifabricStylingLib.libInterfacesIFontStylesMod.IFontStyles = js.native
  def createTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def createTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme, depComments: scala.Boolean): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def focusClear(): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def fontFace(font: atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IFontFace): scala.Unit = js.native
  def getFadedOverflowStyle(theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFadedOverflowStyle(theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme, color: java.lang.String): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: java.lang.String,
    height: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: java.lang.String,
    height: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: scala.Double,
    height: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: scala.Double,
    height: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: java.lang.String,
    height: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: java.lang.String,
    height: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: scala.Double,
    height: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: scala.Double,
    height: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusOutlineStyle(theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusOutlineStyle(theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme, inset: scala.Double): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusOutlineStyle(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    inset: scala.Double,
    width: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusOutlineStyle(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    inset: scala.Double,
    width: scala.Double,
    color: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusStyle(theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusStyle(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    options: atUifabricStylingLib.libInterfacesIGetFocusStylesMod.IGetFocusStylesOptions
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_absolute(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    inset: js.UndefOr[scala.Double],
    position: js.UndefOr[atUifabricStylingLib.atUifabricStylingLibStrings.absolute],
    highContrastStyle: js.UndefOr[atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle],
    borderColor: js.UndefOr[java.lang.String],
    outlineColor: js.UndefOr[java.lang.String],
    isFocusedOnly: js.UndefOr[scala.Boolean]
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_relative(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    inset: js.UndefOr[scala.Double],
    position: js.UndefOr[atUifabricStylingLib.atUifabricStylingLibStrings.relative],
    highContrastStyle: js.UndefOr[atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle],
    borderColor: js.UndefOr[java.lang.String],
    outlineColor: js.UndefOr[java.lang.String],
    isFocusedOnly: js.UndefOr[scala.Boolean]
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getGlobalClassNames[T](
    classNames: atUifabricStylingLib.libStylesGetGlobalClassNamesMod.GlobalClassNames[T],
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme
  ): stdLib.Partial[atUifabricStylingLib.libStylesGetGlobalClassNamesMod.GlobalClassNames[T]] = js.native
  def getGlobalClassNames[T](
    classNames: atUifabricStylingLib.libStylesGetGlobalClassNamesMod.GlobalClassNames[T],
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    disableGlobalClassNames: scala.Boolean
  ): stdLib.Partial[atUifabricStylingLib.libStylesGetGlobalClassNamesMod.GlobalClassNames[T]] = js.native
  def getIcon(): js.UndefOr[atUifabricStylingLib.libUtilitiesIconsMod.IIconRecord] = js.native
  def getIcon(name: java.lang.String): js.UndefOr[atUifabricStylingLib.libUtilitiesIconsMod.IIconRecord] = js.native
  def getIconClassName(name: java.lang.String): java.lang.String = js.native
  def getScreenSelector(min: scala.Double, max: scala.Double): java.lang.String = js.native
  def getTheme(): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def getTheme(depComments: scala.Boolean): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def getThemedContext(context: atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext): atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext = js.native
  def getThemedContext(
    context: atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext,
    scheme: atUifabricStylingLib.libInterfacesIThemeMod.ISchemeNames
  ): atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext = js.native
  def getThemedContext(
    context: atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext,
    scheme: atUifabricStylingLib.libInterfacesIThemeMod.ISchemeNames,
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme
  ): atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext = js.native
  def keyframes(timeline: org.scalablytyped.runtime.StringDictionary[js.Object]): java.lang.String = js.native
  def loadTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def loadTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme, depComments: scala.Boolean): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def mergeStyleSets[TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet] = js.native
  def mergeStyleSets[TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](styleSet: TStyleSet): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet] = js.native
  def mergeStyleSets[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def mergeStyleSets[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def mergeStyleSets[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: scala.Null, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def mergeStyleSets[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  def mergeStyleSets[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false(
    styleSets: (js.UndefOr[
      atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[_] | atUifabricStylingLib.atUifabricStylingLibNumbers.`false` | scala.Null
    ])*
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[_] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](styleSet: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](
    styleSet1: js.UndefOr[scala.Nothing],
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: scala.Null, styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: TStyleSet4
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet4: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`, styleSet2: TStyleSet2): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: TStyleSet2,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: TStyleSet3
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1IStyleSetTStyleSet2IStyleSetTStyleSet3IStyleSetTStyleSet4IStyleSet[TStyleSet1 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet1] */, TStyleSet2 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet2] */, TStyleSet3 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet3] */, TStyleSet4 /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet4] */](
    styleSet1: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet2: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`,
    styleSet3: atUifabricStylingLib.atUifabricStylingLibNumbers.`false`
  ): atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyles")
  def mergeStyles_false(
    args: (js.UndefOr[
      atUifabricMergeDashStylesLib.libIStyleMod.IStyle | atUifabricMergeDashStylesLib.libIStyleMod.IStyleBaseArray | atUifabricStylingLib.atUifabricStylingLibNumbers.`false` | scala.Null
    ])*
  ): java.lang.String = js.native
  def registerDefaultFontFaces(baseUrl: java.lang.String): scala.Unit = js.native
  def registerIconAlias(iconName: java.lang.String, mappedToName: java.lang.String): scala.Unit = js.native
  def registerIcons(iconSubset: atUifabricStylingLib.libUtilitiesIconsMod.IIconSubset): scala.Unit = js.native
  def registerIcons(
    iconSubset: atUifabricStylingLib.libUtilitiesIconsMod.IIconSubset,
    options: stdLib.Partial[atUifabricStylingLib.libUtilitiesIconsMod.IIconOptions]
  ): scala.Unit = js.native
  def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, scala.Unit]): scala.Unit = js.native
  def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, scala.Unit]): scala.Unit = js.native
  def setIconOptions(options: stdLib.Partial[atUifabricStylingLib.libUtilitiesIconsMod.IIconOptions]): scala.Unit = js.native
  def unregisterIcons(iconNames: js.Array[java.lang.String]): scala.Unit = js.native
}

