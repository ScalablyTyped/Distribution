package typings.vegaLite

import typings.vegaLite.anon.Orient
import typings.vegaLite.buildSrcCompositemarkBaseMod.CompositeMarkNormalizer
import typings.vegaLite.buildSrcCompositemarkCommonMod.GenericCompositeMarkDef
import typings.vegaLite.buildSrcCompositemarkCommonMod.PartsMixins
import typings.vegaLite.buildSrcEncodingMod.Encoding
import typings.vegaLite.buildSrcMarkMod.MarkInvalidMixins
import typings.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecLayerMod.NormalizedLayerSpec
import typings.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import typings.vegaLite.vegaLiteStrings.`min-max`
import typings.vegaLite.vegaLiteStrings.box
import typings.vegaLite.vegaLiteStrings.boxplot
import typings.vegaLite.vegaLiteStrings.median
import typings.vegaLite.vegaLiteStrings.outliers
import typings.vegaLite.vegaLiteStrings.rule
import typings.vegaLite.vegaLiteStrings.ticks
import typings.vegaLite.vegaLiteStrings.tukey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompositemarkBoxplotMod {
  
  @JSImport("vega-lite/build/src/compositemark/boxplot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compositemark/boxplot", "BOXPLOT")
  @js.native
  val BOXPLOT_ : boxplot = js.native
  
  @JSImport("vega-lite/build/src/compositemark/boxplot", "BOXPLOT_PARTS")
  @js.native
  val BOXPLOT_PARTS: js.Tuple5[box, median, outliers, rule, ticks] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/boxplot", "boxPlotNormalizer")
  @js.native
  val boxPlotNormalizer: CompositeMarkNormalizer[boxplot] = js.native
  
  inline def getBoxPlotType(extent: Double): `min-max` | tukey = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxPlotType")(extent.asInstanceOf[js.Any]).asInstanceOf[`min-max` | tukey]
  
  inline def getBoxPlotType_minmax(extent: `min-max`): `min-max` | tukey = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxPlotType")(extent.asInstanceOf[js.Any]).asInstanceOf[`min-max` | tukey]
  
  inline def normalizeBoxPlot(
    spec: GenericUnitSpec[Encoding[String], BoxPlot | BoxPlotDef, SelectionParameter[SelectionType]],
    param1: NormalizerParams
  ): NormalizedLayerSpec = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBoxPlot")(spec.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[NormalizedLayerSpec]
  
  type BoxPlot = boxplot
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Record<vega-lite.vega-lite/build/src/compositemark/boxplot.BoxPlotPart, boolean | vega-lite.vega-lite/build/src/mark.MarkConfig<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> ]:? std.Record<vega-lite.vega-lite/build/src/compositemark/boxplot.BoxPlotPart, boolean | vega-lite.vega-lite/build/src/mark.MarkConfig<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>>[P]} */ trait BoxPlotConfig extends StObject {
    
    /**
      * The extent of the whiskers. Available options include:
      * - `"min-max"`: min and max are the lower and upper whiskers respectively.
      * - A number representing multiple of the interquartile range. This number will be multiplied by the IQR to determine whisker boundary, which spans from the smallest data to the largest data within the range _[Q1 - k * IQR, Q3 + k * IQR]_ where _Q1_ and _Q3_ are the first and third quartiles while _IQR_ is the interquartile range (_Q3-Q1_).
      *
      * __Default value:__ `1.5`.
      */
    var extent: js.UndefOr[`min-max` | Double] = js.undefined
    
    /** Size of the box and median tick of a box plot */
    var size: js.UndefOr[Double] = js.undefined
  }
  object BoxPlotConfig {
    
    inline def apply(): BoxPlotConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxPlotConfig]
    }
    
    extension [Self <: BoxPlotConfig](x: Self) {
      
      inline def setExtent(value: `min-max` | Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait BoxPlotConfigMixins extends StObject {
    
    /**
      * Box Config
      */
    var boxplot: js.UndefOr[BoxPlotConfig] = js.undefined
  }
  object BoxPlotConfigMixins {
    
    inline def apply(): BoxPlotConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxPlotConfigMixins]
    }
    
    extension [Self <: BoxPlotConfigMixins](x: Self) {
      
      inline def setBoxplot(value: BoxPlotConfig): Self = StObject.set(x, "boxplot", value.asInstanceOf[js.Any])
      
      inline def setBoxplotUndefined: Self = StObject.set(x, "boxplot", js.undefined)
    }
  }
  
  type BoxPlotDef = GenericCompositeMarkDef[BoxPlot] & BoxPlotConfig & MarkInvalidMixins & Orient
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.box
    - typings.vegaLite.vegaLiteStrings.median
    - typings.vegaLite.vegaLiteStrings.outliers
    - typings.vegaLite.vegaLiteStrings.rule
    - typings.vegaLite.vegaLiteStrings.ticks
  */
  trait BoxPlotPart extends StObject
  
  type BoxPlotPartsMixins = PartsMixins[BoxPlotPart]
}
