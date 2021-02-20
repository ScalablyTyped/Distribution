package typings.vegaLite

import typings.vegaLite.anon.`4`
import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.compositemarkBaseMod.CompositeMarkNormalizer
import typings.vegaLite.compositemarkCommonMod.GenericCompositeMarkDef
import typings.vegaLite.compositemarkCommonMod.PartsMixins
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.errorbarMod.ErrorBarCenter
import typings.vegaLite.errorbarMod.ErrorBarExtent
import typings.vegaLite.errorbarMod.ErrorEncoding
import typings.vegaLite.normalizeBaseMod.NormalizerParams
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.vegaLiteStrings.band
import typings.vegaLite.vegaLiteStrings.borders
import typings.vegaLite.vegaLiteStrings.errorband
import typings.vegaTypings.encodeMod.Interpolate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorbandMod {
  
  @JSImport("vega-lite/build/src/compositemark/errorband", "ERRORBAND")
  @js.native
  val ERRORBAND_ : errorband = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorband", "ERRORBAND_PARTS")
  @js.native
  val ERRORBAND_PARTS: js.Tuple2[band, borders] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorband", "errorBandNormalizer")
  @js.native
  val errorBandNormalizer: CompositeMarkNormalizer[errorband] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorband", "normalizeErrorBand")
  @js.native
  def normalizeErrorBand(spec: GenericUnitSpec[Encoding[String], ErrorBand | ErrorBandDef], hasConfig: NormalizerParams): NormalizedLayerSpec = js.native
  
  type ErrorBand = errorband
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Record<vega-lite.vega-lite/build/src/compositemark/errorband.ErrorBandPart, boolean | vega-lite.vega-lite/build/src/mark.MarkConfig<vega-lite.vega-lite/build/src/expr.ExprOrSignalRef>> ]:? std.Record<vega-lite.vega-lite/build/src/compositemark/errorband.ErrorBandPart, boolean | vega-lite.vega-lite/build/src/mark.MarkConfig<vega-lite.vega-lite/build/src/expr.ExprOrSignalRef>>[P]} */ @js.native
  trait ErrorBandConfig extends StObject {
    
    /**
      * The center of the error band. Available options include:
      * - `"mean"`: the mean of the data points.
      * - `"median"`: the median of the data points.
      *
      * __Default value:__ `"mean"`.
      * @hidden
      */
    var center: js.UndefOr[ErrorBarCenter] = js.native
    
    /**
      * The extent of the band. Available options include:
      * - `"ci"`: Extend the band to the confidence interval of the mean.
      * - `"stderr"`: The size of band are set to the value of standard error, extending from the mean.
      * - `"stdev"`: The size of band are set to the value of standard deviation, extending from the mean.
      * - `"iqr"`: Extend the band to the q1 and q3.
      *
      * __Default value:__ `"stderr"`.
      */
    var extent: js.UndefOr[ErrorBarExtent] = js.native
    
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
    var interpolate: js.UndefOr[Interpolate] = js.native
    
    /**
      * The tension parameter for the interpolation type of the error band.
      *
      * @minimum 0
      * @maximum 1
      */
    var tension: js.UndefOr[Double] = js.native
  }
  object ErrorBandConfig {
    
    @scala.inline
    def apply(): ErrorBandConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBandConfig]
    }
    
    @scala.inline
    implicit class ErrorBandConfigMutableBuilder[Self <: ErrorBandConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: ErrorBarCenter): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setExtent(value: ErrorBarExtent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setInterpolate(value: Interpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      @scala.inline
      def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    }
  }
  
  @js.native
  trait ErrorBandConfigMixins extends StObject {
    
    /**
      * ErrorBand Config
      */
    var errorband: js.UndefOr[ErrorBandConfig] = js.native
  }
  object ErrorBandConfigMixins {
    
    @scala.inline
    def apply(): ErrorBandConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBandConfigMixins]
    }
    
    @scala.inline
    implicit class ErrorBandConfigMixinsMutableBuilder[Self <: ErrorBandConfigMixins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorband(value: ErrorBandConfig): Self = StObject.set(x, "errorband", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorbandUndefined: Self = StObject.set(x, "errorband", js.undefined)
    }
  }
  
  type ErrorBandDef = GenericCompositeMarkDef[ErrorBand] with ErrorBandConfig with `4`
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.band
    - typings.vegaLite.vegaLiteStrings.borders
  */
  trait ErrorBandPart extends StObject
  
  type ErrorBandPartsMixins = PartsMixins[ErrorBandPart]
  
  type ErrorBandUnitSpec[EE] = GenericUnitSpec[ErrorEncoding[Field] with EE, ErrorBand | ErrorBandDef]
}
