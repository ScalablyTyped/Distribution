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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@uifabric/merge-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("@uifabric/merge-styles", "Stylesheet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the singleton instance.
      */
    @scala.inline
    def getInstance(): typings.uifabricMergeStyles.stylesheetMod.Stylesheet = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.uifabricMergeStyles.stylesheetMod.Stylesheet]
  }
  
  @scala.inline
  def concatStyleSets[TStyleSet](): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")().asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet]]]
  @scala.inline
  def concatStyleSets[TStyleSet](styleSet: TStyleSet): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet.asInstanceOf[js.Any]).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet]]]
  @scala.inline
  def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: Unit, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  @scala.inline
  def concatStyleSetsWithProps[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styleProps: TStyleProps, allStyles: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): DeepPartial[TStyleSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSetsWithProps")(styleProps.asInstanceOf[js.Any], allStyles.asInstanceOf[js.Any])).asInstanceOf[DeepPartial[TStyleSet]]
  
  @scala.inline
  def concatStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")().asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def concatStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any]).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  @scala.inline
  def concatStyleSets_false(styleSets: (js.UndefOr[IStyleSet[StringDictionary[js.Any]] | `false` | Null])*): IConcatenatedStyleSet[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSets.asInstanceOf[js.Any]).asInstanceOf[IConcatenatedStyleSet[js.Any]]
  @scala.inline
  def concatStyleSets_false[TStyleSet](styleSet: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet.asInstanceOf[js.Any]).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet]]]
  @scala.inline
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Unit, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null]
  ): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3]]]
  @scala.inline
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any], styleSet4.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ]]
  @scala.inline
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4, TStyleSet5](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null],
    styleSet5: js.UndefOr[TStyleSet5 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4] & ObjectOnly[TStyleSet5]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any], styleSet4.asInstanceOf[js.Any], styleSet5.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4] & ObjectOnly[TStyleSet5]
  ]]
  @scala.inline
  def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4, TStyleSet5, TStyleSet6](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null],
    styleSet5: js.UndefOr[TStyleSet5 | `false` | Null],
    styleSet6: js.UndefOr[TStyleSet6 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4] & ObjectOnly[TStyleSet5] & ObjectOnly[TStyleSet6]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any], styleSet4.asInstanceOf[js.Any], styleSet5.asInstanceOf[js.Any], styleSet6.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4] & ObjectOnly[TStyleSet5] & ObjectOnly[TStyleSet6]
  ]]
  
  @scala.inline
  def concatStyleSets_false_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any]).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  @scala.inline
  def fontFace(font: IFontFace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fontFace")(font.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def keyframes(timeline: IKeyframes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(timeline.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def mergeCss(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")().asInstanceOf[String]
  @scala.inline
  def mergeCss(args: Null, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def mergeCss(args: Unit, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def mergeCss(args: IStyle): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def mergeCss(args: IStyleBaseArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def mergeCss(args: IStyleBaseArray, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def mergeCss(args: IStyle, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def mergeCssSets_false[TStyleSet](styleSets: js.Array[js.UndefOr[TStyleSet | `false` | Null]]): IProcessedStyleSet[TStyleSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[TStyleSet]]
  @scala.inline
  def mergeCssSets_false[TStyleSet](styleSets: js.Array[js.UndefOr[TStyleSet | `false` | Null]], options: IStyleOptions): IProcessedStyleSet[TStyleSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[TStyleSet]]
  @scala.inline
  def mergeCssSets_false[TStyleSet1, TStyleSet2](
    styleSets: js.Tuple2[js.UndefOr[TStyleSet1 | `false` | Null], js.UndefOr[TStyleSet2 | `false` | Null]]
  ): IProcessedStyleSet[TStyleSet1 & TStyleSet2] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[TStyleSet1 & TStyleSet2]]
  @scala.inline
  def mergeCssSets_false[TStyleSet1, TStyleSet2](
    styleSets: js.Tuple2[js.UndefOr[TStyleSet1 | `false` | Null], js.UndefOr[TStyleSet2 | `false` | Null]],
    options: IStyleOptions
  ): IProcessedStyleSet[TStyleSet1 & TStyleSet2] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[TStyleSet1 & TStyleSet2]]
  @scala.inline
  def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSets: js.Tuple3[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null]
    ]
  ): IProcessedStyleSet[TStyleSet1 & TStyleSet2 & TStyleSet3] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[TStyleSet1 & TStyleSet2 & TStyleSet3]]
  @scala.inline
  def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSets: js.Tuple3[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null]
    ],
    options: IStyleOptions
  ): IProcessedStyleSet[TStyleSet1 & TStyleSet2 & TStyleSet3] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[TStyleSet1 & TStyleSet2 & TStyleSet3]]
  @scala.inline
  def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSets: js.Tuple4[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null], 
      js.UndefOr[TStyleSet4 | `false` | Null]
    ]
  ): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ]]
  @scala.inline
  def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSets: js.Tuple4[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null], 
      js.UndefOr[TStyleSet4 | `false` | Null]
    ],
    options: IStyleOptions
  ): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ]]
  
  @scala.inline
  def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]], options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def mergeCss_false(args: `false`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def mergeCss_false(args: `false`, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def mergeStyleSets[TStyleSet](): IProcessedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")().asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet]]]
  @scala.inline
  def mergeStyleSets[TStyleSet](styleSet: TStyleSet): IProcessedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet]]]
  @scala.inline
  def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: Unit, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  @scala.inline
  def mergeStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")().asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def mergeStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  @scala.inline
  def mergeStyleSets_false(styleSets: (js.UndefOr[IStyleSet[StringDictionary[js.Any]] | `false` | Null])*): IProcessedStyleSet[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSets.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[js.Any]]
  @scala.inline
  def mergeStyleSets_false[TStyleSet](styleSet: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet]]]
  @scala.inline
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Unit, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  @scala.inline
  def mergeStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null]
  ): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3]]]
  @scala.inline
  def mergeStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null]
  ): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any], styleSet4.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ]]
  
  @scala.inline
  def mergeStyleSets_false_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  @scala.inline
  def mergeStyles_false(args: (js.UndefOr[IStyle | IStyleBaseArray | `false` | Null])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def setRTL(isRTL: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRTL")(isRTL.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
