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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object InjectionMode {
    
    @JSImport("@uifabric/merge-styles", "InjectionMode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appends rules using appendChild.
      */
    @JSImport("@uifabric/merge-styles", "InjectionMode.appendChild")
    @js.native
    def appendChild: `2` = js.native
    @scala.inline
    def appendChild_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(x.asInstanceOf[js.Any])
    
    /**
      * Inserts rules using the insertRule api.
      */
    @JSImport("@uifabric/merge-styles", "InjectionMode.insertNode")
    @js.native
    def insertNode: `1` = js.native
    @scala.inline
    def insertNode_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insertNode")(x.asInstanceOf[js.Any])
    
    /**
      * Avoids style injection, use getRules() to read the styles.
      */
    @JSImport("@uifabric/merge-styles", "InjectionMode.none")
    @js.native
    def none: `0` = js.native
    @scala.inline
    def none_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@uifabric/merge-styles", "Stylesheet")
  @js.native
  class Stylesheet ()
    extends typings.uifabricMergeStyles.stylesheetMod.Stylesheet {
    def this(config: IStyleSheetConfig) = this()
  }
  /* static members */
  object Stylesheet {
    
    /**
      * Gets the singleton instance.
      */
    @JSImport("@uifabric/merge-styles", "Stylesheet.getInstance")
    @js.native
    def getInstance(): typings.uifabricMergeStyles.stylesheetMod.Stylesheet = js.native
  }
  
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets[TStyleSet](): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets[TStyleSet](styleSet: TStyleSet): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  
  @JSImport("@uifabric/merge-styles", "concatStyleSetsWithProps")
  @js.native
  def concatStyleSetsWithProps[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styleProps: TStyleProps, allStyles: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): DeepPartial[TStyleSet] = js.native
  
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false(styleSets: (js.UndefOr[IStyleSet[StringDictionary[_]] | `false` | Null])*): IConcatenatedStyleSet[_] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false[TStyleSet](styleSet: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: js.UndefOr[scala.Nothing], styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null]
  ): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3]] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3] with ObjectOnly[TStyleSet4]
  ] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4, TStyleSet5](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null],
    styleSet5: js.UndefOr[TStyleSet5 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3] with ObjectOnly[TStyleSet4] with ObjectOnly[TStyleSet5]
  ] = js.native
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
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
  @JSImport("@uifabric/merge-styles", "concatStyleSets")
  @js.native
  def concatStyleSets_false_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  
  @JSImport("@uifabric/merge-styles", "fontFace")
  @js.native
  def fontFace(font: IFontFace): Unit = js.native
  
  @JSImport("@uifabric/merge-styles", "keyframes")
  @js.native
  def keyframes(timeline: IKeyframes): String = js.native
  
  @JSImport("@uifabric/merge-styles", "mergeCss")
  @js.native
  def mergeCss(): String = js.native
  @JSImport("@uifabric/merge-styles", "mergeCss")
  @js.native
  def mergeCss(args: js.UndefOr[IStyle], options: IStyleOptions): String = js.native
  @JSImport("@uifabric/merge-styles", "mergeCss")
  @js.native
  def mergeCss(args: Null, options: IStyleOptions): String = js.native
  @JSImport("@uifabric/merge-styles", "mergeCss")
  @js.native
  def mergeCss(args: IStyle): String = js.native
  @JSImport("@uifabric/merge-styles", "mergeCss")
  @js.native
  def mergeCss(args: IStyleBaseArray): String = js.native
  @JSImport("@uifabric/merge-styles", "mergeCss")
  @js.native
  def mergeCss(args: IStyleBaseArray, options: IStyleOptions): String = js.native
  
  @JSImport("@uifabric/merge-styles", "mergeCssSets")
  @js.native
  def mergeCssSets_false[TStyleSet](styleSets: js.Array[js.UndefOr[TStyleSet | `false` | Null]]): IProcessedStyleSet[TStyleSet] = js.native
  @JSImport("@uifabric/merge-styles", "mergeCssSets")
  @js.native
  def mergeCssSets_false[TStyleSet](styleSets: js.Array[js.UndefOr[TStyleSet | `false` | Null]], options: IStyleOptions): IProcessedStyleSet[TStyleSet] = js.native
  @JSImport("@uifabric/merge-styles", "mergeCssSets")
  @js.native
  def mergeCssSets_false[TStyleSet1, TStyleSet2](
    styleSets: js.Tuple2[js.UndefOr[TStyleSet1 | `false` | Null], js.UndefOr[TStyleSet2 | `false` | Null]]
  ): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSImport("@uifabric/merge-styles", "mergeCssSets")
  @js.native
  def mergeCssSets_false[TStyleSet1, TStyleSet2](
    styleSets: js.Tuple2[js.UndefOr[TStyleSet1 | `false` | Null], js.UndefOr[TStyleSet2 | `false` | Null]],
    options: IStyleOptions
  ): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSImport("@uifabric/merge-styles", "mergeCssSets")
  @js.native
  def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSets: js.Tuple3[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null]
    ]
  ): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSImport("@uifabric/merge-styles", "mergeCssSets")
  @js.native
  def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSets: js.Tuple3[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null]
    ],
    options: IStyleOptions
  ): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSImport("@uifabric/merge-styles", "mergeCssSets")
  @js.native
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
  @JSImport("@uifabric/merge-styles", "mergeCssSets")
  @js.native
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
  
  @JSImport("@uifabric/merge-styles", "mergeCss")
  @js.native
  def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]]): String = js.native
  @JSImport("@uifabric/merge-styles", "mergeCss")
  @js.native
  def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]], options: IStyleOptions): String = js.native
  @JSImport("@uifabric/merge-styles", "mergeCss")
  @js.native
  def mergeCss_false(args: `false`): String = js.native
  @JSImport("@uifabric/merge-styles", "mergeCss")
  @js.native
  def mergeCss_false(args: `false`, options: IStyleOptions): String = js.native
  
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets[TStyleSet](): IProcessedStyleSet[ObjectOnly[TStyleSet]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets[TStyleSet](styleSet: TStyleSet): IProcessedStyleSet[ObjectOnly[TStyleSet]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_false(styleSets: (js.UndefOr[IStyleSet[StringDictionary[_]] | `false` | Null])*): IProcessedStyleSet[_] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_false[TStyleSet](styleSet: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: js.UndefOr[scala.Nothing], styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null]
  ): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3]] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null]
  ): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3] with ObjectOnly[TStyleSet4]
  ] = js.native
  @JSImport("@uifabric/merge-styles", "mergeStyleSets")
  @js.native
  def mergeStyleSets_false_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  
  @JSImport("@uifabric/merge-styles", "mergeStyles")
  @js.native
  def mergeStyles_false(args: (js.UndefOr[IStyle | IStyleBaseArray | `false` | Null])*): String = js.native
  
  @JSImport("@uifabric/merge-styles", "setRTL")
  @js.native
  def setRTL(isRTL: Boolean): Unit = js.native
}
