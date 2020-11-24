package typings.uifabricMergeStyles

import org.scalablytyped.runtime.StringDictionary
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.ikeyframesMod.IKeyframes
import typings.uifabricMergeStyles.irawstylebaseMod.IFontFace
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istyleMod.IStyleBaseArray
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricMergeStyles.istyleoptionsMod.IStyleOptions
import typings.uifabricMergeStyles.istylesetMod.IConcatenatedStyleSet
import typings.uifabricMergeStyles.istylesetMod.IProcessedStyleSet
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import typings.uifabricMergeStyles.objectOnlyMod.ObjectOnly
import typings.uifabricMergeStyles.stylesheetMod.IStyleSheetConfig
import typings.uifabricMergeStyles.uifabricMergeStylesBooleans.`false`
import typings.uifabricMergeStyles.uifabricMergeStylesNumbers.`0`
import typings.uifabricMergeStyles.uifabricMergeStylesNumbers.`1`
import typings.uifabricMergeStyles.uifabricMergeStylesNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/merge-styles", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  
  def fontFace(font: IFontFace): Unit = js.native
  
  def keyframes(timeline: IKeyframes): String = js.native
  
  def mergeCss(): String = js.native
  def mergeCss(args: js.UndefOr[IStyle], options: IStyleOptions): String = js.native
  def mergeCss(args: Null, options: IStyleOptions): String = js.native
  def mergeCss(args: IStyle): String = js.native
  def mergeCss(args: IStyleBaseArray): String = js.native
  def mergeCss(args: IStyleBaseArray, options: IStyleOptions): String = js.native
  
  @JSName("mergeCssSets")
  def mergeCssSets_false[TStyleSet](styleSets: js.Array[js.UndefOr[TStyleSet | `false` | Null]]): IProcessedStyleSet[TStyleSet] = js.native
  @JSName("mergeCssSets")
  def mergeCssSets_false[TStyleSet](styleSets: js.Array[js.UndefOr[TStyleSet | `false` | Null]], options: IStyleOptions): IProcessedStyleSet[TStyleSet] = js.native
  @JSName("mergeCssSets")
  def mergeCssSets_false[TStyleSet1, TStyleSet2](
    styleSets: js.Tuple2[js.UndefOr[TStyleSet1 | `false` | Null], js.UndefOr[TStyleSet2 | `false` | Null]]
  ): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeCssSets")
  def mergeCssSets_false[TStyleSet1, TStyleSet2](
    styleSets: js.Tuple2[js.UndefOr[TStyleSet1 | `false` | Null], js.UndefOr[TStyleSet2 | `false` | Null]],
    options: IStyleOptions
  ): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeCssSets")
  def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSets: js.Tuple3[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null]
    ]
  ): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeCssSets")
  def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSets: js.Tuple3[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null]
    ],
    options: IStyleOptions
  ): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeCssSets")
  def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSets: js.Tuple4[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null], 
      js.UndefOr[TStyleSet4 | `false` | Null]
    ]
  ): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3] with ObjectOnly[TStyleSet4]
  ] = js.native
  @JSName("mergeCssSets")
  def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSets: js.Tuple4[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null], 
      js.UndefOr[TStyleSet4 | `false` | Null]
    ],
    options: IStyleOptions
  ): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3] with ObjectOnly[TStyleSet4]
  ] = js.native
  
  @JSName("mergeCss")
  def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]]): String = js.native
  @JSName("mergeCss")
  def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]], options: IStyleOptions): String = js.native
  @JSName("mergeCss")
  def mergeCss_false(args: `false`): String = js.native
  @JSName("mergeCss")
  def mergeCss_false(args: `false`, options: IStyleOptions): String = js.native
  
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
  
  def setRTL(isRTL: Boolean): Unit = js.native
  
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
  class Stylesheet ()
    extends typings.uifabricMergeStyles.stylesheetMod.Stylesheet {
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
}
