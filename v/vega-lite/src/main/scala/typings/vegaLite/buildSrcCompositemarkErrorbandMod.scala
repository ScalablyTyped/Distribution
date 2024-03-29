package typings.vegaLite

import typings.vegaLite.anon.`6`
import typings.vegaLite.buildSrcChanneldefMod.Field
import typings.vegaLite.buildSrcCompositemarkBaseMod.CompositeMarkNormalizer
import typings.vegaLite.buildSrcCompositemarkCommonMod.GenericCompositeMarkDef
import typings.vegaLite.buildSrcCompositemarkCommonMod.PartsMixins
import typings.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorBarCenter
import typings.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorBarExtent
import typings.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorEncoding
import typings.vegaLite.buildSrcEncodingMod.Encoding
import typings.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecLayerMod.NormalizedLayerSpec
import typings.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import typings.vegaLite.vegaLiteStrings.band
import typings.vegaLite.vegaLiteStrings.borders
import typings.vegaLite.vegaLiteStrings.errorband
import typings.vegaTypings.typesSpecEncodeMod.Interpolate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompositemarkErrorbandMod {
  
  @JSImport("vega-lite/build/src/compositemark/errorband", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorband", "ERRORBAND")
  @js.native
  val ERRORBAND_ : errorband = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorband", "ERRORBAND_PARTS")
  @js.native
  val ERRORBAND_PARTS: js.Tuple2[band, borders] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorband", "errorBandNormalizer")
  @js.native
  val errorBandNormalizer: CompositeMarkNormalizer[errorband] = js.native
  
  inline def normalizeErrorBand(
    spec: GenericUnitSpec[Encoding[String], ErrorBand | ErrorBandDef, SelectionParameter[SelectionType]],
    param1: NormalizerParams
  ): NormalizedLayerSpec = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeErrorBand")(spec.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[NormalizedLayerSpec]
  
  type ErrorBand = errorband
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Record<vega-lite.vega-lite/build/src/compositemark/errorband.ErrorBandPart, boolean | vega-lite.vega-lite/build/src/mark.AnyMarkConfig<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> ]:? std.Record<vega-lite.vega-lite/build/src/compositemark/errorband.ErrorBandPart, boolean | vega-lite.vega-lite/build/src/mark.AnyMarkConfig<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>>[P]} */ trait ErrorBandConfig extends StObject {
    
    /**
      * The center of the error band. Available options include:
      * - `"mean"`: the mean of the data points.
      * - `"median"`: the median of the data points.
      *
      * __Default value:__ `"mean"`.
      * @hidden
      */
    var center: js.UndefOr[ErrorBarCenter] = js.undefined
    
    /**
      * The extent of the band. Available options include:
      * - `"ci"`: Extend the band to the confidence interval of the mean.
      * - `"stderr"`: The size of band are set to the value of standard error, extending from the mean.
      * - `"stdev"`: The size of band are set to the value of standard deviation, extending from the mean.
      * - `"iqr"`: Extend the band to the q1 and q3.
      *
      * __Default value:__ `"stderr"`.
      */
    var extent: js.UndefOr[ErrorBarExtent] = js.undefined
    
    /**
      * The line interpolation method for the error band. One of the following:
      * - `"linear"`: piecewise linear segments, as in a polyline.
      * - `"linear-closed"`: close the linear segments to form a polygon.
      * - `"step"`: a piecewise constant function (a step function) consisting of alternating horizontal and vertical lines. The y-value changes at the midpoint of each pair of adjacent x-values.
      * - `"step-before"`: a piecewise constant function (a step function) consisting of alternating horizontal and vertical lines. The y-value changes before the x-value.
      * - `"step-after"`: a piecewise constant function (a step function) consisting of alternating horizontal and vertical lines. The y-value changes after the x-value.
      * - `"basis"`: a B-spline, with control point duplication on the ends.
      * - `"basis-open"`: an open B-spline; may not intersect the start or end.
      * - `"basis-closed"`: a closed B-spline, as in a loop.
      * - `"cardinal"`: a Cardinal spline, with control point duplication on the ends.
      * - `"cardinal-open"`: an open Cardinal spline; may not intersect the start or end, but will intersect other control points.
      * - `"cardinal-closed"`: a closed Cardinal spline, as in a loop.
      * - `"bundle"`: equivalent to basis, except the tension parameter is used to straighten the spline.
      * - `"monotone"`: cubic interpolation that preserves monotonicity in y.
      */
    var interpolate: js.UndefOr[Interpolate] = js.undefined
    
    /**
      * The tension parameter for the interpolation type of the error band.
      *
      * @minimum 0
      * @maximum 1
      */
    var tension: js.UndefOr[Double] = js.undefined
  }
  object ErrorBandConfig {
    
    inline def apply(): ErrorBandConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBandConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorBandConfig] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: ErrorBarCenter): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setExtent(value: ErrorBarExtent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setInterpolate(value: Interpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    }
  }
  
  trait ErrorBandConfigMixins extends StObject {
    
    /**
      * ErrorBand Config
      */
    var errorband: js.UndefOr[ErrorBandConfig] = js.undefined
  }
  object ErrorBandConfigMixins {
    
    inline def apply(): ErrorBandConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBandConfigMixins]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorBandConfigMixins] (val x: Self) extends AnyVal {
      
      inline def setErrorband(value: ErrorBandConfig): Self = StObject.set(x, "errorband", value.asInstanceOf[js.Any])
      
      inline def setErrorbandUndefined: Self = StObject.set(x, "errorband", js.undefined)
    }
  }
  
  type ErrorBandDef = GenericCompositeMarkDef[ErrorBand] & ErrorBandConfig & `6`
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.band
    - typings.vegaLite.vegaLiteStrings.borders
  */
  trait ErrorBandPart extends StObject
  
  type ErrorBandPartsMixins = PartsMixins[ErrorBandPart]
  
  type ErrorBandUnitSpec[EE] = GenericUnitSpec[
    ErrorEncoding[Field] & EE, 
    ErrorBand | ErrorBandDef, 
    SelectionParameter[SelectionType]
  ]
}
