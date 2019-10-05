package typings.atUifabricStyling

import org.scalablytyped.runtime.StringDictionary
import typings.atUifabricMergeDashStyles.libIRawStyleBaseMod.IFontFace
import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import typings.atUifabricMergeDashStyles.libIStyleMod.IStyleBaseArray
import typings.atUifabricMergeDashStyles.libIStyleSetMod.IConcatenatedStyleSet
import typings.atUifabricMergeDashStyles.libIStyleSetMod.IProcessedStyleSet
import typings.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typings.atUifabricMergeDashStyles.libStylesheetMod.IStyleSheetConfig
import typings.atUifabricStyling.atUifabricStylingNumbers.`0`
import typings.atUifabricStyling.atUifabricStylingNumbers.`1`
import typings.atUifabricStyling.atUifabricStylingNumbers.`2`
import typings.atUifabricStyling.atUifabricStylingNumbers.`false`
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/MergeStyles", JSImport.Namespace)
@js.native
object libMergeStylesMod extends js.Object {
  @js.native
  class Stylesheet ()
    extends typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesMod.Stylesheet {
    def this(config: IStyleSheetConfig) = this()
  }
  
  def concatStyleSets[TStyleSet /* <: IStyleSet[TStyleSet] */](): IConcatenatedStyleSet[TStyleSet] = js.native
  def concatStyleSets[TStyleSet /* <: IStyleSet[TStyleSet] */](styleSet: TStyleSet): IConcatenatedStyleSet[TStyleSet] = js.native
  def concatStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def concatStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def concatStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: Null, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def concatStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  def concatStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  def concatStyleSetsWithProps[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styleProps: TStyleProps, allStyles: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): Partial[TStyleSet] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false(styleSets: (js.UndefOr[IStyleSet[_] | `false` | Null])*): IConcatenatedStyleSet[_] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet /* <: IStyleSet[TStyleSet] */](styleSet: `false`): IConcatenatedStyleSet[TStyleSet] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: Null, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: `false`,
    styleSet4: TStyleSet3 | TStyleSet4
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: `false`,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet3 | TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](
    styleSet1: `false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: TStyleSet3 | TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: TStyleSet3 | TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet3 | TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1 | `false`,
    styleSet2: TStyleSet2 | `false`,
    styleSet3: TStyleSet3 | `false`,
    styleSet4: TStyleSet4 | `false`,
    styleSet5: TStyleSet5 | `false`
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */, TStyleSet6 /* <: IStyleSet[TStyleSet6] */](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null],
    styleSet5: js.UndefOr[TStyleSet5 | `false` | Null],
    styleSet6: js.UndefOr[TStyleSet6 | `false` | Null]
  ): IConcatenatedStyleSet[
    TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5 with TStyleSet6
  ] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  def fontFace(font: IFontFace): Unit = js.native
  def keyframes(timeline: StringDictionary[js.Object]): String = js.native
  def mergeStyleSets[TStyleSet /* <: IStyleSet[TStyleSet] */](): IProcessedStyleSet[TStyleSet] = js.native
  def mergeStyleSets[TStyleSet /* <: IStyleSet[TStyleSet] */](styleSet: TStyleSet): IProcessedStyleSet[TStyleSet] = js.native
  def mergeStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def mergeStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def mergeStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: Null, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def mergeStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  def mergeStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false(styleSets: (js.UndefOr[IStyleSet[_] | `false` | Null])*): IProcessedStyleSet[_] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet /* <: IStyleSet[TStyleSet] */](styleSet: `false`): IProcessedStyleSet[TStyleSet] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: Null, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyles")
  def mergeStyles_false(args: (js.UndefOr[IStyle | IStyleBaseArray | `false` | Null])*): String = js.native
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
  
  /* static members */
  @js.native
  object Stylesheet extends js.Object {
    /**
      * Gets the singleton instance.
      */
    def getInstance(): typings.atUifabricMergeDashStyles.libStylesheetMod.Stylesheet = js.native
  }
  
}

